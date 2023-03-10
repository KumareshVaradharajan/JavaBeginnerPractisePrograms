package StringPrograms;

import org.testng.annotations.Test;

import java.util.Scanner;

public class PrintAString1000timesWithoutLoop {

    @Test
    private void printAString1000times(){

        String input = "kumaresh\n";
        String repeatedString = input.repeat(1000);
        System.out.println(repeatedString);

    }

    @Test
    public void PrintName1000times()
    {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();

        String s = "i";

        s = s.replaceAll("i", "iiiiiiiiii");  //1 x 10 = 10
        s = s.replaceAll("i", "iiiiiiiiii");  //10 x 10 = 100
        s = s.replaceAll("i", "iiiiiiiiii");  //100 x 10 = 1000

        s = s.replaceAll("i", Name + "\n");

        System.out.println(s);
    }

    @Test
    private void PrintAValue1000times(){

        String name = "Kumaresh\n";
        System.out.println(name.repeat(1000));
    }
}
