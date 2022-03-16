import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Visual extends JFrame{
    JFrame frame = new JFrame();
    int w; int h;
    Visual(){
        this.w = 700; this.h= 800;
        JFrame frame = new JFrame("Les Shapes");
        DrawingCanvas dc = new DrawingCanvas(this.w, this.h);
        frame.setSize(this.w, this.h);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(dc);
        frame.setVisible(true);
    }
}

