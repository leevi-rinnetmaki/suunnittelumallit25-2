package facade;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.simple.JSONObject; // add Maven dependency for JSON.simple
import org.json.simple.parser.JSONParser; // add Maven dependency for JSON.simple

public class APIFacade {
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        String jsonResult = getJsonFromApi(urlString);
        return extractAttributeFromJson(jsonResult, attributeName);
    }

    private String getJsonFromApi(String apiUrl) throws IOException {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int status = con.getResponseCode();
            if (status != HttpURLConnection.HTTP_OK) {
                throw new IOException("HTTP GET request failed with code: " + status);
            }

            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                StringBuilder content = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                return content.toString();
            } finally {
                con.disconnect();
            }
        } catch (IOException e) {
            throw e; // propagate IOException
        } catch (Exception e) {
            throw new IOException("Failed to fetch JSON", e);
        }
    }

    private String extractAttributeFromJson(String json, String attributeName) throws IllegalArgumentException {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(json);

            String value = (String) jsonObject.get(attributeName);
            if (value == null) {
                throw new IllegalArgumentException("Attribute '" + attributeName + "' not found");
            }
            return value;
        } catch (org.json.simple.parser.ParseException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }
}