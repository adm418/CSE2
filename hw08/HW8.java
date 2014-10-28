//Anna Malisova
//October 26, 2014
//CSE 2
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input; //originally said char input
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc"); //calls method where user must enter either C or c
	System.out.println("You entered '"+input+"'"); //prints out what user inputs
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); 
	input=getInput(scan,"yYnN",5); //give up after 5 attempts, user has 5 attempts to enter y, Y, n, or N
	if(input!=' '){ 
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  
   public static char getInput(Scanner x, String r){
	    String y=(x.next());
	    while ((y.charAt(0)!=r.charAt(0)&&y.charAt(0)!=r.charAt(1))||y.length()!=1){
	    while (y.length()!=1){
	        System.out.print("You should enter exactly one character-");
	        y = (x.next());
	    }
	    
	    while (y.charAt(0)!=r.charAt(0)&&y.charAt(0)!=r.charAt(1)&&y.length()==1){
	       System.out.print("You did not enter a character from the list '" + r+ "'; try again-");
	       y = (x.next());
	    }	
	    }
	    
	    
	    return(y.charAt(0));
   }
   public static char getInput(Scanner x, String r, int a){
       int starter = 1;
       String y=(x.next());
       
       while ((y.charAt(0)!=r.charAt(0)&&y.charAt(0)!=r.charAt(1)&&y.charAt(0)!=r.charAt(2)&&y.charAt(0)!=r.charAt(3))||y.length()!=1){
       	while (y.length()!=1){
	        if (starter>(a-1)){
               return (' ');
           }
	        System.out.print("You should enter exactly one character-");
	        y = (x.next());
	        starter++;
	    }
       
       while (y.charAt(0)!=r.charAt(0)&&y.charAt(0)!=r.charAt(1)&&y.charAt(0)!=r.charAt(2)&&y.charAt(0)!=r.charAt(3)&&y.length()==1){
           if (starter>(a-1)){
               System.out.println("You failed after 5 tries");
               return (' ');
           }
	       System.out.print("You did not enter a character from the list '" + r+ "'; try again-");
	       y = (x.next());
	       starter++;
	    }
       }
       
	    
	    
	    return(y.charAt(0));
   }
   
   public static char getInput(Scanner x, String quote, String r){
       System.out.println(quote);
       System.out.print("Enter one of: '" + r.charAt(0) + "', '" + r.charAt(1) + "', '" + r.charAt(2) + "', '" + r.charAt(3) + "', '" +r.charAt(4) + "', '" +r.charAt(5) + "', '" +r.charAt(6) + "', '" +r.charAt(7) + "', '" +r.charAt(8) + "', '" +r.charAt(9) + "' -");
       String y=(x.next());
	    
	   
	   while ((y.charAt(0)!=r.charAt(0)&&y.charAt(0)!=r.charAt(1)&&y.charAt(0)!=r.charAt(2)&&y.charAt(0)!=r.charAt(3)&&y.charAt(0)!=r.charAt(4)&&y.charAt(0)!=r.charAt(5)&&y.charAt(0)!=r.charAt(6)&&y.charAt(0)!=r.charAt(7)&&y.charAt(0)!=r.charAt(8)&&y.charAt(0)!=r.charAt(9))||y.length()!=1){
	   	while (y.length()!=1){
	        System.out.println("You should enter exactly one character.");
	        System.out.println(quote);
	        System.out.print("Enter one of: '" + r.charAt(0) + "', '" + r.charAt(1) + "', '" + r.charAt(2) + "', '" + r.charAt(3) + "', '" +r.charAt(4) + "', '" +r.charAt(5) + "', '" +r.charAt(6) + "', '" +r.charAt(7) + "', '" +r.charAt(8) + "', '" +r.charAt(9) + "' -");
	        y = (x.next());
	    }
	    
	    while (y.charAt(0)!=r.charAt(0)&&y.charAt(0)!=r.charAt(1)&&y.charAt(0)!=r.charAt(2)&&y.charAt(0)!=r.charAt(3)&&y.charAt(0)!=r.charAt(4)&&y.charAt(0)!=r.charAt(5)&&y.charAt(0)!=r.charAt(6)&&y.charAt(0)!=r.charAt(7)&&y.charAt(0)!=r.charAt(8)&&y.charAt(0)!=r.charAt(9)&&y.length()==1){
	       System.out.println("You did not enter an acceptable character.");
	       System.out.println(quote);
	       System.out.print("Enter one of: '" + r.charAt(0) + "', '" + r.charAt(1) + "', '" + r.charAt(2) + "', '" + r.charAt(3) + "', '" +r.charAt(4) + "', '" +r.charAt(5) + "', '" +r.charAt(6) + "', '" +r.charAt(7) + "', '" +r.charAt(8) + "', '" +r.charAt(9) + "' -");
	       y = (x.next());
	    }
	   }
	    
	    
	    
	    return(y.charAt(0));
   }
}