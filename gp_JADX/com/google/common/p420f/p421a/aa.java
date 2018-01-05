package com.google.common.p420f.p421a;

import com.google.common.p414a.C6925j;
import com.google.common.p414a.C6937m;
import com.google.common.p415b.ar;
import com.google.common.p415b.at;
import com.google.common.p415b.bh;
import java.util.List;

abstract class aa extends C6979s {
    public List f34381g;
    public final /* synthetic */ C6982z f34382h;

    aa(C6982z c6982z, ar arVar) {
        List d;
        this.f34382h = c6982z;
        super(c6982z, arVar);
        if (arVar.isEmpty()) {
            d = at.m31740d();
        } else {
            d = bh.m31760a(arVar.size());
        }
        this.f34381g = d;
        for (int i = 0; i < arVar.size(); i++) {
            this.f34381g.add(null);
        }
    }

    abstract Object mo5935a(List list);

    final void mo5929a(boolean z, int i, Object obj) {
        List list = this.f34381g;
        if (list != null) {
            list.set(i, C6925j.m31606c(obj));
            return;
        }
        boolean z2 = z || this.f34382h.isCancelled();
        C6937m.m31631a(z2, (Object) "Future was done before all dependencies completed");
    }

    final void mo5931c() {
        List list = this.f34381g;
        if (list != null) {
            this.f34382h.mo5942a(mo5935a(list));
        } else {
            C6937m.m31635b(this.f34382h.isDone());
        }
    }

    final void mo5930b() {
        super.mo5930b();
        this.f34381g = null;
    }
}
