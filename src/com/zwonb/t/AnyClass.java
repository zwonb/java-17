package com.zwonb.t;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyb on 2017/7/28.
 */
public class AnyClass {

    List<?> list = new ArrayList<String>();

    public void doSomething(List<? extends List> list){}
}
