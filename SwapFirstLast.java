import java.util.Arrays;
public class SwapFirstLast{
    public static void main(String[] args){
      int array[] = {1,2,3,4,5};
      SwapFirstLast.swapFirstLast(array);
      System.out.println(Arrays.toString(array));

    }

    public static void swapFirstLast(int[] array){
        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;
    }
}