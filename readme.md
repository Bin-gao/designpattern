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



### singleton

确保一个类只有一个实例，并且自行实例化并向整个系统提供这个实例化。



饿汉式

![image-20220222090721848](C:\Users\lbgao\AppData\Roaming\Typora\typora-user-images\image-20220222090721848.png)





懒汉式

![image-20220222090559369](C:\Users\lbgao\AppData\Roaming\Typora\typora-user-images\image-20220222090559369.png)

### factory

实现了创建者和调用者的分离

详细分类
- 简单工厂模式：用来生产同一等级结构的任意产品，新增产品，需要覆盖已有代码。
  ![image-20220222092810706](C:\Users\lbgao\AppData\Roaming\Typora\typora-user-images\image-20220222092810706.png)

- 工厂方法模式：用来生产同一等级结构中的固定产品，支持增加任意产品。

  ![image-20220222092903333](C:\Users\lbgao\AppData\Roaming\Typora\typora-user-images\image-20220222092903333.png)

- 抽象工厂模式：围绕一个超级工厂创建其他工厂，该超级工厂又称为其他工厂的工厂。
抽象工厂模式提供了一个创建一系列相关或者相互依赖对象的接口，无需指定它们具体的类。

- 使用场景：
	- 客户端不依赖与产品类实例如何被创建，实现等细节。
	- 强调一系列相关的产品对象一起使用创建对象需要大量重复代码。
	- 提供一个产品类的库，所有产品以同样的接口出现，从而使得客户端不依赖具体的实现。

![image-20220222115120800](C:\Users\lbgao\AppData\Roaming\Typora\typora-user-images\image-20220222115120800.png)

- 优点：
	- 具体产品在应用层的代码隔离，无需关心创建的细节。
	- 将一个系列的产品统一到一起创建。

- 缺点：
	- 规定了所有可能被创建的产品集合，拓展新的产品困难。
	- 增加了系统的抽象性和理解难度。

![image-20220222121331952](C:\Users\lbgao\AppData\Roaming\Typora\typora-user-images\image-20220222121331952.png)

核心本质:

- 实例化多谢不使用new，用工厂方法代替。
- 将选择实现类，创建对象统一管理和控制，从而将调用者跟我们的实现类解耦。





