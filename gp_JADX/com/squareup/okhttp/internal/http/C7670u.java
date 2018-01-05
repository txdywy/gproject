package com.squareup.okhttp.internal.http;

public final class C7670u {
    public static boolean m36979a(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean m36980b(String str) {
        return C7670u.m36979a(str) || str.equals("OPTIONS") || str.equals("DELETE") || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK");
    }
}
