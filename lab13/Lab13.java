//Anna Malisova
//Lab13
public class Lab13{
    public static void main(String [] args){
        int valueOfSmaller=0;
        int valueOfLarger=0;
        int[][] myArray={
            {(int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1))},
            {(int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1))},
            {(int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1))},
            {(int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1))},
            {(int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1)), (int)(Math.random()*((39-0)+1))}
        };
        System.out.println("The array before sorting: ");
        listArray(myArray);
        for (int a=0; a<myArray[0].length; a++){
            for(int f=a+1; f<myArray[0].length; f++){
                if(myArray[0][f]<myArray[0][a]){
                    valueOfSmaller=myArray[0][f];
                    valueOfLarger=myArray[0][a];
                    myArray[0][a]=valueOfSmaller;
                    myArray[0][f]=valueOfLarger;
                }
            }   
        }
        for (int b=0; b<myArray[1].length; b++){
            for(int g=b+1; g<myArray[1].length; g++){
                if(myArray[1][g]<myArray[1][b]){
                    valueOfSmaller=myArray[1][g];
                    valueOfLarger=myArray[1][b];
                    myArray[1][b]=valueOfSmaller;
                    myArray[1][g]=valueOfLarger;
                }
            }   
        }
        for (int c=0; c<myArray[2].length; c++){
            for(int h=c+1; h<myArray[2].length; h++){
                if(myArray[2][h]<myArray[2][c]){
                    valueOfSmaller=myArray[2][h];
                    valueOfLarger=myArray[2][c];
                    myArray[2][c]=valueOfSmaller;
                    myArray[2][h]=valueOfLarger;
                }
            }   
        }
        for (int d=0; d<myArray[3].length; d++){
            for(int i=d+1; i<myArray[3].length; i++){
                if(myArray[3][i]<myArray[3][d]){
                    valueOfSmaller=myArray[3][i];
                    valueOfLarger=myArray[3][d];
                    myArray[3][d]=valueOfSmaller;
                    myArray[3][i]=valueOfLarger;
                }
            }   
        }
        for (int e=0; e<myArray[4].length; e++){
            for(int j=e+1; j<myArray[4].length; j++){
                if(myArray[4][j]<myArray[4][e]){
                    valueOfSmaller=myArray[4][j];
                    valueOfLarger=myArray[4][e];
                    myArray[4][e]=valueOfSmaller;
                    myArray[4][j]=valueOfLarger;
                }
            }   
        }
        System.out.println("The array after sorting: ");
        listArray(myArray);
    }
    public static void listArray(int num[][]){
    String out0="{"; //print brackets before (and later after) array
    String out1="{";
    String out2="{";
    String out3="{";
    String out4="{";
    for(int j=0;j<num[0].length;j++){
      if(j>0){
        out0+=", "; //after each value of the array, put a comma 
      }
      out0+=num[0][j];
    }
    out0+="} ";
    System.out.println(out0);
  
  for(int j=0;j<num[1].length;j++){
      if(j>0){
        out1+=", "; //after each value of the array, put a comma 
      }
      out1+=num[1][j];
    }
    out1+="} ";
    System.out.println(out1);
  
 for(int j=0;j<num[2].length;j++){
      if(j>0){
        out2+=", "; //after each value of the array, put a comma 
      }
      out2+=num[2][j];
    }
    out2+="} ";
    System.out.println(out2);
  
  for(int j=0;j<num[3].length;j++){
      if(j>0){
        out3+=", "; //after each value of the array, put a comma 
      }
      out3+=num[3][j];
    }
    out3+="} ";
    System.out.println(out3);
    
    for(int j=0;j<num[4].length;j++){
      if(j>0){
        out4+=", "; //after each value of the array, put a comma 
      }
      out4+=num[4][j];
    }
    out4+="} ";
    System.out.println(out4);
  }
  
}