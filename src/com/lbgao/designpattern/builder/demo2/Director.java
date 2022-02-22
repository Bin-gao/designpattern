package com.lbgao.designpattern.builder.demo2;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 23:11
 */

//指挥：核心，负责指挥构建一个工厂，工程如何构建由它决定
public class Director {

    //按照指挥工人顺序建筑房子
    public Product build(Worker worker) {
        worker.builderB();
        worker.builderC();
        worker.builderA();
        worker.builderD();

        return worker.getProduct();
    }
}
