package com.google.android.gms.peerdownloadmanager.comms.p298e;

import com.squareup.haha.perflib.HprofParser;
import java.io.FilterInputStream;

final class C5434c extends FilterInputStream {
    public final /* synthetic */ C5433b f28097a;

    C5434c(C5433b c5433b) {
        this.f28097a = c5433b;
        super(c5433b.f28093d);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f28097a.f28093d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        this.f28097a.f28095f.m26257a(bArr, i, bArr, i, read);
        return read;
    }

    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) < 0) {
            return -1;
        }
        return bArr[0] & HprofParser.ROOT_UNKNOWN;
    }
}
