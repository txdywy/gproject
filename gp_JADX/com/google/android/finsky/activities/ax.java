package com.google.android.finsky.activities;

import android.support.design.widget.Snackbar;
import com.google.android.finsky.al.C1051j;
import com.google.android.finsky.al.C1221e;
import com.google.android.finsky.utils.be;
import com.google.android.play.utils.k;

final class ax implements C1051j {
    public final /* synthetic */ C1033t f6470a;

    ax(C1033t c1033t) {
        this.f6470a = c1033t;
    }

    public final /* synthetic */ boolean mo1308a(Object obj) {
        C1221e c1221e = (C1221e) obj;
        C1033t c1033t = this.f6470a;
        if (c1221e.f7349a == null || be.m21802a(c1221e.f7349a, k.a())) {
            c1033t.m6045a(c1221e);
            return true;
        }
        Snackbar.m500a(c1033t.getListView(), (CharSequence) "Malformed URL or non-SSL URL on release-key device. Re-flash your device to debug-keys for local DFE access", 0).m493a();
        return false;
    }
}
