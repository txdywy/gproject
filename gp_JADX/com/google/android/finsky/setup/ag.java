package com.google.android.finsky.setup;

import android.net.Uri;
import java.util.Map;
import java.util.Map.Entry;

public final class ag implements Runnable {
    public final /* synthetic */ Runnable f20765a;
    public final /* synthetic */ af f20766b;

    public ag(af afVar, Runnable runnable) {
        this.f20766b = afVar;
        this.f20765a = runnable;
    }

    public final void run() {
        if (this.f20766b.f20764c) {
            this.f20765a.run();
            return;
        }
        this.f20766b.f20764c = true;
        Map a = this.f20766b.f20762a.mo2868a();
        if (!a.isEmpty()) {
            for (Entry entry : a.entrySet()) {
                String str = (String) entry.getKey();
                String decode = Uri.decode(str);
                ah a2 = af.m19185a(decode, (Map) entry.getValue());
                if (a2 == null) {
                    this.f20766b.f20762a.mo2869a(str);
                } else {
                    this.f20766b.f20763b.put(decode, a2);
                }
            }
        }
        this.f20765a.run();
    }
}
