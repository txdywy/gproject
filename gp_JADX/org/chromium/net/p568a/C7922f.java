package org.chromium.net.p568a;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.as;
import org.chromium.net.at;

final class C7922f extends as {
    public final /* synthetic */ C7921e f40627a;

    C7922f(C7921e c7921e) {
        this.f40627a = c7921e;
    }

    public final long mo6576a() {
        return this.f40627a.f40623c;
    }

    public final void mo6578a(at atVar, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.f40627a.f40624d.remaining()) {
            byteBuffer.put(this.f40627a.f40624d);
            this.f40627a.f40624d.clear();
            atVar.mo6592a(false);
            this.f40627a.f40622b.f40646b = false;
            return;
        }
        int limit = this.f40627a.f40624d.limit();
        this.f40627a.f40624d.limit(this.f40627a.f40624d.position() + byteBuffer.remaining());
        byteBuffer.put(this.f40627a.f40624d);
        this.f40627a.f40624d.limit(limit);
        atVar.mo6592a(false);
    }

    public final void mo6577a(at atVar) {
        atVar.mo6591a(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
