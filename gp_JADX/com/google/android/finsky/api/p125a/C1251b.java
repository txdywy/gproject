package com.google.android.finsky.api.p125a;

import android.accounts.Account;
import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.android.volley.C0659a;
import com.android.volley.p060a.C0662b;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.ah.C1186a;
import com.google.android.finsky.api.C0947i;
import com.google.android.finsky.api.C1285f;
import com.google.android.finsky.api.C1286g;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.az.C1535a;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.cg.C2276c;
import com.google.android.finsky.cs.C2376e;
import com.google.android.finsky.ct.C2412a;
import com.google.android.finsky.cv.p177a.lg;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.deviceconfig.C2699l;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p133c.C2243a;
import com.google.android.finsky.p230q.C3950c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.be;
import com.google.android.play.utils.k;
import com.google.android.volley.l;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p002a.C0002a;

public final class C1251b {
    public static String f7422a;
    public C2376e f7423b;
    public C0002a f7424c;
    public C2471a f7425d;
    public C2412a f7426e;
    public final Context f7427f;
    public final C1552e f7428g;
    public final C0662b f7429h;
    public final C0659a f7430i;
    public final boolean f7431j;
    public final String f7432k;
    public final String f7433l;
    public final Map f7434m = new HashMap();
    public final C2482j f7435n;
    public final C1500a f7436o;
    public final C2693e f7437p;
    public final String f7438q;
    public final C1186a f7439r;
    public final C2495w f7440s;
    public String f7441t;
    public C2243a f7442u;
    public C2276c f7443v;
    public C1252c f7444w;
    public final C1535a f7445x;
    public final boolean f7446y;

    public static synchronized void m7282a(String str) {
        synchronized (C1251b.class) {
            f7422a = str;
        }
    }

    private static synchronized String m7283i() {
        String str;
        synchronized (C1251b.class) {
            str = f7422a;
        }
        return str;
    }

    public C1251b(Context context, C0662b c0662b, C0659a c0659a, C1552e c1552e, boolean z, Locale locale, String str, String str2, String str3, String str4, String str5, C2243a c2243a, C2482j c2482j, String str6, String str7, C1500a c1500a, C2693e c2693e, String str8, C1186a c1186a, boolean z2, C2276c c2276c, C1535a c1535a) {
        ((C1250a) C3947d.m18649a(C1250a.class)).mo1705a(this);
        this.f7427f = context;
        this.f7429h = c0662b;
        this.f7430i = c0659a;
        this.f7431j = z;
        this.f7432k = str;
        this.f7433l = str2;
        this.f7428g = c1552e;
        this.f7442u = c2243a;
        this.f7438q = str8;
        this.f7439r = c1186a;
        this.f7446y = z2;
        this.f7434m.put("X-DFE-Device-Id", str6);
        String language = locale.getLanguage();
        String country = locale.getCountry();
        this.f7434m.put("Accept-Language", new StringBuilder((String.valueOf(language).length() + 1) + String.valueOf(country).length()).append(language).append("-").append(country).toString());
        if (!TextUtils.isEmpty(this.f7432k)) {
            this.f7434m.put("X-DFE-MCCMNC", this.f7432k);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.f7434m.put("X-DFE-Client-Id", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            this.f7434m.put("X-DFE-Logging-Id", str4);
        }
        this.f7434m.put("User-Agent", str7);
        m7288b(str5);
        this.f7435n = c2482j;
        this.f7443v = c2276c;
        if (!((Boolean) C0955b.fj.m28964b()).booleanValue() || (this.f7428g != null && this.f7428g.mo2294a(12603109))) {
            this.f7436o = null;
        } else {
            this.f7436o = c1500a;
        }
        this.f7437p = c2693e;
        this.f7445x = c1535a;
        String uri = C1286g.f7656a.toString();
        String a = l.a(this.f7427f, uri);
        if (a == null) {
            language = "BASE_URI blocked by UrlRules: ";
            uri = String.valueOf(uri);
            if (uri.length() != 0) {
                uri = language.concat(uri);
            } else {
                uri = new String(language);
            }
            throw new RuntimeException(uri);
        } else if (be.m21802a(a, k.a())) {
            C2495w a2;
            Account a3 = m7284a();
            if (a3 != null) {
                a2 = this.f7425d.m13178a(a3);
            } else {
                a2 = this.f7425d.m13184a(null);
            }
            this.f7440s = a2;
        } else {
            country = "Insecure URL: ";
            uri = String.valueOf(a);
            throw new RuntimeException(uri.length() != 0 ? country.concat(uri) : new String(country));
        }
    }

    public final void m7288b(String str) {
        this.f7434m.put("X-DFE-Content-Filters", str);
        String str2 = (String) C0954a.aP.m5760a();
        if (!TextUtils.isEmpty(str2)) {
            this.f7434m.put("X-DFE-Content-Filter-Consistency-Token", str2);
        }
    }

    public final Account m7284a() {
        if (this.f7429h == null) {
            return null;
        }
        return this.f7429h.f4063b;
    }

    public final String m7287b() {
        Account a = m7284a();
        return a == null ? null : a.name;
    }

    public final void m7291c() {
        if (this.f7441t != null) {
            if (this.f7429h != null) {
                this.f7429h.m4420a(this.f7441t);
            }
            this.f7441t = null;
        }
    }

    public final C0947i m7292d() {
        if (this.f7431j) {
            return (C0947i) this.f7424c.mo1a();
        }
        return null;
    }

    public final synchronized void m7285a(String str, String str2) {
        this.f7434m.put(str, str2);
    }

    public final synchronized Map m7293e() {
        Map hashMap;
        hashMap = new HashMap();
        hashMap.putAll(this.f7434m);
        if (this.f7428g != null) {
            if (this.f7428g.mo2294a(12610177)) {
                hashMap.put("X-DFE-Encoded-Targets", this.f7428g.mo2301h());
            } else {
                if (this.f7428g.mo2297d()) {
                    hashMap.put("X-DFE-Supported-Targets", this.f7428g.mo2299f());
                }
                if (this.f7428g.mo2298e()) {
                    hashMap.put("X-DFE-Other-Targets", this.f7428g.mo2300g());
                }
            }
        }
        CharSequence e = this.f7423b.mo2880e(m7287b());
        if (!TextUtils.isEmpty(e)) {
            hashMap.put("X-DFE-Phenotype", e);
        }
        C0957n b = C0954a.aq.m5777b(m7287b());
        if (!TextUtils.isEmpty((CharSequence) b.m5760a())) {
            hashMap.put("X-DFE-Debug-Overrides", (String) b.m5760a());
        }
        b = C0954a.f5830Z.m5777b(m7287b());
        if (!TextUtils.isEmpty((CharSequence) b.m5760a())) {
            hashMap.put("X-DFE-Debug-Other-Overridden-Targets", (String) b.m5760a());
        }
        String str = (String) C0954a.an.m5777b(m7287b()).m5760a();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("X-DFE-Cookie", str);
        }
        if (this.f7429h != null) {
            this.f7441t = this.f7429h.mo1071a();
            C3950c.m18652a(hashMap, this.f7441t, this.f7429h.f4064c);
        }
        str = C1251b.m7283i();
        if (str != null && this.f7446y) {
            hashMap.put("x-obscura-nonce", str);
        }
        return hashMap;
    }

    public final synchronized String m7290c(String str) {
        return (String) this.f7434m.get(str);
    }

    public final void m7286a(Map map) {
        if (this.f7444w != null) {
            this.f7444w.mo2270a(this, map);
            return;
        }
        CharSequence f = m7294f();
        if (!TextUtils.isEmpty(f)) {
            map.put("X-DFE-Device-Checkin-Consistency-Token", f);
        }
    }

    public final String m7294f() {
        if (((Boolean) C1285f.f7595M.m28964b()).booleanValue()) {
            return C2699l.m14576a(this.f7427f, this.f7440s);
        }
        return null;
    }

    public static void m7281a(lg lgVar, Map map) {
        if (lgVar.f13009a != null) {
            for (int i = 0; i < lgVar.f13009a.length; i++) {
                map.put(lgVar.f13009a[i].f13012c, lgVar.f13009a[i].f13013d);
            }
        }
    }

    public final void m7289b(Map map) {
        if (this.f7437p != null) {
            CharSequence e = this.f7437p.m14571e();
            if (!TextUtils.isEmpty(e)) {
                map.put("X-DFE-Data-Service-Subscriber", e);
            }
        }
    }

    public final NetworkInfo m7295g() {
        return this.f7443v.mo2833a();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[DfeApiContext headers={");
        Object obj = 1;
        for (String str : this.f7434m.keySet()) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(str).append(": ").append((String) this.f7434m.get(str));
        }
        stringBuilder.append("}]");
        return stringBuilder.toString();
    }

    public final boolean m7296h() {
        return this.f7429h == null && (this.f7428g.mo2294a(12634602) || ((Boolean) C0955b.gS.m28964b()).booleanValue());
    }
}
