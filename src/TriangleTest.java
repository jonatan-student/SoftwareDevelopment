import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle T = new Triangle(new Vector(10, 10), new Vector(20,10), new Vector(15, 20));
    @Test
    void getArea() {
        assertEquals(50, T.GetArea(), 0.001);
    }

    @Test
    void getCircumference() {
        assertEquals(32.361, T.GetCircumference(), 0.001);
    }

    @Test
    void center() {
        assertEquals(new Vector(15, 13.333), T.center());
    }

    @Test
    void containsPoint() {
        assertEquals(true, T.containsPoint(new Vector(15, 17.5)));
    }
}