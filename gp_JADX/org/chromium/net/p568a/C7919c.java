package org.chromium.net.p568a;

import java.nio.ByteBuffer;
import org.chromium.net.as;

final class C7919c extends C7916j {
    public final C7926k f40616a;
    public final ByteBuffer f40617b;
    public final as f40618c = new C7920d(this);
    public boolean f40619d = false;

    C7919c(C7923g c7923g, int i, C7926k c7926k) {
        if (c7923g == null) {
            throw new NullPointerException();
        } else if (i <= 0) {
            throw new IllegalArgumentException("chunkLength should be greater than 0");
        } else {
            this.f40617b = ByteBuffer.allocate(i);
            this.f40616a = c7926k;
        }
    }

    public final void write(int i) {
        m37880f();
        this.f40617b.put((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        m37868d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, this.f40617b.remaining());
            this.f40617b.put(bArr, (i + i2) - i3, min);
            i3 -= min;
            m37880f();
        }
    }

    public final void close() {
        super.close();
        if (!this.f40619d) {
            this.f40619d = true;
            this.f40617b.flip();
        }
    }

    final void mo6573a() {
    }

    final void mo6574b() {
    }

    final as mo6575c() {
        return this.f40618c;
    }

    private final void m37880f() {
        if (!this.f40617b.hasRemaining()) {
            m37868d();
            this.f40617b.flip();
            this.f40616a.m37926a(0);
            m37869e();
        }
    }
}
