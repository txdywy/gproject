package com.google.android.finsky.scheduler;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.bh;

final class bs implements C2918a {
    bs() {
    }

    private static bh m18915a(byte[] bArr) {
        try {
            return (bh) C0757i.m4905a(new bh(), bArr);
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Invalid WakeUpEnd Data", new Object[0]);
            return null;
        }
    }
}
