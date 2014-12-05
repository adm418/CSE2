//Anna Malisova
//December 2, 2014
//PokerHands.java will 

import java.util.Scanner;
public class PokerHands {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String newAnswer = "";
        String suitAnswer = "";
        String rankAnswer = "";
        int i = 0;
        int allCards[] = new int[52];
        for (int a = 0; a < 52; a++) {
            allCards[a] = a;
        }

        int myHand[] = new int[5];
        for (int q = 0; q < 5; q++) {
            myHand[q] = q;
        }
        String cardRank[] = {
            "a", "k", "q", "j", "10", "9", "8", "7", "6", "5", "4", "3", "2"
        };
        String cardSuit[] = {
            "c", "d", "h", "s"
        };


        do {

            for (int f = 0; f < 5; f++) {
                System.out.print("Enter the suit: 'c', 'd', 'h', or 's'-");
                suitAnswer = scan.next();

                if (suitAnswer.equals("c") || suitAnswer.equals("d") || suitAnswer.equals("h") || suitAnswer.equals("s")) {

                    for (int b = 0; b < 4; b++) {
                        if (suitAnswer.equals(cardSuit[b])) {
                            myHand[f] = (b) * 13;
                        }
                    }

                    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
                    rankAnswer = scan.next();
                    if (rankAnswer.equals("a") || rankAnswer.equals("k") || rankAnswer.equals("q") || rankAnswer.equals("j") || rankAnswer.equals("10") || rankAnswer.equals("9") || rankAnswer.equals("8") || rankAnswer.equals("7") || rankAnswer.equals("6") || rankAnswer.equals("5") || rankAnswer.equals("4") || rankAnswer.equals("3") || rankAnswer.equals("2")) {

                        for (int c = 0; c < 13; c++) {
                            if (rankAnswer.equals(cardRank[c])) {
                                myHand[f] += c;
                            }

                        }

                        for (int e = 0; e < 5; e++) {
                            for (int t = e + 1; t < 5; t++) {
                                if (myHand[t] == myHand[e]) {
                                    System.out.println("You can't enter the same card twice");
                                    f--;
                                }
                            }
                        }

                    }
                    else {
                        System.out.println("You did not enter a valid response");
                        f--;
                    }
                }
                else {
                    System.out.println("You did not enter a valid response");
                    f--;
                }

            }


            showOneHand(myHand);

            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
            newAnswer = scan.next();
        } while (newAnswer.equals("y") || newAnswer.equals("Y"));
    }

    public static void showOneHand(int hand[]) {
        int rankFrequency[]=new int [13];
        int suitFrequency[]=new int [4];
        String suit[] = {
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
        for(int a=0; a<5; a++){
            for(int b=0; b<13; b++){
                if(hand[a]%13==b){
                    rankFrequency[b]++;
                }
            }
        }
        
        int fourOfAKindCounter = 0;
        int flushCounter= 0;
        int straightCounter = 0;
        int fullHouseCounter=0;
        int twoPairCounter = 0;
        int royalFlushCounter= 0;

        
        for(int c=0; c<13; c++){
            if(rankFrequency[c] ==1){
                straightCounter++;
            }
            else{
                straightCounter = 0;
            }
            if(rankFrequency[c]==4){
                fourOfAKindCounter++;
            }
            if(rankFrequency[c]==3){
                fullHouseCounter++;
            }
            if(rankFrequency[c]==2){
                fullHouseCounter++;
                twoPairCounter++;
            }
        }
        
        
        if(rankFrequency[0]==1 && rankFrequency[1]==1 && rankFrequency[2]==1 && rankFrequency[3]==1 && rankFrequency[4]==1){
            royalFlushCounter++;
        }
        
        for (int d =0; d<5; d++){
            for(int e=0; e<4; e++){
                if(hand[d]/13 == e){
                    suitFrequency[e] = suitFrequency[e] + 1;
                }
            }
        }
        
        for (int f = 0; f<4; f++){
            if(suitFrequency[f]==5){
                flushCounter++;
            }
       }
        
        
        if(royalFlushCounter==1){
            System.out.println("This is a royal flush");
        }
        else if(royalFlushCounter==1 && straightCounter==1){
            System.out.println("This is a straight flush");
        }
        else if(fullHouseCounter==2){
            System.out.println("This is a full house");
        }
        else if(straightCounter==5){
            System.out.println("This is a straight");
        }
        else if(flushCounter==1){
            System.out.println("This is a flush");
        }
        else if(fourOfAKindCounter==1){
            System.out.println("This is four of a kind");
        }
        else if(twoPairCounter==1){
            System.out.println("This is a pair");
        }
        else if(twoPairCounter==2){
            System.out.println("This is a two pair");
        }
        
        
        
        
        
        
        
        
        
    }
    
}
    /*public static void type(int hand[]) {
            int suit[] = new int[5];
            for (int v = 0; v < 5; v++) {
                suit[v] = hand[v] / 13;
            }
            int rank[] = new int[5];
            /*for (int u = 0; u < 5; u++) {
                rank[u] = hand[u] % 13;
            }
            
            int[] rankFrequency= new int [13];
            for (int u=0; u<13; u++){
                rankFrequency[u]=0;
            }
            for(int r=0; r<5; r++){
                rankFrequency[hand[r]%13]++;
            }

            int flushCounter = 0; //
            int straightCounter = 0; //
            int royalFlushCounter = 0; //
            int straightFlushCounter = 0; // 
            int fourOfAKindCounter = 0; //
            int fullHouseCounter = 0;
            if (suit[0] == suit[1] && suit[0] == suit[2] && suit[0] == suit[3] && suit[0] == suit[4]) {
                flushCounter++;
                for (int g = 0; g < 5; g++) {
                    if (rank[g] == 0 || rank[g] == 1 || rank[g] == 2 || rank[g] == 3 || rank[g] == 4) {
                        for (int h = g + 1; h < 5; h++) {
                            if (rank[h] != rank[g] && (rank[h] == 0 || rank[h] == 1 || rank[h] == 2 || rank[h] == 3 || rank[h] == 4)) {
                                for (int i = h + 1; i < 5; i++) {
                                    if (rank[i] != rank[h] && rank[i] != rank[g] && (rank[i] == 0 || rank[i] == 1 || rank[i] == 2 || rank[i] == 3 || rank[i] == 4)) {
                                        for (int j = i + 1; j < 5; j++) {
                                            if (rank[j] != rank[i] && rank[j] != rank[h] && rank[j] != rank[g] && (rank[j] == 0 || rank[j] == 1 || rank[j] == 2 || rank[j] == 3 || rank[j] == 4)) {
                                                for (int k = j + 1; k < 5; k++) {
                                                    if (rank[k] != rank[j] && rank[k] != rank[i] && rank[k] != rank[h] && rank[k] != rank[g] && (rank[k] == 0 || rank[k] == 1 || rank[k] == 2 || rank[k] == 3 || rank[k] == 4)) {
                                                        royalFlushCounter++;
                                                        System.out.println("This is a royal flush");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(straightCounter>0&&flushCounter > 0 && royalFlushCounter == 0){
                straightFlushCounter++;
                System.out.println("This is a straight flush")
            }
            if (flushCounter > 0 && royalFlushCounter == 0 && straightFlushCounter == 0&&straightFlushCounter==0) {
                System.out.println("This is a flush");
            }
            for(int t=0; t<13; t++){
                if(rankFrequency[t]==rankFrequency[t+1]&&rankFrequency[t]==rankFrequency[t+2]&&rankFrequency[t]==rankFrequency[t+3]&&rankFrequency[t]==rankFrequency[t+4]&&rankFrequency[t]==1){
                    straightCounter++;
                    System.out.println("This is a straight");
                }
                if(rankFrequency[t]==2){
                System.out.println("This is four of a kind");
            }
            
               
            }
            
            


           
                    }


                }
                
                
                
                
                
                
                
                /* 

              
                        if (straightCounter >= 4 && flushCounter == 0) {
                            System.out.println("This is a straight");
                        }
                        if (straightCounter >= 4 && flushCounter > 0) {
                            System.out.println("This is a straight flush");
                        }
                        if (fourOfAKindCounter >= 4) {
                            System.out.println("This is four of a kind");
                        }
                        if (fourOfAKindCounter == 2) {
                            System.out.println("This is two of a kind");
                        }
                        if (fourOfAKindCounter == 3) {
                            System.out.println("This is three of a kind");
                        }*/