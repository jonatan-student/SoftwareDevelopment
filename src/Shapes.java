import java.util.ArrayList;

public class Shapes {
    ArrayList<Circle> circles = new ArrayList<Circle>();

    public void addShape(String type, double N){
        if(type == "circle"){
            for(int i = 0; i<N; i++){
                Circle c = new Circle(new Vector(1000), 10);
                circles.add(c);
            }
        } else if(type == "rectangle"){
            for(int i = 0; i<N; i++){
                Rectangle r = new Circle(new Vector(1000), 10);
                circles.add(c);
            }
        }
    }

    public void printCenters(){
        for (Circle c: circles) {
            System.out.println(c.center().ourCenter());
        }
    }
}
