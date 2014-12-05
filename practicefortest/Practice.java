import java.util.Scanner;
public class Practice{


public static void main( String args[] ){
double [] A = {2.0, 3.0, 3.4};
double [] B = {1.2, 3.2, 7.3};
double [] R = new double[6];
for(int x=0; x<5; x=x+2){
    R[x]=A[x];
    R[x+1]=B[x];
}
System.out.println(R[0]+R[1]+R[2]+R[3]+R[4]+R[5]);
}




}