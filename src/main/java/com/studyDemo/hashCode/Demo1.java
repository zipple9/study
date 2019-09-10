package com.studyDemo.hashCode;

import com.DemoBean;

/**
 * @Author wzy
 * @Date 2019/9/9
 */
public class Demo1 {



    public static void main(String args[]){


        DemoBean db1=new DemoBean();
        DemoBean db2=new DemoBean();

//        db2.setAge(12);

        System.out.println(db1.hashCode());
        System.out.println(db2.hashCode());


        System.out.println(db1.equals(db2));


        System.out.println(Math.round(-1.5));


        String str="adfafa";


    }
}
