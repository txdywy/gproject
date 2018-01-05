package org.chromium.net.p568a;

import com.squareup.haha.perflib.HprofParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

final class C7925i extends InputStream {
    public final C7923g f40641a;
    public boolean f40642b;
    public ByteBuffer f40643c;
    public IOException f40644d;

    public C7925i(C7923g c7923g) {
        this.f40641a = c7923g;
    }

    public final int read() {
        m37923a();
        if (m37924b()) {
            return this.f40643c.get() & HprofParser.ROOT_UNKNOWN;
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            m37923a();
            if (!m37924b()) {
                return -1;
            }
            int min = Math.min(this.f40643c.limit() - this.f40643c.position(), i2);
            this.f40643c.get(bArr, i, min);
            return min;
        }
    }

    private final void m37923a() {
        if (this.f40642b) {
            if (this.f40644d != null) {
                throw this.f40644d;
            }
        } else if (!m37924b()) {
            if (this.f40643c == null) {
                this.f40643c = ByteBuffer.allocateDirect(32768);
            }
            this.f40643c.clear();
            C7923g c7923g = this.f40641a;
            c7923g.f40630c.mo6596a(this.f40643c);
            c7923g.f40629b.m37926a(c7923g.getReadTimeout());
            if (this.f40644d != null) {
                throw this.f40644d;
            } else if (this.f40643c != null) {
                this.f40643c.flip();
            }
        }
    }

    private final boolean m37924b() {
        return this.f40643c != null && this.f40643c.hasRemaining();
    }
}
