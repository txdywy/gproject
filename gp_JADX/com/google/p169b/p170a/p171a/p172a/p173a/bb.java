package com.google.p169b.p170a.p171a.p172a.p173a;

import java.nio.ByteBuffer;
import java.util.Locale;

public abstract class bb extends C6894k {
    public final int f34121g;
    public final int f34122h;

    protected bb(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34121g = byteBuffer.getInt();
        this.f34122h = byteBuffer.getInt();
    }

    public final String m31441c() {
        return m31440b(this.f34122h);
    }

    protected final String m31440b(int i) {
        if (i == -1) {
            return "";
        }
        for (C6894k c6894k = this.f34019a; c6894k != null; c6894k = c6894k.f34019a) {
            if (c6894k instanceof aw) {
                for (C6894k c6894k2 : ((aw) c6894k2).f34023e.values()) {
                    if (c6894k2 instanceof am) {
                        return ((am) c6894k2).m31390b(i);
                    }
                }
                throw new IllegalStateException("XmlChunk did not contain a string pool.");
            }
        }
        throw new IllegalStateException("XmlNodeChunk did not have an XmlChunk parent.");
    }

    protected final void mo5750c(ByteBuffer byteBuffer) {
        super.mo5750c(byteBuffer);
        byteBuffer.putInt(this.f34121g);
        byteBuffer.putInt(this.f34122h);
    }

    public String toString() {
        return String.format(Locale.US, "XmlNodeChunk{line=%d, comment=%s}", new Object[]{Integer.valueOf(this.f34121g), m31441c()});
    }
}
