package com.lbgao.designpattern.simgleton;

/**
 * @Auther: lbgao
 * @Date: 2022/2/21 20:42
 */

//静态内部类
public class Holder {

    private Holder() {

    }

    public static Holder getInstance() {
        return InnerHolder.HOLDER;
    }

    private static class InnerHolder {
        private static final Holder HOLDER = new Holder();
    }
}
