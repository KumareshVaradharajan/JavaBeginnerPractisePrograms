package CommonPrograms;

import org.testng.annotations.Test;

public class SumOfDigits {

    @Test
    public void test() {

        int value = 5555668;
        calculateSumOfTheDigits(value);

    }

    public void calculateSumOfTheDigits(int input) {

        int sum = 0, remainder;

        while (input > 0) {
            remainder = input % 10;
            sum = sum + remainder;
            input = input / 10;
        }

        System.out.println(sum);


    }


    @Test
    public void getSumOfdigits() {

        int input = 567;
        int remainder, sum = 0;

        while (input > 0) {
            remainder = input % 10;
            sum = sum + remainder;
            input = input / 10;
        }

        System.out.println(sum);

    }

    @Test
    public void getReversalOfNumber() {

        int input = 567;
        int remainder = 0, reversedNumber = 0;

        while (input != 0) {
            remainder = input % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            input = input / 10;
        }

        System.out.println(reversedNumber);

    }
}
