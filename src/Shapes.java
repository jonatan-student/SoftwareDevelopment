import java.awt.*;
import java.util.ArrayList;

public class Shapes {
    ArrayList<Circle> circles = new ArrayList<>();
    ArrayList<Rectangle> rectangles = new ArrayList<>();
    ArrayList<Triangle> triangles = new ArrayList<>();
    Vector rando;
    Vector Size;

    public Shapes(double C, double R, double T, int w, int h){
        this.Size = new Vector(w, h);
        this.rando = new Vector(new Vector(w).x, new Vector(h).y);
        addShape("triangle", T);
        addShape("circle", C);
        addShape("rectangle", R);
    }

    public void addShape(String type, double N){
        if(type == "circle"){
            for(int i = 0; i<N; i++){
                Circle c = new Circle(new Vector(new Vector(this.Size.x).x, new Vector(this.Size.y).y), 75);
                circles.add(c);
            }
        } else if(type == "rectangle"){
            for(int i = 0; i<N; i++){
                Rectangle r = new Rectangle(new Vector(new Vector(this.Size.x).x, new Vector(this.Size.y).y), 100, 50);
                rectangles.add(r);
            }
        } else if (type == "triangle"){
            for(int i = 0; i<N; i++){
                Triangle t = new Triangle(new Vector(new Vector(this.Size.x).x, new Vector(this.Size.y).y), new Vector(new Vector(this.Size.x).x, new Vector(this.Size.y).y), new Vector(new Vector(this.Size.x).x, new Vector(this.Size.y).y));
                triangles.add(t);
            }
        }
    }

    public void draw(Graphics2D g2d){
        g2d.fillOval((int) this.rando.x, (int) this.rando.y, 5,5);
        checkPoints(this.rando);

        for(Circle c: circles){
            c.draw(g2d);
            System.out.println("Circle " + circles.indexOf(c)+ " Circumference: " + c.GetCircumference());
            System.out.println("Circle " + circles.indexOf(c)+ " area: " + c.GetCircumference());
            System.out.println("Circle "+circles.indexOf(c)+" center: "+c.center().ourCenter());
        }
        for(Rectangle r: rectangles){
            r.draw(g2d);
            System.out.println("Rectangle " + rectangles.indexOf(r)+ " Perimeter: " + r.GetCircumference());
            System.out.println("Rectangle " + rectangles.indexOf(r)+ " area: " + r.GetArea());
            System.out.println("Rectangle "+rectangles.indexOf(r)+" center: "+r.center().ourCenter());
        }
        for(Triangle t: triangles){
            t.draw(g2d);
            System.out.println("Triangle " + triangles.indexOf(t)+ " Perimeter: " + t.GetCircumference());
            System.out.println("Triangle " + triangles.indexOf(t)+ " area: " + t.GetArea());
            System.out.println("Triangle " + triangles.indexOf(t)+ " center: " + t.center().ourCenter());

        }
    }

    public void checkPoints(Vector rando){
        for(Circle c: circles){
            if(c.containsPoint(rando)){
                System.out.println("The random point is in circle " + circles.indexOf(c));
            } else {
                System.out.println("The random point is not in circle " + circles.indexOf(c));
            }
        }
        for(Rectangle r: rectangles){
            if(r.containsPoint(rando)){
                System.out.println("the random point is in rectangle " + rectangles.indexOf(r));
            } else {
                System.out.println("the random point is not in rectangle " + rectangles.indexOf(r));
            }
        }
        for(Triangle t: triangles){
            if (t.containsPoint(rando)){
                System.out.println("the random point is in triangle " + triangles.indexOf(t));
            } else{
                System.out.println("the random point is not in triangle " + triangles.indexOf(t));
            }
        }
    }
}
