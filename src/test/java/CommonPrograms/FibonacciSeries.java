package CommonPrograms;

import org.testng.annotations.Test;

public class FibonacciSeries {

    @Test
    public void Test() {

        int number = 10;
        getFibonacciSeries(number);

    }

    public void getFibonacciSeries(int number) {

        int a = 0, b = 0, c = 1;

        for (int i = 0; i < number; i++) {
            a = b;
            b = c;
            c = a + b;

            System.out.println(a);
        }
    }
}
