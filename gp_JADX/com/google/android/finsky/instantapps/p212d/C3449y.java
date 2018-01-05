package com.google.android.finsky.instantapps.p212d;

import android.content.Context;
import android.content.SharedPreferences;

public final class C3449y {
    public final SharedPreferences f17624a;

    C3449y(Context context) {
        this.f17624a = context.getSharedPreferences("aia-lastAccountName", 0);
    }

    public final void m17006a(String str) {
        this.f17624a.edit().putString("lastAccountName", str).apply();
    }

    final String m17005a() {
        return this.f17624a.getString("lastAccountName", null);
    }
}
