package com.pingwit.core.les_25.classwork.point_2;

import org.apache.commons.lang3.StringUtils;

public class ApacheStringUtilsExample {

    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(new StringBuffer("aaaa")));
        System.out.println(StringUtils.isEmpty(" "));

        System.out.println("====");
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank(new StringBuffer("aaaa")));
        System.out.println(StringUtils.isBlank(" "));

        String cat = StringUtils.capitalize("cat");
        System.out.println(cat);
        System.out.println(StringUtils.capitalize("cAt"));
        System.out.println(StringUtils.capitalize("cAT"));
    }
}
