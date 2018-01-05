package com.google.android.finsky.p232s.p233a.p235b;

import android.support.v4.os.C0327a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p232s.C3989b;
import com.google.android.finsky.p232s.C4001c;
import com.google.android.finsky.p232s.C4005d;
import com.google.android.finsky.p232s.C4007f;
import com.google.android.finsky.p232s.C4008g;
import com.google.android.finsky.p232s.C4009h;
import com.google.android.finsky.p232s.p233a.p234a.C3993d;
import com.google.android.finsky.p232s.p233a.p234a.C3996g;
import com.google.android.finsky.p232s.p233a.p234a.C3998i;
import com.google.android.finsky.p232s.p233a.p234a.C4000k;
import java.util.ArrayList;
import java.util.List;

public final class C4003b implements C4001c {
    public final C4007f f20090a;
    public final C4008g f20091b;
    public final C1461c f20092c;

    public C4003b(C4007f c4007f, C4008g c4008g, C1461c c1461c) {
        this.f20090a = c4007f;
        this.f20091b = c4008g;
        this.f20092c = c1461c;
    }

    public final void mo3882a(C4005d c4005d) {
        this.f20090a.m18751a(c4005d);
        C4009h a = this.f20091b.m18753a(c4005d);
        Object obj = (a == null || (a.f20121d & 2) == 0) ? null : 1;
        if (obj == null) {
            this.f20090a.m18752b(c4005d);
        }
        C4007f.m18750c(c4005d);
        List arrayList = new ArrayList();
        arrayList.add(new C3993d());
        arrayList.add(new C3996g());
        if (this.f20092c.dj().mo2294a(12635548) && C0327a.m1721a()) {
            arrayList.add(new C4000k());
        } else {
            arrayList.add(new C3998i(this.f20091b));
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((C3989b) obj2).mo3881a(c4005d);
        }
        c4005d.f20097c.m16814b(3);
        c4005d.f20097c.m16810a("rapid_auto_update");
    }
}
