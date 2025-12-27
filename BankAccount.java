public class BankAccount{
    public static void main(String[] args){
        BankAccount p1 = new BankAccount("Arjun", 67, 6700);
        System.out.println(p1);
        System.out.println(p1.withdraw(6.7));
        System.out.println(p1.deposit(670));

        BankAccount p2 = new BankAccount();
        System.out.println(p2);
        System.out.println(p2.withdraw(67));
        System.out.println(p2.deposit(670));

        System.out.println(BankAccount.getNumAccounts());
    }

    private String name;
    private int number;
    private double balance;
    private static int numAccounts;

    public BankAccount(){
        name = "Pikachu";
        number = 0;
        balance = 0;
        numAccounts++;
    }
    
    public BankAccount(String name, int number, double balance){
        this.name = name;
        this.number = number;
        this.balance = balance;
        numAccounts++;
    }

    public String toString(){
        return this.name + " your account balance is: " + this.balance + "and your number is..." + this.number;
    }

    public double withdraw(double amount){
        if(amount<balance){
            balance-=amount;
        }
        return balance;
    }

    public double deposit(double amount){
        return amount + balance;
    }

    public static int getNumAccounts(){
        return numAccounts;
    }

}