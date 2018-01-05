package com.google.android.finsky.setup.p242d.p244a;

import com.google.android.finsky.setup.p242d.C4137g;
import com.google.android.finsky.setup.p242d.C4161e;
import java.util.HashSet;
import java.util.Set;

final class C4162p implements C4161e {
    public final /* synthetic */ C4160o f21034a;

    C4162p(C4160o c4160o) {
        this.f21034a = c4160o;
    }

    public final void mo3988a() {
        synchronized (this.f21034a.f21032k) {
            Set<C4137g> hashSet = new HashSet(this.f21034a.f21026e);
        }
        for (C4137g c4163q : hashSet) {
            this.f21034a.f21031j.post(new C4163q(c4163q));
        }
    }
}
