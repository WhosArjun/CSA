import java.util.Scanner;
public class DataCleaner3000{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the Data Cleaner 3000!");
        System.out.println("The purpose of this DataCleaner is to wipe out all invalid inputs of numbers (negative or above 100), and find the min, max & average values");
        System.out.println("How many data values are you providing today?");
        int amtOfDataValues = console.nextInt();
        double[] array = new double[amtOfDataValues];

        for(int i = 0; i<array.length; i++){
            System.out.println("Data value " + i + " is: ");
            array[i] = console.nextDouble();
        }

        System.out.println("The amount of invalid values were " + amtOfInvalid(array));
        System.out.println("We changed these values to zero.");

        System.out.println("The minimum value in this array is : " + min(array));
        System.out.println("The maximum value in this array is " + max(array));

        System.out.println("The average of all the value of this data set is " + average(array));
    }

    public static double min(double[] array){
        double min = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    public static double max(double[] array){
        double max = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static double average(double[] array){
        double result = 0;
        for(int i = 0; i<array.length; i++){
            result+=array[i];
        }
        return result/array.length;
    }
    public static int amtOfInvalid(double[] array){
        int count = 0;
        for(int j = 0; j<array.length; j++){
            if(array[j] < 0 || array[j] > 100){
                array[j] = 0;
                count++;
            }
        }
        return count;
    }
}