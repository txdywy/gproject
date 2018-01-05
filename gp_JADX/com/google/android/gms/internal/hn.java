package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.am;

public final class hn {
    public final String f26893a;
    public boolean f26894b;
    public String f26895c;
    public /* synthetic */ hj f26896d;

    public hn(hj hjVar, String str) {
        this.f26896d = hjVar;
        am.m23735a(str);
        this.f26893a = str;
    }

    public final void m24689a(String str) {
        if (!jl.m24921b(str, this.f26895c)) {
            Editor edit = this.f26896d.f26864b.edit();
            edit.putString(this.f26893a, str);
            edit.apply();
            this.f26895c = str;
        }
    }
}
