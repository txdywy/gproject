package com.google.android.gms.peerdownloadmanager.comms.p298e;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;

final class C5435d extends FilterOutputStream {
    public final /* synthetic */ C5433b f28098a;

    C5435d(C5433b c5433b) {
        this.f28098a = c5433b;
        super(c5433b.f28092c);
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        DataOutputStream dataOutputStream = this.f28098a.f28092c;
        byte[] bArr2 = new byte[i2];
        this.f28098a.f28096g.m26257a(bArr2, 0, bArr, i, i2);
        dataOutputStream.write(bArr2);
        this.f28098a.f28092c.flush();
    }
}
