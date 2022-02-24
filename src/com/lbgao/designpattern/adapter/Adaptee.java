package com.lbgao.designpattern.adapter;

/**
 * @Auther: lbgao
 * @Date: 2022/2/24 16:30
 */

public class Adaptee implements Adaptee2{
    public void request () {
        System.out.println("连接上网");
    }
}
