package com.google.android.finsky.api;

import android.accounts.Account;
import android.net.Uri;
import android.net.Uri$Builder;
import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.as.e;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.be;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class com.google.android.finsky.api.l
{

    public static Set a;
    public final Uri b;
    public com.google.android.finsky.ba.c c;
    public com.google.android.finsky.api.h d;
    public com.google.android.finsky.as.e e;
    public com.google.android.finsky.accounts.a f;

    l(com.google.android.finsky.ba.c p0, com.google.android.finsky.api.h p1, com.google.android.finsky.as.e p2, com.google.android.finsky.accounts.a p3) {
        this.c = p0;
        this.b = com.google.android.finsky.api.g.a;
        this.d = p1;
        this.e = p2;
        this.f = p3;
    }

    public static String a(String p0) {
        v0 = String.valueOf(p0);
        if (v0.length() != 0)
            v0 = "details?doc=".concat(v0);
        else
            v0 = new String("details?doc=");
        return v0;
    }

    public static String a(String p0, int p1, int p2) {
        if (p1 == 9)
            p1 = 0;
        v0 = com.google.android.finsky.api.g.d.buildUpon().appendQueryParameter("c", Integer.toString(p1)).appendQueryParameter("q", p0);
        if (p2 != 0)
            v0.appendQueryParameter("sb", Integer.toString(p2));
        return v0.build().toString();
    }

    public static String b(String p0) {
        v0 = String.valueOf(p0);
        if (v0.length() != 0)
            v0 = "inlineDetails?doc=".concat(v0);
        else
            v0 = new String("inlineDetails?doc=");
        return v0;
    }

    public static String c(String p0) {
        if (!p0.contains("/details?"))
            v0 = 0;
        else {
            v0 = p0.indexOf("/account=");
            if (v0 == -1)
                v0 = 0;
            else {
                v2 = Uri.parse(p0.substring(0, v0)).getQueryParameter("doc");
                if (TextUtils.isEmpty(v2))
                    v0 = 0;
                else {
                    v3 = p0.substring(v0);
                    v0 = v3.indexOf(47, 2);
                    if (v0 == -1)
                        v0 = v3.length();
                    v0 = v3.substring(9, v0);
                    if (TextUtils.isEmpty(v0))
                        v0 = 0;
                    else
                        v0 = (String.valueOf(v2).length() + 13 + String.valueOf(v0).length()) + "doc=" + v2 + "&account=" + v0;
                }
            }
        }
        return v0;
    }

    private static boolean d(String p0) {
        if (TextUtils.isEmpty(p0))
            v0 = 0;
        else {
            v2 = com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.iw.b());
            v0 = 0;
            while (v0 < v2.length) {
                if (p0.equalsIgnoreCase(v2[v0])) {
                    v0 = 1;
                    return v0;
                }
                v0 = v0 + 1;
            }
            v0 = 0;
        }
        return v0;
    }

    public final String a(String p0, String p1, String p2, String p3, StringBuilder p4) {
        if (this.c.dj().a(12617419)) {
            if (com.google.android.finsky.api.l.a == 0)
                com.google.android.finsky.api.l.a = new HashSet(Arrays.asList(com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.gD.b())));
            p0 = com.google.android.finsky.utils.be.a(p0, com.google.android.finsky.api.l.a);
        }
        v0 = new StringBuilder(256).append(p0).append("/account=").append(p1);
        if (this.c.dj().a(12629845) && !TextUtils.isEmpty(p2) && !com.google.android.finsky.api.l.d(p3))
            v0.append("/mccmnc=").append(p2);
        if (p4 != 0)
            v0.append(p4);
        return v0.toString();
    }

    public final ArrayDeque a(boolean p0) {
        v1 = 0;
        FinskyLog.b("Generate Dfe Api List", new Object[0]);
        v0 = new ArrayDeque();
        if (this.e.d())
            v0.add(this.d.b());
        else {
            v2 = this.d.a();
            if (v2 != 0) {
                v0.add(v2);
                v3 = this.f.d();
                while (v1 < v3.length) {
                    if (!v2.c().equals(v3[v1].name))
                        v0.add(this.d.a(v3[v1].name));
                    v1 = v1 + 1;
                }
            }
            if (p0 != 0)
                v0.add(this.d.b());
        }
        return v0;
    }

    public final boolean a() {
        if (!this.c.dj().a(12640144) && ((Boolean)com.google.android.finsky.aa.b.jg.b()).booleanValue())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
