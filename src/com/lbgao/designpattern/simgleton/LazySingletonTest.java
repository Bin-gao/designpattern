package com.lbgao.designpattern.simgleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Auther: lbgao
 * @Date: 2022/2/21 17:24
 */

//确保一个类只有一个实例，并且自行实例化并向整个系统提供这个实例化。
//    DCL懒汉式
public class LazySingletonTest {
    public static void main(String[] args) throws Exception{

//       Class<LazySingleton> lazySingletonClass = LazySingleton.class;
//
//        String name = lazySingletonClass.getName();
//        System.out.println(name);

        //反射
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        Constructor<? extends LazySingleton> declaredConstructor = LazySingleton.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);

//        LazySingleton instance1 = declaredConstructor.newInstance();
//        System.out.println(instance1);

//        LazySingleton instance2 = declaredConstructor.newInstance();
//        System.out.println(instance2);

        //找到变量
        Field $s_$$ZX7sA21 = LazySingleton.class.getDeclaredField("$s_$$ZX7sA21");
        $s_$$ZX7sA21.setAccessible(true);
        LazySingleton instance3 = declaredConstructor.newInstance();
        $s_$$ZX7sA21.set(instance3,false);

        LazySingleton instance4 = declaredConstructor.newInstance();
        System.out.println(instance4);

        System.out.println(instance3);
    }
}


class LazySingleton {

    private static volatile LazySingleton lazySingleton;

    private static boolean $s_$$ZX7sA21 = false;

    private LazySingleton() {
        synchronized (LazySingleton.class) {
            if (!$s_$$ZX7sA21) {
                $s_$$ZX7sA21 = true;
            }else {
                throw new RuntimeException("不要试图用反射破坏异常");
            }

        }
    }

//    双重检测锁模式的 懒汉式单例 DCL懒汉式
    public static LazySingleton getInstance() {

        if (lazySingleton == null) {

            synchronized (LazySingleton.class) {

                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
    //singleton = new Singleton();  不是一个原子性操作
    //可以分为3部：
    //1、分配内存
    //2、初始化对象
    //3、指向刚分配的地址
    //如果发生重排序，假设A线程执行了1，还没有执行2，B线程来判断NUll，
    //这时候B线程就直接返回了没有初始化的singleton,就会出现空指针异常。
    //volatile避免重排序。
}