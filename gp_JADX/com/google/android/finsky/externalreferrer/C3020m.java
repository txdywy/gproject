package com.google.android.finsky.externalreferrer;

import com.google.android.finsky.externalreferrer.p197a.C3008a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.protobuf.nano.C0757i;

final class C3020m implements C2918a {
    C3020m() {
    }

    private static ExternalReferrerStatus m15605a(byte[] bArr) {
        try {
            return new ExternalReferrerStatus((C3008a) C0757i.m4905a(new C3008a(), bArr));
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Failed to parse bytes to ExternalReferrerInfo", new Object[0]);
            return null;
        }
    }
}
