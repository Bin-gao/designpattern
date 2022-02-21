package com.lbgao.designpattern.factory.method;

/**
 * @Auther: lbgao
 * @Date: 2022/2/21 22:18
 */

public class DazhongFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Dazhong();
    }
}
