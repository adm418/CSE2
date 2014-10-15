//Anna Malisova
//October 14. 2014
//Root.java
import java.util.Scanner;
public class Root{
    public static void main (String [] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter a double greater than 0 ");
        double x = myScanner.nextDouble();
        //System.out.println(x);
        //int x;
        double low = 0;
        double high = 1+x;
        double middle = ((high+low)/2);
        while ((high-low)>(0.0000001*(1+x))){
            
            if ((middle*middle)> x){
            high = middle;
            //System.out.println(high);
            }
            if((middle*middle)< x){
            low = middle;
            
            //System.out.println(low);
            }
            middle = ((high+low)/2);
        }
        System.out.println(middle);
        
    }
}