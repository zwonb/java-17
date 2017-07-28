package com.zwonb;

/**
 * Created by zyb on 2017/7/28.
 */
public class EnumConsTest {

    enum Constants {
        CONSTANT_A("我是枚举成员A"),
        CONSTANT_B("我是枚举成员B"),
        CONSTANT_C("我是枚举成员C"),
        CONSTANT_D(3);

        private String description;
        private int i = 4;

        Constants() {
        }

        Constants(String description) {
            this.description = description;
        }

        Constants(int i) {
            this.i = i;
        }

        public String getDescription() {
            return description;
        }

        public int getI() {
            return i;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < Constants.values().length; i++) {
            System.out.println(Constants.values()[i] + "调用getDescription()方法" +
                    Constants.values()[i].getDescription());
        }
        System.out.println(Constants.valueOf("CONSTANT_D") + "调用getI()方法" +
                Constants.valueOf("CONSTANT_D").getI());
    }
}
