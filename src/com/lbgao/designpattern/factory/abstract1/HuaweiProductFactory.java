package com.lbgao.designpattern.factory.abstract1;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 10:38
 */

public class HuaweiProductFactory implements IproductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IrouterProduct irouterProduct() {
        return new HuaweiRouter();
    }

    @Override
    public InotebookProduct notebookProduct() {
        return null;
    }
}
