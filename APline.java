public class APline{
    public static void main(String[] args){
        APline line1 = new APline(6, 7, 67);
        System.out.println(line1.findSlope());
        System.out.println(line1.isOnLine(6, 7));
        APline line2 = new APline(5, -2, -17);
        System.out.println(line2.findSlope());
        System.out.println(line2.isOnLine(6,7));
        
        
    }

    private int a;
    private int b;
    private int c;

    public APline(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double findSlope(){
        return (double)-a/b;
    }

    public boolean isOnLine(int x, int y){
        if(a*x + b*y + c == 0){
            return true;
        }
        else{
            return false;
        }
    }
}