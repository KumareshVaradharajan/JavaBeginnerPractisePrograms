package StringPrograms;

import org.testng.annotations.Test;

public class ReverseAString {

    @Test
    public void reverseTheGivenString() {

        String input = "hello";
        String reversedString = "";

        StringBuilder stringBuilder = new StringBuilder(reversedString);

        for (int i = input.length() - 1; i >= 0; i--) {
            stringBuilder.append(input.charAt(i));
        }

        System.out.println(stringBuilder);
    }
}
