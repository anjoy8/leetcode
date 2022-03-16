package club.neters.learn.leetcode.subject;

import java.util.ArrayList;

/**
 * 算法: 6
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 */
public class Z_Convert {
    public static void main(String[] args) {
        getScore("PAYPALISHIRING", 4);
    }

    public static String getScore(String s, int numRows) {
        int n = s.length();
        if (numRows == 1 || numRows >= n) {
            return s;
        }
        int t = numRows * 2 - 2;
        ArrayList<Character> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) { // 枚举矩阵的行
            for (int j = 0; j < n - i; j += t) { // 枚举每个周期的起始下标
                ans.add(s.charAt(j + i)); // 当前周期的第一个字符
                if (0 < i && i < numRows - 1 && j + t - i < n) {
                    ans.add(s.charAt(j + t - i)); // 当前周期的第二个字符
                }
            }
        }

        StringBuilder rs = new StringBuilder();
        for (var a : ans) {
            rs.append(a);
        }

        System.out.println(rs);

        return rs.toString();
    }
}
