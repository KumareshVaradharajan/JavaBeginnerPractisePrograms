package CommonPrograms;

import org.testng.annotations.Test;

public class SumOfDigits {

    @Test
    public void test() {

        int value = 5555668;
        calculateSumOfTheDigits(value);

    }

    public void calculateSumOfTheDigits(int value) {

        int sum = 0, lastDigit = 0;

        while (value > 0) {
            lastDigit = value % 10;
            sum = sum + lastDigit;
            value = value / 10;
        }

        System.out.println(sum);


    }
}
