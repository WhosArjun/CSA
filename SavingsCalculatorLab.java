    /****************************************************************
    Name(Full Name) : Arjun Arunkumar Period : 7
    Name of the Lab/Assignment : Method Lab - Savings Calculator Lab 
    Purpose of the program : The purpose of this program was to help a user 
    decided whether to put his savings in the stock market or bank account.
    To do this we developed formulas to calculate the amount of resulted 
    money based on principle, years, months, and days. 

    What I learned : I learned many different java developing skills such as
     importing different classes, how to format a class, writing pre and post
    conditions, using different datatypes, and how to develop different formulas. 
    
    The credits : Mr. Lau and My Dad
    Students who helped : N/A
    *****************************************************************/




//import decimal Format and java.util.*
import java.text.DecimalFormat;
import java.util.*;
public class SavingsCalculatorLab{
    // pre condition : this method receives the amount of years, months, and days as a valid integer. 
    // post condition : this method will receive and convert the amount of months, days, and years in the form of only years. 
    public static double setTime(){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of years money will be invested : ");
        int years = console.nextInt();
        System.out.print("Enter the number of months money will be invested : ");
        int months = console.nextInt();
        System.out.print("Enter the number of days money will be invested : ");
        int days = console.nextInt();
        double monthsInYears = months/12.0;
        double daysInYears = days/365.0;
        //System.out.print(years + monthsInYears + daysInYears);
        return years + monthsInYears + daysInYears;
    }
    // pre condition : this method receives the user input of the amount of money they saved as a valid double 
    // post condition : this method receives the amount of money saved and returns the principal(amount of money invested)
    public static double setPrincipal(){
         Scanner console = new Scanner(System.in);
         System.out.print("Enter the amount of money saved : ");
         double principal = console.nextDouble();
         return principal;

    }
    // pre condition : this method will calculate the amount of money gained from depositing in the savings account as a valid double 
    // post condition : this method will receive the calculated amount of money gained from depositing into the savings account, and return a double. 
    public static double calcSavingsAccount(double principal, double time){
        double A = principal * Math.pow(1.0025, (4*time));
        return A; 

    }
    // pre condition : this method will calculate the amount of money gained from depositing in the stock market as a valid double
    // post condition : This method will calculate the amount of money gained from the stock market, and return a double. 
    public static double calcMarketReturn(double principal, double time){
        double A = principal * Math.pow(Math.E,0.07*time);
        return A;
    }
    // pre condition : this method will calculate the distance from the outcome fo the savings account and the stock market as a valid double
    // post condition : this method will calculate the difference of the stock market and savings result, and return a valid double
    public static double calcDifference(double savingsAccountReturn, double marketAccountReturn){
        double differenceInReturns = marketAccountReturn - savingsAccountReturn; 
        return differenceInReturns;
    }
   /*   pre condition : The main method takes the user input for the principal, years, months, and days. 
        post condition : The main method utilizes the decimal format and calculates the the savings return, market return, and difference. 

   */
    public static void main (String[] args){
        //need to create a DecimalFormat object below. Name of the object is d. 
        DecimalFormat d = new DecimalFormat("$0.00");
        DecimalFormat t = new DecimalFormat("#.00");


        double principal = setPrincipal(); // ask the user for the deposit amount
        double time = setTime(); // ask the user to the enter the time
       
        double savingsReturn= calcSavingsAccount(principal,time);
        System.out.println("In a savings account with 1% annual interest for " + t.format(time) + " years, you will save " + d.format(savingsReturn));
     
        double marketReturn = calcMarketReturn(principal, time);
        System.out.println("If you invest this money in the stock market for " + t.format(time) + "years, you can excpect to save " + d.format(marketReturn));
        System.out.print("You can excpect to save " + d.format(calcDifference(savingsReturn, marketReturn)));
        System.out.println(" more by investing in the stock market.");
    
    }


}

