package designpattern.facade08;

/**
 * Created by JohnSun on 2016/2/22.
 */
public class User {


    //�������û��Computer�࣬��ô��CPU��Memory��Disk����֮�佫���໥����ʵ����������ϵ��
    // ������������ص��������޸�һ���࣬���ܻ������������޸ģ��ⲻ��������Ҫ�����ģ�����Computer�࣬����֮��Ĺ�ϵ��������Computer��
    // ����������˽�������ã��⣬�������ģʽ��
    public static void main(){
        Computer computer=new Computer();
        computer.startup();
        computer.shutdown();
    }

}
