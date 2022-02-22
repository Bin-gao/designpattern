package com.lbgao.designpattern.builder.demo1;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 22:42
 */

public class Worker extends Builder{
    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    Builder builderA(String msg) {
        product.setBuilderA(msg);
        return this;
    }

    @Override
    Builder builderB(String msg) {
        product.setBuilderB(msg);
        return this;
    }

    @Override
    Builder builderC(String msg) {
        product.setBuilderC(msg);
        return this;

    }

    @Override
    Builder builderD(String msg) {
        product.setBuilderD(msg);
        return this;

    }

    @Override
    Product getProduct() {
        return product;
    }
}
