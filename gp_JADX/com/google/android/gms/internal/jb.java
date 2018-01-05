package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.C5147b;

public final class jb extends hz {
    public Handler f27038a;
    public long f27039b = mo4735i().mo4630b();
    public final gm f27040c = new jc(this, this.p);
    public final gm f27041d = new je(this, this.p);

    jb(hv hvVar) {
        super(hvVar);
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
    }

    public final boolean m24858a(boolean z) {
        mo4728b();
        m24432x();
        long b = mo4735i().mo4630b();
        mo4743q().f26875m.m24686a(mo4735i().mo4629a());
        long j = b - this.f27039b;
        if (z || j >= 1000) {
            mo4743q().f26876n.m24686a(j);
            mo4742p().f26851j.m24653a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            ig.m24798a(mo4734h().m24819t(), bundle);
            mo4730d().m24776a("auto", "_e", bundle);
            this.f27039b = b;
            this.f27041d.m24504c();
            this.f27041d.m24502a(Math.max(0, 3600000 - mo4743q().f26876n.m24685a()));
            return true;
        }
        mo4742p().f26851j.m24653a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    public final /* bridge */ /* synthetic */ void mo4728b() {
        super.mo4728b();
    }

    public final /* bridge */ /* synthetic */ gd mo4729c() {
        return super.mo4729c();
    }

    public final /* bridge */ /* synthetic */ ib mo4730d() {
        return super.mo4730d();
    }

    public final /* bridge */ /* synthetic */ gx mo4731e() {
        return super.mo4731e();
    }

    public final /* bridge */ /* synthetic */ go mo4732f() {
        return super.mo4732f();
    }

    public final /* bridge */ /* synthetic */ il mo4733g() {
        return super.mo4733g();
    }

    public final /* bridge */ /* synthetic */ ig mo4734h() {
        return super.mo4734h();
    }

    public final /* bridge */ /* synthetic */ C5147b mo4735i() {
        return super.mo4735i();
    }

    public final /* bridge */ /* synthetic */ Context mo4736j() {
        return super.mo4736j();
    }

    public final /* bridge */ /* synthetic */ gy mo4737k() {
        return super.mo4737k();
    }

    public final /* bridge */ /* synthetic */ ha mo4738l() {
        return super.mo4738l();
    }

    public final /* bridge */ /* synthetic */ jl mo4739m() {
        return super.mo4739m();
    }

    public final /* bridge */ /* synthetic */ jb mo4740n() {
        return super.mo4740n();
    }

    public final /* bridge */ /* synthetic */ hr mo4741o() {
        return super.mo4741o();
    }

    public final /* bridge */ /* synthetic */ hc mo4742p() {
        return super.mo4742p();
    }

    public final /* bridge */ /* synthetic */ hj mo4743q() {
        return super.mo4743q();
    }

    public final /* bridge */ /* synthetic */ gj mo4744r() {
        return super.mo4744r();
    }

    protected final void mo4745s() {
    }

    final void m24877t() {
        synchronized (this) {
            if (this.f27038a == null) {
                this.f27038a = new Handler(Looper.getMainLooper());
            }
        }
    }
}
