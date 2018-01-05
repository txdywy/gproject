package com.google.android.finsky.p232s.p233a.p235b;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.dr.C2883a;
import com.google.android.finsky.p232s.C3989b;
import com.google.android.finsky.p232s.C4001c;
import com.google.android.finsky.p232s.C4005d;
import com.google.android.finsky.p232s.C4007f;
import com.google.android.finsky.p232s.p233a.p234a.C3990a;
import com.google.android.finsky.p232s.p233a.p234a.C3991b;
import com.google.android.finsky.p232s.p233a.p234a.C3992c;
import com.google.android.finsky.p232s.p233a.p234a.C3994e;
import com.google.android.finsky.p232s.p233a.p234a.C3995f;
import com.google.android.finsky.p232s.p233a.p234a.C3997h;
import com.google.android.finsky.p232s.p233a.p234a.C3999j;
import com.google.android.finsky.p232s.p233a.p234a.C4000k;
import java.util.ArrayList;
import java.util.List;

public final class C4002a implements C4001c {
    public final C4007f f20088a;
    public final boolean f20089b;

    public C4002a(C4007f c4007f, boolean z) {
        this.f20088a = c4007f;
        this.f20089b = z;
    }

    public final void mo3882a(C4005d c4005d) {
        ArrayList arrayList;
        int size;
        int i;
        Object obj;
        this.f20088a.m18751a(c4005d);
        this.f20088a.m18752b(c4005d);
        if (this.f20088a.f20110a.m15631a(c4005d.f20099e, true).f15859c) {
            c4005d.f20095a |= 4;
        }
        if (!((Boolean) C0954a.f5854x.m5760a()).booleanValue()) {
            c4005d.f20095a |= 8;
        }
        C4007f.m18750c(c4005d);
        List arrayList2 = new ArrayList();
        arrayList2.add(new C3997h());
        arrayList2.add(new C3992c());
        if (!this.f20089b) {
            boolean z;
            C4007f c4007f = this.f20088a;
            if (C2883a.m15119a(c4007f.f20112c, c4007f.f20113d, c4007f.f20114e)) {
                if (c4005d.f20100f == null || c4005d.f20100f.f11424i) {
                    z = false;
                    if (z) {
                        arrayList2.add(new C3994e());
                        arrayList2.add(new C3999j());
                        arrayList2.add(new C3991b());
                        arrayList = (ArrayList) arrayList2;
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            obj = arrayList.get(i);
                            i++;
                            ((C3989b) obj).mo3881a(c4005d);
                        }
                        c4005d.f20097c.m16814b(3);
                        c4005d.f20097c.m16810a("auto_update");
                    }
                }
                if ("com.google.android.gms".equals(c4005d.f20099e.cf())) {
                    z = C2883a.m15122b(c4007f.f20113d, c4007f.f20114e);
                } else if (c4005d.f20100f.f11422g) {
                    z = C2883a.m15120a(c4007f.f20113d, c4007f.f20114e);
                }
                if (z) {
                    arrayList2.add(new C3994e());
                    arrayList2.add(new C3999j());
                    arrayList2.add(new C3991b());
                    arrayList = (ArrayList) arrayList2;
                    size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        obj = arrayList.get(i);
                        i++;
                        ((C3989b) obj).mo3881a(c4005d);
                    }
                    c4005d.f20097c.m16814b(3);
                    c4005d.f20097c.m16810a("auto_update");
                }
            }
            z = false;
            if (z) {
                arrayList2.add(new C3994e());
                arrayList2.add(new C3999j());
                arrayList2.add(new C3991b());
                arrayList = (ArrayList) arrayList2;
                size = arrayList.size();
                i = 0;
                while (i < size) {
                    obj = arrayList.get(i);
                    i++;
                    ((C3989b) obj).mo3881a(c4005d);
                }
                c4005d.f20097c.m16814b(3);
                c4005d.f20097c.m16810a("auto_update");
            }
        }
        arrayList2.add(new C3995f());
        arrayList2.add(new C4000k());
        arrayList2.add(new C3990a(this.f20088a));
        arrayList = (ArrayList) arrayList2;
        size = arrayList.size();
        i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            ((C3989b) obj).mo3881a(c4005d);
        }
        c4005d.f20097c.m16814b(3);
        c4005d.f20097c.m16810a("auto_update");
    }
}
