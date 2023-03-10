package StringPrograms;

import org.testng.annotations.Test;

public class CountNoOfSpacesInString {

    @Test
    public void countNoOfSpaces(){

        String input = "HiHowareyou?";
        int counter =0;

        for (int i=0; i<input.length(); i++){

            if(String.valueOf(input.charAt(i)).equals(" ")){
                counter++;

            }

        }

        System.out.println("Result : "+ counter);
    }
}
