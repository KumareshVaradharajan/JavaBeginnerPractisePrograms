package StringPrograms;

import org.testng.annotations.Test;

public class RemoveSpecialCharacters {

    @Test
    public void removeSpecialChars(){

        String input = "Kumaresh!@##$$%^^&**(()_+{}|?:><~";

        String output = input.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(output);
    }
}
