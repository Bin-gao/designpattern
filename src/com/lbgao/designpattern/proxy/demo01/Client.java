package com.lbgao.designpattern.proxy.demo01;

/**
 * @Auther: lbgao
 * @Date: 2022/2/24 20:00
 */

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Host());

        proxy.rent();
    }
}
