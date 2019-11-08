/*
 * Yama
 * 08/11/2019
 * Prime factorization program for Summative assignment in Unit2.
 */

package primefactorization;

import java.util.Scanner;

/**
 *
 * @author ayyam8774
 */
public class PrimeFactorization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int choice = 0;
        int knowledge = 0;
        int score = 0;
        
        
        System.out.println(" Do you know what Prime Factorization is? ");
            System.out.println("");
           
            System.out.println("1 → Yes.");
            System.out.println("2 → No.");
            knowledge = keyedInput.nextInt();
            
            if (knowledge == 1)
            {
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("");
            }
            
            if (knowledge == 2)
            {
                System.out.println(" -------- Prime Factorization --------");
                System.out.println("");
                System.out.println("Prime Factorization is finding which prime numbers multiply together to make the original number.");
                System.out.println("");
                System.out.println("Prime number → a whole number greater than 1 that can not be made by multiplying other whole numbers.");
                System.out.println("");
                System.out.println("");
                System.out.println("Example 1: What are the prime factors of 12 ?");
                System.out.println("It is best to start working from the smallest prime number, which is 2, so let's check:");
                System.out.println("");
                System.out.println("12 ÷ 2 = 6");
                System.out.println("Yes, it divided exactly by 2. We have taken the first step!");
                System.out.println("");
                System.out.println("But 6 is not a prime number, so we need to go further. Let's try 2 again:");
                System.out.println("6 ÷ 2 = 3");
                System.out.println("");
                System.out.println("Yes, that worked also. And 3 is a prime number, so we have the answer:");
                System.out.println("12 = 2 × 2 × 3");
                System.out.println("");
                System.out.println("");
                System.out.println("As you can see, every factor is a prime number, so the answer must be right.");
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("");
            }
            
            
            
        while ( choice != 4 )
        {
            System.out.println(" Prime Factorization Quiz. ");
            System.out.println("");
            
            
            
            
            
            
            System.out.println("Prease enter your choice.");
            System.out.println("");
            System.out.println("1 → Find the value of a number squared (Ex: 2*2 = 2 x 2)");
            System.out.println("2 → Find the value of a number cubed (Ex: 2*3 = 2 x 2 x 2)");
            System.out.println("3 → Find the value of a number, to any power");
            System.out.println("4 → Exit");
            System.out.println("Prease enter your choice.");
        
            choice = keyedInput.nextInt();
        
    }
    
}
}
