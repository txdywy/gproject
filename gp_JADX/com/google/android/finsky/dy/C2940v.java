package com.google.android.finsky.dy;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.android.finsky.verifier.p259a.p260a.aa;
import com.google.protobuf.nano.C0757i;

final class C2940v implements C2918a {
    C2940v() {
    }

    private static aa m15299a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (aa) C0757i.m4905a(new aa(), bArr);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Error while deserializing PackageUninstallationData", new Object[0]);
            return null;
        }
    }
}
