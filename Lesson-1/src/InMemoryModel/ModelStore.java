package InMemoryModel;

import Staff.Angle3D;
import Staff.Point3D;

import java.awt.*;

/**
 * класс источник света
 */
public class ModelStore {
    public Point3D Location;
    public Angle3D Angle;
    public Color Color;
    public Float Power;

    /**
     * вращение источника света
     *
     * @param angleAction
     */
    public void rotate(Angle3D angleAction) {
        //...
    }

    /**
     * движение точки света
     *
     * @param pointAction
     */
    public void move(Point3D pointAction) {
        //...
    }
}
