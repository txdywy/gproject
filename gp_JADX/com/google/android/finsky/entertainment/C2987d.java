package com.google.android.finsky.entertainment;

import com.google.android.libraries.play.entertainment.bitmap.C2986a;
import com.google.android.libraries.play.entertainment.bitmap.C6030b;
import com.google.android.play.image.u;
import com.google.android.play.image.v;

final class C2987d extends C2986a {
    public final u f15671a;

    public C2987d(u uVar) {
        this.f15671a = uVar;
    }

    protected final C6030b mo3217a(Object obj) {
        v a = this.f15671a.a(obj.toString(), 0, 0);
        if (a == null) {
            return null;
        }
        return new C6030b(a.a);
    }

    protected final C6030b mo3216a() {
        return null;
    }

    protected final void mo3219b() {
    }

    protected final void mo3220c() {
    }

    protected final void mo3218a(C6030b c6030b, Object obj) {
        this.f15671a.a(obj.toString(), c6030b.f30132a.getWidth(), c6030b.f30132a.getHeight(), c6030b.f30132a);
    }
}
