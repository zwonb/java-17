package com.zwonb;

/**
 * Created by zyb on 2017/7/28.
 */
public class EnumIndexTest {

    //将常量放在枚举类型中
    enum Constants {
        CONSTANT_A, CONSTANT_B, CONSTANT_C
    }

    public static void main(String[] args) {
        for (int i = 0; i < Constants.values().length; i++) {
            //获取枚举成员的索引位置
            System.out.println(Constants.values()[i] + "在枚举中的索引值"
                    + Constants.values()[i].ordinal());
        }
    }

}
