package com.google.p169b.p170a.p171a.p172a.p173a;

import android.support.v7.widget.eq;
import com.google.common.p414a.C6928c;
import com.google.common.p414a.C6937m;
import com.google.common.p416c.C6972g;
import com.google.common.p416c.C6973h;
import com.squareup.haha.perflib.HprofParser;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class C6912t extends am implements C6906n {
    public boolean f34239e;

    protected C6912t(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34239e = true;
    }

    protected C6912t(C6972g c6972g, C6894k c6894k) {
        this(C6907o.m31547b(c6972g), c6894k);
    }

    protected final short mo5836b() {
        if (this.f34239e) {
            return (short) (C6905l.STRING_POOL.f34234o | eq.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        return C6905l.STRING_POOL.f34234o;
    }

    final void m31565a(ByteBuffer byteBuffer, int i) {
        while (i > 0) {
            ao.m31398a(byteBuffer, this);
            i--;
        }
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        if (this.f34239e) {
            int i2;
            int i3 = 0;
            int i4;
            for (i2 = 0; i2 < this.k.size(); i2 = i4) {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C6973h c6973h = new C6973h(byteArrayOutputStream);
                int i5 = 0;
                i4 = i2;
                while (i5 < 2097152 && i4 < this.k.size()) {
                    byte[] bytes = ((String) this.k.get(i4)).getBytes(m31391c().f34080c);
                    C6937m.m31635b(((short) bytes.length) == bytes.length);
                    c6973h.writeShort(bytes.length);
                    c6973h.write(bytes);
                    i4++;
                    i5 = (bytes.length + 2) + i5;
                }
                dataOutput.writeInt(i5);
                dataOutput.write(byteArrayOutputStream.toByteArray());
                i3 = (i5 + 4) + i3;
            }
            dataOutput.writeInt(0);
            int i6 = i3 + 4;
            OutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            C6973h c6973h2 = new C6973h(byteArrayOutputStream2);
            for (ao b : this.l) {
                c6973h2.write(b.m31401b());
            }
            byte[] toByteArray = byteArrayOutputStream2.toByteArray();
            i2 = toByteArray.length;
            if ((toByteArray.length + i6) % 4 != 0) {
                i2 += 4 - ((toByteArray.length + i6) % 4);
            }
            dataOutput.writeInt(i2);
            i2 = i6 + 4;
            dataOutput.write(toByteArray);
            C6894k.m31283a(dataOutput, i2 + toByteArray.length);
            return;
        }
        super.mo5747a(dataOutput, byteBuffer, i);
    }

    protected final int mo5840b(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        int i2 = ((i & 1) != 0 || this.m) ? 1 : 0;
        if (i2 != 0 || m31391c() != ah.UTF8) {
            return super.mo5840b(dataOutput, byteBuffer, i);
        }
        int i3 = 0;
        for (String str : this.k) {
            byte[] bytes = str.getBytes(C6928c.f34257b);
            i2 = C6912t.m31563b(dataOutput, str.length()) + C6912t.m31563b(dataOutput, bytes.length);
            dataOutput.write(bytes);
            dataOutput.write(0);
            i2 += bytes.length + 1;
            byteBuffer.putInt(i3);
            i3 = i2 + i3;
        }
        return C6894k.m31283a(dataOutput, i3);
    }

    private static int m31563b(DataOutput dataOutput, int i) {
        if (i > 127) {
            dataOutput.write(((i & 32512) >> 8) | 128);
        }
        dataOutput.write(i & HprofParser.ROOT_UNKNOWN);
        return i > 127 ? 2 : 1;
    }

    public final void mo5835a(boolean z) {
        this.f34239e = z;
    }
}
