package com.lbgao.designpattern.factory.abstract1;

//抽象产品工厂
public interface IproductFactory {

    IphoneProduct iphoneProduct();

    IrouterProduct irouterProduct();

    InotebookProduct notebookProduct();
}
