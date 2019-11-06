package com.studyDemo.base.ENUM;

/**
 * @Author wzy
 * @Date 2019/11/6
 */
public enum MyEnum {


    MON("星期一"), TUE("星期二"){
        public String getValue(){
            return "MON!";
        }
    };

    private String value;

    private MyEnum(String str){
        this.value=str;
    }



    //给 enum 对象加一下 value 的属性和 getValue() 的方法：

    public static void main(String args[]){
        System.out.println(MyEnum.MON.value);

    }
}
