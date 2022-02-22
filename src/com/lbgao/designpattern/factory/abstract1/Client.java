package com.lbgao.designpattern.factory.abstract1;

/**
 * @Auther: lbgao
 * @Date: 2022/2/22 10:40
 */

public class Client {
    public static void main(String[] args) {
        XiaomiProductFactory xiaomiProductFactory = new XiaomiProductFactory();
        IphoneProduct miIphone = xiaomiProductFactory.iphoneProduct();
        IrouterProduct miRouter = xiaomiProductFactory.irouterProduct();
        miIphone.startUp();
        miIphone.callUp();
        miRouter.startUp();
        miRouter.openWifi();

        System.out.println();

        HuaweiProductFactory huaweiProductFactory = new HuaweiProductFactory();
        IphoneProduct huaweiIphone = huaweiProductFactory.iphoneProduct();
        IrouterProduct huaweiRouter = huaweiProductFactory.irouterProduct();
        huaweiIphone.startUp();
        huaweiIphone.callUp();
        huaweiRouter.startUp();
        huaweiRouter.openWifi();


    }
}
