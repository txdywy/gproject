package com.google.android.finsky.dy;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.android.finsky.verifier.p259a.p260a.ab;
import com.google.protobuf.nano.C0757i;

final class aa implements C2918a {
    aa() {
    }

    private static ab m15211a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (ab) C0757i.m4905a(new ab(), bArr);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Error while deserializing PackageVerdictData", new Object[0]);
            return null;
        }
    }
}
