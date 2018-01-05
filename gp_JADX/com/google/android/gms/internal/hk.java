package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.am;

public final class hk {
    public final String f26878a;
    public final boolean f26879b = true;
    public boolean f26880c;
    public boolean f26881d;
    public /* synthetic */ hj f26882e;

    public hk(hj hjVar, String str) {
        this.f26882e = hjVar;
        am.m23735a(str);
        this.f26878a = str;
    }

    public final void m24684a(boolean z) {
        Editor edit = this.f26882e.f26864b.edit();
        edit.putBoolean(this.f26878a, z);
        edit.apply();
        this.f26881d = z;
    }
}
