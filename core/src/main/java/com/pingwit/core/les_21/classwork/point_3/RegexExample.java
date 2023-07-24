package com.pingwit.core.les_21.classwork.point_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//RegEx
public class RegexExample {

    public static void main(String[] args) {
        String regex = "java"; //шаблон строки "java"
        String regex2 = "\\d{3}"; //шаблон строки из 3 цифровых символов "123"

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("ssjava ss");
        System.out.println(matcher.find());

        Matcher matcher2 = pattern.matcher("javajava");
        int counter = 0;
        while (matcher2.find()) {
            counter++;
        }
        System.out.println(counter);

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher3 = pattern2.matcher("123123");
        int counter2 = 0;
        while (matcher3.find()) {
            counter2++;
        }
        System.out.println(counter2);

        String str = "<p>This <b>77 </b> an <b>example</b> HTML <b>script</b> "
            + "where <b>every</b> alternative <b>word</b> is <b>bold</b>. "
            + "It <i>also</i> contains <i>italic</i> words</p>";
        String regexStr = "<b>(\\w+)</b>";
        Pattern patternStr = Pattern.compile(regexStr);
        Matcher matcherStr = patternStr.matcher(str);
        while (matcherStr.find()) {
            System.out.println(matcherStr.group());
        }

        System.out.println("===Email verifier===");
        String email = "pingwitpl@gmail.com";
        String emailRegex = ".+@(.+)";
        Pattern patternEmail = Pattern.compile(emailRegex);
        Matcher matcherEmail = patternEmail.matcher(email);
        if (matcherEmail.find()) {
            System.out.println(matcherEmail.group());
            System.out.println(matcherEmail.group(1));
        }

        String name = "Liza";
        Pattern compile = Pattern.compile("^[A-Za-z]+$");
        System.out.println(compile.matcher(name).find());
    }
}
