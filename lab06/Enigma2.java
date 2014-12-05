//Anna Malisova
//October 16, 2014
//CSE2
//Enigma2.java
import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * The error is a runtime error in that for case 40, the value of 40/0 is added to out, which does not make sense since 40/0 cannot be computed, so I got rid of the /0
 * 
 * 
 * 
 * 
 */

