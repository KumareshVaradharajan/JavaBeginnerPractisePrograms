package CommonPrograms;

import org.testng.annotations.Test;

public class Factorial {

    @Test
    public void Test(){
        int num = 6;
        isFactorial(num);
    }

    public void isFactorial(int number){

        int factorial = 1;
        for (int i=number; i>0; i--){
            factorial = factorial*i;
//            System.out.println(factorial);
        }

        System.out.println(factorial);
    }
}
