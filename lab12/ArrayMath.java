//Anna Malisova
//ArrayMath.java

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals (double x[], double y[]){
      int trueCounter=0;
      if (x.length==y.length){
          for(int a=0; a<x.length; a++){
              if (x[a]==y[a]){
                  trueCounter++;
              }
          }
          if (trueCounter==x.length){
              return true;
          }
      }
      return false;
  }
  
  public static double[] addArrays(double x[], double y[]){
      double z[]=new double[5];
      if(x.length==y.length){
          z=new double[x.length];
          for(int a=0; a<x.length; a++){
              z[a]=x[a]+y[a];
          }
      }
      if(x.length>y.length){
          z=new double[x.length];
          for(int b=0; b<x.length; b++){
              if(b<y.length){
                  z[b]=x[b]+y[b];
              }
              if(b>=y.length){
                  z[b]=x[b];
              }
          }
          
      }
      if(y.length>x.length){
          z=new double[y.length];
          for(int c=0; c<y.length; c++){
              if(c<x.length){
                  z[c]=x[c]+y[c];
              }
              if(c>=x.length){
                  z[c]=y[c];
              }
          }
      }
  
      return z;
  }
  
  
  
}