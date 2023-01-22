package com.defers.codewars;

//DESCRIPTION:
//        Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
//
//        Examples
//        "the-stealth-warrior" gets converted to "theStealthWarrior"
//        "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertStringToCamelCase {
    static String toCamelCase(String s){
        String pattern = "(-)|(_)";
        String[] splited = s.split(pattern);
        String res = Arrays.stream(Arrays.copyOfRange(splited, 1, splited.length))
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                .collect(Collectors.joining());
        System.out.println(splited[0] + res);
        return splited[0] + res;
    }
}
