package org.chromium.net.p568a;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.as;

final class C7921e extends C7916j {
    public static int f40621a = 16384;
    public final C7926k f40622b;
    public final long f40623c;
    public final ByteBuffer f40624d;
    public final as f40625e = new C7922f(this);
    public long f40626f;

    C7921e(C7923g c7923g, long j, C7926k c7926k) {
        if (c7923g == null) {
            throw new NullPointerException();
        } else if (j < 0) {
            throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        } else {
            this.f40623c = j;
            this.f40624d = ByteBuffer.allocate((int) Math.min(this.f40623c, (long) f40621a));
            this.f40622b = c7926k;
            this.f40626f = 0;
        }
    }

    public final void write(int i) {
        m37868d();
        m37887a(1);
        m37888f();
        this.f40624d.put((byte) i);
        this.f40626f++;
        m37889g();
    }

    public final void write(byte[] bArr, int i, int i2) {
        m37868d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        m37887a(i2);
        int i3 = i2;
        while (i3 > 0) {
            m37888f();
            int min = Math.min(i3, this.f40624d.remaining());
            this.f40624d.put(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
        this.f40626f += (long) i2;
        m37889g();
    }

    private final void m37888f() {
        if (!this.f40624d.hasRemaining()) {
            m37890h();
        }
    }

    private final void m37889g() {
        if (this.f40626f == this.f40623c) {
            m37890h();
        }
    }

    private final void m37890h() {
        m37868d();
        this.f40624d.flip();
        this.f40622b.m37926a(0);
        m37869e();
    }

    private final void m37887a(int i) {
        if (this.f40626f + ((long) i) > this.f40623c) {
            throw new ProtocolException("expected " + (this.f40623c - this.f40626f) + " bytes but received " + i);
        }
    }

    final void mo6573a() {
    }

    final void mo6574b() {
        if (this.f40626f < this.f40623c) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    final as mo6575c() {
        return this.f40625e;
    }
}
