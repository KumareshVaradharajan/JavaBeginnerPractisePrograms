package StringPrograms;

import org.testng.annotations.Test;

import java.util.*;

public class DuplicateWordsInASentence {

    @Test
    public void findDuplicateWordsInSentence() {

        String input = "Kumaresh my name. India is going to be an economic superpower by 2030 said Kumaresh";

        String[] words = input.toLowerCase().split(" ");

        List<String> duplicateWordsList = new ArrayList<>();
        Set<String> uniqueWordsSet = new HashSet<>();

        for (String word : words) {

            if (uniqueWordsSet.add(word)) {
                uniqueWordsSet.add(word);
            } else {
                duplicateWordsList.add(word);
            }

        }

        System.out.println("Final Duplicate values are " + duplicateWordsList);


    }
}
