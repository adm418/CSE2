//Anna Malisova
//October 10, 2014
//Lab07
import java.util.Scanner;
public class LoopTheLoop{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter a number between 1 and 15");
        int nStars = 10;
        int nStars2 = 0;
        int i = 0;
        
        boolean inputIsInt = (myScanner.hasNextInt());
        int input;
        boolean inputRange;
        if(inputIsInt=true){
            input=myScanner.nextInt();
            inputRange= (input>=1&&input<=15);
        }
        if(inputIsInt=false){
            System.out.println("Your int was not in the range [1.15]");
        }
        if (inputRange=true){
            nStars=input;
        }
        else{
            System.out.println("Your int was not in the range [1.15]");
            return;
        }
        while (nStars2<nStars){
        i=0;    
          while (i<=(nStars2)){
            System.out.print("*");
            
           
            i++;
        
        }
        System.out.println();  
        
         nStars2++;   
        }
           
        
    }
}