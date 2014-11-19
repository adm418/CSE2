//Anna Malisova
//November 15, 2014
//PokerOdds.java will use the method showHands() to generate a random poker hand as many times as desired by the user,
//followed by the method simulateOdds() to figure out the odds of a pair of a certain rank if a random hand is generated
//10,000 times

import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
        showHands();
        simulateOdds();
    }

    public static void showHands() {
        Scanner scan = new Scanner(System.in);
        int remainder;
        String rankArray[] = {
            "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"
        };
        int suit;
        String rank = "";
        int allCards[] = new int[52];
        boolean goAgain; //will be used to see if the do-while loop will run again
        do {
            for (int x = 0; x < 52; x++) {
                allCards[x] = x; //set the value of all the array values equal to their label value
            }
            int myHand[] = new int[5];
            for (int y = 0; y < 5; y++) {
                myHand[y] = -1; //set all the values of the array to -1
            }

            for (int z = 0; z < 5; z++) { //makes sure that a card is drawn randomly five times, in order to form a hand
                int randomCard = (int)(Math.random() * ((51 - z) + 1)); //generates a random number between 51 and 0, then 50 and 0, and so on and so on until it is between 47 and 0;
                myHand[z] = allCards[randomCard]; //sets the number card of the hand equal to the array value of the random number picked
                allCards[randomCard] = allCards[51 - z]; //sets the card of the number picked to the last value of the array, so that it is still in selection for the next Math.random
                allCards[51 - z] = -1; //sets the last number in the array to -1, so that there is one less number that can be picked in the Math.random
            }


            String labels[] = {
                "Clubs", "Diamonds", "Hearts", "Spades"
            };
            for (int i = 0; i < 4; i++) {
                System.out.print(labels[i] + ": "); //prints out Clubs: first time, Diamonds: second time, and so on
                for (int h = 0; h < 5; h++) {
                    remainder = myHand[h] % 13;
                    suit = myHand[h] / 13;
                    rank = rankArray[remainder]; //if the remainder is 0, the rank is A, if it is 1, it is K, and so on

                    if (i == 0 && suit == 0) { //if the suit is clubs and manages the label "Clubs", print the rank of the card after the label
                        System.out.print(rank + " ");
                    }
                    if (i == 1 && suit == 1) { //if the suit is diamonds and manages the label "Diamonds", print the rank of the card after the label
                        System.out.print(rank + " ");
                    }
                    if (i == 2 && suit == 2) {
                        System.out.print(rank + " "); //if the suit is hearts and manages the label "Hearts", print the rank of the card after the label
                    }
                    if (i == 3 && suit == 3) {
                        System.out.print(rank + " "); //if the suit is spades and manages the label "Spades", print the rank of the card after the label
                    }

                }
                System.out.println(); //end the line
            }
            System.out.print("Enter Y or y to go again, anything else to move on- ");
            String answer = scan.next();
            if (answer.equals("Y") || answer.equals("y")) {
                goAgain = true; //if and only if the user enters "y" or "Y", make the condition for the do-while loop true so that it goes through the loop again
            }
            else {
                goAgain = false;
            }
        } while (goAgain == true);




    }





    public static void simulateOdds() {
        Scanner scan = new Scanner(System.in);
        int remainder;
        int numNoPairs = 0;
        int rankArray[] = {
            14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2
        }; //basically the same as in the other method, except I used numbers to allow myHand[] to take in the value and for myHand[] to be able to go through the exactlyOneDup method
        int pairsArray[] = new int[13];
        for (int y = 0; y < 13; y++) {
            pairsArray[y] = 0;
        }
        int suit;
        int rank = 0;
        int allCards[] = new int[52];
        boolean goAgain;
        for (int a = 0; a < 10000; a++) { //make the method from before run 10,000 times, except don't print out the hand 10,000 times
            for (int x = 0; x < 52; x++) {
                allCards[x] = x;
            }
            int myHand[] = new int[5];
            for (int y = 0; y < 5; y++) {
                myHand[y] = -1;
            }

            for (int z = 0; z < 5; z++) {
                int randomCard = (int)(Math.random() * ((51 - z) + 1));
                myHand[z] = allCards[randomCard];
                allCards[randomCard] = allCards[51 - z];
                allCards[51 - z] = -1;
            }

            for (int h = 0; h < 5; h++) {
                remainder = myHand[h] % 13;
                suit = myHand[h] / 13;
                rank = rankArray[remainder];
                myHand[h] = rank; //store the card for each card in the hand
            }
            if (exactlyOneDup(myHand) == true) { //check if there is exactly one duplicate. If there is, check where it is by:
                for (int r = 2; r < 15; r++) { //go through all the ranks
                    for (int i = 0; i < 5; i++) { //go through the hand
                        for (int c = i + 1; c < 5; c++) {
                            if (myHand[i] == myHand[c] && myHand[i] == r) { //if the hand is equal to another value of the hand and that is equal to a specific rank, 
                                pairsArray[r - 2] ++; //add one to the counder of the number of pairs for that specific rank
                            }
                        }
                    }
                }
            }
            if (exactlyOneDup(myHand) == false) {
                numNoPairs++; //if there is not exactly one duplicate, meaning there are no pairs, add to the counter for the number of no pairs to be displayed at the end
            }


        }
        System.out.println(" Rank      Freq of exactly one pair");
        String labels[] = {
            "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"
        };
        for (int i = 0; i < 4; i++) { //Print the labels. The reason I separated it into 3 loops was to make the spacing for "10" equal to the rest, since "10" is one character longer than the other labels
            System.out.println("  " + labels[i] + ":        " + pairsArray[i]);

        }
        for (int i = 4; i < 5; i++) {
            System.out.println(" " + labels[i] + ":        " + pairsArray[i]);

        }
        for (int i = 5; i < 13; i++) {
            System.out.println("  " + labels[i] + ":        " + pairsArray[i]);

        }

        System.out.println("-------------------------------------------");
        System.out.println("total not exactly one pair: " + numNoPairs);
    }


    public static boolean exactlyOneDup(int x[]) {
        int numDuplicates = 0;
        for (int i = 0; i < 5; i++) {
            for (int h = i + 1; h < 5; h++) { //go through the array to see if the value at one point of the array is equal to the value at any other points of the array
                if (x[i] == x[h]) {
                    numDuplicates++; //if it is, add one to the counter of the number of duplicates
                }
            }
        }
        if (numDuplicates == 1) { //if there is exactly one duplicate, return true. Otherwise, return false
            return true;
        }
        else {
            return false;
        }


    }
}
