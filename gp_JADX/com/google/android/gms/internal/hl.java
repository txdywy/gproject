package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.am;

public final class hl {
    public final String f26883a;
    public final long f26884b;
    public boolean f26885c;
    public long f26886d;
    public /* synthetic */ hj f26887e;

    public hl(hj hjVar, String str, long j) {
        this.f26887e = hjVar;
        am.m23735a(str);
        this.f26883a = str;
        this.f26884b = j;
    }

    public final long m24685a() {
        if (!this.f26885c) {
            this.f26885c = true;
            this.f26886d = this.f26887e.f26864b.getLong(this.f26883a, this.f26884b);
        }
        return this.f26886d;
    }

    public final void m24686a(long j) {
        Editor edit = this.f26887e.f26864b.edit();
        edit.putLong(this.f26883a, j);
        edit.apply();
        this.f26886d = j;
    }
}
