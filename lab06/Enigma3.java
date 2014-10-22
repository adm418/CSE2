//Anna Malisova
//October 16, 2014
//Enigma3.java
/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
          //System.out.println("default of first switch: " + n);
          //System.out.println("default of first switch: " + k);
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
      //System.out.println(n);
    }
    if(n*n>k){
      n=42;
      out+=n+k;
      //System.out.println(n);
      //System.out.println(k);
    }
    else {
      n=45;
      out+=n+k;
      //System.out.println(n);
      //System.out.println(k);
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        //System.out.println(n);
        //System.out.println(k);
        break;
      case 97:
        n-=14;
        k-=2;
        //System.out.println(n);
        //System.out.println(k);
        break;
      case 98:
        n/=5;
        k/=9;
        //System.out.println(n);
        //System.out.println(k);
      default:
        n-=3;
        //k-=5; //k is equal to 0 here. This is where the error comes from.
        //System.out.println(n);
        //System.out.println(k); 
    }
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * The error comes from line 64, where k becomes equal to 0, and then line 66, hwere 1 is divided by 0.
 * 
 * 
 * 
 */

