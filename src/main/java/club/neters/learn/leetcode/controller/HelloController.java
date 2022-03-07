package club.neters.learn.leetcode.controller;

import club.neters.learn.leetcode.common.MostCommonWord;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@EnableAsync
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "", method = {RequestMethod.GET})
    public String hello() {
        MostCommonWord.letCode3("hello from let code learn hello world the world code");
        return "hello from let code learn.";
    }

}
