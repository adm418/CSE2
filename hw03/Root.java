//Anna Malisova
//September 13, 2014
//Root.java
//Root.java will ask the user to enter a double and then print out a crude estimate of
//the crude estimate of the cube root of the number.It will then give the value of
//the crude cube root when cubed

import java.util.Scanner;
//class
public class Root{
    //main method
    public static void main (String [] args){
       Scanner myScanner;
       myScanner = new Scanner ( System.in );
       System.out.print ("Enter a double, and I print its cube root-");
       double x = myScanner.nextDouble ();
       double guess=x/3;
       double newGuess=(2*guess*guess*guess+x)/(3*guess*guess);
       double newGuess2=(2*newGuess*newGuess*newGuess+x)/(3*newGuess*newGuess);
       double newGuess3=(2*newGuess2*newGuess2*newGuess2+x)/(3*newGuess2*newGuess2);
       double newGuess4=(2*newGuess3*newGuess3*newGuess3+x)/(3*newGuess3*newGuess3);
       double newGuess5=(2*newGuess4*newGuess4*newGuess4+x)/(3*newGuess4*newGuess4);
       double NewGuessCubed=(newGuess5*newGuess5*newGuess5);
       System.out.println ("The cube root is " + newGuess5 + " : ");
       System.out.println (newGuess5+ " * " + newGuess5 + " * " + newGuess5 + "=");
       System.out.println (NewGuessCubed);
    }
}