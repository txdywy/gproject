package com.google.android.gms.ads.p239b;

import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class C4898h implements Runnable {
    public final C4893b f25256a;
    public final boolean f25257b;

    C4898h(C4893b c4893b, boolean z) {
        this.f25256a = c4893b;
        this.f25257b = z;
    }

    public final void run() {
        int i;
        C4893b c4893b = this.f25256a;
        boolean z = this.f25257b;
        Map hashMap = new HashMap();
        if (c4893b == null) {
            i = -1;
        } else {
            i = c4893b.f25246a.length();
        }
        hashMap.put("ad_id_size", Integer.toString(i));
        hashMap.put("hasGmscore", z ? "1" : "0");
        hashMap.put("tag", "AdvertisingIdLightClient");
        C4901k c4901k = new C4901k();
        C4901k.m22926a(hashMap);
    }
}
