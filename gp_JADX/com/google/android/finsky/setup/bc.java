package com.google.android.finsky.setup;

import android.net.Uri;
import java.util.Map;
import java.util.Map.Entry;

final class bc implements Runnable {
    public final /* synthetic */ Runnable f20861a;
    public final /* synthetic */ bb f20862b;

    bc(bb bbVar, Runnable runnable) {
        this.f20862b = bbVar;
        this.f20861a = runnable;
    }

    public final void run() {
        Map a = this.f20862b.f20852a.mo2868a();
        if (a.size() > 0) {
            for (Entry entry : a.entrySet()) {
                String str = (String) entry.getKey();
                String decode = Uri.decode(str);
                aw a2 = bb.m19251a(decode, (Map) entry.getValue());
                if (a2 == null) {
                    this.f20862b.f20852a.mo2869a(str);
                } else {
                    this.f20862b.f20854c.put(decode, a2);
                }
            }
        }
        this.f20861a.run();
    }
}
