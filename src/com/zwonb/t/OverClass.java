package com.zwonb.t;

/**
 * 泛型
 * Created by zyb on 2017/7/28.
 */
public class OverClass<T> {

    private T over;

    public T getOver() {
        return over;
    }

    public void setOver(T over) {
        this.over = over;
    }

    public static void main(String[] args){
        OverClass<Boolean> overB = new OverClass<>();
        overB.setOver(true);
        System.out.println(overB.getOver());
        OverClass<Float> overF = new OverClass<>();
        overF.setOver(123.3f);
        System.out.println(overF.getOver());
    }
}
