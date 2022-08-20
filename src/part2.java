import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class part2 {
    public static void main(String[] args) {
        // Initialize Map to store states and capitals
        Map<String, String> stateNames = getStateNames();

        // Sort map in a TreeMap
        TreeMap<String, String> sorted = new TreeMap<>(stateNames);

        // Copy sorted map to a new map
        sorted.putAll(stateNames);

        // Print sorted map
        System.out.println(" State\t\tCapital");
        System.out.println("--------------------------");
        sorted.forEach((key, value) -> System.out.printf("%-15s %s\n", key, value));
        Scanner input = new Scanner(System.in);

        // Loop until user exits
        while (true) {
            System.out.println("Enter a state to view the capital of or type 'exit' to quit");
            String state = input.nextLine();
            if (state.equals("exit")) {
                break;
            }
            // Display the capital for the state
            if (stateNames.get(state) != null) {
                System.out.println("The capital of " + state + " is "
                        + stateNames.get(state));
            }
        }
    }
    // Sorts 50 states in a map
    public static Map<String, String> getStateNames() {
        Map<String, String> map = new HashMap<>();
        String[][] data = {
                {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
                {"Colorado", "Denver"}, {"Connecticut", "Hartford"},
                {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
                {"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"},
                {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
                {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
                {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada	", "Carson City"}, {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
                {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"}, {"Texas", "Austin"},
                {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"},
                {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};
        for (int i = 0; i < data.length; i++) {
            map.put(data[i][0], data[i][1]);
        }
        return map;
    }
}