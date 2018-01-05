package com.google.android.gms.peerdownloadmanager.common;

import java.io.IOException;
import java.io.OutputStream;

public final class C5377h extends OutputStream {
    public final Object f27951a = new Object();
    public final OutputStream f27952b;
    public final byte[] f27953c = new byte[4];
    public boolean f27954d = false;

    public C5377h(OutputStream outputStream) {
        this.f27952b = outputStream;
    }

    public final void write(int i) {
        synchronized (this.f27951a) {
            if (this.f27954d) {
                throw new IOException("stream is closed");
            }
        }
        m26140a(1);
        this.f27952b.write(i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("invalid length");
            }
            synchronized (this.f27951a) {
                if (this.f27954d) {
                    throw new IOException("stream is closed");
                }
            }
            m26140a(i2);
            this.f27952b.write(bArr, i, i2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        r2 = this;
        r1 = r2.f27951a;
        monitor-enter(r1);
        r0 = r2.f27954d;	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0017 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r2.f27954d = r0;	 Catch:{ all -> 0x0017 }
        monitor-exit(r1);	 Catch:{ all -> 0x0017 }
        r0 = 0;
        r2.m26140a(r0);	 Catch:{ all -> 0x001a }
        r0 = r2.f27952b;
        r0.close();
        goto L_0x0008;
    L_0x0017:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0017 }
        throw r0;
    L_0x001a:
        r0 = move-exception;
        r1 = r2.f27952b;
        r1.close();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.peerdownloadmanager.common.h.close():void");
    }

    private final void m26140a(int i) {
        this.f27953c[0] = (byte) (i >>> 24);
        this.f27953c[1] = (byte) (i >>> 16);
        this.f27953c[2] = (byte) (i >>> 8);
        this.f27953c[3] = (byte) i;
        this.f27952b.write(this.f27953c);
    }
}
