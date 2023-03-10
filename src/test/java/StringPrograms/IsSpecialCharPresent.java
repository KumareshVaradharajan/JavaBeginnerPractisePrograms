package StringPrograms;

import org.testng.annotations.Test;

public class IsSpecialCharPresent {

    @Test
    public void isSpecialCharPresentInAString(){

        String inputString = "Hello How are you ?<>?!@#$%^&*()";
        StringBuilder outputString = new StringBuilder();

        for (int i=0; i<inputString.length(); i++){

            if(!Character.isAlphabetic(inputString.charAt(i)) &&
                    !Character.isDigit(inputString.charAt(i)) &&
                    !Character.isSpaceChar(inputString.charAt(i))){

                outputString.append(inputString.charAt(i));
            }

        }

        System.out.println(outputString);
    }
}
