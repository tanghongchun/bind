package com.csii.bind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class BindApplication {
   public static void main(String[] args){
       System.out.println("我是李四");
       System.out.println("我是李四2");
       SpringApplication.run(BindApplication.class,args);
   }

    
}
