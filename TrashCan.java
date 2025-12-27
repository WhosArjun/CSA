public class TrashCan{
    public static void main(String[] args){
        TrashCan t1 = new TrashCan(10);
        System.out.println(t1.acceptTrash(11));
        TrashCan bedroom = new TrashCan(3.0);
        System.out.println(bedroom.acceptTrash(2.5));
        System.out.println(bedroom.acceptTrash(3.1));
    }

    private double capacity;
    private double currentWeight;

    public TrashCan(double capacity){
        this.capacity = capacity;
        currentWeight = 0;
    }

    public double acceptTrash(double weight){
        currentWeight += weight;
        if(currentWeight>=capacity){
            currentWeight = currentWeight - capacity;
        }
        return capacity-currentWeight;
    }

}
