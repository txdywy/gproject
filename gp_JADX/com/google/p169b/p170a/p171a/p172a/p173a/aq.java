package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6937m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class aq {
    public abstract int mo5815a();

    public abstract int mo5816b();

    public abstract int mo5817c();

    public abstract aj mo5818d();

    public abstract Map mo5819e();

    public abstract int mo5820f();

    public abstract ap mo5821g();

    public final boolean m31419h() {
        return (mo5816b() & 1) != 0;
    }

    public static aq m31410a(ByteBuffer byteBuffer, int i, ap apVar) {
        int i2;
        aj ajVar;
        int i3 = 0;
        int position = byteBuffer.position();
        byteBuffer.position(i);
        int i4 = byteBuffer.getShort() & 65535;
        int i5 = byteBuffer.getShort() & 65535;
        int i6 = byteBuffer.getInt();
        Map linkedHashMap = new LinkedHashMap();
        if ((i5 & 1) != 0) {
            i2 = byteBuffer.getInt();
            int i7 = byteBuffer.getInt();
            while (i3 < i7) {
                linkedHashMap.put(Integer.valueOf(byteBuffer.getInt()), aj.m31372a(byteBuffer));
                i3++;
            }
            ajVar = null;
        } else {
            ajVar = aj.m31372a(byteBuffer);
            i2 = 0;
        }
        aq a = new C6903i().mo5823a(i4).mo5827b(i5).mo5828c(i6).mo5824a(ajVar).mo5826a(linkedHashMap).mo5829d(i2).mo5825a(apVar).mo5822a();
        byteBuffer.position(position);
        return a;
    }

    public final byte[] m31412a(int i) {
        ByteBuffer allocate = ByteBuffer.allocate((m31419h() ? mo5819e().size() * 12 : 8) + mo5815a());
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) mo5815a());
        allocate.putShort((short) (((i & 2) != 0 ? -3 : -1) & mo5816b()));
        allocate.putInt(mo5817c());
        if (m31419h()) {
            allocate.putInt(mo5820f());
            allocate.putInt(mo5819e().size());
            for (Entry entry : mo5819e().entrySet()) {
                allocate.putInt(((Integer) entry.getKey()).intValue());
                allocate.put(((aj) entry.getValue()).m31377d());
            }
        } else {
            Object d = mo5818d();
            C6937m.m31624a(d, (Object) "A non-complex TypeChunk entry must have a value.");
            allocate.put(d.m31377d());
        }
        return allocate.array();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        ap g = mo5821g();
        int c = mo5817c();
        Object d = g.m31409d();
        C6937m.m31626a(d, "%s has no parent package.", g.getClass());
        d = d.mo5838d();
        C6937m.m31626a(d, "%s's parent package has no key pool.", g.getClass());
        objArr[0] = d.m31390b(c);
        objArr[1] = mo5818d();
        objArr[2] = mo5819e();
        return String.format("Entry{key=%s,value=%s,values=%s}", objArr);
    }
}
