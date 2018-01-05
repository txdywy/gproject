package com.google.android.instantapps.p309a;

import com.google.android.instantapps.p309a.p311b.p312a.C5694a;

public final class C5697d implements C5694a {
    public volatile Object f28849a;
    public final /* synthetic */ C5694a f28850b;

    public C5697d(C5694a c5694a) {
        this.f28850b = c5694a;
    }

    public final synchronized Object mo5134a() {
        if (this.f28849a == null) {
            this.f28849a = this.f28850b.mo5134a();
        }
        return this.f28849a;
    }
}
