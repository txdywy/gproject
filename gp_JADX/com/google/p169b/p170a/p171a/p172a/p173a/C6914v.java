package com.google.p169b.p170a.p171a.p172a.p173a;

import android.support.v7.widget.eq;
import com.google.common.p414a.C6937m;
import com.google.common.p415b.ba;
import com.google.common.p416c.C6972g;
import com.google.p438f.p439a.C7121a;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class C6914v extends ap implements C6906n {
    public boolean f34244e;

    protected C6914v(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34244e = true;
    }

    protected C6914v(C6972g c6972g, C6894k c6894k) {
        this(C6907o.m31547b(c6972g), c6894k);
    }

    protected final short mo5836b() {
        if (m31573e()) {
            return (short) (C6905l.TABLE_TYPE.f34234o | eq.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        return C6905l.TABLE_TYPE.f34234o;
    }

    final void m31577d(ByteBuffer byteBuffer) {
        int i;
        int i2 = byteBuffer.getInt();
        int a = C7121a.m32343a(byteBuffer);
        List arrayList = new ArrayList();
        for (i = 0; i < a; i++) {
            arrayList.add(Integer.valueOf(C7121a.m32343a(byteBuffer)));
        }
        a = 0;
        int i3 = 0;
        int i4 = 0;
        while (a < arrayList.size()) {
            i = ((Integer) arrayList.get(a)).intValue();
            int i5;
            if (i == 0) {
                i5 = a;
                a = i3;
                i3 = i4 + 1;
                i = i5;
            } else {
                int i6;
                if (i == -2) {
                    i6 = 0;
                } else {
                    i6 = i;
                }
                a++;
                C6937m.m31635b(a < arrayList.size());
                i3 += ((Integer) arrayList.get(a)).intValue();
                ar a2 = new C6903i().mo5827b(i2).mo5823a(8).mo5828c(i3).mo5825a((ap) this).mo5824a(new C6899e().mo5809b(i6).mo5807a(8).mo5808a(al.STRING).mo5806a()).mo5829d(0).mo5826a(new LinkedHashMap());
                C6937m.m31635b(!this.k.containsKey(Integer.valueOf(i4)));
                this.k.put(Integer.valueOf(i4), a2.mo5822a());
                i5 = a;
                a = i3;
                i3 = i4 + 1;
                i = i5;
            }
            i4 = i3;
            i3 = a;
            a = i + 1;
        }
    }

    private final boolean m31573e() {
        if (!this.f34244e || !m31407c().equals("string")) {
            return false;
        }
        Set treeSet = new TreeSet();
        for (aq aqVar : this.k.values()) {
            if (aqVar.m31419h() || ((aj) C6937m.m31623a(aqVar.mo5818d())).mo5804b() != al.STRING) {
                return false;
            }
            treeSet.add(Integer.valueOf(aqVar.mo5816b()));
        }
        if (treeSet.size() != 1) {
            return false;
        }
        return true;
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        if (m31573e()) {
            List arrayList = new ArrayList();
            Iterable treeSet = new TreeSet();
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.f34112h) {
                int c;
                if (this.k.containsKey(Integer.valueOf(i2))) {
                    boolean z;
                    aq aqVar = (aq) C6937m.m31623a((aq) this.k.get(Integer.valueOf(i2)));
                    treeSet.add(Integer.valueOf(aqVar.mo5816b()));
                    boolean z2 = !aqVar.m31419h() && treeSet.size() == 1;
                    C6937m.m31635b(z2);
                    aj ajVar = (aj) C6937m.m31623a(aqVar.mo5818d());
                    if (ajVar.mo5804b() == al.STRING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C6937m.m31635b(z);
                    c = ajVar.mo5805c();
                    if (c == 0) {
                        c = -2;
                    }
                    arrayList.add(Integer.valueOf(c));
                    c = aqVar.mo5817c();
                    arrayList.add(Integer.valueOf(c - i3));
                } else {
                    arrayList.add(Integer.valueOf(0));
                    c = i3;
                }
                i2++;
                i3 = c;
            }
            byte[] a = C6909q.m31550a(arrayList);
            dataOutput.writeInt(((Integer) ba.m31753a(treeSet)).intValue());
            dataOutput.write(a);
            C6894k.m31283a(dataOutput, a.length);
            return;
        }
        super.mo5747a(dataOutput, byteBuffer, i);
    }

    public final void mo5835a(boolean z) {
        this.f34244e = z;
    }
}
