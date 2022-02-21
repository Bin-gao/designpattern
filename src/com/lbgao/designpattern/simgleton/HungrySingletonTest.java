package com.lbgao.designpattern.simgleton;

/**
 * @Auther: lbgao
 * @Date: 2022/2/21 19:54
 */

//饿汉模式
//只有在真正主动使用对应的类时，才会触发类的初始化，如（直接进行new操作，访问静态属性，
// 访问静态方法，用反射访问类，初始化一个类的子类等）

//浪费内存空间
public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//    类加载过程
//        1，加载二进制文件到内存中，生成对应的.class文件
//        2，连接 a)验证   b)准备（给类的静态变量赋默认值   c)解析
//        3，初始化：给类的静态变量赋初值

    }
}

class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}