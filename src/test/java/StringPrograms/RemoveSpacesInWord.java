package StringPrograms;

import org.testng.annotations.Test;

public class RemoveSpacesInWord {

    @Test
    public void removeSpacesInAWord(){

        String input = "kumaresh varadharajan";

        String output = input.replace(" ", "");

        System.out.println(output);
    }
}
