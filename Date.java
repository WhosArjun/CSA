public class Date{
    public static void main(String[] args){
        Date d1 = new Date();
        Date d2 = new Date(6767,6,7);
        System.out.println(d1);
        System.out.println(d2);
    }
    private int year;
    private int month;
    private int day;

    public Date(){
        year = 0;
        month = 0;
        day = 0;
    }
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }
}