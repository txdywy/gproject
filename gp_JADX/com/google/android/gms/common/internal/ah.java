package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C5068t;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C5588e;
import java.util.concurrent.TimeUnit;

final class ah implements C5068t {
    public /* synthetic */ C4954s f25982a;
    public /* synthetic */ C5588e f25983b;
    public /* synthetic */ ak f25984c;
    public /* synthetic */ al f25985d;

    ah(C4954s c4954s, C5588e c5588e, ak akVar, al alVar) {
        this.f25982a = c4954s;
        this.f25983b = c5588e;
        this.f25984c = akVar;
        this.f25985d = alVar;
    }

    public final void mo4604a(Status status) {
        if (status.m23271a()) {
            this.f25983b.m26583a(this.f25984c.mo4611a(this.f25982a.mo4488a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f25983b.m26582a(this.f25985d.mo4610a(status));
    }
}
