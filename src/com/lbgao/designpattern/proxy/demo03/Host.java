package com.lbgao.designpattern.proxy.demo03;


/**
 * @Auther: lbgao
 * @Date: 2022/2/24 20:00
 */

//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东把房子出租");
    }

    @Override
    public void test() {
        System.out.println("test");
    }
}
