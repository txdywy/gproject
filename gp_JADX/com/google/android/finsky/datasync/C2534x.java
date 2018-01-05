package com.google.android.finsky.datasync;

import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.api.C1255p;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cv.p177a.dk;
import com.google.android.finsky.utils.FinskyLog;
import com.google.i.a.a;
import com.google.wireless.android.finsky.dfe.nano.fl;
import java.util.Locale;

public final class C2534x implements C1255p {
    public final C1461c f13578a;
    public final C2515v f13579b;
    public final C2515v f13580c;

    public C2534x(C1461c c1461c, C2515v c2515v, C2515v c2515v2) {
        this.f13578a = c1461c;
        this.f13579b = c2515v;
        this.f13580c = c2515v2;
    }

    public final C2515v m13487a(String str) {
        Object obj = -1;
        switch (str.hashCode()) {
            case 99363:
                if (str.equals("dfe")) {
                    obj = null;
                    break;
                }
                break;
            case 3142850:
                if (str.equals("fife")) {
                    obj = 1;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                return this.f13579b;
            case 1:
                return this.f13580c;
            default:
                return null;
        }
    }

    final C2515v m13488a(String str, String str2) {
        if (!a.a(str)) {
            int i;
            if (str.toLowerCase(Locale.US).startsWith("http")) {
                i = 0;
            } else {
                i = 1;
            }
            if (i != 0) {
                return m13487a("dfe");
            }
            FinskyLog.m21669e("[Cache and Sync] A FetchSuggestions queue not found for URL: %s", str);
            return null;
        } else if (this.f13578a.mo2249j(str2).mo2294a(12627545)) {
            return m13487a("fife");
        } else {
            FinskyLog.m21662b("[Cache and Sync] Experiment not on, skipping image queue", new Object[0]);
            return null;
        }
    }

    public final void mo1619a(String str, fl flVar) {
        if (str != null) {
            for (dk dkVar : flVar.h) {
                if (dkVar != null) {
                    String str2 = dkVar.f12151c;
                    C2515v a = m13488a(str2, str);
                    if (a != null) {
                        String str3 = "[Cache and Sync] Adding to queue url: ";
                        String valueOf = String.valueOf(str2);
                        FinskyLog.m21662b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
                        a.mo2930a(str2, str);
                        C1189b.m7141a(C1189b.f7275k, 1);
                    }
                }
            }
        }
    }
}
