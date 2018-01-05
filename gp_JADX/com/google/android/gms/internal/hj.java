package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Pair;

final class hj extends hz {
    public static final Pair f26863a = new Pair("", Long.valueOf(0));
    public SharedPreferences f26864b;
    public final hm f26865c = new hm(this, "health_monitor", gj.m24447O());
    public final hl f26866d = new hl(this, "last_upload", 0);
    public final hl f26867e = new hl(this, "last_upload_attempt", 0);
    public final hl f26868f = new hl(this, "backoff", 0);
    public final hl f26869g = new hl(this, "last_delete_stale", 0);
    public final hl f26870h;
    public final hn f26871i;
    public final hl f26872j = new hl(this, "time_before_start", 10000);
    public final hl f26873k = new hl(this, "session_timeout", 1800000);
    public final hk f26874l = new hk(this, "start_new_session");
    public final hl f26875m = new hl(this, "last_pause_time", 0);
    public final hl f26876n = new hl(this, "time_active", 0);
    public boolean f26877o;

    hj(hv hvVar) {
        super(hvVar);
        hl hlVar = new hl(this, "midnight_offset", 0);
        this.f26870h = new hl(this, "first_open_time", 0);
        this.f26871i = new hn(this, "app_instance_id");
        Object obj = new Object();
    }

    final void m24680a(String str) {
        mo4728b();
        Editor edit = m24683t().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    final boolean m24681a(boolean z) {
        mo4728b();
        return m24683t().getBoolean("measurement_enabled", z);
    }

    protected final void mo4745s() {
        this.f26864b = mo4736j().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f26877o = this.f26864b.getBoolean("has_been_opened", false);
        if (!this.f26877o) {
            Editor edit = this.f26864b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
    }

    final SharedPreferences m24683t() {
        mo4728b();
        m24432x();
        return this.f26864b;
    }
}
