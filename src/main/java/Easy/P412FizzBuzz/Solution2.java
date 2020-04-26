package Easy.P412FizzBuzz;

import java.util.ArrayList;
import java.util.List;

class Solution2 implements Solution {

    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>(n);

        int fizz = 1;
        int buzz = 1;

        for(int i=1; i <= n; i++) {
            if (fizz == 3 && buzz == 5) {
                list.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            } else if (fizz == 3) {
                list.add("Fizz");
                fizz = 0;
            } else if (buzz == 5) {
                list.add("Buzz");
                buzz = 0;
            } else {
                list.add(String.valueOf(i));
            }
            fizz++;
            buzz++;
        }

        return list;
    }
}