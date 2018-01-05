package com.google.android.finsky.wear;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p107l.C3654j;

final class bx implements Runnable {
    public final /* synthetic */ bw f24915a;

    bx(bw bwVar) {
        this.f24915a = bwVar;
    }

    public final void run() {
        this.f24915a.f24914d.f24760g = this.f24915a.f24914d.f24760g - 1;
        C4790k c4790k = this.f24915a.f24914d.f24756c.f24798h;
        String str = this.f24915a.f24911a;
        String str2 = this.f24915a.f24912b;
        boolean z = this.f24915a.f24913c;
        C3646a a = c4790k.f24998a.m22484a(str);
        C3647b a2 = a.m17243a(str2);
        if (!(a2 == null || a2.f18029d == null)) {
            Object obj = null;
            C2129c c2129c = a2.f18029d;
            if (c2129c.f10809c != -1 && (z || a2.f18028c == null || new C3654j(C1473m.f7980a.aN()).m17261a(c2129c).m17262a(a2.f18028c).m17265a())) {
                obj = 1;
            }
            if (obj != null) {
                a.f18022b.mo2669b(str2, -1);
            }
        }
        this.f24915a.f24914d.m22419a();
    }
}
