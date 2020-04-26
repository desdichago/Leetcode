package Easy.P412FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution1 implements Solution {

    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>(n);
        String s;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                s = "FizzBuzz";
            } else if (i % 3 == 0) {
                s = "Fizz";
            } else if (i % 5 == 0) {
                s = "Buzz";
            } else {
                s = String.valueOf(i);
            }
            list.add(s);
        }

        return list;
    }
}
