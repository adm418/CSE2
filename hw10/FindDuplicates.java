//Anna Malisova
//November 15, 2014
//CSE2
//FindDuplicates will ask the user to input ten numbers, make those ten numbers into an array,
//and find out if there are any duplicates and also if there is exactly one dupilcate,
//and will report the results to the user

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- "); //prompts user to enter ten ints
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt(); //sets each consecutive number entered into the value for the next value of the array
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ //if there are duplicates, print out that the array (insert array here) has duplicates
        out+="has ";
      }
      else{ //if there are no duplicates, print out the array (insert array here) does not have dupicates
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num); //uses list array to form the list of the array generated by the user   
      if(exactlyOneDup(num)){ //if there is exactly one duplicate, print out that the array (insert array here) has exactly one duplicate
        out+="has ";
      }
      else{ //if there is not exactly one duplicate, print out that the array (insert array here) does not have exactly one duplicate
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); 
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{"; //print brackets before (and later after) array 
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", "; //after each value of the array, put a comma 
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int x[]){
      int numDuplicates=0;
      for(int i=0;i<10;i++){
          for(int h=i+1; h<10; h++){ //go through the array to see if the value at one point of the array is equal to the value at any other points of the array
             if (x[i]==x[h]){
                 numDuplicates++; //if it is, add one to the counter of the number of duplicates
             } 
          }
      }
      if (numDuplicates>0){ //if there is at least one duplicate, return true. Otherwise, return false
          return true;
      }
      else{
          return false;
      }

      
     
  }
  
  public static boolean exactlyOneDup(int x[]){ //go through the same process as the hasDups method, except this time only return true if there is exactly one duplicate
      int numDuplicates=0;
      for(int i=0;i<10;i++){
          for(int h=i+1; h<10; h++){
             if (x[i]==x[h]){
                 numDuplicates++;
             } 
          }
      }
      if (numDuplicates==1){
          return true;
      }
      else{
          return false;
      }

      
  }
  
}

