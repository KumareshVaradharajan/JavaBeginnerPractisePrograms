package CommonPrograms;

import org.testng.annotations.Test;

public class ReverseANumber {

    @Test
    public void reverseNumber() {
        int inputNumber = -123; // can be any integer
        int reversedNumber = 0;

        while (inputNumber != 0) {
            int remainder = inputNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            inputNumber /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }

    @Test
    public void getReversalOfANumber(){
    int inputNumber = 123;
    String reversedNumberAsString = "";

        String num = Integer.toString(inputNumber);

       for(int i=num.length()-1; i>=0; i--){

           reversedNumberAsString += num.charAt(i);
       }

       int finalNum = Integer.parseInt(reversedNumberAsString);
        System.out.println(finalNum);

    }

    @Test
    public void reverseNumberWithSB() {
        int inputNumber = 123; // can be any integer

        // Convert the integer to a string
        String numberAsString = Integer.toString(inputNumber);

        // Reverse the string using StringBuilder
        StringBuilder reversedString = new StringBuilder(numberAsString).reverse();

        // Convert the reversed string back to an integer
        int reversedNumber = Integer.parseInt(reversedString.toString());

        System.out.println("Reversed number: " + reversedNumber);
    }
}
