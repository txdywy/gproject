package com.google.android.finsky.utils;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.C5328c;
import com.google.android.gms.udc.C5603a;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse.UdcSetting;
import java.util.HashMap;
import java.util.Map;

public final class bd {
    public static final int[] f24054a = new int[]{7};
    public static bd f24055b;

    public static synchronized bd m21796a() {
        bd bdVar;
        synchronized (bd.class) {
            if (f24055b == null) {
                f24055b = new bd();
            }
            bdVar = f24055b;
        }
        return bdVar;
    }

    public static boolean m21797a(Context context, String str) {
        C5058o b = m21798b(context, str);
        if (b == null) {
            return false;
        }
        C5328c c5328c = (C5328c) C5603a.f28553d.mo4830a(b, new UdcCacheRequest(f24054a)).mo4487a();
        Status b2 = c5328c.mo4505b();
        Map hashMap = new HashMap();
        if (b2.m23271a()) {
            for (UdcSetting udcSetting : c5328c.mo4843a().f28547a) {
                hashMap.put(Integer.valueOf(udcSetting.f28544a), Integer.valueOf(udcSetting.f28545b));
            }
        } else {
            String valueOf = String.valueOf(c5328c.mo4505b());
            FinskyLog.m21665c(new StringBuilder(String.valueOf(valueOf).length() + 34).append("failed to access setting cache: %s").append(valueOf).toString(), new Object[0]);
        }
        b.mo4559g();
        return ((Integer) hashMap.get(Integer.valueOf(7))).intValue() == 2;
    }

    private static C5058o m21798b(Context context, String str) {
        try {
            C5089p a = new C5089p(context).m23647a(C5603a.f28552c);
            a.f25916a = str == null ? null : new Account(str, "com.google");
            C5058o b = a.m23652b();
            if (b.mo4558f().m23264b()) {
                return b;
            }
            FinskyLog.m21665c("Could not connect to Udc: %s", b.mo4558f());
            return null;
        } catch (RuntimeException e) {
            FinskyLog.m21667d("Could not connect to Udc: %s", e);
            return null;
        }
    }
}
