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
}
