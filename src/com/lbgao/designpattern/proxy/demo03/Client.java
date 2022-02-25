package com.lbgao.designpattern.proxy.demo03;

/**
 * @Auther: lbgao
 * @Date: 2022/2/25 20:46
 */

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //处理角色
        ProxyInvocationHandler pit = new ProxyInvocationHandler();

        //通过调用处理角色来处理我们要调用的接口对象
        pit.setRent(host);
        Rent proxy = (Rent)pit.getProxy();//这里的proxy就是动态生成的

        proxy.rent();
        proxy.test();
    }
}
