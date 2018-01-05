package com.google.android.finsky.instantapps.appmanagement;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.instantapps.common.p217e.bf;

public final class C3394m {
    public final SharedPreferences f17395a;
    public final bf f17396b;
    public final bf f17397c;

    C3394m(Context context, bf bfVar, bf bfVar2) {
        this.f17395a = context.getSharedPreferences("aiaGoToWebTracker", 0);
        this.f17396b = bfVar;
        this.f17397c = bfVar2;
    }

    public final void m16894a(String str) {
        this.f17395a.edit().remove(str).apply();
    }
}
