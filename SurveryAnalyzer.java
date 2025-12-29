import java.util.Scanner;

public class SurveyAnalyzer {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Welcome! What is the survey topic? ");
        String survey = console.nextLine();

        System.out.print("How many people are taking the survey? ");
        int people = console.nextInt();

        System.out.print("How many options does this survey have? ");
        int options = console.nextInt();
        console.nextLine(); // clear newline

        String[] optionList = new String[options];

        for (int i = 0; i < options; i++) {
            System.out.print("Enter option " + (i + 1) + ": ");
            optionList[i] = console.nextLine().toLowerCase();
        }

        System.out.println("\nALL RESPONSES MUST MATCH AN OPTION EXACTLY (lowercase)");

        String[] responses = new String[people];

        for (int i = 0; i < responses.length; i++) {
            System.out.print("Person " + (i + 1) + ", enter your choice: ");
            responses[i] = console.nextLine().toLowerCase();
        }

        countResponses(optionList, responses);
    }

    // Count how many times each option was chosen
    public static void countResponses(String[] options, String[] responses) {
        int[] counts = new int[options.length];

        for (int i = 0; i < responses.length; i++) {
            for (int j = 0; j < options.length; j++) {
                if (responses[i].equals(options[j])) {
                    counts[j]++;
                }
            }
        }

        System.out.println("\nSurvey Results:");
        for (int i = 0; i < options.length; i++) {
            System.out.print(options[i] + ": ");
            for (int k = 0; k < counts[i]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}