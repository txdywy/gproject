package com.google.compression.brotli.wrapper.dec;

import com.squareup.haha.perflib.HprofParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;

public final class C7087a extends InputStream {
    public final C7088b f34673a;

    public C7087a(InputStream inputStream) {
        this.f34673a = new C7088b(Channels.newChannel(inputStream));
    }

    public final void close() {
        this.f34673a.m32217b();
    }

    public final int available() {
        return this.f34673a.f34676c != null ? this.f34673a.f34676c.remaining() : 0;
    }

    public final int read() {
        if (this.f34673a.f34677d) {
            throw new IOException("read after close");
        } else if (this.f34673a.m32215a() == -1) {
            return -1;
        } else {
            return this.f34673a.f34676c.get() & HprofParser.ROOT_UNKNOWN;
        }
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f34673a.f34677d) {
            throw new IOException("read after close");
        } else if (this.f34673a.m32215a() == -1) {
            return -1;
        } else {
            int i3 = 0;
            while (i2 > 0) {
                int min = Math.min(i2, this.f34673a.f34676c.remaining());
                this.f34673a.f34676c.get(bArr, i, min);
                i += min;
                i2 -= min;
                i3 += min;
                if (this.f34673a.m32215a() == -1) {
                    return i3;
                }
            }
            return i3;
        }
    }

    public final long skip(long j) {
        if (this.f34673a.f34677d) {
            throw new IOException("read after close");
        }
        long j2 = 0;
        while (j > 0 && this.f34673a.m32215a() != -1) {
            int min = (int) Math.min(j, (long) this.f34673a.f34676c.remaining());
            C7088b c7088b = this.f34673a;
            c7088b.f34676c.position(c7088b.f34676c.position() + min);
            if (!c7088b.f34676c.hasRemaining()) {
                c7088b.f34676c = null;
            }
            j2 += (long) min;
            j -= (long) min;
        }
        return j2;
    }
}
