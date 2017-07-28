package com.zwonb;

/**
 * Created by zyb on 2017/7/28.
 */
public class ShowEnum {

    enum Constants2 {
        //将常量放在枚举类型中
        CONSTANTA, CONSTANTB
    }

    public static void main(String[] args) {
        for (int i = 0; i < Constants2.values().length; i++) {
            //将枚举成员变量打印
            System.out.println("枚举类型成员变量：" + Constants2.values()[i]);
        }
    }
}
