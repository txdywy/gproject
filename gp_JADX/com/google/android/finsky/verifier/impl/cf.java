package com.google.android.finsky.verifier.impl;

import com.android.volley.C0660x;
import com.android.volley.C0700r;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.verifier.impl.p262a.C4731c;
import com.google.android.finsky.verifier.impl.p262a.C4734f;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;

final class cf implements Runnable {
    public final /* synthetic */ C4699c f24533a;
    public final /* synthetic */ bx f24534b;

    cf(bx bxVar, C4699c c4699c) {
        this.f24534b = bxVar;
        this.f24533a = c4699c;
    }

    public final void run() {
        C0660x cjVar;
        if (this.f24533a.f24162u) {
            bx bxVar = this.f24534b;
            C4699c c4699c = this.f24533a;
            cjVar = new cj(bxVar, c4699c, c4699c);
        } else {
            cjVar = this.f24534b.m22250c(this.f24533a);
        }
        if (this.f24534b.m22259j()) {
            VerifyInstallSnackbarActivity.m22021a(this.f24534b.f24499h, false);
        }
        if (this.f24534b.f24489C != null) {
            this.f24534b.f24489C.m13367a(new C2474c(2627));
        }
        C4731c a = C4731c.m22039a();
        C2495w c2495w = this.f24534b.f24489C;
        C0700r c0700r = (C0700r) this.f24534b.f24492a.mo1a();
        C4699c c4699c2 = this.f24533a;
        c0700r.m4510a(new C4734f(a.f24361b, c2495w, "https://safebrowsing.google.com/safebrowsing/clientreport/download", cjVar, new cg(this), c4699c2));
    }
}
