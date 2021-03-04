package com.yun;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Hello")
public class Controller {
    @PostMapping("/World")
    public String helloWorld(@RequestBody String s){
        System.out.println("传入的值 : " + s);
        return "传入的值 : " + s;
    }

    @GetMapping("/World2")
    public String helloWorld2(){
        return "helloworld";
    }

    public static void main(String args[]){
        story(3);
    }

    public static void story(int age){
        if(age > 0){
            System.out.println("从前有座山，山里有个庙，庙里有个老和尚和" + age + "岁的小和尚");
            age --;
            story(age);
        }else{
            System.out.println("我的故事讲完了，谢谢大家");
        }
    }
}
