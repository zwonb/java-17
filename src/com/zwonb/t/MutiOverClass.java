package com.zwonb.t;

import java.util.HashMap;
import java.util.Map;

/**
 * 集合类声明容器的元素
 * Created by zyb on 2017/7/28.
 */
public class MutiOverClass<K, V> {

    public Map<K, V> map = new HashMap<>();

    public V get(K k) {
        return map.get(k);
    }

    public void put(K k, V v) {
        this.map.put(k, v);
    }

    public static void main(String[] args){
        //实例化泛型类对象
        MutiOverClass<Integer,String> mutiOverClass = new MutiOverClass<>();
        for (int i = 0; i < 5; i++) {
            mutiOverClass.put(i,"我是集合成员"+i);
        }
        for (int i = 0; i < mutiOverClass.map.size(); i++) {
            System.out.println(mutiOverClass.get(i));
        }
    }
}
