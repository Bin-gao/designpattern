package com.lbgao.designpattern.adapter;

import com.lbgao.designpattern.adapter.Adaptee;
import com.lbgao.designpattern.adapter.NetToUsb;

/**
 * @Auther: lbgao
 * @Date: 2022/2/24 16:33
 */

//真正的适配器
public class Adapter2 extends Adaptee implements NetToUsb {

    @Override
    public void handleRequest() {
        super.request();
    }
}
