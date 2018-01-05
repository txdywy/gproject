package com.google.android.finsky.family.remoteescalation;

import android.content.Intent;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.h.a.ac;

final class C3092i implements Runnable {
    public final /* synthetic */ int f16022a;
    public final /* synthetic */ Intent f16023b;
    public final /* synthetic */ C3091h f16024c;

    C3092i(C3091h c3091h, int i, Intent intent) {
        this.f16024c = c3091h;
        this.f16022a = i;
        this.f16023b = intent;
    }

    public final void run() {
        if (this.f16022a == -1) {
            ac acVar = (ac) ParcelableProto.m21672a(this.f16023b, "approval");
            C3096n c3096n = (C3096n) this.f16024c.f.get(0);
            for (C3087j a : c3096n.f16033r) {
                if (a.mo3307a(acVar)) {
                    break;
                }
            }
            c3096n.m15648b();
        } else if (this.f16022a == 1 && this.f16024c.aj != null) {
            this.f16024c.bp.mo3657a(new Document(this.f16024c.aj.m), this.f16024c.bw);
        }
    }
}
