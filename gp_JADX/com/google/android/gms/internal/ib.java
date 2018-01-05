package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.C5147b;
import com.google.android.gms.measurement.C5339b;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

public final class ib extends hz {
    public C5311if f26959a;
    public C5339b f26960b;
    public final Set f26961c = new CopyOnWriteArraySet();
    public boolean f26962d;
    public final AtomicReference f26963e = new AtomicReference();

    protected ib(hv hvVar) {
        super(hvVar);
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
    }

    final void m24774a(String str) {
        this.f26963e.set(str);
    }

    final void m24775a(String str, String str2, long j, Object obj) {
        mo4741o().m24733a(new id(this, str, str2, obj, j));
    }

    public final void m24776a(String str, String str2, Bundle bundle) {
        boolean z;
        Bundle bundle2;
        mo4727a();
        if (this.f26960b == null || jl.m24922c(str2)) {
            z = true;
        } else {
            z = false;
        }
        long a = mo4735i().mo4629a();
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
            for (String str3 : bundle2.keySet()) {
                Object obj = bundle2.get(str3);
                if (obj instanceof Bundle) {
                    bundle2.putBundle(str3, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (r3 = 0; r3 < parcelableArr.length; r3++) {
                        if (parcelableArr[r3] instanceof Bundle) {
                            parcelableArr[r3] = new Bundle((Bundle) parcelableArr[r3]);
                        }
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (r3 = 0; r3 < arrayList.size(); r3++) {
                        Object obj2 = arrayList.get(r3);
                        if (obj2 instanceof Bundle) {
                            arrayList.set(r3, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
        }
        mo4741o().m24733a(new ic(this, str, str2, a, bundle2, z));
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

    public final byte[] m24777a(String str, String str2, String str3, Bundle bundle) {
        mo4727a();
        am.m23735a(str3);
        am.m23735a(str2);
        am.m23733a((Object) bundle);
        long a = mo4735i().mo4629a();
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str2);
        AtomicReference atomicReference = new AtomicReference();
        zzcqw com_google_android_gms_internal_zzcqw = new zzcqw(str3, new zzcqt(bundle), str2, a);
        synchronized (atomicReference) {
            this.p.m24762e().m24733a(new ie(this, atomicReference, com_google_android_gms_internal_zzcqw, str));
            try {
                atomicReference.wait(10000);
            } catch (InterruptedException e) {
                mo4742p().f26847f.m24653a("Interrupted waiting for log and bundle", e);
            }
        }
        byte[] bArr = (byte[]) atomicReference.get();
        if (bArr != null) {
            return bArr;
        }
        mo4742p().f26847f.m24652a("Timed out waiting for log and bundle");
        return new byte[0];
    }
}
