package com.google.android.finsky.al;

import android.text.TextUtils;
import com.google.android.finsky.api.C1285f;

public final class C1217a implements C1216i {
    public final C1051j f7341a;

    public C1217a(C1051j c1051j) {
        this.f7341a = c1051j;
    }

    public final boolean mo1530a(String[] strArr) {
        if (strArr == null) {
            return false;
        }
        try {
            return strArr.length == 3 && Integer.parseInt(strArr[2]) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public final /* synthetic */ boolean mo1529a(Object obj) {
        return this.f7341a.mo1308a((C1218b) obj);
    }

    public final /* synthetic */ boolean mo1532b(Object obj) {
        C1218b c1218b = (C1218b) obj;
        return TextUtils.equals((String) C1285f.f7610g.m28964b(), c1218b.f7343a) && TextUtils.equals((String) C1285f.f7604a.m28964b(), c1218b.f7344b);
    }

    public final /* synthetic */ Object mo1531b(String[] strArr) {
        if (strArr == null || strArr.length != 3) {
            return C1218b.f7342c;
        }
        return new C1218b(strArr[1], strArr[2]);
    }
}
