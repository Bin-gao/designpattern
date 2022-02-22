package com.lbgao.designpattern.builder.demo2;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 23:08
 */

//具体的建造者：工人
public class Worker extends Builder {
    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    void builderA() {
        product.setBuildA("地基");
    }

    @Override
    void builderB() {
        product.setBuildB("钢筋工程");
    }

    @Override
    void builderC() {
        product.setBuildC("铺电信");
    }

    @Override
    void builderD() {
        product.setBuildD("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
