package com.google.android.finsky.scheduler;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.bi;

final class bp implements C2918a {
    bp() {
    }

    private static bi m18911a(byte[] bArr) {
        try {
            return (bi) C0757i.m4905a(new bi(), bArr);
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Invalid WakeUpStart Data", new Object[0]);
            return null;
        }
    }
}
