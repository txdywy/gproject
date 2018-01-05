package com.google.android.finsky.cr;

import java.util.HashMap;

final class C2368e implements Runnable {
    public final /* synthetic */ String f11623a;
    public final /* synthetic */ HashMap f11624b;
    public final /* synthetic */ C2366c f11625c;

    C2368e(C2366c c2366c, String str, HashMap hashMap) {
        this.f11625c = c2366c;
        this.f11623a = str;
        this.f11624b = hashMap;
    }

    public final void run() {
        this.f11625c.f11617a.mo2870a(this.f11623a, this.f11624b);
    }
}
