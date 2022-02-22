package com.lbgao.designpattern.factory.abstract1;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 10:38
 */

public class XiaomiProductFactory implements IproductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IrouterProduct irouterProduct() {
        return new XiaomiRouter();
    }

    @Override
    public InotebookProduct notebookProduct() {
        return new XiaomiNotebook();
    }
}
