package org.chromium.net.impl;

import java.nio.ByteBuffer;
import org.chromium.net.ay;

final class az implements bd {
    public final /* synthetic */ ay f40825a;
    public final /* synthetic */ ByteBuffer f40826b;
    public final /* synthetic */ aw f40827c;

    az(aw awVar, ay ayVar, ByteBuffer byteBuffer) {
        this.f40827c = awVar;
        this.f40825a = ayVar;
        this.f40826b = byteBuffer;
    }

    public final void mo6615a() {
        if (this.f40827c.f40820d.f40780g.compareAndSet(bq.READING, bq.AWAITING_READ)) {
            this.f40827c.f40817a.mo6582a(this.f40827c.f40820d, this.f40825a, this.f40826b);
        }
    }
}
