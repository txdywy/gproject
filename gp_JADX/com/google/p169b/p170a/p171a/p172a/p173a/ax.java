package com.google.p169b.p170a.p171a.p172a.p173a;

import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.Locale;

public final class ax extends bb {
    public final int f34125e;
    public final int f34126f;

    protected ax(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34125e = byteBuffer.getInt();
        this.f34126f = byteBuffer.getInt();
    }

    protected final C6905l mo5749a() {
        return C6905l.XML_END_ELEMENT;
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        super.mo5747a(dataOutput, byteBuffer, i);
        dataOutput.writeInt(this.f34125e);
        dataOutput.writeInt(this.f34126f);
    }

    public final String toString() {
        return String.format(Locale.US, "XmlEndElementChunk{line=%d, comment=%s, namespace=%s, name=%s}", new Object[]{Integer.valueOf(this.f34121g), m31441c(), m31440b(this.f34125e), m31440b(this.f34126f)});
    }
}
