public class Cow{
    public static void main(String[] args){
        Cow bessie = new Cow("Holstein", "Moo");
        System.out.println(bessie.getSound());
        System.out.println(bessie.getType());

        bessie.milkCow();
        System.out.println(bessie.getNumOfMilkings());

        bessie.milkCow();
        bessie.milkCow();
        bessie.milkCow();
        System.out.println(bessie.getNumOfMilkings());
    }
    private String type;
    private String sound;
    private int numOfMilkings;

    public Cow(String type, String sound){
        this.type = type;
        this.sound = sound;
        numOfMilkings = 0;
    }

    public String getSound(){
        return sound;
    }
    public String getType(){
        return type;
    }
    public int getNumOfMilkings(){
        return numOfMilkings;
    }
    public void milkCow(){
        numOfMilkings++;
    }
}