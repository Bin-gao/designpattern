package com.lbgao.designpattern.proxy.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: lbgao
 * @Date: 2022/2/25 20:25
 */

//用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //处理代理实例，并返回结果
    public Object getProxy() {
        return Proxy.newProxyInstance(Rent.class.getClassLoader(),
                                        rent.getClass().getInterfaces(),
                                        this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seehouse();
        Object res = method.invoke(rent,args);
        return res;
    }

    private void seehouse() {

        System.out.println("中介带客户看房子");
    }
}
