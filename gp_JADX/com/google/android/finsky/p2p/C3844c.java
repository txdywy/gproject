package com.google.android.finsky.p2p;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.c.a.l;

final class C3844c implements C2918a {
    C3844c() {
    }

    private static l m18317a(byte[] bArr) {
        try {
            return (l) C0757i.m4905a(new l(), bArr);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Failed to parse bytes to P2pAppFrostingStoreRow", new Object[0]);
            return null;
        }
    }
}
