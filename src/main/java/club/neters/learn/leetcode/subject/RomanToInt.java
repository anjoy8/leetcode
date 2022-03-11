package club.neters.learn.leetcode.subject;

import java.util.HashMap;
import java.util.Map;

/**
 * 算法 13. 罗马数字转整数
 * 给定一个罗马数字，将其转换成整数。
 */
public class RomanToInt {
    public static Map<Character, Integer> symbolValues = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static int getScore(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }

        System.out.println(ans);
        return ans;
    }
}
