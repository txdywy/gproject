package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import android.content.Context;
import com.google.vr.a.a.m;
import com.google.vr.b.a.c;
import java.util.HashMap;
import java.util.Map;

final class C1989z implements Runnable {
    public final /* synthetic */ C1986w f10109a;

    C1989z(C1986w c1986w) {
        this.f10109a = c1986w;
    }

    public final void run() {
        c cVar = this.f10109a.f10101e;
        String str = "finsky";
        Context applicationContext = this.f10109a.f10099c.getApplicationContext();
        Map hashMap = new HashMap();
        hashMap.put("context", applicationContext);
        hashMap.put("pathPrefix", "lullaby/");
        try {
            cVar.b.a(str, m.a(hashMap));
            try {
                this.f10109a.f10101e.b.b("finsky:textures/texture_atlas.bin");
                C1986w.f10097a.post(new aa(this));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }
}
