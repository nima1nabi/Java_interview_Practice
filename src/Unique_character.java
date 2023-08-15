import java.util.Arrays;
import java.util.Collections;

public class Unique_character {



/*
   . Write a return method that can find the unique characters from the
            String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";*/

    public static void main(String[] args) {

/*
       Soloution1:
       String str = "AAABBBCCCDEF";
        StringBuilder unique = new StringBuilder();

        for (int i = 0 ; i < str.length() ; i++)
        {
            int count = 0 ;
            char char_i = str.charAt(i);

            for (int j = 0 ; j < str.length() ; j++)

            {
                if(char_i == str.charAt(j))
                    count++;
            }

            if(count==1)
                unique.append(str.charAt(i));
        }

        System.out.println(unique);
        System.out.println("nima");


 */

        //Soloution2:
        String str = "AAABBBCCCDEF";
        StringBuilder unique = new StringBuilder();

        for(String each : str.split(""))
        {
            if(Collections.frequency(Arrays.asList(str.split("")),each)==1)
                unique.append(each);
        }
        System.out.println(unique);

    }

}
