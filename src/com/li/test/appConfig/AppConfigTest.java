package com.li.test.appConfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 代替application.xml,可配置spring的Java Bean
 * Created by lihn on 17-6-8.
 */
@Configurable
@ComponentScan(basePackages = "com.li.test.scanPackage")
@PropertySource(value = "classpath:init.properties")
public class AppConfigTest {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
