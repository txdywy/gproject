package com.google.p169b.p170a.p171a.p172a.p173a;

import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.Locale;

public final class av extends bb {
    public final int f34123e;
    public final aj f34124f;

    protected av(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34123e = byteBuffer.getInt();
        this.f34124f = aj.m31372a(byteBuffer);
    }

    protected final C6905l mo5749a() {
        return C6905l.XML_CDATA;
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        super.mo5747a(dataOutput, byteBuffer, i);
        dataOutput.writeInt(this.f34123e);
        dataOutput.write(this.f34124f.m31377d());
    }

    public final String toString() {
        return String.format(Locale.US, "XmlCdataChunk{line=%d, comment=%s, value=%s}", new Object[]{Integer.valueOf(this.f34121g), m31441c(), m31440b(this.f34123e)});
    }
}
