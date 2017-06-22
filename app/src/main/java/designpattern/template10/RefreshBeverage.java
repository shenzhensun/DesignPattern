package designpattern.template10;

/**
 * Created by JohnSun on 2016/1/23.
 */
public abstract class RefreshBeverage {

    public RefreshBeverage() {
    }

    /**
     * 定义一个模板方法
     * 封装了所有子类，共同遵循的算法框架
     * 制作饮料
     *
     */


  public  void prepareBeverageTemplate(){
        /**
         * 1,煮水
         */
        boilWater();
        /**
         * 2,炮制饮料
         */
        brew();
        /**
         * 3倒进杯子
         */
        pourInCup();
        /**
         * 加调味料
         */
       if (isNeedAdd())

        addConiments();


    }

    /**
     * 增加钩子方法使他更加的灵活，判断是否需要这个方法
     * @return
     */
    protected boolean isNeedAdd() {
        return true;
    };


    private   void boilWater(){


        System.out.println("煮水");
    };
    protected abstract void brew();


    private   void pourInCup(){
        System.out.println("倒进杯子");
    };


    protected  abstract void addConiments();









}
