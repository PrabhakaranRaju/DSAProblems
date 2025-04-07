package ArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] nums = {2, 2, 1, 5, 5};
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //map
    }
}
