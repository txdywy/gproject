package com.google.android.finsky.tos;

import com.android.volley.VolleyError;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dp.C1096g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gp;

final class C4565a implements C1096g {
    public final /* synthetic */ String f23345a;
    public final /* synthetic */ Boolean f23346b;
    public final /* synthetic */ TosAckedReceiver f23347c;

    C4565a(TosAckedReceiver tosAckedReceiver, String str, Boolean bool) {
        this.f23347c = tosAckedReceiver;
        this.f23345a = str;
        this.f23346b = bool;
    }

    public final void mo1427a(gp gpVar) {
        int i = 0;
        DfeToc dfeToc = new DfeToc(gpVar);
        this.f23347c.f23328c.mo2057a(dfeToc);
        FinskyLog.m21659a("TAR:Initializing TOS acceptance", new Object[0]);
        C4569e c4569e = this.f23347c.f23329d;
        String str = this.f23345a;
        Boolean bool = this.f23346b;
        if (c4569e.m21205a(str, dfeToc)) {
            String str2;
            if ((dfeToc.f14881a.f31758a & 4) != 0) {
                i = 1;
            }
            if (i != 0) {
                str2 = dfeToc.f14881a.f31762e;
            } else {
                str2 = dfeToc.f14881a.f31761d;
            }
            c4569e.m21202a(str, str2, bool);
            return;
        }
        FinskyLog.m21659a("TU:TOS already accepted, returning", new Object[0]);
    }

    public final void mo1426a(VolleyError volleyError) {
        FinskyLog.m21667d("TAR:Error fetching TOC: %s", volleyError);
    }
}
