import java.lang.Math;
public class Triangle extends Shape{
    Vector vertex1, vertex2, vertex3;
    public Triangle(Vector v1, Vector v2, Vector v3){
        this.vertex1 = v1;
        this.vertex2 = v2;
        this.vertex3 = v3;
    }

    @Override
    public double GetArea() {
        double a = this.vertex1.x*(this.vertex2.y-this.vertex3.y)+this.vertex2.x*(this.vertex3.y-this.vertex1.y)+this.vertex3.x*(this.vertex1.y-this.vertex2.y);
        return Math.abs(a/2);
    }

    @Override
    public double GetCircumference() {
        double a = this.vertex1.sub(this.vertex2).length();
        double b = this.vertex2.sub(this.vertex3).length();
        double c = this.vertex3.sub(this.vertex1).length();
        return Math.abs(a+b+c);
    }

    @Override
    public Vector center() {
        return new Vector((this.vertex1.x+this.vertex2.x+this.vertex3.x)/2, (this.vertex1.y+this.vertex2.y+this.vertex3.y)/2);
    }

    @Override
    public boolean containsPoint(Vector point) {
        Vector a = point.sub(this.vertex1);
        Vector b = point.sub(this.vertex2);
        Vector c = point.sub(this.vertex3);
        double theta = a.getAngle(b)+b.getAngle(c)+c.getAngle(a);
        if(theta < 2*Math.PI) return false;
        else return true;
    }
}
