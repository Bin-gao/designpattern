package com.lbgao.designpattern.proxy.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: lbgao
 * @Date: 2022/2/25 20:58
 */

public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy (Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                                        target.getClass().getInterfaces(),
                                            this);
    }




    //处理代理实例，并返回结果；
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        method.invoke(target,args);
        return null;
    }
    public void log (String msg) {
        System.out.println("执行了" + msg + "方法");
    }
}
