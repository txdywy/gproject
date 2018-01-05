package com.google.android.finsky.contentfilterui;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ab.a;
import com.google.android.finsky.ab.b;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.volley.e;
import com.google.wireless.android.finsky.b.g;
import com.google.wireless.android.finsky.b.h;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters$ContentFilterSettingsResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class com.google.android.finsky.contentfilterui.n
{

    public static final b[] a;
    public final ContentFilters$ContentFilterSettingsResponse b;
    public final Bundle c;
    public final String d;
    public List e;
    public boolean f;
    public boolean g;
    public boolean h;
    public com.google.android.finsky.accounts.c i;
    public com.google.android.finsky.api.h j;
    public com.google.android.finsky.volley.e k;

    static {
        com.google.android.finsky.contentfilterui.n.a = new b[0];
    }

    n(ContentFilters$ContentFilterSettingsResponse p0, String p1, com.google.android.finsky.accounts.c p2, com.google.android.finsky.api.h p3, com.google.android.finsky.volley.e p4) {
        this.c = new Bundle();
        this.b = p0;
        this.d = p1;
        this.i = p2;
        this.j = p3;
        this.k = p4;
        this.e = com.google.android.finsky.ab.a.a(p0);
        if (p0.o != 0)
            this.f = 1;
        else {
            v0 = new ArrayList(Arrays.asList(com.google.android.finsky.ab.a.a(this.d())));
            if (v0.size() == this.e.size())
                this.e = v0;
        }
    }

    static g[] a(Iterable p0) {
        v2 = new ArrayList();
        v3 = p0.iterator();
        while (v3.hasNext()) {
            v0 = (com.google.android.finsky.ab.b)v3.next();
            if (v0.c == -1)
                continue;
            v1 = 0;
            while (v1 < v0.a.length) {
                v7 = new com.google.wireless.android.finsky.b.g();
                v7.c = v0.a[v1];
                v7.b = v7.b | 1;
                v6 = new com.google.wireless.android.finsky.b.h();
                v6.a = v6.a | 2;
                v6.c = v0.c;
                v6.a = v6.a | 1;
                v6.b = v0.b;
                v7.d = v6;
                v2.add(v7);
                v1 = v1 + 1;
            }
        }
        return (g[])v2.toArray(new g[v2.size()]);
    }

    public final boolean a() {
        if (this.f != 0 || !this.c() && !TextUtils.isEmpty((String)com.google.android.finsky.aa.a.i.a()))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    final boolean b() {
        if (this.g != 0 || this.c())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    final boolean c() {
        if (this.d != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    final com.google.android.finsky.aa.n d() {
        if (this.c())
            v0 = com.google.android.finsky.aa.a.e.b(this.d);
        else
            v0 = com.google.android.finsky.aa.a.g;
        return v0;
    }

}
