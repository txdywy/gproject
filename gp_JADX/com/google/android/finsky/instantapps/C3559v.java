package com.google.android.finsky.instantapps;

import android.content.Context;
import com.google.android.gms.common.api.Status;

final class C3559v implements Runnable {
    public final /* synthetic */ Status f17830a;
    public final /* synthetic */ C3558u f17831b;

    C3559v(C3558u c3558u, Status status) {
        this.f17831b = c3558u;
        this.f17830a = status;
    }

    public final void run() {
        Context context = this.f17831b.f17829a;
        if (this.f17830a.m23271a()) {
            context.f17337w.mo5136a(209);
            context.f17328F = null;
            context.f17325C.m17042a(context.f17328F);
            if (context.f17330H && context.f17327E != null) {
                context.f17326D = null;
                context.f17327E = null;
                context.f17323A = context.m16872l().m27152a();
                context.m16873m();
            }
            context.f17334t.f17395a.edit().clear().apply();
            if (context.getPackageManager().checkPermission("com.google.android.finsky.permission.INSTANT_APP_STATE", "com.google.android.gms") != 0) {
                InstantAppHygieneService.m16862a(context);
            }
        }
    }
}
