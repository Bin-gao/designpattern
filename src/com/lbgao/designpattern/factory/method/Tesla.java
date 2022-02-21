package com.lbgao.designpattern.factory.method;

/**
 * @Auther: lbgao
 * @Date: 2022/2/21 22:11
 */

public class Tesla implements Car {
    @Override
    public void name() {
        System.out.println("Tesla");
    }
}
