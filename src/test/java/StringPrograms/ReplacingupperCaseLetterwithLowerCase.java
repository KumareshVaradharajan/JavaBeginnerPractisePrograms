package StringPrograms;

import org.testng.annotations.Test;

public class ReplacingupperCaseLetterwithLowerCase {

    @Test
    private void replaceUppercaseLettersInAStringToLowerCase() {

        String input = "kumaresh VARADHARAJAN";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            if(Character.isUpperCase(input.charAt(i))){
                output.append(String.valueOf(input.charAt(i)).toLowerCase());
            }else{
                output.append(input.charAt(i));
            }

        }

        System.out.println(output);
    }
}
