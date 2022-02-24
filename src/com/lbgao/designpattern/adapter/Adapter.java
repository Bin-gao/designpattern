package com.lbgao.designpattern.adapter;

/**
 * @Auther: lbgao
 * @Date: 2022/2/24 16:33
 */

//真正的适配器
public class Adapter implements NetToUsb{
    private Adaptee2 adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
