import javax.swing.*;
import java.awt.*;

public class Visual {
    JFrame frame = new JFrame();
    public Visual(int width, int height){
        frame.setSize(width, height);
        frame.getContentPane().setBackground(Color.gray);
    }

    public void show(){
        frame.add(new drawingComp());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    static class drawingComp extends Component{
        Shapes Collection = new Shapes();
        @Override
        public void paint(Graphics g) {

            Collection.addShape("circle", 2);
            Collection.addShape("rectangle", 2);
            Collection.addShape("triangle", 2);

            Graphics2D g2d = (Graphics2D)g;
            for(Circle c: Collection.circles){
                g2d.setColor(Color.cyan);
                g2d.fillOval((int) c.center().x, (int) c.center().y, (int) c.radius, (int) c.radius);
                g2d.setColor(Color.black);
                g2d.drawOval((int) c.center().x, (int) c.center().y, (int) c.radius, (int) c.radius);
            }
            for(Rectangle r: Collection.rectangles){
                g2d.setColor(Color.yellow);
                g2d.fillRect((int) r.topLeft.x, (int) r.topLeft.y, (int) r.width, (int) r.height);
                g2d.setColor(Color.black);
                g2d.drawRect((int) r.topLeft.x, (int) r.topLeft.y, (int) r.width, (int) r.height);

            }
            for(Triangle t: Collection.triangles){
                g2d.setColor(Color.magenta);
                Polygon triangle = new Polygon();
                triangle.addPoint((int) t.vertex1.x, (int) t.vertex1.y);
                triangle.addPoint((int) t.vertex2.x, (int) t.vertex2.y);
                triangle.addPoint((int) t.vertex3.x, (int) t.vertex3.y);
                g2d.fillPolygon(triangle);
                g2d.setColor(Color.black);
                g2d.drawPolygon(triangle);
            }
            g2d.setColor(Color.white);
            g2d.fillOval((int) Collection.rando.x, (int) Collection.rando.y, 3, 3);

            Collection.printCenters();
            Collection.printAreas();
            Collection.printPerimeter();
            Collection.checkPoints();
        }
    }
}

