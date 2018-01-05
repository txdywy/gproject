package com.google.android.libraries.play.entertainment.bitmap;

import com.google.android.libraries.play.entertainment.p344d.C6049s;
import com.google.android.libraries.play.entertainment.p351m.C6116b;

final class C6050q extends C6049s {
    public C6047p f30177a;
    public C6034e f30178b;

    C6050q(C6047p c6047p) {
        this.f30177a = c6047p;
    }

    public final void mo5268a(Throwable th) {
        C6116b.m28104a(this.f30177a != null, "Recipient already torn down");
        C6047p.f30158c.m28054a("%x Got failure: %s: %s", Integer.valueOf(this.f30177a.hashCode()), th.getClass().getSimpleName(), th.getMessage());
    }

    public final /* synthetic */ void mo5267a(Object obj) {
        boolean z;
        C6034e c6034e = (C6034e) obj;
        C6116b.m28104a(this.f30178b == null, "Already got a result");
        if (this.f30177a != null) {
            z = true;
        } else {
            z = false;
        }
        C6116b.m28104a(z, "Recipient already torn down");
        C6047p.f30158c.m28054a("%x Got result", Integer.valueOf(this.f30177a.hashCode()));
        this.f30178b = c6034e;
        C6047p c6047p = this.f30177a;
        c6047p.f30160e.setImageBitmap(c6034e.m27929b());
        c6047p.f30176u = true;
    }
}
