package com.song.bean;

import lombok.Data;

/**
 * BeanA
 *
 * @author song@liu@ele.me
 * @date 2016-10-09 16:37
 */
@Data
public class BeanA {
    private String name;
    private int age;

    public BeanA(String name, int age){
        this.name = name;
        this.age = age;
    }
}
