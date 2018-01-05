package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import com.squareup.leakcanary.C7582R;

final /* synthetic */ class bz implements Runnable {
    public final bx f24520a;
    public final boolean[] f24521b;
    public final C4699c f24522c;

    bz(bx bxVar, boolean[] zArr, C4699c c4699c) {
        this.f24520a = bxVar;
        this.f24521b = zArr;
        this.f24522c = c4699c;
    }

    public final void run() {
        boolean z;
        C4740a c4740a = this.f24520a;
        boolean[] zArr = this.f24521b;
        C4699c c4699c = this.f24522c;
        bb.m21791a();
        if (zArr == null || zArr.length != 1) {
            z = false;
        } else {
            z = zArr[0];
        }
        if (z) {
            c4740a.m22257h();
            c4740a.m22244a(c4740a.f24499h.getString(C7582R.string.verify_apps_generic_malware), 0);
        }
        if (((Boolean) C0955b.jr.m28964b()).booleanValue()) {
            String str = c4699c.f24154m.f24169b;
            int i = c4699c.f24154m.f24170c;
            byte[] bArr = c4699c.f24145d.f24199b;
            boolean z2 = !z;
            C0954a.f5816L.m5763a(Boolean.valueOf(true));
            bf.m22119a(c4740a.f24499h, str, i, bArr, z2, false);
        }
        if (!z) {
            if (c4740a.m22259j()) {
                VerifyInstallSnackbarActivity.m22021a(c4740a.f24499h, true);
            }
            c4740a.m22241a(1);
            c4740a.m22069l();
        }
    }
}
