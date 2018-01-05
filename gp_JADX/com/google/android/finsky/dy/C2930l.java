package com.google.android.finsky.dy;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.android.finsky.verifier.p259a.p260a.C4719w;
import com.google.protobuf.nano.C0757i;

final class C2930l implements C2918a {
    C2930l() {
    }

    private static C4719w m15286a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (C4719w) C0757i.m4905a(new C4719w(), bArr);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Error while deserializing InstallationAttemptData", new Object[0]);
            return null;
        }
    }
}
