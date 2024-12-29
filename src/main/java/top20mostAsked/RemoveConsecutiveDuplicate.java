package top20mostAsked;

import java.util.Arrays;

public class RemoveConsecutiveDuplicate {

    static void removeDuplicates(char[] S)
    {
        String str = "";
        for(int i=0; i<S.length-1 ; i++){
            if(S[i] != S[i+1]){
                str = str + S[i];

            }
        }
        str = str + S[S.length - 1];
        System.out.println(str);

    }

    public static void main(String[] args)
    {
        char S1[] = "geeks".toCharArray();
        removeDuplicates(S1);

        char S2[] = "aabcca".toCharArray();
        removeDuplicates(S2);
    }

}
