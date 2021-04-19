/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package ScatterinBones;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Logan
 */
public class ScatterinBones {
    
    
    
    public static void main(String[] args) {
        
        Random myRand = new Random();
        Scanner myScan = new Scanner(System.in);
    
        int bones;
        float roll;
        float odds;
        
        boolean dead = false;
   
        System.out.print("Welcome to Scatterin' Bones, the Haunted Woods Survival Predictor where you scatter bones to predict your own demise.");
        System.out.print("\n You are standing at the edge of the trees, peering into the dimly lit undergrowth. There is a 7% chance that you will pee yourself. "
                + "\n How many bones would you like to scatter? \n");
        
        /// these sections set the Random seed based on the number of bones chosen and then checks if you survived or not
        bones = myScan.nextInt();
        
        roll = myRand.nextFloat();
        //System.out.println(roll);
        odds = 7;
        //System.out.println(odds/100f);
        //if the user survives
        if(roll > (odds/100f)){
            System.out.print("Mighty brave of you to keep your drawers clean.");
        } // close if
        // ... or they don't
        else{
            System.out.print("It's alright. You're still cool even if you pee your pants sometimes. Those woods are pretty scary.");
        } // close else
        System.out.print("\n");
        
        //ACT 2
        System.out.print("\n After entering the Haunted Woods, you come across a clearing. You step tentatively across the mossy soil, but there is a 15% chance that a hand will reach up through the ground and grab your ankle."
                + "\n How many bones would you like to scatter? \n");
        /// these sections set the Random seed based on the number of bones chosen and then checks if you survived or not
        bones = myScan.nextInt();
        //myRand = new Random(bones);
        roll = myRand.nextFloat();
        //System.out.println(roll);
        odds = 15;
        //ystem.out.println(odds/100f);
        //if the user survives
        if(roll > (odds/100f)){
            System.out.print("The undead must still be tired from murdering the last person who tried this simulator.");
        } // close if
        // ... or they don't
        else{
            System.out.print("They got you, and this is where your journey ends, friend. We can't all be subjected to a tragic demise, but I guess you got lucky.");
            System.out.print("\n Thanks for playing Scatterin Bones! You didn't survive!");
            dead = true;
        } // close else
        System.out.print("\n");
        
        // ACT 3.... now we gotta check to see if they're still alive first
        if(!dead){
            System.out.print("\n After crossing the undead clearing, you come across a rickety bridge over a bottomless chasm. There is a 33% chance that when you're corssing it, the bridge will collapse and you will be falling until you die of thirst on the way down."
                + "\n How many bones would you like to scatter? \n");
            /// these sections set the Random seed based on the number of bones chosen and then checks if you survived or not
            bones = myScan.nextInt();
            //myRand = new Random(bones);
            roll = myRand.nextFloat();
            //System.out.println(roll);
            odds = 33;
            //System.out.println(odds/100f);
            //if the user survives
            if(roll > (odds/100f)){
                System.out.print("Avoided death once again there, twinkletoes.");
            } // close if
            // ... or they don't
            else{
                System.out.print("Well, now you know what's it's like to skydive, so you can cross that off of your bucket list before you kick the bucket.");
                System.out.print("\n Thanks for playing Scatterin Bones! You didn't survive!");
                dead = true;
            } // close else
        } // close ACT 3 if
        System.out.print("\n");

        // ACT 4.... still checkin to see if they're alive
        if(!dead){
            System.out.print("\n After crossing the rickety bridge, you come across a glowing cave. There is a 72% chance that whatever's in that cave has a nice recipe that includes you as an ingredient."
                + "\n How many bones would you like to scatter? \n");
            /// these sections set the Random seed based on the number of bones chosen and then checks if you survived or not
            bones = myScan.nextInt();
            //myRand = new Random(bones);
            roll = myRand.nextFloat();
            //System.out.println(roll);
            odds = 72;
            //System.out.println(odds/100f);
            //if the user survives
            if(roll > (odds/100f)){
                System.out.print("When it comes to the dinner menu, congratulations are in order for escaping it.");
                // VICTORY!!!!!!
                System.out.print("\n You see the sun and dash for the exit!");
                System.out.print("\n Thanks for playing Scatterin Bones! You actually survived!");
                
            } // close if
            // ... or they don't
            else{
                System.out.print("Ah, well. You were probably delicious.");
                System.out.print("\n Thanks for playing Scatterin Bones! You didn't survive!");
                dead = true;
            } // close else
        } // close ACT 4 if
        
    } // close main
    
} // close ScatterinBones
