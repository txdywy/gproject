package com.google.android.gms.clearcut;

import com.google.android.gms.internal.wz;
import com.google.android.gms.internal.xj;
import com.google.android.gms.internal.xk;
import com.google.android.gms.internal.xl;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

final class C5046s implements C5016d {
    public final byte[] f25605a;
    public final Integer f25606b;
    public final ArrayList f25607c = m23258a(this.f25606b);
    public /* synthetic */ C5019g f25608d;

    C5046s(C5019g c5019g, byte[] bArr) {
        this.f25608d = c5019g;
        this.f25605a = bArr;
        this.f25606b = (Integer) c5019g.f25568m.get(this.f25605a);
    }

    private final ArrayList m23258a(Integer num) {
        ArrayList arrayList = new ArrayList(this.f25608d.f25565j.size());
        for (C5020h c5020h : this.f25608d.f25565j.values()) {
            if (c5020h.f25573d.containsKey(num)) {
                arrayList.add(c5020h);
            }
        }
        return arrayList;
    }

    private final xl m23259b() {
        xl xlVar = new xl();
        xlVar.f27708a = this.f25608d.f25562g;
        if (this.f25605a != null) {
            xlVar.f27711d = this.f25605a;
        }
        xlVar.f27710c = new xk[this.f25607c.size()];
        ArrayList arrayList = this.f25607c;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            C5020h c5020h = (C5020h) arrayList.get(i2);
            xk[] xkVarArr = xlVar.f27710c;
            Map map = (Map) c5020h.f25573d.get(this.f25606b);
            xk xkVar = new xk();
            xkVar.f27705b = C5019g.m23200a(c5020h.f25570a);
            xkVar.f27707d = new xj[map.size()];
            int i4 = 0;
            for (Entry entry : map.entrySet()) {
                xj xjVar = new xj();
                xjVar.f27702b = ((Long) entry.getKey()).longValue();
                xjVar.f27703c = ((long[]) entry.getValue())[0];
                int i5 = i4 + 1;
                xkVar.f27707d[i4] = xjVar;
                i4 = i5;
            }
            xkVarArr[i] = xkVar;
            i2 = i3;
            i++;
        }
        return xlVar;
    }

    public final byte[] mo4533a() {
        return wz.m24212a(m23259b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5046s)) {
            return false;
        }
        return m23259b().equals(((C5046s) obj).m23259b());
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return m23259b().toString();
    }
}
