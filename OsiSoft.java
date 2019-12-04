/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osisoft;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anil
 */
public class OsiSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    public static List<String> summaryRanges(int[] nums) { // Given a sorted integer array without duplicates, return the summary of its ranges.
        /* Description of program 
         Author: Sid Byreddy 
         Input:  [0,1,2,4,5,7]
         Output: ["0->2","4->5","7"]
         Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
         */
        
        String arrow = "->";
        String converter = ""; // Turns integer into a string
        int one = 1;

        ArrayList<String> rangeList = new ArrayList<String>();// Creating output list 

        if (nums.length == 1) { //Error checking to see if there is only one number, only adds the number 
            rangeList.add(nums[0] + converter); // Turns number into a string and adds to list
            return rangeList; // Returns answer since there is no more numbers 
        }

        for (int i = 0; i < nums.length; i++) { // Looping through the numbers given 
            int startingNumber = nums[i]; // Gives the starting number 
            while ((i + 1 < nums.length) && (nums[i + one] - nums[i] == one)) { // Preventing an array out of bounds exception, and checks if numbers are continuous 
                i++; // Increment the index to get the next number 
            }
            if (startingNumber != nums[i]) { // If the incremented number is not the same as the starting, then there was a continuous path
                rangeList.add(startingNumber + arrow + nums[i]); // Formats the starting number to the ending range number as a string and adds to list 
            } else { // if the starting is the same as the ending, then there was no continuous range, and just output the starting number
                rangeList.add(startingNumber + converter); // turns number into a string and adds to list
            }
        }
        return rangeList; // Returns the continuous range
    }

}
