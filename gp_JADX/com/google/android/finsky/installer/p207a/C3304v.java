package com.google.android.finsky.installer.p207a;

import com.google.android.finsky.download.C2845h;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

final class C3304v implements Runnable {
    public final /* synthetic */ List f17099a;
    public final /* synthetic */ C3303u f17100b;

    C3304v(C3303u c3303u, List list) {
        this.f17100b = c3303u;
        this.f17099a = list;
    }

    public final void run() {
        int i = 0;
        C3301s c3301s = this.f17100b.f17098a;
        int i2 = 0;
        for (C2845h c2845h : this.f17099a) {
            FinskyLog.m21659a("Attempt recovery of %s %d", c2845h.f15276a, Integer.valueOf(c2845h.f15279d));
            if (i2 == 0 && c3301s.m16608a(c2845h.f15276a, c2845h.f15279d)) {
                i2 = true;
            } else {
                FinskyLog.m21659a("Releasing %s %d", c2845h.f15276a, Integer.valueOf(c2845h.f15279d));
                c3301s.f17073c.mo3179c(c2845h.f15276a);
            }
        }
        C3301s c3301s2 = this.f17100b.f17098a;
        List<C3647b> a = c3301s2.f17072b.m17245a();
        List arrayList = new ArrayList(a.size());
        for (C3647b c3647b : a) {
            arrayList.add(c3647b.f18026a);
        }
        c3301s2.f17079i.mo2851a(arrayList);
        c3301s2.f17093w = true;
        c3301s2.f17094x = false;
        c3301s2.m16607a(true);
        ArrayList arrayList2 = c3301s2.f17095y;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((Runnable) obj).run();
        }
    }
}
