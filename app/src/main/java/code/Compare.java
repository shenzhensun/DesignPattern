package code;

/**
 * Created by JohnSun on 2017/6/28.
 */

public class Compare {
    public int [] exchange(int a,int b ){
        int tem=a;
        a=b;
        b=tem;
        int data[]= new int[]{a,b};
        return data ;
    }


}
