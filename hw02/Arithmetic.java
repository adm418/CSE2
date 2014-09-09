//Anna Malisova
//09/05/2014
//hw02 - Arithmetic.java
//CSE02-111

//  define a class
public class Arithmetic {
//  add main method
   public static void main(String[] args) {
       //Number of pairs of socks
       int nSocks=3;
       //Cost per pair of socks
       //('$' is part of the variable name)
       double sockCost$=2.58;
       
       //Number of drinking glasses
       int nGlasses=6;
       //Cost per glass
       double glassCost$=2.29;
       
       //Number of boxes of envelopes
       int nEnvelopes=1;
       //cost per box of envelopes
       double envelopeCost$=3.25;
       double taxPercent=0.06;
       
       //total cost of socks
       double totalSockCost$=sockCost$*nSocks;
       //tax of total cost of socks*100
       double totalSockTaxDecimalForm$=(totalSockCost$*taxPercent*100);
       //tax of total cost of socks int form
       double totalSockTaxIntForm$=(int) totalSockTaxDecimalForm$;
       //tax of total cost of socks two decimals
       double totalSockTax$=(totalSockTaxIntForm$)/100;
       //total cost of glasses
       double totalGlassCost$=glassCost$*nGlasses;
       //tax of total cost of glasses decimal form*100
       double totalGlassTaxDecimalForm$=(totalGlassCost$*taxPercent*100);
       //tax of total cost of glasses int form
       double totalGlassTaxIntForm$=(int) totalGlassTaxDecimalForm$;
       //tax of total cost of glasses two decimal places
       double totalGlassTax$=totalGlassTaxIntForm$/100;
       //total cost of envelopes
       double totalEnvelopeCost$=envelopeCost$*nEnvelopes;
       //tax of total cost of envelopes
       double totalEnvelopeTaxDecimalForm$=(totalEnvelopeCost$*taxPercent*100);
       //tax of total cost of envelopes int form
       double totalEnvelopeTaxIntForm$=(int) totalEnvelopeTaxDecimalForm$;
       //tax of total cost of envelopes two decimals
       double totalEnvelopeTax$=(totalEnvelopeTaxIntForm$)/100;
       //total cost without tax
       double totalCostNoTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
       //total cost with tax*100
       double totalCostWithTax$=(totalCostNoTax$*taxPercent + totalCostNoTax$)*100;
       //total cost with tax integer form
       int totalCostWithTaxIntForm$=(int) totalCostWithTax$;
       //total cost with tax with two decimal places
       double totalCostWithTaxTwoDecimals$=totalCostWithTaxIntForm$/100;
       
       //print out values
       System.out.println("The total cost of the socks without tax is $" + 
       totalSockCost$);
       System.out.println("The tax on the total number of socks is $" + 
       totalSockTax$ + "(actual: " + totalSockTaxDecimalForm$/100 +")");
       System.out.println("The total cost of the glasses without tax is $" + 
       totalGlassCost$);
       System.out.println("The tax on the total number of glasses is $" + 
       totalGlassTax$ + "(actual: " + totalGlassTaxDecimalForm$/100 +")");
       System.out.println("The total cost of the envelopes without tax is $" + 
       totalEnvelopeCost$);
       System.out.println("The tax on the total number of envelopes is $" + 
       totalEnvelopeTax$ + "(actual: " + totalEnvelopeTaxDecimalForm$/100 +")");
       System.out.println("The total cost without tax is $" +
       totalCostNoTax$);
       System.out.println("The total cost with tax is $" +
       totalCostWithTaxTwoDecimals$  + 
       "(actual: " + (totalCostWithTax$)/100 +")");
       
       
       
       
   }
}
    
