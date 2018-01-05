package com.squareup.okhttp;

import java.io.UnsupportedEncodingException;
import p526e.C7728j;

public final class C7684q {
    public static String m37007a(String str, String str2) {
        try {
            return "Basic " + C7728j.m37413a((str + ":" + str2).getBytes("ISO-8859-1")).mo6519b();
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError();
        }
    }
}
