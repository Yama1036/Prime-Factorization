/*
 * Yama
 * 08/11/2019
 * Prime factorization program for Summative assignment in Unit2.
 */

package primefactorization;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ayyam8774
 */
public class PrimeFactorization {

    /**
     * @param args the command line arguments
     * 
     */
    public static void score (int n1, int n2) {
        int score = 0;
        
        
        
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int choice = 0;
        int score = 0;
        int ans;
        double Per;
        int correct = 0;
        int incorrect = 0;
        
       
        while ( choice != 6 )
        {
            System.out.println(" Prime Factorization Quiz. ");
            System.out.println("");
            
            
            
            
            
            
            System.out.println("Prease enter your choice.");
            System.out.println("");
            System.out.println("1 → Level 1 : Do Prime Factorization by 1 degits. Ex: 4, 6, 8");
            System.out.println("2 → Level 2 : Do Prime Factorization by 2 degits. Ex: 10, 45, 78");
            System.out.println("3 → Level 3 : Do Prime Factorization by 3 degits. Ex: 100, 120, 526");
            System.out.println("4 → Level 4 : Do Prime Factorization by 4 degits. Ex: 1000, 1111, 2520");
            System.out.println("5 → What is Prime Factorization?");
            System.out.println("6 → Exit");
            System.out.println("");
            System.out.println("Prease enter your choice ↓");
        
            choice = keyedInput.nextInt();
            
            
            
            if (choice == 1)
            {
                System.out.println("Welcome to Level 1!!");
                System.out.println("Note: Please not use Calculator or Google or others to help you to answer those Questions.");
                System.out.println("4 Questions are provide for you. You have to answer those.");
                System.out.println("");
                System.out.println("The ways to answer → If Quesion is Do Prime Factiorization of 10, The answer is 2x5 so you enter "+25+". Don't write it as "+52+" always start with small number.");
                
                int Que1 [] = new int [4];
                Que1[0] = 4;
                Que1[1] = 6;
                Que1[2] = 8;
                Que1[3] = 9;
                
                int Ans1 [] = new int [4];
                Ans1[0] = 22;
                Ans1[1] = 23;
                Ans1[2] = 222;
                Ans1[3] = 33;
                    
                
                System.out.println("Question 1: 4");
                ans = keyedInput.nextInt();
                
                if (ans == Ans1[0])
                {
                    System.out.println("");
                    System.out.println("Correct");
                    
                    score = score + 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                }
                
                else 
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                }

                
                System.out.println("Question 2: 6");
                ans = keyedInput.nextInt();
                
                if(ans == Ans1[1])
                {
                    System.out.println("");
                    System.out.println("Correct");
                    
                    score = score + 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                }
                    
                else
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                }

                
                System.out.println("Question 3: 8");
                ans = keyedInput.nextInt();
                
                if(ans == Ans1[2])
                {
                    System.out.println("");
                    System.out.println("Correct");
                    
                    score = score + 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                }
                    
                else
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                }
                
                
                System.out.println("Question 4: 9");
                ans = keyedInput.nextInt();
                
                if(ans == Ans1[3])
                {
                    System.out.println("");
                    System.out.println("Correct");
                    
                    score = score + 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                }
                    
                else
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    
                }
                
                
                
            }
            
            
            if (choice == 2)
            {
                System.out.println("Welcome to Level 2!!");
                System.out.println("Note: Please not use Calculator or Google or others to help you to answer those Questions.");
                
                
                
                
                
                
            }
            
            
            
            if (choice == 3)
            {
                System.out.println("Welcome to Level 3!!");
                System.out.println("Note: Please not use Calculator or Google or others to help you to answer those Questions.");
                
            }
            
            
            if (choice == 4)
            {
                System.out.println("Welcome to Level 4!!");
                System.out.println("Note: Please not use Calculator or Google or others to help you to answer those Questions.");
                
            }
            
            
            
            
            if (choice == 5)
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
        
            
            if (choice == 6)
            {
                System.out.println("");
            }
    }
           
}
}

