package exercise;

// BEGIN
public class Circle {

    private Point centre;
    private int radius;

    public Circle() {
	this(new Point(0, 0));
    }

    public Circle(int x, int y, int radius) {
	this.setCenter(new Point(x, y));
	this.radius = radius;
    }

    public int getRadius() {
	return radius;
    }

    public Point getCenter() {
	return centre;
    }
}
// END
