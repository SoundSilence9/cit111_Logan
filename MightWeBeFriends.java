/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chunk1.FriendsProject;

import java.util.Scanner;

/**
 *
 * @author Logan
 */
public class MightWeBeFriends {
    
    public static void main(String[] args) {
        
        //create a scanner and the necessary variables
        Scanner myScanner = new Scanner(System.in);
        
        String colorOne = "";
        String colorTwo = "";
        
        int totalScore = 0;
        
        //talk to the user and get input
        System.out.println("Welcome, potential friend. This progam will determine a score for friend compatibility based on basic colors. The maximum score is 100 and the minimum score is 0.");
        
        System.out.println("What are your top two favorite basic colors?");
        
        System.out.println("Enter color one (no capitals): ");
        
        colorOne = myScanner.nextLine();
        //System.out.println(colorOne);
        
        System.out.println("Enter color two (no capitals): ");
        
        colorTwo = myScanner.nextLine();
        //System.out.println(colorTwo);
        
        //execute logic and compute score
        if(colorOne.equals("blue") || colorOne.equals("green") || colorOne.equals("black")){
            totalScore += 50;
            //System.out.println("Added 50 for color one.");
        }
        
        if((colorTwo.equals("blue") && !colorOne.equals("blue")) || (colorTwo.equals("green") && !colorOne.equals("green")) || (colorTwo.equals("black") && colorOne.equals("black"))){
            totalScore += 50;
            //System.out.println("Added 50 for color two.");
        }
        
        if((colorOne.equals("orange") || colorTwo.equals("orange"))){
            totalScore += 25;
            //System.out.println("Added 25 for color one.");
        }
        
        if((colorOne.equals("purple") || colorTwo.equals("purple"))){
            totalScore += 17;
            //System.out.println("Added 17 for color two.");
        }
                
        //report the results to the user
        System.out.println("Your compatablity score based on colors is: " + totalScore);
        
    } //close main
    
}//close class
