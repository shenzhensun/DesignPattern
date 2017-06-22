package designpattern.builder03;

import java.util.ArrayList;
import java.util.List;

import designpattern.simplefactory01.Factory.MailSender;
import designpattern.simplefactory01.Factory.QqSender;
import designpattern.simplefactory01.Factory.Sender;

/**
 * Created by Administrator on 2016/2/10.
 *
 * 抽象工厂模式加test 即建造者模式
 *
 */
public class Bulider {
  private List<Sender> list =new ArrayList<Sender>();
    public void produceMailSender(int count ){
        for (int i=0;i<count ;i++){
            list.add(new MailSender());

        }
    }

    public void priduceQqSender(int count ){
        for (int i = 0; i < count; i++) {
            list.add(new QqSender());
        }

    }






}
