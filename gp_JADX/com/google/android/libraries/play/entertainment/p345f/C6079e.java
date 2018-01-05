package com.google.android.libraries.play.entertainment.p345f;

import com.google.android.libraries.play.entertainment.p344d.C6049s;

final class C6079e extends C6049s {
    public final /* synthetic */ C6075b f30226a;

    C6079e(C6075b c6075b) {
        this.f30226a = c6075b;
    }

    public final void mo5268a(Throwable th) {
        this.f30226a.m28009f();
    }

    public final /* synthetic */ void mo5267a(Object obj) {
        try {
            this.f30226a.f30215e.setDataSource((String) obj);
            this.f30226a.f30215e.prepareAsync();
        } catch (Throwable e) {
            C6075b.f30210a.m28058b(e, "Error setting/preparing music streaming url", new Object[0]);
            this.f30226a.m28009f();
        }
    }
}
