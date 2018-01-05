package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.os.SystemClock;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.billing.p120d.C1812d;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import java.util.HashMap;
import java.util.Map;

public final class ar {
    public static void m10196a(Account account, Document document, C1091e c1091e, boolean z, boolean z2, C2495w c2495w) {
        m10197a(account, document, c1091e, z, z2, false, c2495w);
    }

    public static void m10197a(Account account, Document document, C1091e c1091e, boolean z, boolean z2, boolean z3, C2495w c2495w) {
        m10200a(account, document, null, c1091e, z, z2, z3, c2495w);
    }

    public static void m10200a(Account account, Document document, Map map, C1091e c1091e, boolean z, boolean z2, boolean z3, C2495w c2495w) {
        Map hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = map;
        }
        hashMap.put("pcam", "0");
        m10199a(account, document, document.m14646d(), document.f14885a.f12096c, 1, null, hashMap, c1091e, null, z, z2, z3, c2495w, null);
    }

    public static void m10198a(Account account, Document document, ax axVar, String str, int i, String str2, Map map, C1091e c1091e, C1812d c1812d, boolean z, boolean z2, C2495w c2495w, InstallRequest installRequest) {
        m10199a(account, document, axVar, str, i, str2, map, c1091e, c1812d, z, z2, false, c2495w, installRequest);
    }

    private static void m10199a(Account account, Document document, ax axVar, String str, int i, String str2, Map map, C1091e c1091e, C1812d c1812d, boolean z, boolean z2, boolean z3, C2495w c2495w, InstallRequest installRequest) {
        if (axVar.f11834c == 1 && document == null) {
            throw new IllegalArgumentException("A document is required for apps");
        }
        if (axVar.f11834c == 1 && C1473m.f7980a.mo2249j(account.name).mo2294a(12612611)) {
            C2322b a = C1473m.f7980a.mo2032L().mo2854a(str);
            if (a != null) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put("pappi", "1");
                if (a.f11422g) {
                    map.put("papps", "1");
                }
            }
        }
        c2495w.m13367a(new C2474c(300).m13236a(str).m13213a(axVar).m13241b(i));
        C1473m.f7980a.mo2112b(account.name).mo1579a(str, i, document != null ? document.m14625N() : null, map, (C0660x) new as(SystemClock.elapsedRealtime(), c2495w, str, axVar, i, account, document, str2, z, c1091e, installRequest, z3, z2, c1812d), (C0657w) new au(c2495w, str, i, z2, document, c1091e));
    }
}
