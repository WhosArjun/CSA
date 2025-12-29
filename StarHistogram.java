import java.util.Scanner;
public class StarHistogram{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("What is the first value of your array");
        array[0] = console.nextInt();
        System.out.println("What is the second value of your array");
        array[1] = console.nextInt();
        System.out.println("What is the third value of your array");
        array[2] = console.nextInt();
        System.out.println("What is the fourth value of your array");
        array[3] = console.nextInt();
        System.out.println("What is the fifth value of your array");
        array[4] = console.nextInt();

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ": ");
            
            for(int j = 0; j<array[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}