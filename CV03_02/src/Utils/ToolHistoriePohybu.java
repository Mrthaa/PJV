package Utils;

import java.awt.*;
import java.util.ArrayList;

public class ToolHistoriePohybu {

    public static double spoctiVzdalenost(ArrayList<Point> history) {
        Point p1 = history.get(0);
        Point p2 = history.get(history.size() - 1);
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }

    public static double spoctiVzdalenost(Point[] history) {
        Point p1 = history[0];
        Point p2 = history[history.length - 1];
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }

    public static String sestavVyslednouCestu(ArrayList<Point> history) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nMove history:");
        for(Point point : history) {
            stringBuilder
                    .append("\n[X: ")
                    .append(point.x)
                    .append(";Y: ")
                    .append(point.y)
                    .append("]");
        }
        return stringBuilder.toString();
    }

    public static String sestavVyslednouCestu(Point[] history) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nMove history:");
        for (Point point : history) {
            stringBuilder
                    .append("\n[X: ")
                    .append(point.x)
                    .append(";Y: ")
                    .append(point.y)
                    .append("]");
        }
        return stringBuilder.toString();
    }
}
