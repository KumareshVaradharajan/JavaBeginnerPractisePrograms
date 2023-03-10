package StringPrograms;

import org.testng.annotations.Test;

import java.util.Locale;

public class CapitalizeFirstWordOfEachLetter {

    @Test
    public void capitalizeFirstWord() {
        String inputString = "hello world how are you", outputString = "";

        String[] valuesArray = inputString.split(" ");

        for (String value : valuesArray) {

            String firstLetter = String.valueOf(value.toUpperCase().charAt(0));
            String remaining = value.substring(1);

            outputString+= firstLetter+remaining+" ";

        }

        System.out.println("Result : "+ outputString.trim());

    }
}
