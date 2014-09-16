//Anna Malisova
//September 13, 2014
//CSE2
//Bicycle.java
//Bicyle.java will ask for the user's input of the number of counts on a cyclometer and
//the number of seconds during which the count occured. It will then
//print out the distance traveled and the average miles per hour.

import java.util.Scanner;
//class
public class Bicycle{
    //main method
    public static void main (String [] args){
       Scanner myScanner;
       myScanner = new Scanner ( System.in );
       System.out.print ("Enter the number of seconds : ");
       int nSeconds = myScanner.nextInt ();
       System.out.print ("Enter the number of counts : ");
       int nCounts = myScanner.nextInt ();
       int wheelDiameter = 27;
       double PI=3.14159;
       int feetPerMile=5280;
       int inchesPerFoot=12;
       int secondsPerMinute=60;
       double minutes=nSeconds/60;
       double hours=minutes/60;
       double distance=(nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile)*100;
       int distanceAsInteger=(int) distance;
       double distanceAsDouble=(double) distanceAsInteger;
       //double distanceTwoDecimals=distanceAsInteger/100;
       double averageMph=distance/hours;
       int averageMphAsInteger= (int) averageMph;
       double averageMphAsDouble = (double) averageMphAsInteger;
      // double averageMphTwoDecimals=averageMphAsInteger/100;
       
       System.out.println ("The distance was " + (double) distanceAsDouble/100 +
       " miles and took " + minutes + " minutes.");
       System.out.println ("The average MPH was " +averageMphAsDouble/100);
    }
}
 