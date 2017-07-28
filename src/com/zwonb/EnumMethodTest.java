package com.zwonb;

/**
 * Created by zyb on 2017/7/28.
 */
public class EnumMethodTest {

    enum Constants {
        CONSTANT_A, CONSTANT_B
    }

    private static void compare(Constants constants) {
        for (int i = 0; i < Constants.values().length; i++) {
            //顺序靠前返回-1，相等返回0，后面返回1
            System.out.println(constants + "与" + Constants.values()[i] + "的比较结果为：" +
                    constants.compareTo(Constants.values()[i]));
        }
    }

    public static void main(String[] args) {
        compare(Constants.CONSTANT_A);
    }
}
