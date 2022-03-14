package club.neters.learn.leetcode.controller;

import club.neters.learn.leetcode.subject.*;
import club.neters.learn.leetcode.utils.NodeUtil;
import club.neters.learn.leetcode.utils.TreeNodeUtil;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@EnableAsync
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "", method = {RequestMethod.GET})
    public String hello() {
        //: 819
//        MostCommonWord.letCode3("hello from let code learn hello world the world code");

        //: offer 32
//        Integer[] arr = {3, 9, 20, null, null, 15, 7};
//        List<Integer> lists = LevelOrder.levelOrder2(TreeNodeUtil.arrayToTreeNode(arr));

        //: 589
//        Integer[] arr = {1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14};
//        List<Integer> lists = NodePreOrder.preorder(NodeUtil.arrayToNode(arr));

        //：2049
//        Integer[] arr = {-1,2,0,2,0};
//        int score = CountHighestScoreNodes.getScore(arr);

        //: 13
//        int mcmxciv = RomanToInt.getScore("MCMXCIV");

        //: 599
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] score = FindRestaurant.getScore(list1,list2);
        return "hello from let code learn.";
    }
}
