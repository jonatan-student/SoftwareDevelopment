import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c = new Circle(new Vector(50,50), 10);
    @org.junit.jupiter.api.Test
    void getArea() {
        assertEquals(314.15926, c.GetArea(), 0.001);
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        assertEquals(62.83185, c.GetCircumference(), 0.001);
    }

    @org.junit.jupiter.api.Test
    void center() {
        assertEquals(new Vector(50,50), c.center());
    }

    @org.junit.jupiter.api.Test
    void containsPoint() {
        assertEquals(true, c.containsPoint(new Vector(50,50)));
    }
}