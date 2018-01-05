package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C7689v;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ak;
import java.util.Date;

public final class C7652d {
    public final long f39620a;
    public final ag f39621b;
    public final ak f39622c;
    public Date f39623d;
    public String f39624e;
    public Date f39625f;
    public String f39626g;
    public Date f39627h;
    public long f39628i;
    public long f39629j;
    public String f39630k;
    public int f39631l = -1;

    public C7652d(long j, ag agVar, ak akVar) {
        this.f39620a = j;
        this.f39621b = agVar;
        this.f39622c = akVar;
        if (akVar != null) {
            C7689v c7689v = akVar.f39309f;
            int length = c7689v.f39793a.length / 2;
            for (int i = 0; i < length; i++) {
                String a = c7689v.m37013a(i);
                String b = c7689v.m37017b(i);
                if ("Date".equalsIgnoreCase(a)) {
                    this.f39623d = C7664o.m36960a(b);
                    this.f39624e = b;
                } else if ("Expires".equalsIgnoreCase(a)) {
                    this.f39627h = C7664o.m36960a(b);
                } else if ("Last-Modified".equalsIgnoreCase(a)) {
                    this.f39625f = C7664o.m36960a(b);
                    this.f39626g = b;
                } else if ("ETag".equalsIgnoreCase(a)) {
                    this.f39630k = b;
                } else if ("Age".equalsIgnoreCase(a)) {
                    this.f39631l = C7653e.m36924b(b, -1);
                } else if (C7671w.f39704c.equalsIgnoreCase(a)) {
                    this.f39628i = Long.parseLong(b);
                } else if (C7671w.f39705d.equalsIgnoreCase(a)) {
                    this.f39629j = Long.parseLong(b);
                }
            }
        }
    }

    public static boolean m36921a(ag agVar) {
        return (agVar.m36630a("If-Modified-Since") == null && agVar.m36630a("If-None-Match") == null) ? false : true;
    }
}
