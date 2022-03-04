import java.util.ArrayList;

public class Shapes {
    ArrayList<Circle> circles = new ArrayList<>();
    ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void addShape(String type, double N){
        if(type == "circle"){
            for(int i = 0; i<N; i++){
                Circle c = new Circle(new Vector(1000), 10);
                circles.add(c);
            }
        } else if(type == "rectangle"){
            for(int i = 0; i<N; i++){
                Rectangle r = new Rectangle(new Vector(1000), 10, 5);
                rectangles.add(r);
            }
        }
    }

    public void printCenters(){
        for (Circle c: circles) {
            System.out.println("Circle "+circles.indexOf(c)+": "+c.center().ourCenter());
        }
        for (Rectangle r: rectangles) {
            System.out.println("Rectangle "+rectangles.indexOf(r)+1+": "+r.center().ourCenter());
        }
    }
}
