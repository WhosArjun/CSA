/*--------------------------------------
Name : Arjun Arunkumar
Teacher : Edmund Lau
Due Date : 1/14/2025
Name of Lab : Electric Bill Lab
What I Learned : I learned how to use different scanner materials in While loops, and I also learned
                how to properly use files in my code
Who helped me : N/A
Who did I help : N/A
--------------------------------------- */
import java.util.*;
import java.io.*;
import java.text.*;


public class ElectricBill{
    public static void main(String[] args) throws FileNotFoundException{
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        File myFile = new File("billdata.txt");
        Scanner console = new Scanner(myFile);
        String[] months = {"January", "February", "March", "April", "May", "June", 
        "July", "August","September", "October", "November", "December"};
        double[] bills = new double[12];



        int i = 0;
        while(console.hasNextDouble()){
            double line = console.nextDouble();
            bills[i] = line;
            i++;
        }
        if(i!=12){
            System.out.println("Insufficient data");
        }
        else{
        double largestAmt = bills[0];
        int index = 0;
        double result = bills[0];
        for(int k = 1; i<bills.length; k++){
            if(bills[k]>largestAmt){
                largestAmt = bills[k];
                index = i;
            }
            result+=bills[k];
        }

        String s = n.format(largestAmt);
        String t = n.format(result);

        System.out.println("Largest bill: " + s + " (" + months[index] + ")");
        System.out.println("Total for year: " + t);


    }
    console.close();
    }
}
//Sample Output : 
//Largest Bill: $144.53 (August)
//Total for year : $910.33