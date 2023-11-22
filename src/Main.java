import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String>  cities = new HashMap<>();
        cities.put("New York", "Chicago");
        cities.put("Chicago", "Salt Lake City");
        cities.put("Salt Lake City", "Los Angeles");
        cities.put("Austin", "Atlanta");
        cities.put("Atlanta", "Miami");

        Scanner console = new Scanner(System.in);
        String startPoint = console.nextLine();
        String finishPoint = console.nextLine();
    }

    public static boolean check(Map<String, String> cities, String starPoint, String finishPoint) {
        if (starPoint == null || finishPoint == null) {
            return false;
        }
        if (cities == null) {
            return false;
        }
        String currentCity = cities.get(starPoint);

        if (currentCity == null) {
            return false;
        }

        Set<String> visitedCities = new HashSet<>();
        while (currentCity != null) {
            if (visitedCities.contains(currentCity)) {
                return false;
            }
            else {
                visitedCities.add(currentCity);
            }

            if (currentCity.equals(finishPoint)) {
                return true;
            }

            currentCity = cities.get(currentCity);
        }

        return false;
    }
}