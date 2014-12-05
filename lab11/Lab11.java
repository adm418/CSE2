//Anna Malisova
//lab11

import java.util.Scanner;
public class Lab11{
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        int x[] = new int[10];
        System.out.print("Enter 10 ints- ");
        for(int i=0; i<10; i++){
        x[i]=scan.nextInt(); 
        }
        int lowest=x[0];
        int highest=x[0];
        int sum=x[0];
        for (int j=0; j<10; j++){
            for(int k=j+1; k<10; k++){
                if (x[k]<lowest){
                    lowest=x[k];
                }
                if (x[k]>highest){
                    highest=x[k];
                }
            }
            if(j<9){
            sum=sum+x[j+1];
            }
        }
        System.out.println("The lowest entry is "+lowest);
        System.out.println("The highest entry is "+highest);
        System.out.println("The sum is "+sum);
        int m=9;
        for (int l=0; l<10; l++){
            System.out.print(" ");
            System.out.print(x[l]);
            System.out.print("    ");
            System.out.println(x[m]);
        m--;
        }
    }
}