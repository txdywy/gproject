package com.google.android.finsky.installqueue.p141a;

import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3370n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final /* synthetic */ class C3351t implements Runnable {
    public final C3342k f17244a;
    public final List f17245b;
    public final List f17246c;

    C3351t(C3342k c3342k, List list, List list2) {
        this.f17244a = c3342k;
        this.f17245b = list;
        this.f17246c = list2;
    }

    public final void run() {
        C3342k c3342k = this.f17244a;
        Collection collection = this.f17245b;
        List<C3369m> list = this.f17246c;
        List arrayList = new ArrayList(collection);
        for (C3369m c3369m : list) {
            arrayList.remove(c3369m.m16819a());
            if (c3369m.f17273c.f17153d != 11) {
                ((C3300k) c3342k.f17214c.mo1a()).mo3461o(c3369m.m16819a());
            } else {
                c3342k.m16779b(new C3370n(c3369m.f17274d).m16827a(2).m16826a());
            }
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((C3300k) c3342k.f17214c.mo1a()).mo3461o((String) arrayList2.get(i));
            i = i2;
        }
    }
}
