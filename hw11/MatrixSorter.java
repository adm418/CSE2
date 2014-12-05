//Anna Malisova
//MatrixSorter.java

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    //show(mat3d);
   }
   
   public static int[][][] buildMat3d(){
       int[][][] newArray={
           {
             {(int)(Math.random()*((99-0)+1))},
             {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
             {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))}
           },
           {
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))}
           },
           {
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))},
               {(int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1)), (int)(Math.random()*((99-0)+1))}
           }
       };
       return newArray;
   }
   public static void show(int num[][][]){
    String out0="{"; //print brackets before (and later after) array
    String out1="{";
    String out2="{";
    String out3="{";
    String out4="{";
    for(int x=0; x<num[0].length; x++){
    for(int j=0;j<num[0][x].length;j++){
      if(j>0){
        out0+=", "; //after each value of the array, put a comma 
      }
      out0+=num[0][x][j];
    }
    out0+="} ";
    System.out.println(out0);
  }
  for(int y=0; y<num[1].length; y++){
  for(int j=0;j<num[1][y].length;j++){
      if(j>0){
        out1+=", "; //after each value of the array, put a comma 
      }
      out1+=num[1][y][j];
    }
    out1+="} ";
    System.out.println(out1);
  }
  for(int z=0; z<num[2].length; z++){
 for(int j=0;j<num[2][z].length;j++){
      if(j>0){
        out2+=", "; //after each value of the array, put a comma 
      }
      out2+=num[2][z][j];
    }
    out2+="} ";
    System.out.println(out2);
  }
   }
   public static int findMin(int newArray[][][]){
       int min=newArray[0][0][0];
       for(int z=0; z<newArray.length; z++){
         for(int y=0; y<newArray[z].length; y++){
            for(int x=0; x<newArray[z][y].length; x++){
               if (newArray[z][y][x]<min){
                   min=newArray[z][y][x];
               }
       }
       }  
       }
       
      return min;
   }
   public static int[][][] sort(int newArray[]){
       int smaller=newArray[2][0][0];
       int bigger=0;
       for(int y=0; y<newArray[2].length; y++){
            for(int x=0; x<newArray[2][y].length; x++){
                for(int z=x+1; z<newArray[2][y].length; z++){
                    if (newArray[2][y][z]<smaller){
                       newArray[2][y][z]=newArray[2][y][x];
                       newArray[2][y][x]=smaller;
                    
               }
                }
               
       }
       }
   }
   
}
