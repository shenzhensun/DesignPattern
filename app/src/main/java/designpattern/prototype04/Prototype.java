package designpattern.prototype04;

/**
 * Created by Administrator on 2016/2/10.
 *
 * 原型模式虽然是创建型的模型，但与工厂模式没有关系，
 * 以一个对象为原型进行复制，克隆产生一个和源对象类似的新对象。
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**

 * 影子克隆 ：浅复制将一个对象复制后，基本的数据类型的变量都会被重建，而引用数据类型指向的还是原对象所指向的
 * 深度克隆：深复制将一个对象复制后，不论是基本数据类型还是引用数据类型都会新创建，彻底复制。
 */
public class Prototype implements Cloneable ,Serializable {
    private static  final long serialVersionUID=1l;
    private String string;
    private SerializableObject obj;


    public Object clone() throws  CloneNotSupportedException{

        Prototype prototype=(Prototype)super.clone();
        return  prototype;
    }

    /**
     * 深复制
     */
    public  Object deepClone()throws IOException,ClassNotFoundException{
        /**
         * 写入当前对象的二进制流
         */
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos =new ObjectOutputStream(bos);
        oos.writeObject(this);//

        /*  读出二进制流产生的新对象 */

        ByteArrayInputStream bis =new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return  ois.readObject();
    }

  public String getString(){

      return  string;
  }

    public void setString(String string){
        this.string=string;

    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

    class  SerializableObject implements Serializable {

    private static final long serialVersionUID=1l;



}
/**
 * 要实现深复制，需要采用流的形式读入当前的的二进制输入，然后输入二进制对应的对象，
 *
 */




}
