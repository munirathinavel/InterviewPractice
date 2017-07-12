package online.codechef.july17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 Nitika was once reading a history book and wanted to analyze it. So she asked her brother to create a list of names
 of the various famous personalities in the book. Her brother gave Nitika the list. Nitika was furious when she saw the
 list. The names of the people were not properly formatted. She doesn't like this and would like to properly format it.

 A name can have at most three parts: first name, middle name and last name.
 It will have at least one part. The last name is always present. The rules of formatting a name are very simple:

 Only the first letter of each part of the name should be capital.
 All the parts of the name except the last part should be represented by only two characters.
 The first character should be the first letter of the part and should be capitalized.
 The second character should be ".".

 Let us look at some examples of formatting according to these rules:

 gandhi -> Gandhi
 mahatma gandhI -> M. Gandhi
 Mohndas KaramChand ganDhi -> M. K. Gandhi

 Input
 The first line of the input contains an integer T denoting the number of test cases.
 The only line of each test case contains the space separated parts of the name.

 Output
 For each case, output the properly formatted name.

 Constraints
 1 ≤ T ≤ 100
 2 ≤ Length of each part of the name ≤ 10
 Each part of the name contains the letters from lower and upper case English alphabets (i.e. from 'a' to 'z', or 'A' to 'Z')

 Example
 Input:
 3
 gandhi
 mahatma gandhI
 Mohndas KaramChand gandhi

 Output:
 Gandhi
 M. Gandhi
 M. K. Gandhi
 */
public class WhatsInName {

    private String formatName(String name){
        StringBuilder sb = new StringBuilder();



        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();

        String[] names = new String[len];
        for(int i=0; i < len; i++){
            String name = s.nextLine();
            names[i] = name;
        }

        System.out.println(Arrays.toString(names));

        s.close();
    }
}
