//Anna Malisova
//October 19, 2014
//NumberStack.java will prompt the user for an integer between 1 and 9, inclusive, and prints out displays depending on
//the value entered, using for loops, while loops, and do-while loops

import java.util.Scanner;
public class NumberStack {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9-");
        int x = 0;
        int nNumbers = 0;
        int y;
        int z;
        int a;

        if (myScanner.hasNextInt()) {
            int input = myScanner.nextInt();
            if (input < 1 || input > 9) {
                System.out.println("You did not enter a number between 1 and 9.");
                return;
            }
            System.out.println("Using for loops:");
            nNumbers = input; // set nNumbers equal to the number input by the reader
            for (y = 1; y < nNumbers + 1; y++) { //makes the number repeat 2n-1 number of times within the same line

                for (z = 0; z < y; z++) { //makes the number repeat for n number of lines\
                    for (a = nNumbers; a > y; a--) {
                        System.out.print(" ");
                    }
                    for (x = 0; x < y - 1; x++) {
                        System.out.print(y + "" + y);

                    }
                    System.out.println(y);

                }
                for (a = nNumbers; a > y; a--) {
                    System.out.print(" ");
                }
                for (x = 0; x < y - 1; x++) { //prints out "-" 2n-1 number of times depending on the number, after each number is printed 2n-1 times for n amount of lines
                    System.out.print("--");

                }
                System.out.println("-");


            }
            System.out.println("Using while loops: ");
            y = 1;
            while (y < nNumbers + 1) { //makes the number repeat 2n-1 number of times within the same line
                z = 0;
                while (z < y) { //makes the number repeat for n number of lines\
                    a = nNumbers;
                    while (a > y) {
                        System.out.print(" ");

                        a--;
                    }
                    x = 0;
                    while (x < y - 1) {
                        System.out.print(y + "" + y);


                        x++;
                    }
                    System.out.println(y);


                    z++;
                }
                a = nNumbers;
                while (a > y) {
                    System.out.print(" ");

                    a--;
                }
                x = 0;
                while (x < y - 1) { //prints out "-" 2n-1 number of times depending on the number, after each number is printed 2n-1 times for n amount of lines
                    System.out.print("--");


                    x++;
                }
                System.out.println("-");
                y++;


            }
            System.out.println("Using do-while loops:");
            y = 1;
            do { //makes the number repeat 2n-1 number of times within the same line
                z = 0;
                do { //makes the number repeat for n number of lines\
                    a = nNumbers;
                    do {
                        System.out.print(" ");

                        a--;
                    } while (a > y - 1);
                    x = 0;
                    do {
                        System.out.print(y + "" + y);


                        x++;
                    } while (x < y - 1);
                    System.out.println(y);


                    z++;
                } while (z < y);
                a = nNumbers;
                do {
                    System.out.print(" ");

                    a--;
                } while (a > y - 1);
                x = 0;
                do { //prints out "-" 2n-1 number of times depending on the number, after each number is printed 2n-1 times for n amount of lines
                    System.out.print("--");


                    x++;
                } while (x < y - 1);
                System.out.println("-");
                y++;


            } while (y < nNumbers + 1);











        }
        else {
            System.out.println("You did not enter a number between 1 and 9.");
            return;
        }

    }
}
