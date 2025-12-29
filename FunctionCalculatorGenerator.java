import java.util.Scanner;
public class FunctionCalculatorGenerator{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the function calculator!");
        System.out.println("This is an example function : f(x) = a(x)^2 + b(x) + c");
        System.out.println("Please give us your a value for the quadratic function");
        double a = console.nextDouble();
        System.out.println("Give us your b value");
        double b = console.nextDouble();
        System.out.println("Give us your c value");
        double c = console.nextDouble();

        double[] array = new double[5];
        System.out.println("What is your first x value");
        array[0] = console.nextDouble();
        System.out.println("What is your second x value");
        array[1] = console.nextDouble();
        System.out.println("What is your third x value");
        array[2] = console.nextDouble();
        System.out.println("What is your fourth x value");
        array[3] = console.nextDouble();
        System.out.println("What is your fifth x value");
        array[4] = console.nextDouble();

        double evaluate;
        for(int i = 0; i<array.length; i++){
            System.out.println("For your x value of " + array[i] + " Your quadratic model evaluates to: " );
            evaluate = a*Math.pow(array[i],2) + b*array[i] + c;
            System.out.println("f(" + array[i] + ") = " + evaluate);
        }
    }
}