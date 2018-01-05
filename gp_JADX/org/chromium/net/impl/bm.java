package org.chromium.net.impl;

import android.os.Build.VERSION;
import java.nio.ByteBuffer;

final class bm implements bd {
    public final /* synthetic */ boolean f40859a;
    public final /* synthetic */ bg f40860b;

    bm(bg bgVar, boolean z) {
        this.f40860b = bgVar;
        this.f40859a = z;
    }

    public final void mo6615a() {
        this.f40860b.f40849j = this.f40860b.f40847h.mo6576a();
        if (this.f40860b.f40849j == 0) {
            this.f40860b.m38096d();
            return;
        }
        if (this.f40860b.f40849j <= 0 || this.f40860b.f40849j >= 8192) {
            this.f40860b.f40848i = ByteBuffer.allocateDirect(8192);
        } else {
            this.f40860b.f40848i = ByteBuffer.allocateDirect(((int) this.f40860b.f40849j) + 1);
        }
        if (this.f40860b.f40849j > 0 && this.f40860b.f40849j <= 2147483647L) {
            this.f40860b.f40843d.setFixedLengthStreamingMode((int) this.f40860b.f40849j);
        } else if (this.f40860b.f40849j <= 2147483647L || VERSION.SDK_INT < 19) {
            this.f40860b.f40843d.setChunkedStreamingMode(8192);
        } else {
            this.f40860b.f40843d.setFixedLengthStreamingMode(this.f40860b.f40849j);
        }
        if (this.f40859a) {
            this.f40860b.m38094b();
            return;
        }
        this.f40860b.f40840a.set(bp.AWAITING_REWIND_RESULT);
        this.f40860b.f40847h.mo6577a(this.f40860b);
    }
}
