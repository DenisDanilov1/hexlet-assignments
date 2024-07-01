package exercise;

// BEGIN
public class App {

    public static void printSquare(Circle circle) {
        try {
            int square = (int) Math.round(Math.PI * Math.pow(circle.getRadius(), 2));
            System.out.println("The area of the circle: " + square);
        } catch (NegativeRadiusException e) {
            System.out.println("The area could not be calculated");
        } finally {
            System.out.println("The calculation is over");
        }
    }
}
// END
