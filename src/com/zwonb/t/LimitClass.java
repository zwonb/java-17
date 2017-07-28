package com.zwonb.t;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 限制泛型可用类型
 * Created by zyb on 2017/7/28.
 */
public class LimitClass<T extends List> {

    public static void main(String[] args) {
        LimitClass<ArrayList> limitClass = new LimitClass<>();
        LimitClass<LinkedList> linkedListLimitClass = new LimitClass<>();
        //下面报错，HashMap没有实现List接口
//        LimitClass<HashMap> hashMapLinkedList = new LinkedList<>();
    }
}
