import java.awt.*;
import java.lang.Math;
public class Circle extends Shape {
    Vector center;
    double radius;

    public Circle(Vector c, double r){
        this.center = c;
        this.radius = r;
    }

    @Override
    public double GetArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public double GetCircumference() {
        return Math.PI*2*this.radius;
    }

    @Override
    public Vector center() {
        return this.center;
    }

    @Override
    public boolean containsPoint(Vector point) {
        Vector p = point.sub(this.center);
        if (p.length()<this.radius){
            return true;
        } else return false;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.cyan);
        g2d.fillOval((int) this.center().x, (int) this.center().y, (int) this.radius, (int) this.radius);
        g2d.setColor(Color.black);
        g2d.drawOval((int) this.center().x, (int) this.center().y, (int) this.radius, (int) this.radius);
    }
}
