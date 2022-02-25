## GoF 23



- [ ] 一种思维，一种态度，一种进步

- 创建型模式：
	- 单例模型，工厂模式，抽象工厂模式，建造者模式，原型模式。

- 结构型模式:
	- 适配器模式，桥接模式，装饰模式，组合模式，外观模式，享元模式，代理模式。

- 行为型模式:
	- 模板方法模式，命令模式，迭代器模式，观察者模式，中介者模式，备忘录模式，解释器模式，状态模式，策略模式，职责链模式，访问者模式。



OOP七大原则

- /**开闭原则**/：对拓展开发，对修改关闭
- /**里氏替换原则**/：继承必须确保超类所拥有的性质在子类中仍然成立。尽量减少修改父类拥有的属性，正方形不是长方形。
- /**依赖倒置原则**/：要面向接口编程，不要面向实现编程。抽象不依赖细节，细节依赖抽象，降低程序的耦合性。
- /**单一职责原则**/：控制类的粒度大小，将对象解耦，提高其内聚性。保证一个方法只做一件事。
- /**接口隔离原则**/：要为各个类建立它们需要的专用接口。
- /**迪米特法则**/：只与你的直接朋友交谈，不和"陌生人"说话。降低类之间的耦合性，提高类的独立性。controller -> service -> dao
- /**合成复用原则**/：尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。

## 创建型模式

### singleton 单例模式

定义：确保一个类只有一个实例，并且自行实例化并向整个系统提供这个实例化。



饿汉式

![image-20220222090721848-16457898237783](D:\21.04.14\designpattern\readme.assets\image-20220222090721848-16457898237783.png)

![image-20220222090559369](D:\21.04.14\designpattern\readme.assets\image-20220222090559369.png)

### factory 工厂模式

实现了创建者和调用者的分离

详细分类
- 简单工厂模式：用来生产同一等级结构的任意产品，新增产品，需要覆盖已有代码。
  ![image-20220222092810706](D:\21.04.14\designpattern\readme.assets\image-20220222092810706.png)

- 工厂方法模式：用来生产同一等级结构中的固定产品，支持增加任意产品。

  ![image-20220222092903333](D:\21.04.14\designpattern\readme.assets\image-20220222092903333.png)

- 抽象工厂模式：围绕一个超级工厂创建其他工厂，该超级工厂又称为其他工厂的工厂。
抽象工厂模式提供了一个创建一系列相关或者相互依赖对象的接口，无需指定它们具体的类。

- 使用场景：
	- 客户端不依赖与产品类实例如何被创建，实现等细节。
	- 强调一系列相关的产品对象一起使用创建对象需要大量重复代码。
	- 提供一个产品类的库，所有产品以同样的接口出现，从而使得客户端不依赖具体的实现。

![image-20220222115120800](D:\21.04.14\designpattern\readme.assets\image-20220222115120800.png)

- 优点：
	- 具体产品在应用层的代码隔离，无需关心创建的细节。
	- 将一个系列的产品统一到一起创建。

- 缺点：
	- 规定了所有可能被创建的产品集合，拓展新的产品困难。
	- 增加了系统的抽象性和理解难度。

![image-20220222121331952-16457897454342](D:\21.04.14\designpattern\readme.assets\image-20220222121331952-16457897454342.png)

核心本质:

- 实例化多谢不使用new，用工厂方法代替。
- 将选择实现类，创建对象统一管理和控制，从而将调用者跟我们的实现类解耦。


### builder 建造者模式

建造者模式也属于创建型模式，它提供了一种创建对象的最佳方式。

定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

在用户不知道对象的建造过程和细节的情况下就可以之间创建复杂的对象。

用户只需要给出指定复杂对象的类型和内容，建造者模式负责按顺序创建负责对象。

![image-20220223222139680](D:\21.04.14\designpattern\readme.assets\image-20220223222139680.png)

### prototype 原型模式

- 克隆

创建一些对象更高效。

```java
public class Product implements Cloneable {

    private String name;
    private Date create;

    @Override
    protected Object clone() throws CloneNotSupportedException {
       otected Object clone() throws CloneNotSupportedException {
        Video clone = (Video) super.clone();

        Date date = new Date();
        clone.setCreate(date);

        return clone;
    }

    public Product(String name, Date create) {
        this.name = name;
        this.create = create;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", create=" + create +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }
}

```

## 结构型模式

- 从程序的结构上实现松耦合，从而可以扩大整体的类结构，用来解决更大的问题。

### adapter 适配器模式

- 对象适配器优点 （组合，常用）
	- 一个对象适配器可以把多个不同的适配者适配到同一个目标
	- 可以适配一个适配者的子类，由于适配器和适配者之间是关联关系，适配者的子类也可通过该适配器进行适配。
	
- 类适配器 （单继承）
	- 对于java，C#等不支持多重类继承的语言，一次最多只能适配一个适配者类，不能同时适配多个适配者。

- 适用场景
	- 系统需要使用一些现有的类，而这些类的接口不符合系统的需要，甚至没有类的源代码。
	- 想创建一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。

![image-20220224165028636](D:\21.04.14\designpattern\readme.assets\image-20220224165028636.png)

### bridge 桥接模式

- 桥接模式是将抽象部分和它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式。

![image-20220224174719262](D:\21.04.14\designpattern\readme.assets\image-20220224174719262.png)





分析这个场景中有两变化的维度：品牌，类型。

![image-20220224174828094](D:\21.04.14\designpattern\readme.assets\image-20220224174828094.png)

![image-20220224191410572](D:\21.04.14\designpattern\readme.assets\image-20220224191410572.png)

好处分析：
- 桥接模式类似于多继承方案，但是多继承方案又违背了类的单一职责原则，复用性比较差，类的个数比较多，桥接模式是比多继承方案更好的解决方案。极大的减少了子类的个数。

-  桥接模式提高了系统的可扩充性，在两个变化维度中任意拓展一个维度，都不需要修改原来的系统。符合开闭原则，就像一座桥，可以把两个变化的维度连接起来。

劣势分析：
- 桥接模式的引入会增加系统的理解和设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计和编程。
- 桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围具有一定的局限性。 

最佳实践：
- 如果一个系统需要在构建的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系。
- 抽象化角色和实现化角色可以以继承的方式独立扩展而互不影响，在程序运行时可以动态将一个抽象化子类的对象和一个实现化子类进行组合，即系统需要对抽象化角色和实现化角色进行动态耦合。
- 一个类存在两个独立变化的维度，且这个两个维度都需要进行扩展。
- 虽然在系统中使用继承是没有问题的，但是由于抽象化角色和具体化角色需要独立变化，设计要求需要独立管理这两者。对于那些不希望使用继承或者因为多层次继承导致整个系统类的个数剧增的系统，桥接模式更为适用。

场景：
- java语言通过java虚拟机实现了平台无关性。
 ![image-20220224193710307](D:\21.04.14\designpattern\readme.assets\image-20220224193710307.png)
- jdbc驱动程序也是桥接模式的应用之一。

### proxy 代理模式

代理模式：SpringAOP和SpringMVC的底层。

代理模式的分类：
- 静态代理
- 动态代理

![image-20220224194852540](D:\21.04.14\designpattern\readme.assets\image-20220224194852540.png)角色分析：
- 抽象角色：一般会使用接口或者抽象类来解决
- 真实角色：被代理的角色
- 代理角色：代理真实角色，代理真实角色后，我们一般会做一些附属操作
- 客户：访问代理对象的人


代理模式是不会将真是对象通过参数传递进去，而是直接在代理类中创建实例对象
适配器的适配对象与适配器没有实现同一个接口，而代理者与被代理者实现了同一个接口


代码步骤：
1.接口

```java
//租房
public interface Rent {
    void rent();
}
```
2.真实角色
```java
//房东
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东把房子出租");
    }
}
```

3.代理角色
```java
public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        hetong();
        host.rent();
        fee();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带客户看房");
    }

    //合同
    public void hetong() {
        System.out.println("中介和客户签合同");
    }

    //收中介费
    public void fee() {
        System.out.println("收中介费");
    }
}

```

4.客户端访问代理角色
```java
public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        hetong();
        host.rent();
        fee();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带客户看房");
    }

    //合同
    public void hetong() {
        System.out.println("中介和客户签合同");
    }

    //收中介费
    public void fee() {
        System.out.println("收中介费");
    }
}

```

代理模式的好处：
- 可以使真实角色的操作更加纯粹，，不用去关注一些公共业务。
- 公共也就交给了代理角色。实现了业务的分工。
- 公共业务发生扩展的时候，方便集中管理。

缺点：
- 一个真实角色就会产生一个代理角色；代码量会翻倍，开发效率会变低。



加深理解：

![image-20220224214835054](D:\21.04.14\designpattern\readme.assets\image-20220224214835054.png)

### 动态代理

- 动态代理和静态代理角色一样
- 动态代理的代理类是动态生成的，不是我们直接写好的。
- 动态代理分为两大类：1. 基于接口的动态代理，2. 基于类的动态代理
  - 基于接口---JDK动态代理 【我们在这里使用】
  - 基于类：cglib
  - java字节码实现：javassist

需要了解两个类：：Proxy : 代理，InvocationHandler（接口）：调用处理程序

​	

动态代理的好处：

- 可以使真实角色的操作更加纯粹，不用去关注一些公共的业务
- 公共也就交给了代理角色，实现了业务的分工
- 公共业务发生扩展的时候，方便集中管理
- 一个动态代理类代理的是一个接口，一般就是对应的一类业务