import java.util.Random;
import java.lang.Math;
public class Vector {
    Random random = new Random();
    double x = 0;
    double y = 0;

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector(double range){
        this.x = random.nextDouble(range);
        this.y = random.nextDouble(range);
    }

    public double length(){
        double l = Math.sqrt(Math.pow(this.x,2)+Math.pow(y,2));
        return l;
    }

    public Vector add(Vector other){
        Vector vector = new Vector(this.x + other.x, this.y + other.y);
        return vector;
    }

    public Vector sub(Vector other){
        Vector vector = new Vector(this.x - other.x, this.y - other.y);
        return vector;
    }

    public double getAngle(Vector other){
        return Math.atan(this.length()/other.length());
    }

    public String ourCenter(){
        return "("+this.x + "," + this.y + ")";
    }
}
