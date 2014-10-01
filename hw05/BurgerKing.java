//Anna Malisova
//September 28, 2014
//BurgerKing.java
//BurgerKing.java will prompt the user to enter a choice of a burger, a soda, or fries and will then 
//prompt the users for details of their choices.

import java.util.Scanner;
//class
public class BurgerKing{
    //main method
    public static void main(String [] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("    Burger (B or b)");
        System.out.println("    Soda (S or s)");
        System.out.print("  Fries (F or f)");
        String foodChoice=myScanner.next();
        String sodaChoice="";
        String burgerChoice="";
        String friesChoice="";
        int count=foodChoice.length();
        switch (count){
            case 1:
        
        switch (foodChoice){
            case "B":
                System.out.println("Enter A or a for 'all the fixins'");
                System.out.println("     C or c for cheese");
                System.out.print("    N or n for none of the above");
                burgerChoice=myScanner.next();
                switch (burgerChoice){
                    case "A":
                        System.out.println("You ordered a burger with 'all the fixins'");
                        break;
                    case "a":
                        System.out.println("You ordered a burger with 'all the fixins'");
                        break;
                    case "C":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "c":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "N":
                        System.out.println("You ordered a burger with nothing");
                        break;
                    case "n":
                        System.out.println("You ordered a burger with nothing");
                        break;
                    default:
                    System.out.println("You did not enter any of A, a, C, c, N, or n");
                    break;
                }
                break;
            case "b":
                System.out.println("Enter A or a for 'all the fixins'");
                System.out.println("     C or c for cheese");
                System.out.print("    N or n for none of the above");
                burgerChoice=myScanner.next();
                switch (burgerChoice){
                    case "A":
                        System.out.println("You ordered a burger with 'all the fixins'");
                        break;
                    case "a":
                        System.out.println("You ordered a burger with 'all the fixins'");
                        break;
                    case "C":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "c":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "N":
                        System.out.println("You ordered a burger with nothing");
                        break;
                    case "n":
                        System.out.println("You ordered a burger with nothing");
                        break;
                    default:
                    System.out.println("You did not enter any of A, a, C, c, N, or n");
                    break;
                }
                break;
            case "S":
                System.out.println("Do you want Pepsi (p or P),");
                System.out.print("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)-"); 
                sodaChoice=myScanner.next();
                switch (sodaChoice){
                    case "p":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "P":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "c":
                        System.out.println("You ordered a Coke");
                        break;
                    case "C":
                        System.out.println("You ordered a Coke");
                        break;
                    case "s":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "S":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "M":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    case "m":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    default:
                    System.out.println("You did not enter any of p, P, c, C, s, S, m, or M");
                    break; 
                }
                break;
            case "s":
                System.out.println("Do you want Pepsi (p or P),");
                System.out.print("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)-"); 
                sodaChoice=myScanner.next();
                switch (sodaChoice){
                    case "p":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "P":
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "c":
                        System.out.println("You ordered a Coke");
                        break;
                    case "C":
                        System.out.println("You ordered a Coke");
                        break;
                    case "s":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "S":
                        System.out.println("You ordered a Sprite");
                        break;
                    case "M":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    case "m":
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    default:
                    System.out.println("You did not enter any of p, P, c, C, s, S, m, or M");
                    break; 
                }
                break;
            case "F":
                System.out.print("Do you want a large or small order of fries (l,L,s, or S)-");
                friesChoice=myScanner.next();
                switch (friesChoice){
                    case "l":
                        System.out.println("You ordered large fries");
                        break;
                    case "L":
                        System.out.println("You ordered large fries");
                        break;
                    case "s":
                        System.out.println("You ordered small fries");
                        break;
                    case "S":
                        System.out.println("You ordered small fries");
                        break;
                    default:
                    System.out.println("You did not enter any of l, L, s, or S");
                    break; 
                }
                break;
            case "f":
                System.out.print("Do you want a large or small order of fries (l,L,s, or S)-");
                friesChoice=myScanner.next();
                switch (friesChoice){
                    case "l":
                        System.out.println("You ordered large fries");
                        break;
                    case "L":
                        System.out.println("You ordered large fries");
                        break;
                    case "s":
                        System.out.println("You ordered small fries");
                        break;
                    case "S":
                        System.out.println("You ordered small fries");
                        break;
                    default:
                    System.out.println("You did not enter any of l, L, s, or S");
                    break; 
                }
                break;
            default:
                System.out.println("You did not enter any of B, b, S, s, F, or f");
                break;
        }
        break;
        default:
           System.out.println("A single character expected");
                break; 
        }
            
   
    }
}