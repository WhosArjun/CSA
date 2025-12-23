public class Person{
        private String name;
        private int age;
        private double weight;

        public Person(String name, int age, double weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String toString(){
            return "name : " + name + " age : " + age + "weight : " + weight;
        }

        public static void main(String[] args){
            Person p1 = new Person("Ryder", 67, 67);
            System.out.println(p1);
        }
}