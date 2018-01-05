package com.google.android.finsky.cg;

import com.google.android.finsky.aa.C0955b;
import com.google.android.play.image.bs;
import com.google.android.play.utils.p146c.C6323d;

final class C2275b implements bs {
    public final /* synthetic */ C2274a f11277a;

    C2275b(C2274a c2274a) {
        this.f11277a = c2274a;
    }

    public final int m11738a() {
        C2274a c2274a = this.f11277a;
        if (c2274a.f11272b) {
            return c2274a.m11735a();
        }
        int a = C6323d.m28965a();
        if (a == -1) {
            return c2274a.m11735a();
        }
        float f = c2274a.f11273c;
        if (a < ((Integer) C0955b.fH.m28964b()).intValue() + c2274a.f11274d) {
            return 0;
        }
        if (((float) a) < ((float) ((Integer) C0955b.fI.m28964b()).intValue()) * f) {
            return 1;
        }
        if (((float) a) < ((float) ((Integer) C0955b.fJ.m28964b()).intValue()) * f) {
            return 2;
        }
        return 3;
    }
}
