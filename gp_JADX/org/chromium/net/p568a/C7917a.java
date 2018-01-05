package org.chromium.net.p568a;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.as;

final class C7917a extends C7916j {
    public final int f40611a;
    public final as f40612b = new C7918b(this);
    public ByteBuffer f40613c;
    public boolean f40614d = false;

    C7917a(C7923g c7923g, long j) {
        if (c7923g == null) {
            throw new NullPointerException("Argument connection cannot be null.");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        } else if (j < 0) {
            throw new IllegalArgumentException("Content length < 0.");
        } else {
            this.f40611a = (int) j;
            this.f40613c = ByteBuffer.allocate(this.f40611a);
        }
    }

    C7917a(C7923g c7923g) {
        if (c7923g == null) {
            throw new NullPointerException();
        }
        this.f40611a = -1;
        this.f40613c = ByteBuffer.allocate(16384);
    }

    public final void write(int i) {
        m37868d();
        m37870a(1);
        this.f40613c.put((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        m37868d();
        m37870a(i2);
        this.f40613c.put(bArr, i, i2);
    }

    private final void m37870a(int i) {
        if (this.f40611a != -1 && this.f40613c.position() + i > this.f40611a) {
            throw new ProtocolException("exceeded content-length limit of " + this.f40611a + " bytes");
        } else if (this.f40614d) {
            throw new IllegalStateException("Cannot write after being connected.");
        } else if (this.f40611a == -1 && this.f40613c.limit() - this.f40613c.position() <= i) {
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.f40613c.capacity() * 2, this.f40613c.capacity() + i));
            this.f40613c.flip();
            allocate.put(this.f40613c);
            this.f40613c = allocate;
        }
    }

    final void mo6573a() {
        this.f40614d = true;
        if (this.f40613c.position() < this.f40611a) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        this.f40613c.flip();
    }

    final void mo6574b() {
    }

    final as mo6575c() {
        return this.f40612b;
    }
}
