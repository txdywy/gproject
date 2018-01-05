package com.google.android.common.http;

import java.util.regex.Pattern;

public final class com.google.android.common.http.c implements Comparable
{

    public static final com.google.android.common.http.c e;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    static {
        com.google.android.common.http.c.e = new com.google.android.common.http.c();
    }

    c() {
        this.a = "DEFAULT";
        this.b = "";
        this.c = 0;
        this.d = 0;
    }

    c(String p0, String p1) {
        this.a = p0;
        v4 = UrlRules.a.split(p1);
        if (v4.length == 0)
            throw new UrlRules$RuleFormatException("Empty rule");
        this.b = v4[0];
        v3 = 0;
        v2 = 0;
        v0 = 1;
        while (true) {
            while (true) {
                if (v0 >= v4.length) {
                    this.c = v3;
                    this.d = v2;
                    return;
                }
                v5 = v4[v0].toLowerCase();
                if (!v5.equals("rewrite"))
                    break;
                if (v0 + 1 >= v4.length)
                    break;
                v3 = v4[v0 + 1];
                v0 = v0 + 2;
            }
            if (!v5.equals("block"))
                break;
            v0 = v0 + 1;
            v2 = 1;
        }
        v0 = String.valueOf(p1);
        if (v0.length() != 0)
            v0 = "Illegal rule: ".concat(v0);
        else
            v0 = new String("Illegal rule: ");
        throw new UrlRules$RuleFormatException(v0);
    }

    public final String a(String p0) {
        if (this.d != 0)
            p0 = 0;
        else if (this.c != 0) {
            v0 = String.valueOf(this.c);
            v1 = String.valueOf(p0.substring(this.b.length()));
            if (v1.length() != 0)
                p0 = v0.concat(v1);
            else
                p0 = new String(v0);
        }
        return p0;
    }

    public final int compareTo(Object p0) {
        return ((com.google.android.common.http.c)p0).b.compareTo(this.b);
    }

}
