package com.java.class37;

public class ExceptionRealTime {
    public static void main(String[] args) throws Exception {
        method1();
    }
    static void method1(){
        method2();
    }

    static void method2(){
        method3();
    }

    static void method3()  {
        method4();
    }

    static void method4() throws ClassNotFoundException {

    }


}
