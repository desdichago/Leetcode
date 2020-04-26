package Easy.P28ImplementstrStr;

/**
 * Matiyasevich Yuri Vladimirovich, 1969 (printed 1971, translated 1973)
 * Knuth-Morris-Pratt, 1970 (printed 1977)
 * O(m+n) solution
 */

public class SolutionKMP {
    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        int[] lps = createKMPTable(needle);
        int k = 0;
        int l = 0;
        int n = haystack.length();
        int m = needle.length();

        while (k < n) {
            if (haystack.charAt(k) == needle.charAt(l)) {
                k++;
                l++;
                if (l == m) {
                    return k - m; // found
                }
            } else {
                if (l == 0) {
                    k++;
                    if (k == n) {
                        return -1; // not found
                    }
                } else {
                    l = lps[l - 1];
                }
            }
        }

        return -1;
    }

    private int[] createKMPTable(String pattern) {

        int i = 1;
        int j = 0;
        int m = pattern.length();
        int[] pi = new int[m];
        pi[0] = 0;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                pi[i] = j+1;
                i++;
                j++;
            } else {
                if (j == 0) {
                    pi[i] = 0;
                    i++;
                } else {
                    j = pi[j - 1];
                }
            }
        }

        return pi;
    }
}
