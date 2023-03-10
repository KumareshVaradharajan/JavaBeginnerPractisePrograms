package StringPrograms;

import org.testng.annotations.Test;

import java.util.Scanner;

public class MergeFirstCharOfEachWord {

    @Test
    public void MergeFirstCharOfEachWordInString() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String input = scanner.nextLine();
        System.out.println(input);
        scanner.close();

        String[] wordsArray = input.split(" ");
        String output = "";

        for (String word : wordsArray) {

            output += word.charAt(0);
        }

        System.out.println("Result : "+ output);
    }



    @Test
    public void MergeFirstchar()
    {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String firsthalf, secondhalf, FinalString = "";

        String[] str = input.split(" ");

        for(String s2 : str)
        {
            firsthalf = s2.substring(0, 1);
            secondhalf = s2.substring(1);

            FinalString+= firsthalf;
        }

        System.out.println(FinalString);
    }

}
