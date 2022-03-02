public class Vector {
    double x = 0;
    double y = 0;

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
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

    public void print(){
        System.out.println("("+this.x + "," + this.y + ")");
    }
}
