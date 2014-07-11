/*This program asks the user for the number of rolls they want simulated and then 
 * prints a random number from 1 to 6 to the console to simulate a dice roll
 *
 * I Nathanael greene  certify that this material is my original work. No other person's
 * work has been used without suitable acknowledgment and I have not made my work available to anyone else.
 */

package dicerolling;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Nathanael Greene 000336422
 */
public class DiceRolling {

    /**
     * @param args 
     */
    public static void main(String[] args) {
      Random randomizer = new Random();
      int numberOfSides = 6;
      int roll;
      int numberOfRolls;
      Scanner input;
      
      System.out.print("Please enter the number of dice rolls: ");
      input = new Scanner(System.in);
      numberOfRolls = input.nextInt();
      
      //loops through 1 to the value of numberOfRolls each time taking a random
      //number from 1 - 6 calculated using the Random() function.
      for(int i = 1; i <= numberOfRolls; i++) {
        roll = randomizer.nextInt(numberOfSides) + 1;
        System.out.println(roll);
      }
    }

}
