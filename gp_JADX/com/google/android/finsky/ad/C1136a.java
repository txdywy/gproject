package com.google.android.finsky.ad;

import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;

public final class C1136a {
    public final C1461c f7092a;

    public C1136a(C1461c c1461c) {
        this.f7092a = c1461c;
    }

    public final boolean m6874a(String str, long j) {
        if (!this.f7092a.dj().mo2294a(12644763)) {
            return true;
        }
        String str2 = (String) C0955b.db.m28964b();
        String[] a = C4680k.m21818a(str2);
        int length = a.length;
        for (int i = 0; i < length; i++) {
            String[] split = TextUtils.split(a[i], ":");
            if (split.length <= 0 || split.length > 2) {
                C1136a.m6873a(str2);
            } else if (!split[0].equals(str)) {
                continue;
            } else if (split.length == 1) {
                return false;
            } else {
                try {
                    if (j >= Long.valueOf(split[1]).longValue()) {
                        return true;
                    }
                    return false;
                } catch (NumberFormatException e) {
                    C1136a.m6873a(str2);
                }
            }
        }
        return true;
    }

    private static void m6873a(String str) {
        FinskyLog.m21659a("Bad config: %s", str);
    }
}
