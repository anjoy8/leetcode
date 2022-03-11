package club.neters.learn.leetcode.subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 算法：2049
 * 统计最高分的节点数目
 */
public class CountHighestScoreNodes {
    public static long maxScore = 0;
    public static int cnt = 0;
    public static int n;
    public static List<Integer>[] children;

    public static int getScore(Integer[] parents) {
        n = parents.length;
        // 初始化孩子数组
        children = new List[n];
        for (int i = 0; i < n; i++) {
            children[i] = new ArrayList<>();
        }
        // 生成二叉树结构
        for (int i = 0; i < n; i++) {
            int p = parents[i];
            if (p != -1) {
                children[p].add(i);
            }
        }
        dfs(0);

        System.out.println(cnt);
        return cnt;
    }

    public static int dfs(int node) {
        long score = 1;
        int size = n - 1;

        if (children[node] != null) {
            for (int c : children[node]) {
                int t = dfs(c);
                score *= t;
                size -= t;
            }
        }
        if (node != 0) {
            score *= size;
        }
        if (score == maxScore) {
            cnt++;
        } else if (score > maxScore) {
            maxScore = score;
            cnt = 1;
        }
        return n - size;
    }
}
