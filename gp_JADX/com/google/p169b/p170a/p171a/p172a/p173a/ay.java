package com.google.p169b.p170a.p171a.p172a.p173a;

import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.Locale;

public abstract class ay extends bb {
    public final int f34127e;
    public final int f34128f;

    protected ay(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34127e = byteBuffer.getInt();
        this.f34128f = byteBuffer.getInt();
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        super.mo5747a(dataOutput, byteBuffer, i);
        dataOutput.writeInt(this.f34127e);
        dataOutput.writeInt(this.f34128f);
    }

    public String toString() {
        return String.format(Locale.US, "XmlNamespaceChunk{line=%d, comment=%s, prefix=%s, uri=%s}", new Object[]{Integer.valueOf(this.f34121g), m31441c(), m31440b(this.f34127e), m31440b(this.f34128f)});
    }
}
