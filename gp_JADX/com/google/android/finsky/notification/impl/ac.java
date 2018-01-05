package com.google.android.finsky.notification.impl;

import com.google.android.finsky.cd.C2263f;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

final class ac implements C2918a {
    ac() {
    }

    private static C2263f m18079a(byte[] bArr) {
        try {
            return (C2263f) C0757i.m4905a(new C2263f(), bArr);
        } catch (InvalidProtocolBufferNanoException e) {
            FinskyLog.m21669e("Failed to decode notification proxy proto.", new Object[0]);
            return null;
        }
    }
}
