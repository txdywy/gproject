package com.google.android.finsky.instantapps.appmanagement;

import android.content.Context;
import android.content.SharedPreferences;

public final class C3403w {
    public SharedPreferences f17419a;

    C3403w(Context context) {
        this.f17419a = context.getSharedPreferences("visitedInstantApps", 0);
    }

    public final boolean m16903a(String str) {
        return this.f17419a.contains(str);
    }
}
