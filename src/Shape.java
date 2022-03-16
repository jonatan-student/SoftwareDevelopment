import java.awt.*;

public abstract class Shape {
    public abstract double GetArea();

    public abstract double GetCircumference();

    public abstract Vector center();

    public abstract boolean containsPoint(Vector point);

    public abstract void draw(Graphics2D g2d);

    public double dist(Shape shape){
        Vector dist = this.center().sub(shape.center());
        return dist.length();
    }
}
