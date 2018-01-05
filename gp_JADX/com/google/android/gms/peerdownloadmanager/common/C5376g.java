package com.google.android.gms.peerdownloadmanager.common;

import com.squareup.haha.perflib.HprofParser;
import java.io.InputStream;
import java.io.InterruptedIOException;

public final class C5376g extends InputStream {
    public final Object f27946a = new Object();
    public final InputStream f27947b;
    public final byte[] f27948c = new byte[4];
    public int f27949d = 0;
    public boolean f27950e = false;

    public C5376g(InputStream inputStream) {
        this.f27947b = inputStream;
    }

    public final int read() {
        if (m26139c()) {
            return -1;
        }
        if (this.f27949d == 0) {
            this.f27949d = m26137a();
            if (m26139c()) {
                return -1;
            }
        }
        m26138b();
        this.f27949d--;
        return this.f27947b.read();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("invalid length");
        } else if (m26139c()) {
            return -1;
        } else {
            if (this.f27949d == 0) {
                this.f27949d = m26137a();
                if (m26139c()) {
                    return -1;
                }
            }
            m26138b();
            int read = this.f27947b.read(bArr, i, Math.min(i2, this.f27949d));
            this.f27949d -= read;
            return read;
        }
    }

    public final void close() {
        synchronized (this.f27946a) {
            if (this.f27950e) {
                return;
            }
            this.f27950e = true;
            this.f27947b.close();
        }
    }

    private final int m26137a() {
        int i = 0;
        while (i < 4) {
            m26138b();
            i += this.f27947b.read(this.f27948c, i, 4 - i);
        }
        i = (((this.f27948c[0] << 24) | ((this.f27948c[1] & HprofParser.ROOT_UNKNOWN) << 16)) | ((this.f27948c[2] & HprofParser.ROOT_UNKNOWN) << 8)) | (this.f27948c[3] & HprofParser.ROOT_UNKNOWN);
        if (i == 0) {
            close();
        }
        return i;
    }

    private final void m26138b() {
        while (!m26139c() && this.f27947b.available() == 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new InterruptedIOException();
            }
        }
    }

    private final boolean m26139c() {
        boolean z;
        synchronized (this.f27946a) {
            z = this.f27950e;
        }
        return z;
    }
}
