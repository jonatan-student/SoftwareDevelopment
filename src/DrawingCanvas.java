import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent{
    public int width; public int height;
    public Shapes shapes;

    public DrawingCanvas(int w, int h){
        this.width = w; this.height = h;
        shapes = new Shapes(0,0,60, this.width, this.height);
    }

    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        shapes.draw(g2d);
    }
}
