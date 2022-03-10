package club.neters.learn.leetcode.subject;

import club.neters.learn.leetcode.common.Node;

import java.util.ArrayList;
import java.util.List;

public class NodePreOrder {
    public static List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + ", ");
        }
        return res;
    }

    public static void helper(Node root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        if (root.children != null) {
            for (Node ch : root.children) {
                helper(ch, res);
            }
        }
    }
}
