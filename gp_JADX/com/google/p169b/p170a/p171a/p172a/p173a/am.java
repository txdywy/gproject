package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6937m;
import com.google.common.p416c.C6966a;
import com.google.common.p416c.C6967b;
import com.google.common.p416c.C6970e;
import com.google.common.p416c.C6973h;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class am extends C6894k {
    public final int f34102f;
    public final int f34103g;
    public final int f34104h;
    public final int f34105i;
    public final int f34106j;
    public List f34107k = new ArrayList();
    public List f34108l = new ArrayList();
    public boolean f34109m = false;

    protected am(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34105i = byteBuffer.getInt();
        this.f34106j = byteBuffer.getInt();
        this.f34102f = byteBuffer.getInt();
        this.f34103g = byteBuffer.getInt();
        this.f34104h = byteBuffer.getInt();
    }

    protected final void mo5748a(ByteBuffer byteBuffer) {
        super.mo5748a(byteBuffer);
        List list = this.f34107k;
        int i = this.d + this.f34103g;
        int i2 = this.f34105i;
        Collection arrayList = new ArrayList();
        int i3 = 0;
        int i4 = -1;
        while (i3 < i2) {
            int i5 = i + byteBuffer.getInt();
            ah c = m31391c();
            int a = ag.m31366a(byteBuffer, i5, c);
            int a2 = ag.m31365a(a, c) + i5;
            if (c == ah.UTF8) {
                a = ag.m31366a(byteBuffer, a2, c);
                a2 += ag.m31365a(a, c);
            } else {
                a *= 2;
            }
            arrayList.add(new String(byteBuffer.array(), a2, a, c.f34080c));
            if (i5 <= i4) {
                this.f34109m = true;
            }
            i3++;
            i4 = i5;
        }
        list.addAll(arrayList);
        this.f34108l.addAll(m31382a(byteBuffer, this.d + this.f34104h, this.f34106j));
    }

    public final String m31390b(int i) {
        return (String) this.f34107k.get(i);
    }

    protected static List m31383a(List list, int[] iArr) {
        List arrayList = new ArrayList(list.size());
        for (ao aoVar : list) {
            List arrayList2 = new ArrayList(aoVar.mo5814a().size());
            for (an anVar : aoVar.mo5814a()) {
                int i = iArr[anVar.mo5810a()];
                C6937m.m31630a(i >= 0);
                arrayList2.add(new C6900f(i, anVar.mo5811b(), anVar.mo5812c(), anVar.mo5813d()));
            }
            arrayList.add(ao.m31399a(Collections.unmodifiableList(arrayList2)));
        }
        return arrayList;
    }

    public final ah m31391c() {
        return ((this.f34102f & 256) != 0 ? 1 : null) != null ? ah.UTF8 : ah.UTF16;
    }

    protected final C6905l mo5749a() {
        return C6905l.STRING_POOL;
    }

    private final int m31385d() {
        return (this.f34107k.size() + this.f34108l.size()) * 4;
    }

    private final List m31382a(ByteBuffer byteBuffer, int i, int i2) {
        List arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(ao.m31397a(byteBuffer, byteBuffer.getInt() + i, this));
        }
        return arrayList;
    }

    protected int mo5840b(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        int i2;
        Map hashMap = new HashMap();
        if ((i & 1) != 0 || this.f34109m) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = 0;
        for (String str : this.f34107k) {
            if (i2 == 0 || !hashMap.containsKey(str)) {
                ah c = m31391c();
                byte[] bytes = str.getBytes(c.f34080c);
                C6966a a = C6967b.m31816a(bytes.length + 5);
                ag.m31367a(a, str.length(), c);
                if (c == ah.UTF8) {
                    ag.m31367a(a, bytes.length, c);
                }
                a.write(bytes);
                if (c == ah.UTF8) {
                    a.write(0);
                } else {
                    a.writeShort(0);
                }
                byte[] a2 = a.mo5923a();
                dataOutput.write(a2);
                hashMap.put(str, Integer.valueOf(i3));
                byteBuffer.putInt(i3);
                i3 = a2.length + i3;
            } else {
                Integer num = (Integer) hashMap.get(str);
                byteBuffer.putInt(num == null ? 0 : num.intValue());
            }
        }
        return C6894k.m31283a(dataOutput, i3);
    }

    private final int m31384c(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        int i2 = ((i & 1) != 0 || this.f34109m) ? 1 : 0;
        if (this.f34108l.size() <= 0) {
            return 0;
        }
        int i3;
        Map hashMap = new HashMap();
        int i4 = 0;
        for (ao aoVar : this.f34108l) {
            if (i2 == 0 || !hashMap.containsKey(aoVar)) {
                byte[] b = aoVar.m31401b();
                dataOutput.write(b);
                hashMap.put(aoVar, Integer.valueOf(i4));
                byteBuffer.putInt(i4);
                i4 = b.length + i4;
            } else {
                Integer num = (Integer) hashMap.get(aoVar);
                if (num == null) {
                    i3 = 0;
                } else {
                    i3 = num.intValue();
                }
                byteBuffer.putInt(i3);
            }
        }
        dataOutput.writeInt(-1);
        i3 = i4 + 4;
        dataOutput.writeInt(-1);
        return C6894k.m31283a(dataOutput, i3 + 4);
    }

    protected final void mo5750c(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f34107k.size());
        byteBuffer.putInt(this.f34108l.size());
        byteBuffer.putInt(this.f34102f);
        byteBuffer.putInt(this.f34020b + m31385d());
        byteBuffer.putInt(0);
    }

    protected void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteBuffer allocate = ByteBuffer.allocate(m31385d());
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        Object c6973h = new C6973h(byteArrayOutputStream);
        try {
            int b = mo5840b(c6973h, allocate, i);
            m31384c(c6973h, allocate, i);
            dataOutput.write(allocate.array());
            dataOutput.write(byteArrayOutputStream.toByteArray());
            if (!this.f34108l.isEmpty()) {
                byteBuffer.putInt(24, (this.f34020b + m31385d()) + b);
            }
        } finally {
            C6970e.m31821a(c6973h);
        }
    }
}
