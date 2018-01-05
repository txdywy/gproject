package com.google.android.finsky.p113v;

import android.view.ViewGroup;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.providers.C3947d;

public final class C4695b {
    public final C1042d f24082a;
    public final ViewGroup f24083b;
    public ViewGroup f24084c;
    public C3037a f24085d;
    public C1611k f24086e;

    public C4695b(C1042d c1042d, ViewGroup viewGroup) {
        ((C1449e) C3947d.m18649a(C1449e.class)).mo1971a(this);
        this.f24082a = c1042d;
        this.f24083b = viewGroup;
    }

    public final void m21845a() {
        if (this.f24084c != null) {
            this.f24084c.setVisibility(8);
            this.f24084c.removeAllViews();
            if (this.f24085d != null) {
                this.f24085d.mo3276a();
                this.f24085d = null;
            }
        }
    }
}
