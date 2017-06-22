package designpattern.adapter05.wrapper2;

/**
 *第三种适配器模式，有时接口中有多个抽象方法，
 * 当我们写该接口的实现类，必须实现该接口的所有方法，
 * 这明显有时比较浪费，引入接口的适配器模式，借助一个抽象类，抽象类实现类该接口，实现了所有的方法，
 * 而我们不和原接口打交道，只和抽象类打交道，写一个类继承该抽象类 重写我们需要的方法。
 */
public interface Sourceable {

    public void method1();
    public void method2();

}
