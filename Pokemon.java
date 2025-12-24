public class Pokemon{
    public static void main(String[] args){
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon(67, 41, "Lorax", "Water");
        System.out.println(p1);
        System.out.println(p2);
    }

    private int power;
    private double weight;
    private String name;
    private String type;

    public Pokemon(){
        power = 0;
        weight = 67;
        name = "Pikachu";
        type = "Fire";
    }

    public Pokemon(int power, double weight, String name, String type){
        this.power = power;
        this.weight = weight;
        this.name = name;
        this.type = type;
    }

    public int getPower(){
        return power;
    }
    public double getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }

    public void setPower(int power){
        this.power = power;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "Name: " + name + " Type: " + type + " Power: " + power + " Weight: " + weight;
    }
}