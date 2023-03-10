package StringPrograms;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Swap2Strings {

    @Test
    public void swaptwoStringsusingList() {

        String word1 = "Hello", word2 = "World";

        List<String> swapList = new ArrayList<>();
        swapList.add(word1);
        swapList.add(word2);

        word1 = swapList.get(1);
        word2 = swapList.get(0);

        System.out.println("Word1 : " + word1);
        System.out.println("Word2 : " + word2);

    }

    @Test
    public void swapTwoStringsUsingArray() {

        String word1 = "Hello", word2 = "World";

        String[] swapArray = new String[]{word1, word2};
        word1 = swapArray[1];
        word2 = swapArray[0];

        System.out.println("Word1 : " + word1);
        System.out.println("Word2 : " + word2);

    }

}
