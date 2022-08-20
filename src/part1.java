import java.util.Scanner;

/* TODO: Develop a program that asks the user to enter a capital for a U.S State and the program reports
        if the user entered a valid capital. */
public class part1 {
    public static void main(String[] args) {
        // Initialize array to store states and capitals
        String[][] getData = getData();
        String[][] stateNames = getStateData();

        // Display the current contents of the array then use a bubble sort to sort the content by capital.
        sortByCapitals(stateNames);
        System.out.println(" State\t\tCapital");
        System.out.println("--------------------------");
        for (String[] name : stateNames) {
            System.out.printf("%-15s %s\n", name[0], name[1]);
        }
        // Get user input for all the state capitals and then display the total correct count.
        Scanner input = new Scanner(System.in);
        int count = 0; // Num of correct answers
        // Loop until user exits
        for (String[] stateName : stateNames) {
            System.out.println("Guess the capital of " + stateName[0] + ".");
            String userCapitalInput = input.nextLine();

            if (isEqual(stateName[1], userCapitalInput)) {
                System.out.println("Your answer is correct");
                count++;
            } else {
                System.out.println("The correct answer is " + stateName[1]);
            }
        }
        System.out.println("\nThe correct count is " + count);
    }

    // Return true if string matches the capital of the state
    public static boolean isEqual(String c, String a) {
        if (c.length() != a.length())
            return false;

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) != a.charAt(i))
                return false;
        }
        return true;
    }

    // Use bubble sort to sort the content by capital
    public static void sortByCapitals(String[][] stCap) {
        boolean xch;

        for (int i = 0; i < stCap.length - 1; ++i) {
            xch = false;
            for (int j = 0; j < stCap.length - i - 1; ++j) {
                if (stCap[j][1].compareToIgnoreCase(stCap[j + 1][1]) > 0) {
                    String[] temp = {stCap[j][0], stCap[j][1]};

                    stCap[j] = stCap[j + 1];

                    stCap[j + 1] = temp;

                    xch = true;
                }
            }
            if (!xch)
                break;
        }
    }
    // Stores all 50 states and capitals in a two-dimensional array, in order by city name.
    public static String[][] getData() {
        String[][] capitalNames = {
                {"Montgomery", "Alabama"}, {"Juneau", "Alaska"}, {"Phoenix", "Arizona"},
                {"Little Rock", "Arkansas"}, {"Sacramento", "California"},
                {"Denver", "Colorado"}, {"Hartford", "Connecticut"},
                {"Dover", "Delaware"}, {"Tallahassee", "Florida"},
                {"Atlanta", "Georgia"}, {"Honolulu", "Hawaii"}, {"Boise", "Idaho"},
                {"Springfield", "Illinois"}, {"Indianapolis", "Indiana"},
                {"Moines", "Iowa Des"}, {"Topeka", "Kansas"}, {"Frankfort", "Kentucky"},
                {"Baton Rouge", "Louisiana"}, {"Augusta", "Maine"},
                {"Annapolis", "Maryland"}, {"Boston", "Massachusetts"},
                {"Lansing", "Michigan"}, {"Saint Paul", "Minnesota"},
                {"Jackson", "Mississippi"}, {"Jefferson City", "Missouri"},
                {"Helena", "Montana"}, {"Lincoln", "Nebraska"},
                {"Carson City", "Nevada"}, {"Concord", "New Hampshire"},
                {"Trenton", "New Jersey"}, {"Santa Fe", "New Mexico"},
                {"Albany", "New York"}, {"Raleigh", "North Carolina"},
                {"Bismarck", "North Dakota"}, {"Columbus", "Ohio"},
                {"Oklahoma City", "Oklahoma"}, {"Salem", "Oregon"},
                {"Harrisburg", "Pennsylvania"}, {"Providence", "Rhode Island"},
                {"Columbia", "South Carolina"}, {"Pierre", "South Dakota"},
                {"Nashville", "Tennessee"}, {"Austin", "Texas"},
                {"Salt Lake City", "Utah"}, {"Montpelier", "Vermont"},
                {"Richmond", "Virginia"}, {"Olympia", "Washington"},
                {"Charleston", "West Virginia"}, {"Madison", "Wisconsin"},
                {"Cheyenne", "Wyoming"}};
        return capitalNames;
    }
    // Stores all 50 states and capitals in a two-dimensional array, in order by state name. Same as previous array
    // I just used a second one to handle the game functionality.
    public static String[][] getStateData() {

        String[][] stateNames = {
                {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
                {"Colorado", "Denver"}, {"Connecticut", "Hartford"},
                {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
                {"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
                {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
                {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada	", "Carson City"}, {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
                {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"}, {"Texas", "Austin"},
                {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"},
                {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};
        return stateNames;
    }
}

