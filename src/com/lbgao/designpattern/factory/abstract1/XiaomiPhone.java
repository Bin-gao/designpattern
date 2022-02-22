package com.lbgao.designpattern.factory.abstract1;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 10:33
 */

public class XiaomiPhone implements IphoneProduct{
    @Override
    public void callUp() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("小米手机发短信");
    }

    @Override
    public void startUp() {
        System.out.println("小米手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机关机");
    }
}
