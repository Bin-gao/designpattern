package com.lbgao.designpattern.builder.demo2;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 22:37
 */

//抽象的建造者：方法
public abstract class Builder {
     abstract void builderA();
     abstract void builderB();
     abstract void builderC();
     abstract void builderD();

     //得到产品
     abstract Product getProduct();
}
