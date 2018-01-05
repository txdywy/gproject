package com.squareup.okhttp.internal.p525a;

import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p526e.C7725i;
import p526e.C7728j;
import p526e.C7732o;
import p526e.C7733p;

final class aj {
    public final C7732o f39425a;
    public int f39426b;
    public final C7725i f39427c = C7733p.m37442a(this.f39425a);

    public aj(C7725i c7725i) {
        this.f39425a = new C7732o(new ak(this, c7725i), new al());
    }

    public final List m36741a(int i) {
        this.f39426b += i;
        int h = this.f39427c.mo6500h();
        if (h < 0) {
            throw new IOException("numberOfPairs < 0: " + h);
        } else if (h > MemoryMappedFileBuffer.DEFAULT_PADDING) {
            throw new IOException("numberOfPairs > 1024: " + h);
        } else {
            List arrayList = new ArrayList(h);
            for (int i2 = 0; i2 < h; i2++) {
                C7728j d = m36740a().mo6521d();
                C7728j a = m36740a();
                if (d.mo6522e() == 0) {
                    throw new IOException("name.size == 0");
                }
                arrayList.add(new C7636x(d, a));
            }
            if (this.f39426b > 0) {
                this.f39425a.m37440b();
                if (this.f39426b != 0) {
                    throw new IOException("compressedLimit > 0: " + this.f39426b);
                }
            }
            return arrayList;
        }
    }

    private final C7728j m36740a() {
        return this.f39427c.mo6490c((long) this.f39427c.mo6500h());
    }
}
