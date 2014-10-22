//Anna Malisova
//October 10, 2014
//Lab07
import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
       
        int nStars = 10;
        int nStars2 = 0;
        int i = 0;
        String answer;


       

        while (true) {
            System.out.print("Enter a number between 1 and 15 ");
            boolean inputIsInt = (myScanner.hasNextInt());
            int input = 0;
            boolean inputRange = true;
            nStars = 10;
            nStars2 = 0;
            i = 0;
            if (inputIsInt) {

                input = myScanner.nextInt();
                inputRange = (input >= 1 && input <= 15);

                if (inputRange) {
                    nStars = input;
                    while (nStars2 < (nStars - 1)) {
                        System.out.print("*");
                        nStars2++;
                    }
                    System.out.println("*");
                    nStars = input;
                    nStars2 = 0;
                    while (nStars2 < nStars) {
                        i = 0;
                        while (i <= (nStars2)) {
                            System.out.print("*");


                            i++;

                        }
                        System.out.println();

                        nStars2++;
                    }
                }
                else {
                    System.out.println("Your int was not in the range [1.15]");
                    return;
                }
            }
            else {
                System.out.println("You did not enter an int");
            }
            
            
            System.out.print("Enter y or Y to go again- ");
            answer = myScanner.next ();
            
            
            
            if ((!answer.equals("Y"))&&(!answer.equals("y"))){
                break;
            }
        }





    }
}