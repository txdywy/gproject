package org.chromium.net.p568a;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.as;
import org.chromium.net.at;

final class C7920d extends as {
    public final /* synthetic */ C7919c f40620a;

    C7920d(C7919c c7919c) {
        this.f40620a = c7919c;
    }

    public final long mo6576a() {
        return -1;
    }

    public final void mo6578a(at atVar, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.f40620a.f40617b.remaining()) {
            byteBuffer.put(this.f40620a.f40617b);
            this.f40620a.f40617b.clear();
            atVar.mo6592a(this.f40620a.f40619d);
            if (!this.f40620a.f40619d) {
                this.f40620a.f40616a.f40646b = false;
                return;
            }
            return;
        }
        int limit = this.f40620a.f40617b.limit();
        this.f40620a.f40617b.limit(this.f40620a.f40617b.position() + byteBuffer.remaining());
        byteBuffer.put(this.f40620a.f40617b);
        this.f40620a.f40617b.limit(limit);
        atVar.mo6592a(false);
    }

    public final void mo6577a(at atVar) {
        atVar.mo6591a(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
