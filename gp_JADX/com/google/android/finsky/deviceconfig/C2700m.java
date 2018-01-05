package com.google.android.finsky.deviceconfig;

import android.text.TextUtils;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.providers.C3947d;
import com.google.android.gcm.C4882b;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class C2700m implements Runnable {
    public C2701n f14855a;
    public C1289l f14856b;

    public C2700m() {
        ((C1377d) C3947d.m18649a(C1377d.class)).mo1814a(this);
    }

    public final void run() {
        C2701n c2701n = this.f14855a;
        ArrayDeque a = this.f14856b.m7700a(false);
        if (!TextUtils.isEmpty(C4882b.m22906b(c2701n.f14857a))) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                c2701n.m14579a((C1254c) it.next());
            }
        }
    }
}
