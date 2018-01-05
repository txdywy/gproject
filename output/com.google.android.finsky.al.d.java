package com.google.android.finsky.al;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.common.http.UrlRules;
import com.google.android.common.http.c;
import com.google.android.finsky.api.g;

public final class com.google.android.finsky.al.d implements com.google.android.finsky.al.i
{

    public static final String a;
    public final Context b;
    public final com.google.android.finsky.al.j c;

    static {
        com.google.android.finsky.al.d.a = com.google.android.finsky.api.g.a.toString();
    }

    d(Context p0, com.google.android.finsky.al.j p1) {
        this.b = p0;
        this.c = p1;
    }

    public final boolean a(Object p0) {
        if (this.c == 0 || this.c.a((com.google.android.finsky.al.e)p0))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean a(String[] p0) {
        return 1;
    }

    public final Object b(String[] p0) {
        v1 = 0;
        if (p0 != 0 && p0.length >= 3 && !((p0.length - 3) % 2)) {
            v2 = 3;
            v0 = 0;
            while (v2 < p0.length) {
                v3 = -1;
                switch (p0[v2].hashCode()) {
                    case -312917353:
                        if (p0[v2].equals("Heterodyne"))
                            v3 = 1;
                        break;
                    case 79164:
                        if (p0[v2].equals("PGS"))
                            v3 = 0;
                        break;
                    default:
                        break;
                }
                switch (v3) {
                    case 0:
                        v1 = p0[v2 + 1];
                        break;
                    case 1:
                        v0 = p0[v2 + 1];
                        break;
                    default:
                        break;
                }
                v2 = v2 + 2;
            }
            v2 = new com.google.android.finsky.al.f();
            v2.a = p0[1];
            v2.b = v1;
            v2.c = v0;
            v0 = v2.a();
        }
        else
            v0 = com.google.android.finsky.al.e.d;
        return v0;
    }

    public final boolean b(Object p0) {
        v0 = UrlRules.a(this.b.getContentResolver()).a(com.google.android.finsky.al.d.a);
        if (v0 == com.google.android.common.http.c.e)
            v0 = com.google.android.finsky.al.d.a;
        else
            v0 = v0.a(com.google.android.finsky.al.d.a);
        return TextUtils.equals(((com.google.android.finsky.al.e)p0).a, v0);
    }

}
