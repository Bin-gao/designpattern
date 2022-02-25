package com.lbgao.designpattern.proxy.demo02;

/**
 * @Auther: lbgao
 * @Date: 2022/2/25 19:43
 */

public class Client {
    public static void main(String[] args) {
        ServiceProxy proxy = new ServiceProxy();
        proxy.setService(new ServiceImpl());

        proxy.add();
    }
}
