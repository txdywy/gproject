package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.am;

public final class hm {
    public String f26888a;
    public final String f26889b;
    public final String f26890c;
    public final long f26891d;
    public /* synthetic */ hj f26892e;

    hm(hj hjVar, String str, long j) {
        this.f26892e = hjVar;
        am.m23735a(str);
        am.m23742b(j > 0);
        this.f26888a = String.valueOf(str).concat(":start");
        this.f26889b = String.valueOf(str).concat(":count");
        this.f26890c = String.valueOf(str).concat(":value");
        this.f26891d = j;
    }

    final void m24687a() {
        this.f26892e.mo4728b();
        long a = this.f26892e.mo4735i().mo4629a();
        Editor edit = this.f26892e.f26864b.edit();
        edit.remove(this.f26889b);
        edit.remove(this.f26890c);
        edit.putLong(this.f26888a, a);
        edit.apply();
    }

    final long m24688b() {
        return this.f26892e.m24683t().getLong(this.f26888a, 0);
    }
}
