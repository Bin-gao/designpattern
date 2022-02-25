package com.lbgao.designpattern.proxy.demo04;

import com.lbgao.designpattern.proxy.demo02.Service;
import com.lbgao.designpattern.proxy.demo02.ServiceImpl;

/**
 * @Auther: lbgao
 * @Date: 2022/2/25 21:01
 */

public class Client {
    public static void main(String[] args) {
        //真实角色
        ServiceImpl service = new ServiceImpl();

        //处理角色
        ProxyInvocationHandler pis = new ProxyInvocationHandler();

        //设置代理的对象
        pis.setTarget(service);

        //动态生成代理角色
        Service proxy = (Service) pis.getProxy(service);

        proxy.add();
    }


}
