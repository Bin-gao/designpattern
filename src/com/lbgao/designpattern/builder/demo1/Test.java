package com.lbgao.designpattern.builder.demo1;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 22:47
 */

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();

        System.out.println(worker.getProduct().toString());
        worker.builderA("全家桶").builderB("雪碧").getProduct();
        System.out.println(worker.getProduct().toString());
    }
}
