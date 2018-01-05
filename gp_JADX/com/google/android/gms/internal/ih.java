package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.C5312g;

final class ih implements Runnable {
    public /* synthetic */ boolean f26989a = false;
    public /* synthetic */ C5312g f26990b;
    public /* synthetic */ ij f26991c;
    public /* synthetic */ ig f26992d;

    ih(ig igVar, C5312g c5312g, ij ijVar) {
        this.f26992d = igVar;
        this.f26990b = c5312g;
        this.f26991c = ijVar;
    }

    public final void run() {
        if (this.f26989a && this.f26992d.f26983a != null) {
            ig.m24797a(this.f26992d, this.f26992d.f26983a);
        }
        Object obj = (this.f26990b != null && this.f26990b.f26997d == this.f26991c.d && jl.m24921b(this.f26990b.f26996c, this.f26991c.c) && jl.m24921b(this.f26990b.f26995b, this.f26991c.b)) ? null : 1;
        if (obj != null) {
            Bundle bundle = new Bundle();
            ig.m24798a(this.f26991c, bundle);
            if (this.f26990b != null) {
                if (this.f26990b.f26995b != null) {
                    bundle.putString("_pn", this.f26990b.f26995b);
                }
                bundle.putString("_pc", this.f26990b.f26996c);
                bundle.putLong("_pi", this.f26990b.f26997d);
            }
            this.f26992d.mo4730d().m24776a("auto", "_vs", bundle);
        }
        this.f26992d.f26983a = this.f26991c;
        this.f26992d.mo4733g().m24827a(this.f26991c);
    }
}
