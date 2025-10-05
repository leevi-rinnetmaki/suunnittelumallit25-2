package facade;

public class Main {
    public static void main(String[] args) throws Exception {
        APIFacade facade = new APIFacade();
        System.out.println(facade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value"));
        System.out.println(facade.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "date"));

    }
}
