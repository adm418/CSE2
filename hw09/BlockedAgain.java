//Anna Malisova
//November 2, 2014
//BlockedAgain.java
import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }

    public static int getInt() {
        System.out.print("Enter an int between 1 and 9, inclusive: "); //prompt user to enter an int
        Scanner scan = new Scanner(System.in);
        boolean isItAnInt;
        boolean inRange=false;
        int y = 0;
        while(inRange==false){ //make sure that the user's input goes through this loop at least once
            isItAnInt=checkInt(scan); 
            while(isItAnInt==false){//if it is not an int
                scan.next(); //allow for new input
                isItAnInt=checkInt(scan);
            }
            y = scan.nextInt();//if it is an int, assign y as the value
            inRange=checkRange(y); //check if y is in the range
        }
        return y; //if y is in the range and it is an int, return y


    }

    public static boolean checkInt(Scanner scan) { //method to check if the input is an integer

        if (scan.hasNextInt()) {//if the input is an integer
            return (true);
        }
        else {
            System.out.print("You did not enter an int; try again: ");
            return (false);
            
        }

    }
    public static boolean checkRange(int x) { //method to check if the input is in the right range

    
        if (x >= 1 && x <= 9) { //check if input is between 1 and 9, inclusive
            return (true);
        }
        else {
            System.out.print("You did not enter an int in [1,9]; try again: ");
            return (false);
            
        }

        

    }

    public static void allBlocks(int input) { //solves problem B of printing the stack of blocks
        int y;

        for (y = 1; y < input + 1; y++) { //makes the block() method repeat for input number of times
            block(input, y);
        }

    }

    public static void block(int input, int y) { //solves problem B1 - printing each individual block
        int x;
        int z;
        int a;

        for (z = 0; z < y; z++) { //makes the number repeat for n number of lines\
            line(input, y);

        }

        for (a = input; a > y; a--) {
            System.out.print(" ");
        }
        for (x = 0; x < y - 1; x++) { //prints out "-" 2n-1 number of times depending on the number, after each number is printed 2n-1 times for n amount of lines
            System.out.print("--");

        }
        System.out.println("-");




    }

    public static void line(int input, int y) { //solves problem B1a - printing with proper numbers and indent spaces
        int a;
        int x;
        for (a = input; a > y; a--) {//controls spacing, decrease spacing with each number increase
            System.out.print(" ");
        }
        for (x = 0; x < y - 1; x++) {//controls the number of times that the number comes out, which will be 2n-1 when you include the System.out.println(y)
            System.out.print(y + "" + y);

        }
        System.out.println(y);

    }


}