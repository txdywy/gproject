package com.google.android.finsky.installer.p207a;

import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;

final class ag implements az {
    public final /* synthetic */ C3301s f16866a;

    ag(C3301s c3301s) {
        this.f16866a = c3301s;
    }

    public final void mo3407a(String str) {
        this.f16866a.mo3431a(str);
    }

    public final void mo3406a(C3647b c3647b, boolean z) {
        this.f16866a.m16594a(c3647b, z);
    }

    public final void mo3408a(String str, int i, int i2) {
        this.f16866a.m16597a(str, i, i2);
    }

    public final void mo3405a(ah ahVar) {
        if (!(this.f16866a.f17096z == null || ahVar == this.f16866a.f17096z)) {
            FinskyLog.m21669e("Unexpected (late?) finish of task for %s", ahVar.f16878I);
        }
        this.f16866a.f17096z = null;
        C3301s c3301s = this.f16866a;
        ArrayList arrayList = new ArrayList(c3301s.f17092v);
        c3301s.f17092v.clear();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c3301s.f17077g.post((Runnable) obj);
        }
        if (this.f16866a.m16622d()) {
            C3301s c3301s2 = this.f16866a;
            c3301s2.m16614b(new C3307y(c3301s2, ahVar.f16878I));
        }
        this.f16866a.m16607a(true);
    }
}
