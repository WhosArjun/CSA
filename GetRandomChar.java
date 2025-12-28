public class GetRandomChar{
    public static void main(String[] args){
        for(int i = 0; i<11; i++){
            System.out.print(getRandomChar() + " ");
        }
    }

    public static char getRandomChar(){
        char[] choices = {'r','r','r','p','p','p','p','p','s','s','s','s','s'};
        int index = (int)(Math.random()*choices.length);
        return choices[index];
    }
}