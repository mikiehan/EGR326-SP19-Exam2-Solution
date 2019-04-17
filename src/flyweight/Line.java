package flyweight;

import java.util.HashMap;
import java.util.Map;

//flyweight and immutable + thread-safe
public final class Line {
    private final Point p1;
    private final Point p2;
    private volatile static Map<String, Line> map = new HashMap<>();

    public static Line getInstance(Point p1, Point p2){
        String key = p1 + "," + p2;
        if (!map.containsKey(key)) {
            synchronized (Line.class) {
                if (!map.containsKey(key)) {
                    map.put(key, new Line(p1, p2));
                }
            }
        }
        return map.get(key);
    }

    private Line(Point p1, Point p2) {
        this.p1 = p1.clone();
        this.p2 = p2.clone();
    }

    public Point getP1() {
        return p1.clone();
    }

    public Point getP2() {
        return p2.clone();
    }

}
