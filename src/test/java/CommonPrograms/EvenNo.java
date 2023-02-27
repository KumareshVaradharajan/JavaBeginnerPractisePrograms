package CommonPrograms;

import org.testng.annotations.Test;

public class EvenNo {

    int number = 101;

    @Test
    public void checkIfGivenNumberIsEvenNoOrNot() {

        if (number % 2 == 0) {
            System.out.println("The Given Number is Even Number");
        } else {
            System.out.println("The Given Number is NOT an Even Number");
        }
    }
}
