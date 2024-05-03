package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {

    public static List<String> buildApartmentsList(List<Home> apartments, int n) {

        List<String> result = new ArrayList<>();

        for (Home apartment : apartments) {
            if (apartment.getArea() > n) {
                result.add(apartment.gecompareTo());
            }
        }

        return result;
    }
}
// END
