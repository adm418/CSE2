//Anna Malisova
//September 25, 2014
//CSE2
//RandomGames.java
//RandomGames.java will prompt the user to choose from 1 of 3 games: 
//Roulette, Craps, or Picking a card from a deck of playing cards

import java.util.Scanner;
//class
public class RandomGames{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card-");
        String answer = myScanner.next();
        //int count = StringUtils.countMatches(myScanner.next(), myScanner.next());
        int count = answer.length();// - answer.replaceAll("\\.", "").length();
        int rouletteNumber = (int) (Math.random() * ((37 - 0) + 1));
        int rollDie1=(int)(Math.random()*(6-1))+1;
        int rollDie2=(int)(Math.random()*(6-1))+1;
        int cardNumber=(int) (Math.random()*((14-2)+1));
        int cardSuit=(int)(Math.random()*((5-1)+1));
        String card="";
        String suit="";
        //String suit = "suit";
        
        switch (count){
            case 1:
                switch(answer){
                    case "R":
                        switch(rouletteNumber){
                            case 37:
                                System.out.println("Roulette: 00");
                                break;
                                
                            default:
                            System.out.println("Roulette: " + rouletteNumber); 
                            break;
                        }
                       break; 
                    case "r":
                        switch(rouletteNumber){
                            case 37:
                                System.out.println("Roulette: 00");
                                break;
                            default:
                            System.out.println("Roulette: " + rouletteNumber); 
                            break;
                        }
                        break;
                    case "C":
                       
                        System.out.println("Craps: " + rollDie1+"+"+rollDie2+"="+(rollDie1+rollDie2));
                        break;
                    case "c":
                        System.out.println("Craps: " + rollDie1+"+"+rollDie2+"="+(rollDie1+rollDie2));
                        break;
                    case "P":
                        switch(cardNumber){
                            case 12:
                                card="Ace";
                               
                                break;
                                
                            case 11:
                                card="King";
                                   
                                break;
                            case 1:
                                card="Queen";
                                
                                break;
                            case 0:
                                card="Jack";
                                 
                                break;
                            default:
                                card=Integer.toString(cardNumber);
                                break;
                         
                        }
                        switch(cardSuit){
                                        case 0:
                                        suit ="hearts";
                                      
                                        break;
                                        case 1:
                                        suit ="clubs";
                                
                                        break;
                                        case 2:
                                        suit ="diamonds";
                                       
                                        break;
                                        case 3:
                                        suit ="spades";
                                       
                                        break;
                                          }
                        System.out.println(card+" of "+suit);  
                        
                 
                        break;
                    case "p":
                        switch(cardNumber){
                            case 12:
                                card="Ace";
                               
                                break;
                                
                            case 11:
                                card="King";
                                   
                                break;
                            case 1:
                                card="Queen";
                                
                                break;
                            case 0:
                                card="Jack";
                                 
                                break;
                            default:
                                card=Integer.toString(cardNumber);
                                break;
                         
                        }
                        switch(cardSuit){
                                        case 1:
                                        suit ="hearts";
                                      
                                        break;
                                        case 2:
                                        suit ="clubs";
                                
                                        break;
                                        case 3:
                                        suit ="diamonds";
                                       
                                        break;
                                        case 4:
                                        suit ="spades";
                                       
                                        break;
                                          }
                        System.out.println(card+" of "+suit);  
                        
                 
                        break;
                    default:
                       System.out.println("'" + answer + "' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
                        break;
                    
                }
            break;
            default:
                System.out.println("a single character expected");
                break;
                
        }
     
    }
}