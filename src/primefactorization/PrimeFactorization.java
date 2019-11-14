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
    public static void Score (int n1, int n2, int n3) {
        // n1 = # of correct
        // n2 = # of incorrect
        // n3 = # of Questions.
        
        double per = n1 / n3;
        per = per * 100;
        per = Math.round(per);
        
        System.out.println("Your Percentage is → "+per+"%");
        
        
        if (per == 100)
        {
            System.out.println("");
            System.out.println("Perfect !!");
            System.out.println("");
        }    
        
        else if (per <= 99 && per >= 80)
        {
            System.out.println("");
            System.out.println("Well done !!");
            System.out.println("");
        }
        
        else if (per < 80 && per > 50)
        {
            System.out.println("");
            System.out.println("Nice try !!");
            System.out.println("");
        }    
        
        else if (per < 50 && per > 0)
        {
            System.out.println("");
            System.out.println("Try it again !!");
            System.out.println("");
        }
        
        else if (per == 0 ) 
        {
            System.out.println("");
            System.out.println("Do you know what Prime Factorization is?");
            System.out.println("");
        }    
    }
    
    
        public static void answer (int num1, int num2, int num3) {
            //num1 = answer that correct.
            //num2 = answer that user input.
            //num3 = score.
            int Correct;
            int Incorrect;
            int score;
            int correct;
            int incorrect;
            int current;
            
            
            
            current = num3;
            
            c = current;
            
            
            
            if (num1 == num2)
            {
                System.out.println("");
                System.out.println("Correct");
                    
                score = num3 + 1;
                System.out.println("Your score right now: "+score+"");
                System.out.println("");
                System.out.println("");
                Correct = a + 1;
                Incorrect = b + 0;
                
                a = Correct;
                b = Incorrect;
                
            }
            
            
            
            else
            {
                System.out.println("");
                System.out.println("Incorrect");
                    
                score = num3 - 1;
                System.out.println("Your score right now: "+score+"");
                System.out.println("");
                System.out.println("");
                Correct = a + 0;
                Incorrect = b + 1;
                
                a = Correct;
                b = Incorrect;
                
            }
            
            
        }
                
            
    
    
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int choice = 0;
        int score = 0;
        int ans;
        double Per;
        int correct = 0;
        int incorrect = 0;
        int current = 0;
        
       
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
                System.out.println("Note: Please do not use Calculator or Google or others to help you to answer those Questions.");
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
                    correct = correct + 1;
                    incorrect = incorrect + 0;
                }
                
                else 
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 0;
                    incorrect = incorrect + 1;
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
                    correct = correct + 1;
                    incorrect = incorrect + 0;
                }
                    
                else
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 0;
                    incorrect = incorrect + 1;
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
                    correct = correct + 1;
                    incorrect = incorrect + 0;
                }
                    
                else
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 0;
                    incorrect = incorrect + 1;
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
                    correct = correct + 1;
                    incorrect = incorrect + 0;
                }
                    
                else
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 0;
                    incorrect = incorrect + 1;
                    
                }
                
                Score(correct, incorrect, 4);
                
                
                System.out.println("----------------------------------------------------------------------------");
                
            }
            
            
            if (choice == 2)
            {
                System.out.println("Welcome to Level 2!!");
                System.out.println("Note: Please do not use Calculator or Google or others to help you to answer those Questions.");
                System.out.println("10 Questions are provide for you. You have to answer those.");
                System.out.println("");
                System.out.println("The ways to answer → If Quesion is Do Prime Factiorization of 10, The answer is 2x5 so you enter "+25+". Don't write it as "+52+" always start with small number.");
                
                
                int Que2 [] = new int [10];
                Que2[0] = 10;
                Que2[1] = 25;
                Que2[2] = 12;
                Que2[3] = 72;
                Que2[4] = 32;
                Que2[5] = 16;
                Que2[6] = 99;
                Que2[7] = 27;
                Que2[8] = 80;
                Que2[9] = 34;
                
                int Ans2 [] = new int [10];
                Ans2[0] = 25;
                Ans2[1] = 55;
                Ans2[2] = 223;
                Ans2[3] = 22233;
                Ans2[4] = 22222;
                Ans2[5] = 2222;
                Ans2[6] = 3311;
                Ans2[7] = 333;
                Ans2[8] = 22225;
                Ans2[9] = 217;
                    
                
                System.out.println("Question 1: 10");
                ans = keyedInput.nextInt();
                
                if (ans == Ans2[0])
                {
                    System.out.println("");
                    System.out.println("Correct");
                    
                    score = score + 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 1;
                    incorrect = incorrect + 0;
                }
                
                else 
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 0;
                    incorrect = incorrect + 1;
                }

                
                System.out.println("Question 2: 25");
                ans = keyedInput.nextInt();
                
                if(ans == Ans2[1])
                {
                    System.out.println("");
                    System.out.println("Correct");
                    
                    score = score + 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 1;
                    incorrect = incorrect + 0;
                }
                    
                else
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 0;
                    incorrect = incorrect + 1;
                }

                
                System.out.println("Question 3: 12");
                ans = keyedInput.nextInt();
                
                if(ans == Ans2[2])
                {
                    System.out.println("");
                    System.out.println("Correct");
                    
                    score = score + 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 1;
                    incorrect = incorrect + 0;
                }
                    
                else
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 0;
                    incorrect = incorrect + 1;
                }
                
                
                System.out.println("Question 4: 72");
                ans = keyedInput.nextInt();
                
                if(ans == Ans2[3])
                {
                    System.out.println("");
                    System.out.println("Correct");
                    
                    score = score + 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 1;
                    incorrect = incorrect + 0;
                }
                    
                else
                {
                    System.out.println("");
                    System.out.println("Incorrect");
                    
                    score = score - 1;
                    System.out.println("Your score right now: "+score+"");
                    System.out.println("");
                    System.out.println("");
                    correct = correct + 0;
                    incorrect = incorrect + 1;
                    
                }
                
                System.out.println("----------------------------------------------------------------------------");
                
            }
                
                
                
           
            
            
            
            if (choice == 3)
            {
                System.out.println("Welcome to Level 3!!");
                System.out.println("Note: Please do not use Calculator or Google or others to help you to answer those Questions.");
                System.out.println("");
                System.out.println("");
                System.out.println("Question1: 100");
                ans = keyedInput.nextInt();
                
                answer(2255,ans,current);
                
                System.out.println("");
                System.out.println("");
                System.out.println("Question2: 121");
                ans = keyedInput.nextInt();
                
                
                answer(1111,ans,current);
                
                System.out.println("");
                System.out.println("");
                System.out.println("Question3: 525");
                System.out.println("");
                ans = keyedInput.nextInt();
                
                answer(3557,ans,current);
                
                Score(correct,incorrect,3);
                
                
                
                
            }
            
            
            if (choice == 4)
            {
                System.out.println("Welcome to Level 4!!");
                System.out.println("Note: Please do not use Calculator or Google or others to help you to answer those Questions.");
                
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

