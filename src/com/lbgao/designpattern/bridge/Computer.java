package com.lbgao.designpattern.bridge;

/**
 * @Auther: lbgao
 * @Date: 2022/2/24 17:31
 */

public abstract class Computer {
    //组合品牌
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info () {
        brand.info();
    }

}

class Desktop extends Computer {

    public Desktop (Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式电脑");
    }
}

class Laptop extends Computer {

    public Laptop (Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本电脑");
    }
}
