package com.lbgao.designpattern.factory.method;

/**
 * @Auther: lbgao
 * @Date: 2022/2/21 22:11
 */

public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }



}
