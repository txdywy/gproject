package com.google.android.finsky.setup;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.cr.C2364b;
import com.google.android.finsky.cr.C2365a;
import com.google.android.finsky.cr.C2366c;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class af {
    public final C2366c f20762a;
    public final Map f20763b;
    public boolean f20764c;

    public af(Context context) {
        this(new C2365a(context.getDir("FinskySetup", 0), "RestoreAccounts"));
    }

    private af(C2364b c2364b) {
        this.f20763b = new HashMap();
        this.f20764c = false;
        this.f20762a = new C2366c(c2364b);
    }

    public final void m19187a(String str) {
        if (((ah) this.f20763b.get(str)) == null) {
            FinskyLog.m21665c("Calling finish for a missing account %s. Ignoring", FinskyLog.m21655a(str));
            return;
        }
        this.f20763b.remove(str);
        m19190d(str);
    }

    public final int m19188b(String str) {
        ah ahVar = (ah) this.f20763b.get(str);
        return ahVar != null ? ahVar.f20767a : 0;
    }

    public final List m19186a() {
        return new ArrayList(this.f20763b.keySet());
    }

    public final boolean m19189c(String str) {
        ah ahVar = (ah) this.f20763b.get(str);
        return ahVar != null && ahVar.f20769c;
    }

    public final void m19190d(String str) {
        String encode = Uri.encode(str);
        ah ahVar = (ah) this.f20763b.get(str);
        if (ahVar == null) {
            this.f20762a.mo2869a(encode);
            return;
        }
        Map hashMap = new HashMap();
        hashMap.put("attempts", Integer.toString(ahVar.f20767a));
        hashMap.put("aid", ahVar.f20768b);
        this.f20762a.mo2870a(encode, hashMap);
    }

    static ah m19185a(String str, Map map) {
        ah ahVar = null;
        String str2 = (String) map.get("attempts");
        String str3 = (String) map.get("aid");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            FinskyLog.m21665c("Missing data for account %s (%s, %s)", FinskyLog.m21655a(str), str2, str3);
            return ahVar;
        }
        try {
            int intValue = Integer.valueOf(str2).intValue();
            ah ahVar2 = new ah();
            ahVar2.f20767a = intValue;
            ahVar2.f20768b = str3;
            return ahVar2;
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Bad data for account %s (%s, %s)", FinskyLog.m21655a(str), str2, str3);
            return ahVar;
        }
    }
}
