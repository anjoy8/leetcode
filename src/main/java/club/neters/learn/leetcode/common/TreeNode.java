package club.neters.learn.leetcode.common;

public class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(Integer val) {
        this.val = val;
    }

    public TreeNode(Integer val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
