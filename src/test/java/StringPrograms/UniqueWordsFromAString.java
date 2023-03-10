package StringPrograms;

import org.testng.annotations.Test;

import java.util.*;

public class UniqueWordsFromAString {

    @Test
    public void getUniqueWordsFromAString(){

        String input = "Kumaresh Varadharajan is shortly called as Kumaresh";

        String[] wordsArray = input.split(" ");

        StringBuilder finalString = new StringBuilder();

        Set<String> wordsSet = new LinkedHashSet<>();
        List<String> wordsList = new ArrayList<>();


        for(String words : wordsArray){
            if(!wordsSet.add(words)){
                wordsList.add(words);
            }
        }

        for (String words : wordsSet){
            finalString.append(words).append(" ");
        }

        System.out.println(finalString);
        System.out.println("Duplicates "+ wordsList);
    }
}
