package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.packagemanager.C0983h;

final class be implements C0983h {
    public String f24445a;
    public boolean f24446b = false;

    be(String str) {
        this.f24445a = str;
    }

    public final void mo1175b(String str, boolean z) {
    }

    public final void mo1176c(String str, boolean z) {
    }

    public final void mo1177d(String str) {
        if (str.equals(this.f24445a)) {
            this.f24446b = true;
            synchronized (this) {
                notify();
            }
        }
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }
}
