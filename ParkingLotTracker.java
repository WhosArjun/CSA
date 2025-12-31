import java.util.Scanner;

public class ParkingLotTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many parking spots? ");
        int spots = sc.nextInt();

        int[] lot = new int[spots]; 
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- PARKING LOT MENU ---");
            System.out.println("1. Park a car");
            System.out.println("2. Remove a car");
            System.out.println("3. Count empty spots");
            System.out.println("4. Show parking lot");
            System.out.println("5. Quit");

            System.out.print("Choose: ");
            choice = sc.nextInt();

            if (choice == 1) {
                parkCar(lot, sc);
            } 
            else if (choice == 2) {
                removeCar(lot, sc);
            } 
            else if (choice == 3) {
                System.out.println("Empty spots: " + countEmpty(lot));
            } 
            else if (choice == 4) {
                printLot(lot);
            } 
            else if (choice == 5) {
                System.out.println("Exiting program.");
            } 
            else {
                System.out.println("Invalid choice.");
            }
        }
    }

    public static void parkCar(int[] lot, Scanner sc) {
        System.out.print("Enter spot number to park (0 - " + (lot.length - 1) + "): ");
        int spot = sc.nextInt();

        if (spot < 0 || spot >= lot.length) {
            System.out.println("Invalid spot number.");
        } 
        else if (lot[spot] == 1) {
            System.out.println("That spot is already occupied.");
        } 
        else {
            lot[spot] = 1;
            System.out.println("Car parked in spot " + spot + ".");
        }
    }

    public static void removeCar(int[] lot, Scanner sc) {
        System.out.print("Enter spot number to remove car from (0 - " + (lot.length - 1) + "): ");
        int spot = sc.nextInt();

        if (spot < 0 || spot >= lot.length) {
            System.out.println("Invalid spot number.");
        } 
        else if (lot[spot] == 0) {
            System.out.println("That spot is already empty.");
        } 
        else {
            lot[spot] = 0;
            System.out.println("Car removed from spot " + spot + ".");
        }
    }

    public static int countEmpty(int[] lot) {
        int count = 0;
        for (int i = 0; i < lot.length; i++) {
            if (lot[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static void printLot(int[] lot) {
        System.out.println("\nParking Lot Status:");
        for (int i = 0; i < lot.length; i++) {
            if (lot[i] == 0) {
                System.out.println("Spot " + i + ": EMPTY");
            } else {
                System.out.println("Spot " + i + ": OCCUPIED");
            }
        }
    }
}
