package StringPrograms;

import org.testng.annotations.Test;

public class CapitalizeEvenCharacters {

    @Test
    public void capitalizeEvenChar(){
        String inputString = "helloworld";
        String outputString = "";

        for (int i=0; i<inputString.length(); i++){

            if(i%2!=0){
                outputString += inputString.toUpperCase().charAt(i);
            }else{
                outputString +=inputString.charAt(i);
            }
        }

        System.out.println(outputString);
    }
}
