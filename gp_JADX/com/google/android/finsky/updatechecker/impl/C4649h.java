package com.google.android.finsky.updatechecker.impl;

import android.content.Context;
import com.google.android.finsky.ar.C1502a;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.updatechecker.C4638a;
import com.google.android.finsky.updatechecker.C4640d;

public final class C4649h implements C4638a {
    public final C4661t f23949a;

    public C4649h(Context context, C2266a c2266a, C2206c c2206c, C3646a c3646a, C1627b c1627b, C4640d c4640d, C1502a c1502a, C3960a c3960a) {
        this.f23949a = new C4661t(context, c2266a, c2206c, c3646a, c1627b, c4640d, c1502a, c3960a);
    }

    public final boolean mo4312a() {
        if (!this.f23949a.f23994e.m9312b()) {
            boolean z;
            C4661t c4661t = this.f23949a;
            if (c4661t.m21649a() || c4661t.m21650b()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public final void mo4311a(C2495w c2495w) {
    }
}
