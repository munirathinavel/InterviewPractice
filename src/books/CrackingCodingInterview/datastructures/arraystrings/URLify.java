package books.CrackingCodingInterview.datastructures.arraystrings;

import java.util.Arrays;

/**
 * Problem 1.3: URLify
 * Write a method to replace all spaces in a string with '%20'.
 */
public class URLify {

	public static void main(String[] args) {
        URLify obj = new URLify();

        String s = "Mr John Smith         ";
        int trueLen = 13;                           //true length excluding the spaces at end

        char[] str = obj.replaceSpaces(s.toCharArray(), trueLen);
        System.out.println(Arrays.toString(str));
    }

    /**
     * Two pass approach:
     * 1. In First pass: Count no.of spaces. As we have to replace space with %20 (3 chars) then new len will be triple
     * 2. New counter variable initialization for 2nd pass
     * 3. Start from end as we don't have to worry about overwriting anything
     * 4. If character, put it else add '%', '2', '0'
     */
    private char[] replaceSpaces(char[] str, int trueLen) {
        int spaceCount = 0;
        //first pass - count the spaces
        for(int i=0; i < trueLen; i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }

        //Now for final string we need: (true len + spaceCount * 2) array space
        //Start from end
        int index = trueLen + spaceCount*2;
        for(int i = trueLen-1; i >= 0; i--){
            if(str[i] == ' '){                  //insert %20 at index
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            }else{                              //insert character
                str[index - 1] = str[i];
                index--;
            }
        }

        return str;
    }

}
