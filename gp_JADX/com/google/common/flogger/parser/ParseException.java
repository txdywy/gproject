package com.google.common.flogger.parser;

public final class ParseException extends RuntimeException {
    public static ParseException m32162a(String str, String str2, int i, int i2) {
        return new ParseException(m32164b(str, str2, i, i2));
    }

    public static ParseException m32161a(String str, String str2, int i) {
        return new ParseException(m32164b(str, str2, i, i + 1));
    }

    public static ParseException m32163b(String str, String str2, int i) {
        return new ParseException(m32164b(str, str2, i, -1));
    }

    public ParseException(String str) {
        super(str);
    }

    private static String m32164b(String str, String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder append = new StringBuilder(str).append(": ");
        if (i > 8) {
            append.append("...").append(str2, i - 5, i);
        } else {
            append.append(str2, 0, i);
        }
        append.append('[').append(str2.substring(i, i2)).append(']');
        if (str2.length() - i2 > 8) {
            append.append(str2, i2, i2 + 5).append("...");
        } else {
            append.append(str2, i2, str2.length());
        }
        return append.toString();
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
