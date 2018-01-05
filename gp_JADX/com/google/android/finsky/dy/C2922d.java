package com.google.android.finsky.dy;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.android.finsky.verifier.p259a.p260a.C4697a;
import com.google.c.a.a.a.a.a;
import com.google.protobuf.nano.C0757i;

final class C2922d implements C2918a {
    C2922d() {
    }

    private static C4697a m15271a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (C4697a) C0757i.m4905a(new C4697a(), bArr);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Error while deserializing ApkInfoData", new Object[0]);
            a.a.a(e);
            return null;
        }
    }
}
