package com.lbgao.designpattern.prototype.demo1;

import java.util.Date;

/**
 * @Auther: lbgao
 * @Date: 2022/2/23 23:01
 */

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        //原型对象 v1
        Date date = new Date();
        Video v1 = new Video("v1", date);
        System.out.println("v1 == >" + v1);
        System.out.println("v1 == >" + v1.hashCode());

        //原型对象 v2
        Video v2  = (Video) v1.clone();
        v2.setName("v2");
        System.out.println("v2 == >" + v2);
        System.out.println("v2 == >" + v2.hashCode());

        System.out.println("=================");

        date.setTime(121221541);

        System.out.println("v1 == >" + v1);
        System.out.println("v1 == >" + v1.hashCode());
        //原型对象 v2
        System.out.println("v2 == >" + v2);
        System.out.println("v2 == >" + v2.hashCode());
    }
}
