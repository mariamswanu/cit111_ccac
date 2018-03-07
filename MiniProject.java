/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;
import java.util.Scanner;

/**
 *
 * @author mariam.swanu
 */
public class MiniProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        int userAnswer; 
        int numLoop = 0; 
        int correctAnswer = (5+5); 
        
        
        while (numLoop <3) 
        {
       System.out.print("What is 5 + 5?\n"); 
       userAnswer = keyboard.nextInt(); 
       //System.out.print("your answer was: " + userAnswer + "\n");
       
       if (userAnswer < 10)
           // IF TRUE
       {
           System.out.print("your answer is too low.\n");
                   numLoop = numLoop + 1;
       }
       else if (userAnswer > 10){
           System.out.print("your answer is too high .\n"); 
           numLoop = numLoop +1; 
       }
       else if (userAnswer == correctAnswer){
           System.out.print("congratulation !!! you got it right!!!!"); 
           numLoop = 3; 
           
       }
       
       
        }// CLOSE WHILE LOOP
        
        System.out.print("\nThe correct answer is 10.\n"); 
        System.out.print("5 + 5 is equal to 10.\n"); 
        
        
        
        
    }// CLOSE MAIN METHOD

} // CLOSE CLASS
    