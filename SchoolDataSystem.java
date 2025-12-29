import java.util.Scanner;
public class SchoolDataSystem{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("How many students are in your school? ");
        int students = console.nextInt();

        int[] array = new int[students];
        
        for(int i = 0; i<array.length; i++){
            System.out.println("What is the score of student " + i + " ? ");
            array[i] = console.nextInt();
        }

        System.out.println("The class average for this test is... " + average(array) + "!!!!");
        System.out.println("THe highest score was Joshua with... " + highestScore(array) + "!!!!");
        System.out.println("The lowest score was Joshua with..." + lowestScore(array) + "!!!!");
        System.out.println("The range for this test was... " + range(array) + "!");
        System.out.println("The passing threshold was a 70, the amount of students who passed was... " + passingScores(array) + "!!!");

        for(int i = 0; i<array.length; i++){
            System.out.println("Student " + (i+1) + " : " + array[i] + "->" + letterGrade(array[i]));
        }
    }
    
    public static double average(int[] array){
        int result = 0;
        for(int i = 0; i<array.length; i++){
            result+=array[i];
        }
        return result/ (double) array.length;
    }

    public static int highestScore(int[] array){
        int max = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int lowestScore(int[] array){
        int min = array[0];
        for(int i = 1; i< array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int range(int[] array){
        int min = array[0];
        int max = array[0];
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

    public static int passingScores(int[] array){
        int count = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] >= 70){
                count++;
            }
        }
        return count;
    }

    public static char letterGrade(int score) {
    if (score < 70) return 'F';
    else if (score < 80) return 'C';
    else if (score < 90) return 'B';
    else return 'A';
    }


}
