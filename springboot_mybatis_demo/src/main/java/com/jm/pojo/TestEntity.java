package com.jm.pojo;

public class TestEntity {
    public static Integer i = 1;
    public String j = "2";
//    static TestEmmm testEmmm ;
    public static void getEunm(){


    }

    public static void main(String[] args) {
//        System.out.println(TestEmmm.valueOf();
        TestEmmm[] values = TestEmmm.values();
        for (TestEmmm value : values) {
            System.out.println(value);
        }
        System.out.println();
    }
}
