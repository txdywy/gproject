package com.google.android.finsky.scheduler;

import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.scheduler.p238b.C4027e;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

final class ac implements C2918a {
    ac() {
    }

    private static C4026d m18794a(byte[] bArr) {
        try {
            return new C4027e(bArr).m18863a();
        } catch (InvalidProtocolBufferNanoException e) {
            return null;
        }
    }
}
