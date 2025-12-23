public class Student{
    public static void main(String[] args){
        Student p1 = new Student(67, "Arjun", 6.7);
        System.out.println(p1);
        Student p2 = new Student(41, "Ryder", 4.1);
        System.out.println(p2);
    }

    private int ID;
    private String name;
    private double gpa;

    public Student(int ID, String name, double gpa){
        this.ID = ID;
        this.name = name;
        this.gpa = gpa;
    }

    public String toString(){
        return "ID: " + ID + " name: " + name + " GPA: " + gpa;
    }
}