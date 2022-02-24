package com.lbgao.designpattern.bridge;

/**
 * @Auther: lbgao
 * @Date: 2022/2/24 17:40
 */

public class Test {
    public static void main(String[] args) {
        Computer computer = new Laptop(new Apple());
        computer.info();
    }
}
