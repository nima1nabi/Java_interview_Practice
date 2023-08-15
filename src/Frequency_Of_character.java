import java.util.Arrays;
import java.util.Collections;

public class Frequency_Of_character {
    /*
    * . Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    * */
    public static void main(String[] args) {

        //soloution1:

/*        String str = "AAABBCDD";

        String frequencyOfChars = "";

        for (int i = 0; i < str.length(); i++)
        {
            int count = 0 ;


            for (int j = 0; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }

            if(!frequencyOfChars.contains(str.charAt(i)+""))
                frequencyOfChars+=(str.charAt(i) +""+ count);

        }
        System.out.println("FrequencyOfChars =" + frequencyOfChars);*/

        //soloution2

        String str = "AAABBCDD";

        String frequencyOfChars = "";

        for (String each : str.split(""))
        {
            if(!frequencyOfChars.contains(each))
            frequencyOfChars= frequencyOfChars + each + Collections.frequency(Arrays.asList(str.split("")),each);
        }
        System.out.println(frequencyOfChars);
    }
}
