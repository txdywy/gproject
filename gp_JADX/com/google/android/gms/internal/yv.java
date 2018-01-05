package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.p270c.C4909c;
import com.google.android.gms.common.C5105f;
import java.util.concurrent.Callable;

final class yv implements Callable {
    public /* synthetic */ Context f27769a;

    yv(Context context) {
        this.f27769a = context;
    }

    public final /* synthetic */ Object call() {
        ys ysVar = C4909c.m22927a().f25267g;
        Context context = this.f27769a;
        if (!ysVar.f27741c) {
            synchronized (ysVar.f27739a) {
                if (ysVar.f27741c) {
                } else {
                    try {
                        Context h = C5105f.m23698h(context);
                        if (h != null || context == null) {
                            context = h;
                        } else {
                            h = context.getApplicationContext();
                            if (h != null) {
                                context = h;
                            }
                        }
                        if (context == null) {
                        } else {
                            yr yrVar = C4909c.m22927a().f25266f;
                            ysVar.f27742d = context.getSharedPreferences("google_ads_flags", 0);
                            ysVar.f27741c = true;
                            ysVar.f27740b.open();
                        }
                    } finally {
                        ysVar.f27740b.open();
                    }
                }
            }
        }
        return null;
    }
}
