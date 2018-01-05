package com.google.android.finsky.ratereview;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.cr.C2365a;
import com.google.android.finsky.cr.C2366c;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.cv.p177a.kd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.ab;
import com.google.android.play.dfe.api.C1460g;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public final class C3974q {
    public static final C3980w f20052a = null;
    public final String f20053b;
    public final C1460g f20054c;
    public final C0986a f20055d;
    public Map f20056e = new HashMap();
    public Map f20057f = new HashMap();
    public C2366c f20058g;
    public C2366c f20059h;
    public Map f20060i = new HashMap();

    public C3974q(String str, C3981y c3981y, C1460g c1460g, C0986a c0986a) {
        this.f20053b = str;
        this.f20054c = c1460g;
        this.f20058g = new C2366c(new C2365a(c3981y.f20071a.getCacheDir(), C3981y.m18698a(this.f20053b, "unsubmitted_reviews_")));
        this.f20059h = new C2366c(new C2365a(c3981y.f20071a.getCacheDir(), C3981y.m18698a(this.f20053b, "unsubmitted_testing_program_reviews_")));
        this.f20055d = c0986a;
        new Handler(Looper.getMainLooper()).post(new C3975r(this));
    }

    public final synchronized iu m18689a(String str, iu iuVar, boolean z) {
        Map map = z ? this.f20057f : this.f20056e;
        if (map.containsKey(str)) {
            C3980w c3980w = (C3980w) map.get(str);
            if (c3980w == null) {
                iuVar = null;
            } else {
                iuVar = c3980w.f20067a;
            }
        }
        return iuVar;
    }

    public final synchronized void m18690a(String str, int i, String str2, String str3, kd kdVar, Document document, String str4, boolean z) {
        C2366c c2366c;
        Map map = z ? this.f20057f : this.f20056e;
        if (z) {
            c2366c = this.f20059h;
        } else {
            c2366c = this.f20058g;
        }
        C3980w c3980w = new C3980w(str, i, str2, str3, kdVar, document, str4, System.currentTimeMillis());
        map.put(str, c3980w);
        if (c2366c.m12012b()) {
            Object obj;
            Map hashMap = new HashMap();
            hashMap.put("doc_id", c3980w.f20068b);
            hashMap.put("rating", c3980w.f20067a.f12717e);
            hashMap.put("title", c3980w.f20067a.f12719g);
            hashMap.put("content", c3980w.f20067a.f12720h);
            if (!TextUtils.isEmpty(c3980w.f20069c)) {
                hashMap.put("doc_user_review_url_key", c3980w.f20069c);
            }
            hashMap.put("doc_timestamp", c3980w.f20067a.f12724l);
            String str5 = "structured_reviews";
            if (c3980w.f20067a.f12730r == null) {
                obj = "";
            } else {
                obj = ab.m21685a(c3980w.f20067a.f12730r);
            }
            hashMap.put(str5, obj);
            c2366c.mo2870a(str, hashMap);
        }
    }

    public final synchronized void m18692a(String str, boolean z) {
        C2366c c2366c;
        Map map = z ? this.f20057f : this.f20056e;
        if (z) {
            c2366c = this.f20059h;
        } else {
            c2366c = this.f20058g;
        }
        map.put(str, f20052a);
        if (c2366c.m12012b()) {
            c2366c.mo2869a(str);
        }
    }

    public final synchronized void m18694b(String str, boolean z) {
        C2366c c2366c;
        Map map = z ? this.f20057f : this.f20056e;
        if (z) {
            c2366c = this.f20059h;
        } else {
            c2366c = this.f20058g;
        }
        if (c2366c.m12012b()) {
            c2366c.mo2869a(str);
        }
        if (map.containsKey(str)) {
            map.remove(str);
        }
    }

    public final void m18691a(String str, String str2, C3973p c3973p) {
        Pair create = Pair.create(str, str2);
        EnumSet enumSet = (EnumSet) this.f20060i.get(create);
        if (enumSet == null) {
            this.f20060i.put(create, EnumSet.of(c3973p));
            return;
        }
        enumSet.add(c3973p);
    }

    public final void m18693b(String str, String str2, C3973p c3973p) {
        EnumSet enumSet = (EnumSet) this.f20060i.get(Pair.create(str, str2));
        if (enumSet != null) {
            enumSet.remove(c3973p);
        }
    }

    public final boolean m18695c(String str, String str2, C3973p c3973p) {
        EnumSet enumSet = (EnumSet) this.f20060i.get(Pair.create(str, str2));
        return enumSet != null && enumSet.contains(c3973p);
    }
}
