package com.li.test;

import com.li.test.appConfig.AppConfigTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 * Created by lihn on 17-6-8.
 */
@Component(value = "mockConfigTest")
public class MockConfigTest {
    @Value("#{'${server.name}'.split(',')}")
    private List<String> servers;
    @Value("#{'${server.id}'.split(',')}")
    private List<Integer> serverId;
    @Value("${server.host:127.0.0.1}")
    private String noProKey;
    @Autowired
    private Environment environment;

    public void readValues() {
        System.out.println("Services Size : " + servers.size());
        for(String s : servers)
            System.out.println(s);
        System.out.println("ServicesId Size : " + serverId.size());
        for(Integer i : serverId)
            System.out.println(i);
        System.out.println("Server Host : " + noProKey);
        String property = environment.getProperty("server.jdbc");
        System.out.println("Server Jdbc : " + property);
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigTest.class);
        MockConfigTest mockConfigTest = (MockConfigTest) context.getBean("mockConfigTest");
        mockConfigTest.readValues();
    }
}
