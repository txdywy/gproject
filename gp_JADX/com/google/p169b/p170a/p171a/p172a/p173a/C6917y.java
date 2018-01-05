package com.google.p169b.p170a.p171a.p172a.p173a;

import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class C6917y extends C6894k {
    public final int f34248e;
    public final List f34249f = new ArrayList();

    protected C6917y(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34248e = byteBuffer.getInt();
    }

    protected final void mo5748a(ByteBuffer byteBuffer) {
        super.mo5748a(byteBuffer);
        List list = this.f34249f;
        Collection arrayList = new ArrayList(this.f34248e);
        int i = this.d + this.f34020b;
        int i2 = (this.f34248e * 260) + i;
        while (i < i2) {
            arrayList.add(new C6893a(byteBuffer.getInt(i), ab.m31303a(byteBuffer, i + 4)));
            i += 260;
        }
        list.addAll(arrayList);
    }

    protected final C6905l mo5749a() {
        return C6905l.TABLE_LIBRARY;
    }

    protected final void mo5750c(ByteBuffer byteBuffer) {
        super.mo5750c(byteBuffer);
        byteBuffer.putInt(this.f34249f.size());
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        for (C6892z c6892z : this.f34249f) {
            ByteBuffer order = ByteBuffer.allocate(260).order(ByteOrder.LITTLE_ENDIAN);
            order.putInt(c6892z.mo5745a());
            ab.m31304a(order, c6892z.mo5746b());
            dataOutput.write(order.array());
        }
    }
}
