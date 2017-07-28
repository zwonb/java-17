package com.zwonb.t;

/**
 * Created by zyb on 2017/7/28.
 */
public class Test {

    private Object b;

    public Object getB() {
        return b;
    }

    public void setB(Object b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setB(Boolean.TRUE);
        System.out.println(test.getB());
        test.setB(new Float("132.5"));
        Float b = (Float) test.getB();
        System.out.println(b);
    }
}
