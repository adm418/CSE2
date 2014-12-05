//Anna Malisova
//CSE2
//October 31, 2014
//MethodCalls


public class MethodCalls {
    public static void main(String[] arg) {
        int a = 784, b = 22, c;
        c = addDigit(a, 3);
        System.out.println("Add 3 to " + a + " to get " + c);
        c = addDigit(addDigit(c, 4), 5);
        System.out.println("Add 3, 4, and 5 to " + a + " to get " + c);
        System.out.println("Add 3 to -98 to get: " + addDigit(-98, 3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }

    public static int addDigit(int number, int digit) {
        String numberAsString;
        String digitAsString;
        String newString;
        int numberToReturn;
        if (digit > 0 && digit <= 9) {
            if (number < 0) {
                number = number * -1;
                numberAsString = Integer.toString(number);
                digitAsString = Integer.toString(digit);
                newString = digitAsString + numberAsString;
                numberToReturn = Integer.parseInt(newString);
                numberToReturn = numberToReturn * -1;
                return (numberToReturn);
            }
            else {
                numberAsString = Integer.toString(number);
                digitAsString = Integer.toString(digit);
                newString = digitAsString + numberAsString;
                numberToReturn = Integer.parseInt(newString);
                return (numberToReturn);
            }

        }
        
        else {
            return number;
        }
    }

    public static int join(int x, int y){//784, 22
        if (x<0&&y<0){
            x*=-1;
            y*=-1;
        }
        String xAsString = Integer.toString(x);
        String yAsString = Integer.toString(y);
        int number=0;
        int digit;
        int numberToReturn=y;
        //int i=xAsString.length()-1;
        for (int i=xAsString.length()-1; i>=0; i--){
          number = Character.getNumericValue(xAsString.charAt(i));//4, 8
          numberToReturn = addDigit(numberToReturn, number);//422, 8422

        }
        return numberToReturn;
        
        
    }


}



/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/