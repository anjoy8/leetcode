package club.neters.learn.leetcode.utils;

import club.neters.learn.leetcode.common.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 一维数组转换为n叉树代码
 */
public class NodeUtil {
    public static Node arrayToNode(Integer[] array){
        if(array.length == 0){
            return null;
        }

        Node root = new Node(array[0]);
        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        int i = 1;
        Node temptNode;

        while (!q.isEmpty()){
            temptNode = q.poll();
            if (i<array.length&&array[i]==null){
                i++;
                List<Node> children = new ArrayList<>();
                boolean enterNextWhile  = false;
                while (i<array.length&&array[i]!=null){
                    enterNextWhile = true;
                    Node x = new Node(array[i]);
                    children.add(x);
                    q.offer(x);
                    i++;
                }
                if (enterNextWhile){
                    temptNode.children = children;
                }
            }
        }
        return root;
    }

}