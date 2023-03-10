package StringPrograms;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NoOfVowelsAndConsonents {

    @Test
    public void getNoOfVowelsAndConsonents() {

        String input = "kumaresh varadharajan";
        String lowerCaseInput = input.toLowerCase();

        List<Character> vowelsList = new ArrayList<>();
        List<Character> consonentsList = new ArrayList<>();


        for (int i = 0; i < lowerCaseInput.length(); i++) {

            if (lowerCaseInput.charAt(i) == 'a' || lowerCaseInput.charAt(i) == 'e'
                    || lowerCaseInput.charAt(i) == 'i' || lowerCaseInput.charAt(i) == 'o'
                    || lowerCaseInput.charAt(i) == 'u') {

                vowelsList.add(lowerCaseInput.charAt(i));

            } else if (!(lowerCaseInput.charAt(i) == ' ')){
                consonentsList.add(lowerCaseInput.charAt(i));
            }
        }

        System.out.println("Vowels : "+ vowelsList);
        System.out.println("No of Vowels : "+ vowelsList.size());

        System.out.println("Consonents : "+ consonentsList);
        System.out.println("No of Consonents : "+ consonentsList.size());
    }
}
