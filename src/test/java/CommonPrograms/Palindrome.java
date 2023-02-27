package CommonPrograms;

import org.testng.annotations.Test;

public class Palindrome {

//    String input = "malayalam";
    String reverseString = "";

    @Test
    public void Test(){
        isPalindrome("Khushboo");
    }


    public void isPalindrome(String input) {

        System.out.println(input);

        StringBuilder stringBuilder = new StringBuilder(reverseString);
        for(int i=input.length()-1; i>=0; i--){
            stringBuilder.append(input.charAt(i));
        }

        System.out.println(stringBuilder);
    }
}
