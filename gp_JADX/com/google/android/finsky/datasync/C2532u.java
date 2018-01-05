package com.google.android.finsky.datasync;

import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.api.C1299v;
import com.google.android.finsky.cv.p177a.hc;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;

public final class C2532u implements C1299v {
    public final String f13574a;
    public C2534x f13575b;

    public C2532u(String str) {
        this.f13574a = str;
    }

    public final void mo2935a(hc[] hcVarArr) {
        ((C1374t) C3947d.m18649a(C1374t.class)).mo1801a(this);
        for (hc hcVar : hcVarArr) {
            C2534x c2534x = this.f13575b;
            String str = hcVar.f12537c;
            String str2 = this.f13574a;
            String str3 = "[Cache and Sync] Deleting from queue url: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            FinskyLog.m21662b(valueOf, new Object[0]);
            C2515v a = c2534x.m13488a(str, str2);
            if (a != null) {
                a.mo2931a(str, str2, false);
            }
            C2534x c2534x2 = this.f13575b;
            String str4 = hcVar.f12537c;
            String str5 = this.f13574a;
            a = c2534x2.m13488a(str4, str5);
            if (a != null) {
                a.mo2932b(str4, str5);
            }
        }
        if (hcVarArr.length != 0) {
            C1189b.f7268d.m5763a(Integer.valueOf(3));
        }
    }
}
