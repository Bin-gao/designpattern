package com.lbgao.designpattern.builder.demo1;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 22:40
 */

public abstract class Builder {
    abstract Builder builderA(String msg);

    abstract Builder builderB(String msg);

    abstract Builder builderC(String msg);

    abstract Builder builderD(String msg);

    abstract Product getProduct();
}
