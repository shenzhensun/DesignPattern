package designpattern.singleinstance02;

/**
 * Created by JohnConna on 2016/1/6.
 */
public class SingleInstance2 {
    /**
     * 利用了classloader的机制来保证初始化instance时只有一个线程，
     * 所以也是线程安全的，同时没有性能损耗，所以一般我倾向于使用这一种。
     */
    /**
     *
     * 什么是线程安全？
        如果你的代码所在的进程中有多个线程在同时运行，而这些线程可能会同时运行这段代码。
       如果每次运行结果和单线程运行的结果是一样的，
       而且其他的变量的值也和预期的是一样的，就是线程安全的。

     或者说：一个类或者程序所提供的接口对于线程来说是原子操作
     ，或者多个线程之间的切换不会导致该接口的执行结果存在二义性,也就是说我们不用考虑同步的问题，那就是线程安全的。
     */
        private static class LazyHolder {
            private static final SingleInstance2 INSTANCE = new SingleInstance2();
        }
        private SingleInstance2 (){

        }

        public static final SingleInstance2 getInstance()
        {
            return LazyHolder.INSTANCE;
        }




}
