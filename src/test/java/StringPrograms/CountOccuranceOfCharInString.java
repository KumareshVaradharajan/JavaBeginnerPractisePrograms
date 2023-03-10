package StringPrograms;

import org.testng.annotations.Test;

public class CountOccuranceOfCharInString {

    @Test
    public void countTheOccuranceOfChar() {

        char inputChar = 'u';
        String inputString = "kumaresh";
        int counter = 0;

        for (int i = 0; i< inputString.length(); i++){

            if(inputString.charAt(i)==inputChar){
                counter++;
            }

        }

        System.out.println(counter);

    }
}
