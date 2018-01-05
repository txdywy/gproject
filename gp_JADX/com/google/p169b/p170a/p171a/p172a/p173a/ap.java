package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6937m;
import com.google.common.p416c.C6970e;
import com.google.common.p416c.C6973h;
import com.google.common.p419e.C6976b;
import com.squareup.haha.perflib.HprofParser;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ap extends C6894k {
    public final int f34110f;
    public int f34111g;
    public int f34112h;
    public final int f34113i;
    public ad f34114j;
    public final Map f34115k = new TreeMap();

    protected ap(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34110f = byteBuffer.get() & HprofParser.ROOT_UNKNOWN;
        this.f34111g = byteBuffer.get() & HprofParser.ROOT_UNKNOWN;
        byteBuffer.position(byteBuffer.position() + 2);
        this.f34112h = byteBuffer.getInt();
        this.f34113i = byteBuffer.getInt();
        this.f34114j = ad.m31308a(byteBuffer);
    }

    protected final void mo5748a(ByteBuffer byteBuffer) {
        int i = 0;
        int i2 = this.d + this.f34113i;
        if (m31403e()) {
            while (i < this.f34112h) {
                int i3 = byteBuffer.getShort() & 65535;
                this.f34115k.put(Integer.valueOf(i3), aq.m31410a(byteBuffer, ((byteBuffer.getShort() & 65535) * 4) + i2, this));
                i++;
            }
            return;
        }
        while (i < this.f34112h) {
            i3 = byteBuffer.getInt();
            if (i3 != -1) {
                this.f34115k.put(Integer.valueOf(i), aq.m31410a(byteBuffer, i3 + i2, this));
            }
            i++;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TypeChunk[id:").append(this.f34110f).append(", typeName:").append(m31407c()).append(", configuration:").append(this.f34114j).append(", originalEntryCount:").append(this.f34112h).append(", entries:");
        for (Entry entry : this.f34115k.entrySet()) {
            stringBuilder.append("<").append(entry.getKey()).append("->").append(entry.getValue()).append("> ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private final boolean m31403e() {
        return (this.f34111g & 1) != 0;
    }

    public final String m31407c() {
        Object d = m31409d();
        C6937m.m31626a(d, "%s has no parent package.", getClass());
        d = d.mo5837c();
        C6937m.m31626a(d, "%s's parent package has no type pool.", getClass());
        return d.m31390b(this.f34110f - 1);
    }

    public final aa m31409d() {
        C6894k c6894k = this.f34019a;
        while (c6894k != null && !(c6894k instanceof aa)) {
            c6894k = c6894k.f34019a;
        }
        return (c6894k == null || !(c6894k instanceof aa)) ? null : (aa) c6894k;
    }

    protected final C6905l mo5749a() {
        return C6905l.TABLE_TYPE;
    }

    private final int m31402b(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        int i2;
        int i3 = 0;
        int length;
        if (m31403e()) {
            i2 = 0;
            for (Entry entry : this.f34115k.entrySet()) {
                boolean z;
                byte[] a = ((aq) entry.getValue()).m31412a(i);
                dataOutput.write(a);
                byteBuffer.putShort((short) (((Integer) entry.getKey()).intValue() & 65535));
                byteBuffer.putShort((short) (i2 / 4));
                length = a.length + i2;
                if (length % 4 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C6937m.m31635b(z);
                i2 = length;
            }
        } else {
            int i4 = 0;
            while (i3 < this.f34112h) {
                aq aqVar = (aq) this.f34115k.get(Integer.valueOf(i3));
                if (aqVar == null) {
                    byteBuffer.putInt(-1);
                    length = i4;
                } else {
                    byte[] a2 = aqVar.m31412a(i);
                    dataOutput.write(a2);
                    byteBuffer.putInt(i4);
                    length = a2.length + i4;
                }
                i3++;
                i4 = length;
            }
            i2 = i4;
        }
        return C6894k.m31283a(dataOutput, i2);
    }

    protected final void mo5750c(ByteBuffer byteBuffer) {
        int i = this.f34020b + (this.f34112h * 4);
        byteBuffer.put(C6976b.m31830a((long) this.f34110f));
        byteBuffer.put(C6976b.m31830a((long) this.f34111g));
        byteBuffer.putShort((short) 0);
        byteBuffer.putInt(this.f34112h);
        byteBuffer.putInt(i);
        ad adVar = this.f34114j;
        ByteBuffer order = ByteBuffer.allocate(adVar.mo5752a()).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(adVar.mo5752a());
        order.putShort((short) adVar.mo5753b());
        order.putShort((short) adVar.mo5754c());
        order.put(adVar.mo5755d());
        order.put(adVar.mo5756e());
        order.put((byte) adVar.mo5757f());
        order.put((byte) adVar.mo5758g());
        order.putShort((short) adVar.mo5759h());
        order.put((byte) adVar.mo5760i());
        order.put((byte) adVar.mo5761j());
        order.put((byte) adVar.mo5762k());
        order.put((byte) 0);
        order.putShort((short) adVar.mo5763l());
        order.putShort((short) adVar.mo5764m());
        order.putShort((short) adVar.mo5765n());
        order.putShort((short) adVar.mo5766o());
        if (adVar.mo5752a() >= 32) {
            order.put((byte) adVar.mo5767p());
            order.put((byte) adVar.mo5768q());
            order.putShort((short) adVar.mo5769r());
        }
        if (adVar.mo5752a() >= 36) {
            order.putShort((short) adVar.mo5770s());
            order.putShort((short) adVar.mo5771t());
        }
        if (adVar.mo5752a() >= 48) {
            order.put(adVar.mo5772u());
            order.put(adVar.mo5773v());
        }
        if (adVar.mo5752a() >= 52) {
            order.put((byte) adVar.mo5774w());
            order.put((byte) adVar.mo5775x());
            order.putShort((short) 0);
        }
        order.put(adVar.mo5776y());
        byteBuffer.put(order.array());
    }

    protected void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteBuffer order = ByteBuffer.allocate(this.f34112h * 4).order(ByteOrder.LITTLE_ENDIAN);
        Object c6973h = new C6973h(byteArrayOutputStream);
        try {
            m31402b(c6973h, order, i);
            dataOutput.write(order.array());
            dataOutput.write(byteArrayOutputStream.toByteArray());
        } finally {
            C6970e.m31821a(c6973h);
        }
    }
}
