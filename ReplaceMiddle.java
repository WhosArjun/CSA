import java.util.Arrays;
public class ReplaceMiddle{
    public static void main(String[] args){
        char[] array = {'M', 'a', 'd', 'd', 'i', 'e'};
        ReplaceMiddle.replaceMiddle(array);
        System.out.println(Arrays.toString(array));
    }
    
    //Assume that the length of the array is an odd number
    public static void replaceMiddle(char[] array){
         array[array.length / 2] = '*';
    }
}