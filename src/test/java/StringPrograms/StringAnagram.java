package StringPrograms;

import org.testng.annotations.Test;

public class StringAnagram {

    @Test
    private void checkIfStringIsAnagram() {

        String input = "MalayalaM";

        StringBuilder inputSb = new StringBuilder(input).reverse();

        if (inputSb.toString().equals(input)) {
            System.out.println("Anagram");
        } else {
            System.out.println("NOT an Anagram");
        }
    }
}
