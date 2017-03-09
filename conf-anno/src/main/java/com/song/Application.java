package com.song;

import com.song.bean.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试用注解配置spring
 *
 * @author song@liu@ele.me
 * @date 2016-10-09 16:37
 */
@Configuration
@EnableAutoConfiguration
public class Application {
    @Autowired
    private BeanA beanA;

    @Bean
    public BeanA getBeanA(){
        return new BeanA("song", 12);
    }

    public static void main(String[] args){
        Application app = new Application();
        System.out.println(app.beanA.getName());
        List<String> s = new ArrayList<>();
    }
}
