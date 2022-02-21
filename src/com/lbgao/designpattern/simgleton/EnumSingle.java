package com.lbgao.designpattern.simgleton;

import java.lang.reflect.Constructor;

//enum 本身也是一个class类
public enum EnumSingle {

    INSTANCE;

    public EnumSingle getInstance(){
        return INSTANCE;
    }

}

class Test{

    public static void main(String[] args) throws Exception {
        EnumSingle instance1 = EnumSingle.INSTANCE;
        EnumSingle instance2 = EnumSingle.INSTANCE;

        System.out.println(instance1);
        System.out.println(instance2);

        Constructor<EnumSingle> constructor = EnumSingle.class.getDeclaredConstructor();
//        Constructor<EnumSingle> constructor = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);

        EnumSingle instance3 = constructor.newInstance();
        System.out.println(instance3);
        System.out.println(instance1);

    }
}
