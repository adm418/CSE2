//Anna Malisova
//September 19, 2014
//BigMacAgain.java
//BigMacAgain.java will use the Scanner class to ask users how many Big Macs they want
//and whether or not they want fries. It will then calculate and print out the total cost
//of the meal. 
//Big Macs cost $2.22 each 
//An order of fries costs $2.15

import java.util.Scanner;
//class
public class BigMacAgain{
    //main method
    public static void main(String [] args){
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //prompt user for number of BigMacs
        System.out.print ("Enter the number of BigMacs: ");
        double BigMacCost=2.22;
        double FriesCost=2.15;
        
        if(myScanner.hasNextInt()) {
            int nBigMacs = myScanner.nextInt ();
            double bigMacTotalCostManyDecimals=BigMacCost*nBigMacs*100;
            int bigMacTotalCostInt=(int) bigMacTotalCostManyDecimals;
            double bigMacTotalCostTwoDecimals=bigMacTotalCostInt/100.0;
            //now check if the integer is less than 0
            if(nBigMacs>0){
                
                    System.out.println("You ordered " + nBigMacs + " for a cost of " + nBigMacs + "x" + BigMacCost + "=$" + bigMacTotalCostTwoDecimals);
                    System.out.print ("Do you want an order of fries (Y/y/N/n)?");
                    String answer=myScanner.next();
                    
                      if(answer.equals("Y") || answer.equals("y") || answer.equals("N") || answer.equals("n"))
                       {
                            if(answer.equals("Y") || answer.equals("y")){
                                System.out.println("You ordered fries at a cost of $" + FriesCost);
                                System.out.println("The total cost of the meal is $" + (bigMacTotalCostTwoDecimals+FriesCost));
                            
                            } 
                            else{
                                System.out.println("The total cost of the meal is $" + bigMacTotalCostTwoDecimals); 
                            }
                     
                       }
                       else {
                           System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
                           return;
                       }
                      
                
            }      
        
            else {
                System.out.println("You did not enter an int > 0");
                return;
             }
        }
            
        else {
            System.out.println("You did not enter an int");
            return;//leaves the program
        }
      
       
        
        
    }
    //end of main method
        
}//end of class
