package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.p037h.C0305a;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.C5147b;
import com.google.android.gms.measurement.C5312g;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ig extends hz {
    public ij f26983a;
    public volatile C5312g f26984b;
    public C5312g f26985c;
    public long f26986d;
    public final Map f26987e = new C0305a();
    public final CopyOnWriteArrayList f26988f = new CopyOnWriteArrayList();

    public ig(hv hvVar) {
        super(hvVar);
    }

    static String m24796a(String str) {
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return str.substring(0, 36);
        }
        String str2 = split[split.length - 1];
        return str2.length() > 36 ? str2.substring(0, 36) : str2;
    }

    public static void m24798a(C5312g c5312g, Bundle bundle) {
        if (bundle != null && c5312g != null && !bundle.containsKey("_sc")) {
            if (c5312g.f26995b != null) {
                bundle.putString("_sn", c5312g.f26995b);
            }
            bundle.putString("_sc", c5312g.f26996c);
            bundle.putLong("_si", c5312g.f26997d);
        }
    }

    final ij m24799a(Activity activity) {
        am.m23733a((Object) activity);
        ij ijVar = (ij) this.f26987e.get(activity);
        if (ijVar != null) {
            return ijVar;
        }
        ijVar = new ij(m24796a(activity.getClass().getCanonicalName()), mo4739m().m24957t());
        this.f26987e.put(activity, ijVar);
        return ijVar;
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
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

    public final ij m24819t() {
        m24432x();
        mo4728b();
        return this.f26983a;
    }

    static /* synthetic */ void m24797a(ig igVar, ij ijVar) {
        igVar.mo4729c().m24408a(igVar.mo4735i().mo4630b());
        if (igVar.mo4740n().m24858a(ijVar.f26998a)) {
            ijVar.f26998a = false;
        }
    }
}
