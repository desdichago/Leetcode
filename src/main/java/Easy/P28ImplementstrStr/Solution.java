package Easy.P28ImplementstrStr;

import java.util.Arrays;

/**
 * O(n*m) time
 */

public class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.equals("")) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();

        for (int i = 0; i < haystackChars.length; i++) {
            if (haystackChars[i] == needleChars[0]) {
                char[] tempChars = Arrays.copyOfRange(haystackChars, i, i + needleChars.length);
                if (Arrays.equals(tempChars, needleChars)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
