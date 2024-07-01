package exercise;

// BEGIN
package exercise;

public class App {

    public static void printSquare(Circle circle) {
        try {
            int square = (int) Math.round(Math.PI * circle.getRadius() * circle.getRadius());
            System.out.println(square);
        } catch (NegativeRadiusException e) {
            System.out.println("The area could not be calculated");
        } finally {
            System.out.println("The calculation is over");
        }
    }
}
// END
