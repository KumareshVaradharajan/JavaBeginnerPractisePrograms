package CommonPrograms;

import java.util.Scanner;

public class EvenNo {

//    int number = 101;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The Given Number is Even Number");
        } else {
            System.out.println("The Given Number is NOT an Even Number");
        }
    }
}
