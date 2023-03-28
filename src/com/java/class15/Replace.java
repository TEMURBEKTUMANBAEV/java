package com.java.class15;

public class Replace {
    public static void main(String[] args) {
        String str = "earth is flat";
        String str1 = str.replace('a', 'W');
        System.out.println(str1);

        String str3 = "public static void main(String{} args)";
        str3  = str3.replace('{','[').replace('}', ']');
        System.out.println(str3);



        //        System.out.println(str3);
//        System.out.println(str4);
//
//        String str5 = str4.replace('}', ']');
//        System.out.println(str5);


















    }
}
