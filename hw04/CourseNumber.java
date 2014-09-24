//Anna Malisova
//CSE2
//September 21, 2014
//CourseNumber.java
//CourseNumber.java will ask the user to input a 6 digit number.
//The first four digits give the year and the last give the semester
//It will then print out the semester and year

import java.util.Scanner;
//class
public class CourseNumber{
    //main method
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.print("Enter a six digit number giving the course semester- ");
        int sequence=myScanner.nextInt();
        
        if(sequence>=186510&&sequence<=201440){
            double yearDecimal = sequence/100;
            int yearInt = (int) yearDecimal;
            double termDecimal = sequence - yearInt*100;
            int term = (int) termDecimal;
            if (term==10){
                System.out.println("The course was offered in the Spring semester of " + yearInt);
            }
            if (term==20){
                System.out.println("The course was offered in the Summer 1 semester of " + yearInt);
                
            }
            if (term==30){
                System.out.println("The course was offered in the Summer 2 semester of " + yearInt);
                
            }
            if (term==40){
                System.out.println("The course was offered in the Fall semester of " + yearInt);
            }
            if (term!=10 && term!=20 && term!=30 && term!=40){
                System.out.println(term + " is not a legitimate semester");
            }
        }
        else{
            System.out.println("The number was outside the range [186510,201440]");
            return;
        }
    }
}