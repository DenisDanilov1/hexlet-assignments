package exercise;

// BEGIN
public class App {

    public static void printSquare(Circle circle) throws NegativeRadiusException {
        try {
            int square = (int) Math.round(Math.PI * Math.pow(circle.getRadius(), 2));
            throw new NegativeRadiusException("Площадь круга: " + square);
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END
