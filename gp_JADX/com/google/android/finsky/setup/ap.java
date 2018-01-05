package com.google.android.finsky.setup;

import android.net.Uri;
import java.util.Map;
import java.util.Map.Entry;

public final /* synthetic */ class ap implements Runnable {
    public final ao f20791a;
    public final Runnable f20792b;

    public ap(ao aoVar, Runnable runnable) {
        this.f20791a = aoVar;
        this.f20792b = runnable;
    }

    public final void run() {
        ao aoVar = this.f20791a;
        Runnable runnable = this.f20792b;
        if (!aoVar.f20790d) {
            aoVar.f20790d = true;
            Map a = aoVar.f20788b.mo2868a();
            if (!a.isEmpty()) {
                for (Entry entry : a.entrySet()) {
                    String str = (String) entry.getKey();
                    String decode = Uri.decode(str);
                    PackageSetupStatus a2 = aoVar.m19230a((Map) entry.getValue());
                    if (a2 == null) {
                        aoVar.f20788b.mo2869a(str);
                    } else {
                        aoVar.f20789c.put(decode, a2);
                    }
                }
            }
        }
        runnable.run();
    }
}
