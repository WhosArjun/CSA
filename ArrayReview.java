public class ArrayReview{
    public static void main(String[] args){
        int[] array = {6,7,67,67,676,7,6,7,76,7};
        System.out.println(ArrayReview.countInRange(array, 67,7));
        System.out.println(ArrayReview.range(array));
        System.out.println(ArrayReview.lastIndexOf(array, 67));
        System.out.println(ArrayReview.isSorted(array));
    }

    public static int lastIndexOf(int[] array, int value){
        int index = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] == value){
                index = i;
            }
        }
        return index;
    }

    public static int range(int[] array){
        int min = 0;
        int max = 0;
        for(int i = 1; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        return max - min;
    }

    public static int countInRange(int[] array, int max, int min){
        int count = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
            else{
                count++;
            }
        }
        return count;
    }

    public static boolean isSorted(int[] array){
        for(int i = 0; i<array.length - 1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
}