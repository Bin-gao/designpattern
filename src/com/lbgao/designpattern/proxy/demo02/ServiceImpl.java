package com.lbgao.designpattern.proxy.demo02;

/**
 * @Auther: lbgao
 * @Date: 2022/2/25 19:35
 */

public class ServiceImpl implements Service{
    @Override
    public void add() {
        System.out.println("this add method");
    }

    @Override
    public void update() {
        System.out.println("this update method");
    }


    @Override
    public void delete() {
        System.out.println("this delete method");
    }

    @Override
    public void query() {
        System.out.println("this query method");
    }
}
