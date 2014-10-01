//Anna Malisova
//September 29, 2014
//BoolaBoola.java
//BoolaBoola.java will have three boolean variables to each of which the value of true or false is randomly assigned. 
//The program will then, at random, combine the three variables with random choices of && and || and stores the result.


import java.util.Scanner;
public class BoolaBoola{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        String andOrString1="";
        String andOrString2="";
        String correctOrIncorrect="";
        //String falseCases="";
        int trueFalseInt=(int)(Math.random()*(1-0))+1;
        System.out.println(trueFalseInt);
        int trueFalseInt2 = (int)(Math.random()*(1))+1;
        int trueFalseInt3 = (int)(Math.random()*(1))+1;
        //int andOr1=(int)(Math.random()*(2))+1;
        //int andOr2=(int)(Math.random()*(2))+1;
        int randomNumber=(int)(Math.random()*(4-1))+1;
        boolean trueFalse1;
        boolean trueFalse2;
        boolean trueFalse3;
        if (trueFalseInt==0){
            trueFalse1=true;
        }
        else {
            trueFalse1=false;
        }
        if (trueFalseInt2==0){
            trueFalse2=true;
        }
        else {
            trueFalse2=false;
        }
        if (trueFalseInt3==0){
            trueFalse3=true;
        }
        else {
            trueFalse3=false;
        }
        
        
        
        
        
        boolean statement1=trueFalse1||trueFalse2||trueFalse3;
        boolean statement2=trueFalse1&&trueFalse2&&trueFalse3;
        boolean statement3=trueFalse1||trueFalse2&&trueFalse3;
        boolean statement4=trueFalse1&&trueFalse2||trueFalse3;
        String answer="";
        //for (int i = 0; i < 1; i++)
        {
            
            switch (randomNumber){
                case 1:
                   System.out.print("Does " + trueFalse1 +" || "  +trueFalse2+ " || " + 
                    trueFalse3 + " have the value true(t/T) or false(f/F)?");
                    answer = myScanner.next(); 
                    if(answer.equals("f")||answer.equals("F")||answer.equals("t")||answer.equals("T")){
                        if(answer.equals("t")||answer.equals("T")&&statement1==true){
                            
                            System.out.println("Correct!");
                        }
                        else if (answer.equals("f")||answer.equals("F")&&statement1==false){
                            System.out.println("Correct!");}
                            else{
                                System.out.println("Wrong; try again");
                            }
                        }
                            
                        
                    else{
                        System.out.println("Wrong; try again");
                    }
                    break;
                case 2:
                   System.out.print("Does " + trueFalse1 +" && " +trueFalse2+ " && " + 
                    trueFalse3 + " have the value true(t/T) or false(f/F)?");
                    answer = myScanner.next(); 
                    if(answer.equals("f")||answer.equals("F")||answer.equals("t")||answer.equals("T")){
                        if(answer.equals("t")||answer.equals("T")&&statement2==true){
                            
                            System.out.println("Correct!");
                        }
                        else if (answer.equals("f")||answer.equals("F")&&statement2==false){
                            System.out.println("Correct!");}
                            else{
                                System.out.println("Wrong; try again");
                            }
                        }
                            
                        
                    else{
                        System.out.println("Wrong; try again");
                    }
                    break;
                case 3:
                    System.out.print("Does " + trueFalse1 +" || " +trueFalse2+ " && " + 
                    trueFalse3 + " have the value true(t/T) or false(f/F)?");
                    answer = myScanner.next(); 
                    if(answer.equals("f")||answer.equals("F")||answer.equals("t")||answer.equals("T")){
                        if(answer.equals("t")||answer.equals("T")&&statement3==true){
                            
                            System.out.println("Correct!");
                        }
                        else if (answer.equals("f")||answer.equals("F")&&statement3==false){
                            System.out.println("Correct!");}
                            else{
                                System.out.println("Wrong; try again");
                            }
                        }
                            
                        
                    else{
                        System.out.println("Wrong; try again");
                    }
                    break;
                case 4:
                    System.out.print("Does " + trueFalse1 +" && " +trueFalse2+ " || " + 
                    trueFalse3 + " have the value true(t/T) or false(f/F)?");
                    answer = myScanner.next(); 
                    if(answer.equals("f")||answer.equals("F")||answer.equals("t")||answer.equals("T")){
                        if(answer.equals("t")||answer.equals("T")&&statement4==true){
                            
                            System.out.println("Correct!");
                        }
                        else if (answer.equals("f")||answer.equals("F")&&statement4==false){
                            System.out.println("Correct!");}
                            else{
                                System.out.println("Wrong; try again");
                            }
                        }
                            
                        
                    else{
                        System.out.println("Wrong; try again");
                    }
                    break;
            
        }
        }
           
           
           
           
            
        
    }
}