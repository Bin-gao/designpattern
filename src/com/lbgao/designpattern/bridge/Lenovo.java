package com.lbgao.designpattern.bridge;

/**
 * @Auther: lbgao
 * @Date: 2022/2/24 17:31
 */

public class Lenovo implements Brand{
    @Override
    public void info() {
        System.out.print("联想");
    }
}
