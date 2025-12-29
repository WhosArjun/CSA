import java.util.Scanner;
public class SequenceAnalyzer {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] seq = new int[5];
        System.out.println("Pick your first number: ");
        seq[0] = console.nextInt();
        System.out.println("Pick your first number: ");
        seq[1] = console.nextInt();
        System.out.println("Pick your first number: ");
        seq[2] = console.nextInt();
        System.out.println("Pick your first number: ");
        seq[3] = console.nextInt();
        System.out.println("Pick your first number: ");
        seq[4] = console.nextInt();

        boolean isArithmetic = true;
        boolean isGeometric = true;

        double diff = seq[1] - seq[0];
        double ratio = seq[1] / seq[0];

        for (int i = 1; i < seq.length - 1; i++) {
            if (seq[i + 1] - seq[i] != diff) {
                isArithmetic = false;
            }
            if (seq[i] != 0 && seq[i + 1] / seq[i] != ratio) {
                isGeometric = false;
            }
        }

        if (isArithmetic) {
            System.out.println("The sequence is ARITHMETIC.");
            System.out.println("Common difference: " + diff);
            System.out.println("Next term: " + (seq[seq.length - 1] + diff));
        } 
        else if (isGeometric) {
            System.out.println("The sequence is GEOMETRIC.");
            System.out.println("Common ratio: " + ratio);
            System.out.println("Next term: " + (seq[seq.length - 1] * ratio));
        } 
        else {
            System.out.println("The sequence is NEITHER arithmetic nor geometric.");
        }
    }
}
