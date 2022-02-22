package com.lbgao.designpattern.builder.demo2;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 23:14
 */

public class Test {
    public static void main(String[] args) {
        Director director = new Director();

        Product product = director.build(new Worker());
        System.out.println(product.toString());
    }
}
