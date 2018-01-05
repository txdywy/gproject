package com.google.android.finsky.setup;

import android.net.Uri;
import java.util.Map;
import java.util.Map.Entry;

final class bd implements Runnable {
    public final /* synthetic */ Runnable f20863a;
    public final /* synthetic */ bb f20864b;

    bd(bb bbVar, Runnable runnable) {
        this.f20864b = bbVar;
        this.f20863a = runnable;
    }

    public final void run() {
        Map a = this.f20864b.f20853b.mo2868a();
        if (a.size() > 0) {
            for (Entry entry : a.entrySet()) {
                String str = (String) entry.getKey();
                String decode = Uri.decode(str);
                ay b = bb.m19254b(decode, (Map) entry.getValue());
                if (b == null) {
                    this.f20864b.f20853b.mo2869a(str);
                } else {
                    this.f20864b.f20855d.put(decode, b);
                }
            }
        }
        this.f20863a.run();
    }
}
