package com.zwonb;

public class Main {

    public static void main(String[] args) {
        doit(ConstantsInterface.ConstantsA); //使用接口中的常量
        doit2(ConstantsEnum.CONSTANTSA); //使用枚举类型的常量
        doit2(ConstantsEnum.CONSTANTSB); //使用枚举类型的常量
        doit(3);
//        doit2(3); //报错
    }

    private static void doit(int c) {
        switch (c){
            case ConstantsInterface.ConstantsA:
                System.out.println("doit()ConstantsA");
                break;
            case ConstantsInterface.ConstantsB:
                System.out.println("doit()ConstantsB");
                break;
        }
    }

    private static void doit2(ConstantsEnum c) {
        switch (c){
            case CONSTANTSA:
                System.out.println("doit2()ConstantsA");
                break;
            case CONSTANTSB:
                System.out.println("doit2()ConstantsB");
                break;
        }
    }
}
