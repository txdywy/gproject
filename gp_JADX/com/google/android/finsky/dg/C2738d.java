package com.google.android.finsky.dg;

import android.net.Uri;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4671b;

final class C2738d implements Runnable {
    public final /* synthetic */ C2736i f14968a;
    public final /* synthetic */ C2734a f14969b;

    C2738d(C2734a c2734a, C2736i c2736i) {
        this.f14969b = c2734a;
        this.f14968a = c2736i;
    }

    public final void run() {
        C2734a c2734a = this.f14969b;
        C2736i c2736i = this.f14968a;
        if (c2734a.m14775a()) {
            c2734a.m14779c(c2736i);
            return;
        }
        boolean isEmpty = c2734a.f14958a.isEmpty();
        c2734a.f14958a.add(c2736i);
        if (isEmpty) {
            Uri uriFor;
            if ((((Boolean) C0955b.bu.m28964b()).booleanValue() & (c2734a.f14965h.f8182f & C0327a.m1722b())) != 0) {
                uriFor = Global.getUriFor("tv_user_setup_complete");
            } else if (C4671b.m21784a()) {
                uriFor = Global.getUriFor("device_provisioned");
            } else {
                uriFor = Secure.getUriFor("device_provisioned");
            }
            c2734a.f14963f.registerContentObserver(uriFor, false, c2734a.f14961d);
        }
    }
}
