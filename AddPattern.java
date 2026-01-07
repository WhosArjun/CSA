public class AddPattern{
    public static void main(String[] args){
        AddPattern p1 = new AddPattern(2, 3);
        System.out.println(p1.next());
        System.out.println(p1.next());
        System.out.println(p1.next());
        System.out.println(p1.prev());
        System.out.println(p1.prev());
        System.out.println(p1.getCurrNum());
        
    }

    private int currNum;
    private int plusNum;

    public AddPattern(int currNum, int plusNum){
        this.currNum = currNum;
        this.plusNum = plusNum;
    }

    public int next(){
        currNum+=plusNum;
        return currNum;
        
    }

    public int prev(){
        currNum-=plusNum;
        return currNum;
    }

    public int getCurrNum(){
        return currNum;
    }
}