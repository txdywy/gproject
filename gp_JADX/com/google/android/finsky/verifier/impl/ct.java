package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.safetynet.C5572f;
import com.google.android.gms.tasks.C4751a;
import com.google.android.gms.tasks.C5587d;

final class ct implements C4751a {
    ct() {
    }

    public final void mo4375a(C5587d c5587d) {
        try {
            Object a = ((C5572f) c5587d.mo5061c()).m26562a();
            if (cs.m22280a((String) a)) {
                C0954a.f5818N.m5763a(a);
            }
        } catch (RuntimeException e) {
            FinskyLog.m21667d("Unable to fetch SafetyNet ID: %s", e);
        }
    }
}
