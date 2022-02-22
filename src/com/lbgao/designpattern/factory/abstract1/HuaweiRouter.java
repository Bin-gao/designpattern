package com.lbgao.designpattern.factory.abstract1;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 10:35
 */

public class HuaweiRouter implements IrouterProduct{
    @Override
    public void startUp() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器连接");
    }
}
