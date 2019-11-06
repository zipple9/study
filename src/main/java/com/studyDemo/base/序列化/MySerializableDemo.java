package com.studyDemo.base.序列化;

import java.io.*;

/**
 * @Author wzy
 * @Date 2019/11/6
 */
public class MySerializableDemo implements Serializable {



    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "MySerializableDemo{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public static void main(String args[]) throws Exception{
        MySerializableDemo demo=new MySerializableDemo();
        demo.setName("123");

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bout);
        oos.writeObject(demo);





        ByteArrayInputStream bin =
                new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bin);
        System.out.println(ois.readObject());
    }



}
