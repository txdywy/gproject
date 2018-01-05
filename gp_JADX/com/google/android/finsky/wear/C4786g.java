package com.google.android.finsky.wear;

import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.wearable.C5619g;
import java.util.ArrayList;

final class C4786g implements C1643x {
    public final /* synthetic */ C4785f f24977a;

    C4786g(C4785f c4785f) {
        this.f24977a = c4785f;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        C5619g c5619g = (C5619g) c4980w;
        synchronized (C4788i.class) {
            this.f24977a.f24976c.m22518a(this.f24977a.f24975b, c5619g, this.f24977a.f24974a);
            c5619g.mo4500a();
            ArrayList arrayList = this.f24977a.f24976c.f24970c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    this.f24977a.f24976c.f24971d.post(runnable);
                }
            }
            this.f24977a.f24976c.f24970c.clear();
            this.f24977a.f24976c.f24970c = null;
            this.f24977a.f24976c.f24969b = true;
        }
    }
}
