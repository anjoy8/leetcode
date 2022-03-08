package club.neters.learn.leetcode.subject;

import club.neters.learn.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32:
 * 请实现一个函数按照之字形顺序打印二叉树，
 * 即第一行按照从左到右的顺序打印，
 * 第二层按照从右到左的顺序打印，
 * 第三行再按照从左到右的顺序打印，其他行以此类推
 */
public class LevelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (node != null) {
                    // 偶数层 -> 队列头部
                    if (res.size() % 2 == 0) {
                        tmp.addLast(node.val);
                    } else {
                        // 奇数层 -> 队列尾部
                        tmp.addFirst(node.val);
                    }

                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
            res.add(tmp);
        }
        return res;
    }

    public static List<Integer> levelOrder2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        var sign = 1;
        while (!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            // 变换奇偶层
            sign *= -1;
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (node != null) {
                    // 偶数层 = 1 -> 每次添加到队列头部，倒序
                    if (sign > 0) {
                        tmp.addFirst(node.val);
                    } else {
                        // 奇数层 = -1 -> 每次添加到队列尾部，正序
                        tmp.addLast(node.val);
                    }

                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }

            res.addAll(tmp);
        }

        for (int j = 0; j < res.size(); j++) {
            System.out.println(res.get(j));
        }
        return res;
    }
}
