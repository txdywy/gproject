package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.p037h.C0305a;
import com.google.android.gms.common.util.C5147b;
import com.google.android.gms.measurement.C5312g;
import java.util.Map;

public final class gd extends hy {
    public final Map f26772a = new C0305a();
    public long f26773b;

    public gd(hv hvVar) {
        super(hvVar);
        C0305a c0305a = new C0305a();
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
    }

    public final void m24408a(long j) {
        C5312g t = mo4734h().m24819t();
        for (String str : this.f26772a.keySet()) {
            long longValue = j - ((Long) this.f26772a.get(str)).longValue();
            if (t == null) {
                mo4742p().f26851j.m24652a("Not logging ad unit exposure. No active activity");
            } else if (longValue < 1000) {
                mo4742p().f26851j.m24653a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(longValue));
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("_ai", str);
                bundle.putLong("_xt", longValue);
                ig.m24798a(t, bundle);
                mo4730d().m24776a("am", "_xu", bundle);
            }
        }
        if (!this.f26772a.isEmpty()) {
            long j2 = j - this.f26773b;
            if (t == null) {
                mo4742p().f26851j.m24652a("Not logging ad exposure. No active activity");
            } else if (j2 < 1000) {
                mo4742p().f26851j.m24653a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("_xt", j2);
                ig.m24798a(t, bundle2);
                mo4730d().m24776a("am", "_xa", bundle2);
            }
        }
        m24410b(j);
    }

    public final /* bridge */ /* synthetic */ void mo4728b() {
        super.mo4728b();
    }

    final void m24410b(long j) {
        for (String put : this.f26772a.keySet()) {
            this.f26772a.put(put, Long.valueOf(j));
        }
        if (!this.f26772a.isEmpty()) {
            this.f26773b = j;
        }
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
}
