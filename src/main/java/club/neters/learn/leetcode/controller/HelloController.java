package club.neters.learn.leetcode.controller;

import club.neters.learn.leetcode.subject.LevelOrder;
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
//        MostCommonWord.letCode3("hello from let code learn hello world the world code");
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
        List<Integer> lists = LevelOrder.levelOrder2(TreeNodeUtil.arrayToTreeNode(arr));
        return "hello from let code learn.";
    }
}
