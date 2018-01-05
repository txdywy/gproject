package com.google.android.finsky.dy;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;
import com.google.protobuf.nano.C0757i;

final class C2936r implements C2918a {
    C2936r() {
    }

    private static C4722z m15293a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (C4722z) C0757i.m4905a(new C4722z(), bArr);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Error while deserializing PackageInstallationStateData", new Object[0]);
            return null;
        }
    }
}
