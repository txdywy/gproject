package com.google.p169b.p170a.p171a.p172a.p173a;

import android.support.v7.widget.eq;
import com.google.common.p414a.C6937m;
import com.google.common.p416c.C6970e;
import com.google.common.p416c.C6972g;
import com.google.common.p416c.C6973h;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class C6894k {
    public final C6894k f34019a;
    public final int f34020b;
    public final int f34021c;
    public final int f34022d;

    protected C6894k(ByteBuffer byteBuffer, C6894k c6894k) {
        this.f34019a = c6894k;
        this.f34022d = byteBuffer.position() - 2;
        this.f34020b = byteBuffer.getShort() & 65535;
        this.f34021c = byteBuffer.getInt();
    }

    protected abstract C6905l mo5749a();

    protected void mo5748a(ByteBuffer byteBuffer) {
    }

    protected final void m31292b(ByteBuffer byteBuffer) {
        byteBuffer.position(this.f34022d + this.f34021c);
    }

    protected short mo5836b() {
        return mo5749a().f34234o;
    }

    protected void mo5750c(ByteBuffer byteBuffer) {
    }

    protected void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
    }

    protected static int m31283a(DataOutput dataOutput, int i) {
        while (i % 4 != 0) {
            dataOutput.write(0);
            i++;
        }
        return i;
    }

    public final byte[] m31290a(int i) {
        boolean z = false;
        ByteBuffer order = ByteBuffer.allocate(this.f34020b).order(ByteOrder.LITTLE_ENDIAN);
        int position = order.position();
        order.putShort(mo5836b());
        order.putShort((short) this.f34020b);
        order.putInt(0);
        mo5750c(order);
        position = order.position() - position;
        if (position == this.f34020b) {
            z = true;
        }
        C6937m.m31632a(z, "Written header is wrong size. Got %s, want %s", position, this.f34020b);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutput c6973h = new C6973h(byteArrayOutputStream);
        try {
            mo5747a(c6973h, order, i);
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            position = this.f34020b + toByteArray.length;
            order.putInt(4, position);
            ByteBuffer order2 = ByteBuffer.allocate(position).order(ByteOrder.LITTLE_ENDIAN);
            order2.put(order.array());
            order2.put(toByteArray);
            return order2.array();
        } finally {
            C6970e.m31821a(c6973h);
        }
    }

    static C6894k m31285a(ByteBuffer byteBuffer, C6894k c6894k) {
        Object c6912t;
        switch (C6894k.m31286a(byteBuffer.getShort()).ordinal()) {
            case 1:
                c6912t = new C6912t(byteBuffer, c6894k);
                c6912t.mo5748a(byteBuffer);
                break;
            case 2:
                c6912t = new C6911s(byteBuffer, c6894k);
                c6912t.mo5748a(byteBuffer);
                break;
            case 10:
                c6912t = new C6910r(byteBuffer, c6894k);
                c6912t.mo5748a(byteBuffer);
                break;
            case 11:
                c6912t = new C6914v(byteBuffer, c6894k);
                c6912t.mo5748a(byteBuffer);
                break;
            case 12:
                c6912t = new C6915w(byteBuffer, c6894k);
                c6912t.mo5748a(byteBuffer);
                break;
            default:
                throw new IllegalStateException("We don't support compressed XML resources yet");
        }
        C6894k c6894k2 = (C6894k) C6937m.m31623a(c6912t);
        c6894k2.m31292b(byteBuffer);
        return c6894k2;
    }

    static C6894k m31284a(C6972g c6972g, C6894k c6894k, C6916x c6916x) {
        boolean z = true;
        int i = 0;
        short readShort = c6972g.readShort();
        boolean z2 = (readShort & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0;
        ByteBuffer order;
        C6894k c6911s;
        switch (C6894k.m31286a(readShort).ordinal()) {
            case 1:
                C6937m.m31635b(z2);
                C6894k c6912t = new C6912t(c6972g, c6894k);
                int i2;
                byte[] bArr;
                if (c6916x == null) {
                    C6913u c6913u = new C6913u(c6972g, c6912t.m31391c().f34080c);
                    for (i2 = 0; i2 < c6912t.i; i2++) {
                        c6912t.k.add(c6913u.m31572b());
                    }
                    c6913u.m31570a();
                    bArr = new byte[c6972g.readInt()];
                    c6972g.readFully(bArr);
                    ByteBuffer order2 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                    while (i < c6912t.j) {
                        c6912t.l.add(ao.m31398a(order2, c6912t));
                        i++;
                    }
                } else {
                    int[] iArr = new int[c6912t.i];
                    C6913u c6913u2 = new C6913u(c6972g, c6912t.m31391c().f34080c);
                    Set<Integer> treeSet = new TreeSet();
                    i2 = c6916x.f34245a.nextSetBit(0);
                    while (i2 >= 0) {
                        treeSet.add(Integer.valueOf(i2));
                        i2 = c6916x.f34245a.nextSetBit(i2 + 1);
                    }
                    int i3 = 0;
                    for (Integer intValue : treeSet) {
                        int intValue2 = intValue.intValue();
                        c6913u2.m31571a(intValue2 - i3);
                        while (i3 < intValue2) {
                            i2 = i3 + 1;
                            iArr[i3] = -1;
                            i3 = i2;
                        }
                        if (i3 == intValue2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C6937m.m31635b(z2);
                        c6912t.k.add(c6913u2.m31572b());
                        i2 = i3 + 1;
                        iArr[i3] = c6912t.k.size() - 1;
                        i3 = i2;
                    }
                    c6913u2.m31571a(c6912t.i - i3);
                    c6913u2.m31570a();
                    while (i3 < c6912t.i) {
                        i2 = i3 + 1;
                        iArr[i3] = -1;
                        i3 = i2;
                    }
                    bArr = new byte[c6972g.readInt()];
                    c6972g.readFully(bArr);
                    order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                    List arrayList = new ArrayList();
                    for (Integer intValue3 : treeSet) {
                        i2 = intValue3.intValue();
                        if (i2 < c6912t.j) {
                            c6912t.m31565a(order, i2 - i);
                            arrayList.add(ao.m31398a(order, c6912t));
                            i = i2 + 1;
                        } else {
                            c6912t.l = am.m31383a(arrayList, iArr);
                        }
                    }
                    c6912t.l = am.m31383a(arrayList, iArr);
                }
                return c6912t;
            case 2:
                C6937m.m31635b(z2);
                c6911s = new C6911s(c6972g, c6894k);
                C6911s.m31558a(c6972g, c6916x, c6911s, c6911s.e);
                c6911s.m31370c();
                return c6911s;
            case 10:
                C6937m.m31635b(z2);
                c6911s = new C6910r(c6972g, c6894k);
                c6911s.m31551a(c6972g, c6916x);
                return c6911s;
            case 11:
                if (z2) {
                    c6911s = new C6914v(c6972g, c6894k);
                    byte[] bArr2 = new byte[(c6911s.c - c6911s.b)];
                    c6972g.readFully(bArr2);
                    c6911s.m31577d(ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN));
                    return c6911s;
                }
                order = C6907o.m31542a(c6972g);
                c6911s = new ap(order, c6894k);
                c6911s.mo5748a(order);
                return c6911s;
            case 12:
                if (z2) {
                    z = false;
                }
                C6937m.m31635b(z);
                return new C6915w(c6972g, c6894k);
            default:
                throw new IllegalStateException("We don't support compressed XML resources yet");
        }
    }

    private static C6905l m31286a(short s) {
        return C6905l.m31540a((short) (s & 4095));
    }
}
