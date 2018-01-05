package com.google.p169b.p170a.p171a.p172a.p173a;

import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class bc extends C6894k {
    public final List f34154e = new ArrayList();

    protected bc(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
    }

    protected final void mo5748a(ByteBuffer byteBuffer) {
        super.mo5748a(byteBuffer);
        List list = this.f34154e;
        int i = (this.f34021c - this.f34020b) / 4;
        Collection arrayList = new ArrayList(i);
        int i2 = this.d + this.f34020b;
        byteBuffer.mark();
        byteBuffer.position(i2);
        for (i2 = 0; i2 < i; i2++) {
            arrayList.add(Integer.valueOf(byteBuffer.getInt()));
        }
        byteBuffer.reset();
        list.addAll(arrayList);
    }

    protected final C6905l mo5749a() {
        return C6905l.XML_RESOURCE_MAP;
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        super.mo5747a(dataOutput, byteBuffer, i);
        for (Integer intValue : this.f34154e) {
            dataOutput.writeInt(intValue.intValue());
        }
    }
}
