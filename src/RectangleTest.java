import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle R = new Rectangle(new Vector(50,50), 10,10);
    @Test
    void getArea() {
        assertEquals(100, R.GetArea(), 0.001);
    }

    @Test
    void getCircumference() {
        assertEquals(40, R.GetCircumference());
    }

    @Test
    void center() {
        assertEquals(new Vector(55.0,55.0), R.center());
    }

    @Test
    void containsPoint() {
        assertEquals(true, R.containsPoint(new Vector(50,50)));
    }
}