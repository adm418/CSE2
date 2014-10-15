//Anna Malisova
//October 14, 2014
//Roulette.java
public class Roulette{
    public static void main(String [] args){
        int x =0;
        int y =100;
        int a = 0;
        int b = 1000;
        int randomNumber;
        
        //int earnings = 36;
        int numberTimesWon = 0;
        //int numberTimesWon1 = 0;
        //int numberTimesWon3 = 0;
        int earnings = 100;
        int totalEarnings = 0;
        
        //int earnings2 = 0;
        int numberTimesLost = 0;
        
        while (a<b){
            
            randomNumber = (int)(Math.random()*((37-0)+1));
            
            x = 0;
           earnings = 100;
           while (x<y){
            
            
            int output = (int)(Math.random()*((37-0)+1));
            if (output==randomNumber) {
                earnings=earnings+36;
                totalEarnings = totalEarnings+36;
                x++;
                //numberTimesWon++;
                }
            else{
                earnings--;
                totalEarnings--;
                x++;
                //numberTimesLost++;
            }
            
            
           }
        if (earnings==0){
                numberTimesLost++;
            }
            if (earnings>100){
                numberTimesWon++;
            }
       
        a++;
        }
       System.out.println("You won a profit " + numberTimesWon + " times.");
       System.out.println("You lost all your money " + numberTimesLost + " times.");
       System.out.println("Your total earnings are $" + totalEarnings + ".");
        
        
        
    }
}