package com.defers.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidatePINCode {
    public static boolean validatePin(String pin) {
        Pattern p = Pattern.compile("\\d{4}|\\d{6}");
        Matcher m = p.matcher(pin);
        return m.matches();
    }
}
