package Easy.P412FizzBuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution3 implements Solution {

    public List<String> fizzBuzz(int n) {

        return IntStream.rangeClosed(1, n)
                .mapToObj(this::convert)
                .collect(Collectors.toList());
    }

    private String convert(int i) {

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return  "Fizz";
        } else if (i % 5 == 0) {
            return  "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
