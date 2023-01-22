package com.defers.codewars;

//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//
//        The output should be two capital letters with a dot separating them.
//
//        It should look like this:
//
//        Sam Harris => S.H
//
//        patrick feeney => P.F

public class AbbreviateATwoWordName {
    public static String abbrevName(String name) {
        int indexOfSpace = name.indexOf(" ");
        String result = name.substring(0, 1) + "." + name.substring(indexOfSpace + 1, indexOfSpace + 2);
        return result.toUpperCase();
    }
}
