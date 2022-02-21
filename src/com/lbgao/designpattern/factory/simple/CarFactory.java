package com.lbgao.designpattern.factory.simple;

/**
 * @Auther: lbgao
 * @Date: 2022/2/21 22:14
 */

//静态工厂模式
//增加一个新的产品。如果你不修改代码，做不到
//开闭原则
public class CarFactory {
    //方法一
    public static Car getCar(String car) {
        if (car.equals("WuLing")) {
            return new WuLing();
        }else if (car.equals("Tesla")){
            return new Tesla();
        }else {
           return null;
        }
    }

    //方法二
    public static Car getWuLing() {
        return new WuLing();
    }
}
