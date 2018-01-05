package com.google.android.finsky.cm;

import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.packagemanager.C0983h;
import p002a.C0002a;

public final class C2293a implements C0983h {
    public final C0002a f11321a;
    public final C0002a f11322b;
    public final C0002a f11323c;

    public C2293a(C0002a c0002a, C0002a c0002a2, C0002a c0002a3) {
        this.f11321a = c0002a;
        this.f11322b = c0002a2;
        this.f11323c = c0002a3;
    }

    public final void mo1175b(String str, boolean z) {
        ((ab) this.f11321a.mo1a()).mo3807c(str);
    }

    public final void mo1176c(String str, boolean z) {
        if (z) {
            ((ab) this.f11321a.mo1a()).mo3800b();
        } else {
            ((ab) this.f11321a.mo1a()).mo3782a(str);
            ((ab) this.f11321a.mo1a()).mo3802b(str);
        }
        if (((C1461c) this.f11323c.mo1a()).dj().mo2294a(12625988)) {
            ((C3300k) this.f11322b.mo1a()).mo3430a(new C2295b(this, str, z));
        } else {
            ((C3300k) this.f11322b.mo1a()).mo3449c(str, z);
        }
    }

    public final void mo1177d(String str) {
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }
}
