package ModelElements;

import Staff.Point3D;

import java.util.ArrayList;

/**
 * полигон
 */
public class Poligon {

    public ArrayList<Point3D> points = new ArrayList<Point3D>();

    /**
     * конструктор с начальной точкой
     *
     * @param point
     */
    public Poligon(Point3D point) {
        points.add(point);
    }
}
