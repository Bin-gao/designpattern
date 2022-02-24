package com.lbgao.designpattern.proxy.demo01;

/**
 * @Auther: lbgao
 * @Date: 2022/2/24 21:29
 */

public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        hetong();
        host.rent();
        fee();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带客户看房");
    }

    //合同
    public void hetong() {
        System.out.println("中介和客户签合同");
    }

    //收中介费
    public void fee() {
        System.out.println("收中介费");
    }
}
