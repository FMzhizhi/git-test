package com.test;

public class First {
    public static void main(String[] args) {
        System.out.println("Hello Git");
        System.out.println("Hello Git");
        System.out.println("Hello Git");
        System.out.println("Hello Git");
        System.out.println("Hello Git");
        get();
//        get();
        //调用静态方法
        System.out.println("hello world");

    }
    public static void get(){
        int i=0;
        System.out.println("i="+(++i));
    }
}
