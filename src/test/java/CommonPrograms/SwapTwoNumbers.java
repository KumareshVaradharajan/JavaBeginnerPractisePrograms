package CommonPrograms;

import org.testng.annotations.Test;

public class SwapTwoNumbers {

    @Test
    public void Test() {
        int num1 = 10;
        int num2 = 20;
        swapTwonumbers(num1, num2);
    }

    public void swapTwonumbers(int number1, int number2) {

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println(number1);
        System.out.println(number2);
    }
}
