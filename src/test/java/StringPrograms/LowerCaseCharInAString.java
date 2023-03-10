package StringPrograms;

import org.testng.annotations.Test;

public class LowerCaseCharInAString {

    @Test
    public void printLowerCaseCharInAString(){
        String input = "kumaresh is a GREAT tester";
        StringBuilder outputString = new StringBuilder();

        for(int i=0; i<input.length(); i++){

            if(Character.isLowerCase(input.charAt(i))){
                outputString.append(input.charAt(i));
            }

        }

        System.out.println(outputString);
    }
}
