package com.google.android.finsky.instantappsbackendclient.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public final class C3574a {
    public final Context f17854a;
    public final C3576c f17855b;

    C3574a(Context context, C3576c c3576c) {
        this.f17854a = context;
        this.f17855b = c3576c;
    }

    public final int m17147a() {
        m17150d();
        return m17152f().getInt("filter_level", 0);
    }

    public final int m17148b() {
        m17150d();
        return m17152f().getInt("authority", 0);
    }

    final void m17149c() {
        Bundle a = this.f17855b.m17164a();
        if (a == null) {
            m17152f().edit().putInt("filter_level", 0).putInt("authority", 0).apply();
        } else {
            m17152f().edit().putInt("filter_level", a.getInt("filter_level")).putInt("authority", a.getInt("authority")).apply();
        }
    }

    public final void m17150d() {
        if (m17151e()) {
            m17149c();
        }
    }

    public final boolean m17151e() {
        SharedPreferences f = m17152f();
        return (f.contains("filter_level") && f.contains("authority")) ? false : true;
    }

    final SharedPreferences m17152f() {
        return this.f17854a.getSharedPreferences("AIA-ContentFilterCache", 0);
    }
}
