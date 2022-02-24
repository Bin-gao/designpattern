package com.lbgao.designpattern.adapter;

/**
 * @Auther: lbgao
 * @Date: 2022/2/24 16:23
 */

//客户端类：
public class Computer {

    public void net (NetToUsb adapter) {
        //上网的具体步骤，找一个转接头
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();//电脑
        Adaptee adaptee = new Adaptee();//网线
        Adapter2 adapter = new Adapter2();//转接器

        computer.net(adapter);

        Adapter adapter1 = new Adapter(adaptee);
        computer.net(adapter1);
    }
}
