public class AdditionPattern{
    public static void main(String[] args){
        AdditionPattern p1 = new AdditionPattern(6, 7);
        System.out.println(p1.currentNumber());
        System.out.println(p1.next());
        System.out.println(p1.next());
        System.out.println(p1.prev());
        System.out.println(p1.currentNumber());

        AdditionPattern p2 = new AdditionPattern(7,6);
        System.out.println(p2.next());
        System.out.println(p2.currentNumber());
        System.out.println(p2.prev());
        System.out.println(p2.prev());
    }

    private int number;
    private int add;

    public AdditionPattern(int number, int add){
        this.number = number;
        this.add = add;
    }

    public int currentNumber(){
        return number;
    }

    public int next(){
        number = number + add;
        return number;
    }

    public int prev(){
        number = number-add;
        return number;
    }
}