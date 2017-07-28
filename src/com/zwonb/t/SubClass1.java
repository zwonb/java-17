package com.zwonb.t;

/**
 * 保留父类的泛型类型，否则T，T1都是Object
 * Created by zyb on 2017/7/28.
 */
public class SubClass1<T,T1> implements ITest<T> {
    @Override
    public String s() {
        return null;
    }
}
