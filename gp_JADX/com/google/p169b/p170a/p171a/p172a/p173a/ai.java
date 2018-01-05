package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6937m;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class ai extends C6895m {
    public am f34081g;
    public final Map f34082h = new HashMap();

    protected ai(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        C6937m.m31631a(byteBuffer.getInt() > 0, (Object) "ResourceTableChunk package count was < 1.");
    }

    protected final void mo5748a(ByteBuffer byteBuffer) {
        super.mo5748a(byteBuffer);
        m31370c();
    }

    protected final void m31370c() {
        this.f34082h.clear();
        for (C6894k c6894k : this.f34023e.values()) {
            if (c6894k instanceof aa) {
                aa aaVar = (aa) c6894k;
                this.f34082h.put(aaVar.f34025j, aaVar);
            } else if (c6894k instanceof am) {
                this.f34081g = (am) c6894k;
            }
        }
        C6937m.m31624a(this.f34081g, (Object) "ResourceTableChunk must have a string pool.");
    }

    protected final C6905l mo5749a() {
        return C6905l.TABLE;
    }

    protected final void mo5750c(ByteBuffer byteBuffer) {
        super.mo5750c(byteBuffer);
        byteBuffer.putInt(this.f34082h.size());
    }
}
