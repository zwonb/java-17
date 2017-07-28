package com.zwonb;

/**
 * Created by zyb on 2017/7/28.
 */
public enum AnyEnum implements IEnumSetGet {

    CONSTANTS_A {
        //可以在枚举类型成员变量设置方法
        @Override
        public String getDescription() {
            return "我是枚举成员A";
        }

        @Override
        public int getI() {
            return i;
        }
    },
    CONSTANT_B {
        @Override
        public String getDescription() {
            return "我是枚举成员B";
        }

        @Override
        public int getI() {
            return i;
        }
    },
    CONSTANTS_C {
        @Override
        public String getDescription() {
            return "我是枚举成员C";
        }

        @Override
        public int getI() {
            return i;
        }
    },
    CONSTANTS_D {
        @Override
        public String getDescription() {
            return "我是枚举成员D";
        }

        @Override
        public int getI() {
            return i;
        }
    };

    private static int i = 5;

    public static void main(String[] args) {
        for (int i = 0; i < AnyEnum.values().length; i++) {
            System.out.println(AnyEnum.values()[i] + "调用getDescription()方法" +
                    AnyEnum.values()[i].getDescription());
            System.out.println(AnyEnum.values()[i] + "调用getI()方法" +
                    AnyEnum.values()[i].getI());
        }
    }
}
