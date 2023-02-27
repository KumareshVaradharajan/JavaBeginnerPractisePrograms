package CommonPrograms;

import org.testng.annotations.Test;

public class PrimeNumber {

    @Test
    public void test(){
        int number = 19;
        isPrimeNumber(number);
    }

    public void isPrimeNumber(int number){

        boolean prime = false;

        if(!(number%2==0)){
            for (int i=3; i<10; i++){
                if(i!=number){
                    if(number%i!=0){
                        prime = true;
                    }else{
                        prime = false;
                        break;
                    }
                }
            }
        }

        if(prime == true){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }

    }
}
