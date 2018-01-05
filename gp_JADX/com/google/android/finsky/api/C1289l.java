package com.google.android.finsky.api;

import android.accounts.Account;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.be;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class C1289l {
    public static Set f7682a;
    public final Uri f7683b = C1286g.f7656a;
    public C1461c f7684c;
    public C1287h f7685d;
    public C1506e f7686e;
    public C0986a f7687f;

    public C1289l(C1461c c1461c, C1287h c1287h, C1506e c1506e, C0986a c0986a) {
        this.f7684c = c1461c;
        this.f7685d = c1287h;
        this.f7686e = c1506e;
        this.f7687f = c0986a;
    }

    public static String m7695a(String str, int i, int i2) {
        if (i == 9) {
            i = 0;
        }
        Builder appendQueryParameter = C1286g.f7659d.buildUpon().appendQueryParameter("c", Integer.toString(i)).appendQueryParameter("q", str);
        if (i2 != 0) {
            appendQueryParameter.appendQueryParameter("sb", Integer.toString(i2));
        }
        return appendQueryParameter.build().toString();
    }

    public static String m7694a(String str) {
        String str2 = "details?doc=";
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    public static String m7696b(String str) {
        String str2 = "inlineDetails?doc=";
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    public final String m7699a(String str, String str2, String str3, String str4, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder(256);
        if (this.f7684c.dj().mo2294a(12617419)) {
            if (f7682a == null) {
                f7682a = new HashSet(Arrays.asList(C4680k.m21818a((String) C0955b.gD.m28964b())));
            }
            str = be.m21801a(str, f7682a);
        }
        StringBuilder append = stringBuilder2.append(str).append("/account=").append(str2);
        if (!(!this.f7684c.dj().mo2294a(12629845) || TextUtils.isEmpty(str3) || C1289l.m7698d(str4))) {
            append.append("/mccmnc=").append(str3);
        }
        if (stringBuilder != null) {
            append.append(stringBuilder);
        }
        return append.toString();
    }

    public static String m7697c(String str) {
        if (!str.contains("/details?")) {
            return null;
        }
        int indexOf = str.indexOf("/account=");
        if (indexOf == -1) {
            return null;
        }
        Object queryParameter = Uri.parse(str.substring(0, indexOf)).getQueryParameter("doc");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String substring = str.substring(indexOf);
        indexOf = substring.indexOf(47, 2);
        if (indexOf == -1) {
            indexOf = substring.length();
        }
        Object substring2 = substring.substring(9, indexOf);
        if (TextUtils.isEmpty(substring2)) {
            return null;
        }
        return new StringBuilder((String.valueOf(queryParameter).length() + 13) + String.valueOf(substring2).length()).append("doc=").append(queryParameter).append("&account=").append(substring2).toString();
    }

    private static boolean m7698d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String equalsIgnoreCase : C4680k.m21818a((String) C0955b.iw.m28964b())) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m7701a() {
        return !this.f7684c.dj().mo2294a(12640144) && ((Boolean) C0955b.jg.m28964b()).booleanValue();
    }

    public final ArrayDeque m7700a(boolean z) {
        int i = 0;
        FinskyLog.m21662b("Generate Dfe Api List", new Object[0]);
        ArrayDeque arrayDeque = new ArrayDeque();
        if (this.f7686e.m8841d()) {
            arrayDeque.add(this.f7685d.mo2017b());
        } else {
            C1254c a = this.f7685d.mo2015a();
            if (a != null) {
                arrayDeque.add(a);
                String c = a.mo1636c();
                Account[] d = this.f7687f.mo1188d();
                int length = d.length;
                while (i < length) {
                    Account account = d[i];
                    if (!c.equals(account.name)) {
                        arrayDeque.add(this.f7685d.mo2016a(account.name));
                    }
                    i++;
                }
            }
            if (z) {
                arrayDeque.add(this.f7685d.mo2017b());
            }
        }
        return arrayDeque;
    }
}
