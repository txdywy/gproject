package com.google.p169b.p170a.p171a.p172a.p173a;

import com.squareup.haha.perflib.HprofParser;
import java.io.DataOutput;
import java.nio.ByteBuffer;

public class as extends C6894k {
    public final int f34116e;
    public int[] f34117f;

    protected as(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34116e = byteBuffer.get() & HprofParser.ROOT_UNKNOWN;
        byteBuffer.position(byteBuffer.position() + 3);
        int i = byteBuffer.getInt();
        this.f34117f = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f34117f[i2] = byteBuffer.getInt();
        }
    }

    protected final C6905l mo5749a() {
        return C6905l.TABLE_TYPE_SPEC;
    }

    protected final void mo5750c(ByteBuffer byteBuffer) {
        super.mo5750c(byteBuffer);
        byteBuffer.putInt(this.f34116e);
        byteBuffer.putInt(this.f34117f.length);
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        int i2 = (i & 2) != 0 ? -1073741825 : -1;
        for (int i3 : this.f34117f) {
            dataOutput.writeInt(i3 & i2);
        }
    }
}
