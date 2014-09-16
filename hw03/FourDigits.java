//Anna Malisova
//September 13, 2014
//CSE2
//FourDigits.java
//FourDigits. java will ask the user to input a double and will then print out
//the first four digits to the right of the decimal point

import java.util.Scanner;
//class
public class FourDigits {
    //main method
    public static void main (String[] args){
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print ("Enter a double and I display the four digits to the right of the decimal point-");
        double x=myScanner.nextDouble ();
        int xAsInteger=(int) x,
            xFirstDigit, xSecondDigit, xThirdDigit, xFourthDigit;
        double xDecimals=(x-xAsInteger)*10000;
        xFirstDigit=(int)(xDecimals/1000)%10;
        xSecondDigit=(int)(xDecimals/100)%10;
        xThirdDigit=(int)(xDecimals/10)%10;
        xFourthDigit=(int) (xDecimals)%10;
        //int xNewInteger=(int) xDecimals;
       
        
        System.out.println ("The four digits are " + xFirstDigit + xSecondDigit + xThirdDigit + xFourthDigit);
        
        

        
    }
    
}