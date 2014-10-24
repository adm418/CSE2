//Anna Malisova
//October 24, 2014

//CSE2
//Methods.java
import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
  public static int getInt(Scanner x){
	    System.out.print("Enter an int-");
	    while (!x.hasNextInt()){
	       System.out.print("You did not enter an int. Please enter an int-");
	       x.next();
	    }
	    
	    
	    return(x.nextInt());
	     
	}
    public static int larger(int y, int z){
        if (y>z){
            return(y);
        }
        else{
            return(z);
        }
        
    }
    public static boolean ascending(int q, int r, int s){
        if (q<r&&r<s){
            return(true);
        }
        else{
            return (false);
        }
    }
 
/*******SAMPLE RUNS:
Enter three ints
Enter an int- r
You did not enter an int; try again- 3
Enter an int- 8
Enter an int- 9
The larger of 3 and 8 is 8
The larger of 3, 8, and 9 is 9
It is true that 3, 8, and 9 are in ascending order

Enter three ints
Enter an int- 4
Enter an int- 3
Enter an int- 7
The larger of 4 and 3 is 4
The larger of 4, 3, and 7 is 7
It is false that 4, 3, and 7 are in ascending order
*/
}
