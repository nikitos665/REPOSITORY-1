package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {
        String aparat = "номерок мой блатной пацаны 15.255.245.192 салам пацаны гуляем лялелеля 270.65.31.200 лорнер 207.3.58.105";
        Pattern pattern = Pattern.compile("(\\b((1\\d{0,2})|(2[0-4]\\d)|(25[0-5])|([1-9]\\d)|(\\d)|(\\d{2}).){3}((1\\d{0,2})|(2[0-4]\\d)|(25[0-5])|([1-9]\\d)$|(\\d)$))");
        Matcher matcher = pattern.matcher(aparat);
        while (matcher.find()){
            System.out.println(matcher.group());
    }
}}
