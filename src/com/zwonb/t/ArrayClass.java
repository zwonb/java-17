package com.zwonb.t;

import java.util.Arrays;

/**
 * 泛型数组
 * Created by zyb on 2017/7/28.
 */
public class ArrayClass<T> {

    private T[] array;
//    private T[] a = new T[10]; 不能用泛型建立数组的实例

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public static void main(String[] args){
        ArrayClass<String> arrayClass = new ArrayClass<>();
        arrayClass.setArray(new String[]{"1","2","3"});
        System.out.println(Arrays.toString(arrayClass.getArray()));
    }
}
