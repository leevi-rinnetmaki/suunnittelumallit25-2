package flyweight;

import javafx.scene.paint.Color;
import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<String, Color> tileColors = new HashMap<>();

    public static Color getColor(String type) {
        if (!tileColors.containsKey(type)) {
            switch (type) {
                case "Building":
                    tileColors.put(type, Color.RED);
                    break;
                case "Road":
                    tileColors.put(type, Color.DARKGRAY);
                    break;
                case "Forest":
                    tileColors.put(type, Color.FORESTGREEN);
                    break;
                case "Swamp":
                    tileColors.put(type, Color.YELLOW);
                    break;
                case "Water":
                    tileColors.put(type, Color.DEEPSKYBLUE);
                    break;
                default:
                    tileColors.put(type, Color.BLACK);
            }
        }
        return tileColors.get(type);
    }
}
