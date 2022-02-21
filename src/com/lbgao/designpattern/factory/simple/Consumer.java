package com.lbgao.designpattern.factory.simple;

/**
 * @Auther: lbgao
 * @Date: 2022/2/21 22:12
 */

public class Consumer {
    public static void main(String[] args) {
        //1. 传统方式
//        Car car1 = new WuLing();
//        Car car2 = new Tesla();
//
//        car1.name();
//        car2.name();

        //2. 使用工厂创建
        Car car1 = CarFactory.getCar("WuLing");
        Car car2 = CarFactory.getCar("Tesla");
        car1.name();
        car2.name();
    }
}
