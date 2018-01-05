package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;

final class hd implements Runnable {
    public /* synthetic */ String f26852a;
    public /* synthetic */ hc f26853b;

    hd(hc hcVar, String str) {
        this.f26853b = hcVar;
        this.f26852a = str;
    }

    public final void run() {
        hz c = this.f26853b.p.m24760c();
        if (c.m24431w()) {
            hm hmVar = c.f26865c;
            String str = this.f26852a;
            hmVar.f26892e.mo4728b();
            if (hmVar.m24688b() == 0) {
                hmVar.m24687a();
            }
            if (str == null) {
                str = "";
            }
            long j = hmVar.f26892e.f26864b.getLong(hmVar.f26889b, 0);
            if (j <= 0) {
                Editor edit = hmVar.f26892e.f26864b.edit();
                edit.putString(hmVar.f26890c, str);
                edit.putLong(hmVar.f26889b, 1);
                edit.apply();
                return;
            }
            Object obj = (hmVar.f26892e.mo4739m().m24958u().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / (j + 1) ? 1 : null;
            Editor edit2 = hmVar.f26892e.f26864b.edit();
            if (obj != null) {
                edit2.putString(hmVar.f26890c, str);
            }
            edit2.putLong(hmVar.f26889b, j + 1);
            edit2.apply();
            return;
        }
        this.f26853b.m24630a(6, "Persisted config not initialized. Not logging error/warn");
    }
}
