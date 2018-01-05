package com.google.android.finsky.dc;

import com.google.android.finsky.packagemanager.C2294c;
import com.google.android.finsky.utils.FinskyLog;

final class C2565k implements C2294c {
    public final /* synthetic */ C2564j f13679a;

    C2565k(C2564j c2564j) {
        this.f13679a = c2564j;
    }

    public final void mo2836a() {
        FinskyLog.m21669e("Unexpected install success for %s", this.f13679a.f13676a);
    }

    public final void mo2837a(int i, Throwable th) {
        this.f13679a.f13678c.f13668l.m13367a(this.f13679a.f13678c.m13558b(111).m13210a(i).m13238a(th));
    }
}
