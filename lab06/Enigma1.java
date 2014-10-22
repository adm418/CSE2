//Anna Malisova
//October 16, 2014
//CSE 2
//Enigma1.java
/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1)
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1 {
  public static void main(String[] arg) {
    Scanner myScanner;
    myScanner = new Scanner(System.in);
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x;

    if (myScanner.hasNextDouble()) {
      x = (myScanner.nextDouble());
      if (x < 0 || x > 99) {
        System.out.println("You did not enter a value between 0 and 99.");
        return;
      }

      System.out.println("You entered " + x + "%");
      //System.out.println(1-x/100);
      double proportion = (1 - x / 100) * 100;
      proportion = (int) proportion;
      //System.out.println(proportion);
      //print out the proportion remaining for select percentages

      if (proportion == 93) //when the user enters 7
        System.out.println("The proportion remaining is " + 0.93);
      else if (proportion == 59) //when the user enters 41
        System.out.println("The proportion remaining is " + 0.59);
      else if ((1 - x / 100) == 0.86) //when the user enters 14
        System.out.println("The proportion remaining is " + 0.86);
      else if (proportion == 67) //when the user enters 33
        System.out.println("The proportion remaining is " + 0.67);
      else if ((1 - x / 100) == 0.4) //when the user enters 60
        System.out.println("The proportion remaining is " + 0.40);
    }
    else {
      System.out.println("You did not enter a value between 0 and 99.");
    }
  }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *  When the user enters 7, 41, and 33, no proportion is returned.This is because the most precise answer for 
    1-(x/100) for 7, 41, and 33 is not exactly .93, .59, or .67, but rather slightly more or slightly less.
    Therefore, you must convert the proportion to an integer first in order to find the less precise answer.
 * Also, when you enter an input that is not an error, the program crashes. Lastly, the program lets you enter
 * a value greater than 100 or less than 0  even though it asks for a value between 0 and 100.
 */
