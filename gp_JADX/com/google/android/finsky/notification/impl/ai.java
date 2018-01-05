package com.google.android.finsky.notification.impl;

import com.google.android.finsky.cd.C2259b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

final class ai implements C2918a {
    ai() {
    }

    private static C2259b m18094a(byte[] bArr) {
        try {
            return (C2259b) C0757i.m4905a(new C2259b(), bArr);
        } catch (InvalidProtocolBufferNanoException e) {
            FinskyLog.m21669e("Failed to decode notification content proto.", new Object[0]);
            return null;
        }
    }
}
