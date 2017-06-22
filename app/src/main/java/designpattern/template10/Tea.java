package designpattern.template10;

/**
 * Created by JohnSun on 2016/1/23.
 */
public class Tea extends RefreshBeverage {


    public Tea(){

    };


    @Override
    protected boolean isNeedAdd(){

    return  false;
    }


    @Override
    protected void brew() {
       System.out.println();
    }

    @Override
    protected void addConiments() {
        System.out.println("添加茶叶");
    }
}
