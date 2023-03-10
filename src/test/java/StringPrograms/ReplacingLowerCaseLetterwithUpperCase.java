package StringPrograms;

import org.testng.annotations.Test;

public class ReplacingLowerCaseLetterwithUpperCase {

    @Test
    private void replaceLowercaseLettersInAStringToUpperCase() {

        String input = "kumaresh VARADHARAJAN";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

           if(Character.isLowerCase(input.charAt(i))){
               output.append(String.valueOf(input.charAt(i)).toUpperCase());
           }else{
               output.append(input.charAt(i));
           }

        }

        System.out.println(output);
    }
}
