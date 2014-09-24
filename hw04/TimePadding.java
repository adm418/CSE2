//Anna Malisova
//September 23, 2014
//TimePadding.java
//The program will ask the user to enter a positive integer for the 
//number of seconds that have passed during the day and will then
//display the time in conventional form

import java.util.Scanner;
//class
public class TimePadding{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");
        
        if (myScanner.hasNextInt()){
            int seconds = myScanner.nextInt();
            
            double hoursDecimal = seconds/3600;
            int hours = (int) hoursDecimal;
            int hoursInSeconds=hours*3600;
            int leftOverSeconds=seconds-hoursInSeconds;
            double minutesDecimal = leftOverSeconds/60;
            int minutes = (int) minutesDecimal;
            int minutesInSeconds=minutes*60;
            int leftOverSeconds2=leftOverSeconds-minutesInSeconds;
            
        
            if (leftOverSeconds2<10&&minutes>=10){
                System.out.println("The time is " + hours + ":" + minutes + ":0" + leftOverSeconds2 + ".");
            }
            if (minutes<10&&leftOverSeconds2>=10){
                System.out.println("The time is " + hours + ":0" + minutes + ":" + leftOverSeconds2 + ".");
            }
            if (minutes<10&&leftOverSeconds2<10){
                System.out.println("The time is " + hours + ":0" + minutes + ":0" + leftOverSeconds2 + ".");
            }
            if (minutes>=10&&leftOverSeconds2>=10){
                System.out.println("The time is " + hours + ":" + minutes + ":" + leftOverSeconds2 + ".");
            }
            
        }
        else{
            System.out.println("You did not enter an integer");
            return;
        }
    }
}