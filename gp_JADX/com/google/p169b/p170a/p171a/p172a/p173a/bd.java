package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6937m;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public final class bd extends bb {
    public final int f34155e;
    public final int f34156f;
    public final int f34157i;
    public final int f34158j;
    public final int f34159k;
    public final int f34160l;
    public final int f34161m;
    public final List f34162n = new ArrayList();

    protected bd(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34155e = byteBuffer.getInt();
        this.f34156f = byteBuffer.getInt();
        this.f34157i = byteBuffer.getShort() & 65535;
        int i = byteBuffer.getShort() & 65535;
        C6937m.m31632a(i == 20, "attributeSize is wrong size. Got %s, want %s", i, 20);
        this.f34158j = byteBuffer.getShort() & 65535;
        this.f34159k = (byteBuffer.getShort() & 65535) - 1;
        this.f34160l = (byteBuffer.getShort() & 65535) - 1;
        this.f34161m = (byteBuffer.getShort() & 65535) - 1;
    }

    protected final void mo5748a(ByteBuffer byteBuffer) {
        super.mo5748a(byteBuffer);
        List list = this.f34162n;
        Collection arrayList = new ArrayList(this.f34158j);
        int i = (this.d + this.f34020b) + this.f34157i;
        int i2 = i + (this.f34158j * 20);
        byteBuffer.mark();
        byteBuffer.position(i);
        for (int i3 = i; i3 < i2; i3 += 20) {
            arrayList.add(new C6904j(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), aj.m31372a(byteBuffer), this));
        }
        byteBuffer.reset();
        list.addAll(arrayList);
    }

    protected final C6905l mo5749a() {
        return C6905l.XML_START_ELEMENT;
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        super.mo5747a(dataOutput, byteBuffer, i);
        dataOutput.writeInt(this.f34155e);
        dataOutput.writeInt(this.f34156f);
        dataOutput.writeShort(20);
        dataOutput.writeShort(20);
        dataOutput.writeShort((short) this.f34162n.size());
        dataOutput.writeShort((short) (this.f34159k + 1));
        dataOutput.writeShort((short) (this.f34160l + 1));
        dataOutput.writeShort((short) (this.f34161m + 1));
        for (au auVar : this.f34162n) {
            ByteBuffer order = ByteBuffer.allocate(20).order(ByteOrder.LITTLE_ENDIAN);
            order.putInt(auVar.mo5830a());
            order.putInt(auVar.mo5831b());
            order.putInt(auVar.mo5832c());
            order.put(auVar.mo5833d().m31377d());
            dataOutput.write(order.array());
        }
    }

    public final String toString() {
        return String.format(Locale.US, "XmlStartElementChunk{line=%d, comment=%s, namespace=%s, name=%s, attributes=%s}", new Object[]{Integer.valueOf(this.f34121g), m31441c(), m31440b(this.f34155e), m31440b(this.f34156f), this.f34162n.toString()});
    }
}
