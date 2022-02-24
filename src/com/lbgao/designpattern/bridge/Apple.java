package com.lbgao.designpattern.bridge;

/**
 * @Auther: lbgao
 * @Date: 2022/2/24 17:28
 */

public class Apple implements Brand{
    @Override
    public void info() {
        System.out.print("苹果");
    }
}
