package com.li.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lihn on 17-6-8.
 */
public class StartTest {
    public static ApplicationContext context;
    public static void main(String[] args){
        context = new ClassPathXmlApplicationContext("application.xml");
    }
}
