import java.util.ArrayList;
import java.util.Random;

public class Shapes {
    Random random = new Random();
    public Shapes(){
        ArrayList shapes = new ArrayList();
    }

    public void addShape(String type, int N){
        if(type == "circle"){
            Circle c = new Circle(random.nextDouble(100), random.nextDouble(100));
        }
    }
}
