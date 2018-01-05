package com.google.android.finsky.stream.myapps;

import android.content.Context;
import com.google.android.finsky.cv.p177a.C2443p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p226m.C3740a;
import com.google.android.finsky.p226m.C3741b;
import com.google.android.finsky.p226m.C3742c;
import java.util.Map;

final class C4535b implements C3742c, ad {
    public String f23221a;
    public long f23222b;
    public long f23223c;
    public C3741b f23224d;
    public C4549n f23225e;

    C4535b(C2443p c2443p, Context context, C2495w c2495w, C3741b c3741b) {
        long j;
        Object obj;
        this.f23221a = c2443p.f13190b.f11833b;
        if (((c2443p.f13189a & 1) != 0 ? 1 : null) != null) {
            j = c2443p.f13191c;
        } else {
            j = Long.MAX_VALUE;
        }
        this.f23222b = j;
        if ((c2443p.f13189a & 2) != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            j = c2443p.f13192d;
        } else {
            j = 0;
        }
        this.f23223c = j;
        this.f23224d = c3741b;
        this.f23224d.m17618a(context, c2495w);
        this.f23224d.m17619a((C3742c) this);
    }

    public final void mo4258a(C4549n c4549n) {
        this.f23225e = c4549n;
    }

    public final boolean mo4259a() {
        long j;
        C3740a a = this.f23224d.m17617a(this.f23221a);
        if (a == null) {
            j = 0;
        } else {
            j = a.f18883b;
        }
        return j >= this.f23223c && j <= this.f23222b;
    }

    public final void mo4260b() {
        this.f23224d.m17621b(this);
    }

    public final void mo4134a(Map map) {
        if (this.f23225e != null && map.containsKey(this.f23221a)) {
            this.f23225e.m21163a();
        }
    }
}
