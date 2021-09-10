package org.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WJT
 * @Version: 1.0
 * @Date: 2021/9/10 11:55
 * @Description:
 */
@Controller
@RestController
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        String hello = "hello jenkins!";
        System.out.println(hello);
        return hello;
    }

    @RequestMapping("getHello/{number}")
    public String getNumber(@PathVariable Integer number) {
        if (number == null) {
            return "not number";
        } else {
            for (int i = 0; i < number; i++) {
                System.out.println("hello jenkins!!");
            }
            return "the number is " + number;
        }
    }
}