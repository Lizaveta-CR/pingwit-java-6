package com.pingwit.core.les_12.classwork.point_1;

import java.util.Arrays;

public class StringExample {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[] {'h', 'e', 'l', 'l', 'o'}, 2, 3);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str1.length());
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));
        boolean empty = str1.isEmpty();
        System.out.println(empty);
        String str5 = "";
        System.out.println(str5.isEmpty());
        String str6 = " ";
        System.out.println(str6.isEmpty());
        System.out.println(str6.length());

//        String str7 = null;
//        str7.isEmpty();

        String str8 = "Java";
        String str9 = ", hellohel,";
        str8 = str8.concat(str9);
        System.out.println(str8);
        String str10 = str8 + str9;
        System.out.println(str10);

        String str11 = str9.replace(',', 'a');
        System.out.println(str11);
        String str12 = str11.replace("hel", " ");
        System.out.println(str12);

        System.out.println(str8);
        str8 = str8.substring(2);
        System.out.println(str8);
        str8 = str8.substring(2, 6);
        System.out.println(str8);

        String str13 = "abracadabra";
        str13 = str13.toUpperCase();
        System.out.println(str13);
        System.out.println(str13.toLowerCase());
        System.out.println(str13);

        String str14 = "This is \"an\" example";
        System.out.println(str14);
        System.out.println("=============================================");
        String obj1 = new String("Java");
        String obj2 = new String("Java");
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        String lit1 = "Java";
        String lit2 = "Java";
        System.out.println(lit1 == lit2);
        System.out.println(lit1.equals(lit2));
        System.out.println(obj1 == lit1);
        System.out.println(obj1.equals(lit1));

        String lit3 = obj1.intern();
        String obj3 = new String("Java1");
        String lit4 = obj3.intern();
        String lit5 = "Java1";
        System.out.println(lit4 == lit5);
    }
}
