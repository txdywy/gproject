package com.google.android.finsky.installer.p207a;

import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.packagemanager.C3280e;

final class ap implements C3280e {
    public final /* synthetic */ C3647b f16941a;
    public final /* synthetic */ ah f16942b;

    ap(ah ahVar, C3647b c3647b) {
        this.f16942b = ahVar;
        this.f16941a = c3647b;
    }

    public final void mo3412a(String str, int i) {
        if (str.contentEquals(this.f16941a.f18026a)) {
            if (i != 1) {
                this.f16942b.m16439b(80, null);
                this.f16942b.m16423a(5, 981);
            } else {
                this.f16942b.m16439b(0, null);
            }
            this.f16942b.m16443c();
        }
    }
}
