package com.google.android.gms.ads.p239b;

import android.content.Context;

public class C4897g {
    public static C4897g f25254a;
    public final Context f25255b;

    private C4897g(Context context) {
        this.f25255b = context;
    }

    public static C4897g m22922a(Context context) {
        C4897g c4897g;
        synchronized (C4897g.class) {
            if (f25254a == null) {
                f25254a = new C4897g(context);
            }
            c4897g = f25254a;
        }
        return c4897g;
    }

    final void m22923a(C4893b c4893b, boolean z) {
        if (Math.random() <= ((double) new C4900j(this.f25255b).m22925b("gads:ad_id_use_shared_preference:ping_ratio"))) {
            new Thread(new C4898h(c4893b, z)).start();
        }
    }
}
