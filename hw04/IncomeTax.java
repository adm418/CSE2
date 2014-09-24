//Anna Malisova
//CSE2
//September 21, 2014
//IncomeTax.java
//This program will prompt the user for an int reflecting the thousands of dollars of income and
//will then write out the tax on the income.
//It will follow the following schedule: <20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%.

import java.util.Scanner;
//class
public class IncomeTax{
    //main method
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        //prompt user for int reflecting thousands of dollars of income
        System.out.print("Enter an int giving the number of thousands- ");
        if (myScanner.hasNextInt()){
            int income=myScanner.nextInt ();
            int incomeThousands=income*1000;
            if (income>0){
                if(income<20&&income>0){
                    double percentTaxLess20=5.0;
                    //int incomeThousands=income*1000;
                    System.out.println("The tax rate on $" + incomeThousands+" is "+
                    percentTaxLess20+"%, and the tax is $"+percentTaxLess20*incomeThousands/100);
                }
                if(income>=20 && income<40){
                    double percentTax20To40=7.0;
                    //int incomeThousands=income*1000;
                    System.out.println("The tax rate on $" + incomeThousands+" is "+
                    percentTax20To40+"%, and the tax is $"+percentTax20To40*incomeThousands/100);
                }
                if(income>=40 && income<78){
                    double percentTax40To78=12.0;
                    System.out.println("The tax rate on $" + incomeThousands+" is "+
                    percentTax40To78+"%, and the tax is $"+percentTax40To78*incomeThousands/100);
                }
                if(income>=78){
                    double percentTaxGreater78=14.0;
                    System.out.println("The tax rate on $" + incomeThousands+" is "+
                    percentTaxGreater78+"%, and the tax is $"+percentTaxGreater78*incomeThousands/100);
                }
                
            
                
            }
            else{
                System.out.println("You did not enter a positive int");
                return;
            }
            
        }
        else{
            System.out.println("You did not enter an int");
            return;
        }
        
    }
}
