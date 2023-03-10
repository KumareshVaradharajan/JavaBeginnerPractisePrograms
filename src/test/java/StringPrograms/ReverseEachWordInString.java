package StringPrograms;

import org.testng.annotations.Test;

public class ReverseEachWordInString {

    @Test
    public void reverseEachWordOfTheString(){

        String input = "Kumaresh varadharajan is an Automation Tester";
        StringBuilder output = new StringBuilder();

        String[] wordsArray = input.split(" ");

        for (String word : wordsArray){
            StringBuilder sb = new StringBuilder(word).reverse();
            output.append(sb).append(" ");
        }

        System.out.println(output);
    }
}
