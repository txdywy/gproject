package org.chromium.net.p568a;

import java.nio.ByteBuffer;
import org.chromium.net.as;
import org.chromium.net.at;

final class C7918b extends as {
    public final /* synthetic */ C7917a f40615a;

    C7918b(C7917a c7917a) {
        this.f40615a = c7917a;
    }

    public final long mo6576a() {
        if (this.f40615a.f40611a != -1) {
            return (long) this.f40615a.f40611a;
        }
        if (this.f40615a.f40614d) {
            return (long) this.f40615a.f40613c.limit();
        }
        return (long) this.f40615a.f40613c.position();
    }

    public final void mo6578a(at atVar, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < this.f40615a.f40613c.remaining()) {
            byteBuffer.put(this.f40615a.f40613c.array(), this.f40615a.f40613c.position(), remaining);
            this.f40615a.f40613c.position(remaining + this.f40615a.f40613c.position());
        } else {
            byteBuffer.put(this.f40615a.f40613c);
        }
        atVar.mo6592a(false);
    }

    public final void mo6577a(at atVar) {
        this.f40615a.f40613c.position(0);
        atVar.mo6590a();
    }
}
