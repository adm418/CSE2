//Anna Malisova
//CSE2
//September 21, 2014
//Month.java
//Month.java will prompt the user to enter an int (1-January, 2-Feb, etc.) 
//for the month and then display the number of days in the month
//If 2 is entered, the user is asked to enter the year

import java.util.Scanner;
//class
public class Month{
    //main method
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        int janMarchMayJulyAugOctDecNovDecDays=31;
        int febDaysNonLeap=28;
        int febDaysLeap=29;
        int aprilJuneSepDays=30;
        
        
        //prompt user for month input
        System.out.print("Enter an int giving the number of the month (1-12)- ");
        if (myScanner.hasNextInt()){
            int month=myScanner.nextInt();
            if (month>=1 && month<=12){
                if(month==1||month==3||month==5||month==7||month==8||month==10||month==11||month==12){
                    System.out.println("The month has " + janMarchMayJulyAugOctDecNovDecDays + " days");
                }
                if(month==2){
                    System.out.print("Enter an int giving the year ");
                    if (myScanner.hasNextInt()){
                        int year=myScanner.nextInt();
                        boolean leapYear = ((year % 4 == 0));
                        if(year>0){
                           if(leapYear){
                             System.out.println("The month has " +febDaysLeap+" days");
                         }
                           else{
                              System.out.println("The month has " +febDaysNonLeap+ " days");
                          }
                        }
                          else{
                              System.out.println("You did not enter a number greater than 0");
                              return;
                          }
                    //    }
                       
                    }
                    else{
                       System.out.println("You did not enter an int");
                       return;
                    }
                    }
            //   
               if(month==4||month==6||month==9){
                    System.out.println("The month has " + aprilJuneSepDays + " days");
                
                 }
               
          //      }
            //   else{
        //    System.out.println("You did not enter an int between 1 and 12");
          //  return;
    //    }
               
            
      //  }
        
    
    //    else{
     //   System.out.println("You did not enter an int");
       // return;
        
        }
        else{
            System.out.println("You did not enter an int between 1 and 12");
        }
        }
        else{
            System.out.println("You did not enter an int");
            return;
        }
    }
    

}