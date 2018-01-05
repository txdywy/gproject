package com.google.android.finsky.splitinstallservice;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class ay {
    public final Context f21224a;

    ay(Context context) {
        this.f21224a = context;
    }

    public final synchronized int m19571a() {
        int i;
        SharedPreferences sharedPreferences = this.f21224a.getSharedPreferences("SplitSessionIdGenerator", 0);
        i = sharedPreferences.getInt("Latest", 0) + 1;
        Editor edit = sharedPreferences.edit();
        edit.putInt("Latest", i);
        edit.commit();
        return i;
    }
}
