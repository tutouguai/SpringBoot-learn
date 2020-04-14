package com.learn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//声明该注解是springboot的引导类
@SpringBootApplication
public class MySpringBootApplication {

    //main方法是程序的入口
    public static void main(String[] args) {
        //run方法，表示运行SpringBoot的引导类，参数就是SpringBoot的引导类字节码对象
        SpringApplication.run(MySpringBootApplication.class);

    }
}
