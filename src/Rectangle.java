import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {
    Vector topLeft;
    double height, width;
    public Rectangle(Vector TL, double width, double height){
        this.topLeft = TL;
        this.height = height; this.width= width;
    }

    @Override
    public double GetArea() {
        return this.width * this.height;
    }

    @Override
    public double GetCircumference() {
        return 2 * this.width + 2 * this.height;
    }

    @Override
    public Vector center() {
        return new Vector((this.topLeft.x+this.width)*0.5, (this.topLeft.y-this.height)*0.5);
    }

    @Override
    public boolean containsPoint(Vector point) {
        if (point.x < this.topLeft.x || point.x > (this.topLeft.x + this.width) || point.y > this.topLeft.y|| point.y < this.topLeft.y - this.height){
            return false;
        } else return true;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.yellow);
        g2d.fillRect((int) this.topLeft.x, (int) this.topLeft.y, (int) this.width, (int) this.height);
        g2d.setColor(Color.black);
        g2d.drawRect((int) this.topLeft.x, (int) this.topLeft.y, (int) this.width, (int) this.height);
    }
}
