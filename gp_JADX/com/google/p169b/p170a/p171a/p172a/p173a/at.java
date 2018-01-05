package com.google.p169b.p170a.p171a.p172a.p173a;

import java.io.DataOutput;
import java.nio.ByteBuffer;

public final class at extends C6894k {
    public final C6905l f34118e;
    public final byte[] f34119f = new byte[(this.b - 8)];
    public final byte[] f34120g = new byte[(this.c - this.b)];

    protected at(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34118e = C6905l.m31540a(byteBuffer.getShort(this.d));
        byteBuffer.get(this.f34119f);
        byteBuffer.get(this.f34120g);
    }

    protected final void mo5750c(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f34119f);
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        dataOutput.write(this.f34120g);
    }

    protected final C6905l mo5749a() {
        return this.f34118e;
    }
}
