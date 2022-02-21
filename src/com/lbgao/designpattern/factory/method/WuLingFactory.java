package com.lbgao.designpattern.factory.method;

/**
 * @Auther: lbgao
 * @Date: 2022/2/21 22:28
 */

public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
