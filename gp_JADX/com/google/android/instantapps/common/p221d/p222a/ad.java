package com.google.android.instantapps.common.p221d.p222a;

import android.app.ApplicationErrorReport.CrashInfo;
import com.google.android.instantapps.p309a.C5699f;
import com.google.android.p306h.p307a.p308a.C5670g;
import com.google.android.p306h.p307a.p308a.C5678o;

public final class ad {
    public final int f28908a;
    public CrashInfo f28909b;
    public C5670g f28910c;
    public boolean f28911d;
    public Runnable f28912e;
    public C5678o f28913f;
    public long f28914g;
    public boolean f28915h;

    public ad(int i) {
        this.f28908a = i;
    }

    public final ad m26988a(Runnable runnable) {
        this.f28911d = true;
        this.f28912e = runnable;
        return this;
    }

    public final ac m26987a() {
        if (this.f28915h) {
            C5699f.m26960a(this.f28909b, (Object) "Cannot set the crash-redirected flag if there was no CrashInfo.");
        }
        return new ac(this.f28909b, this.f28910c, this.f28911d, this.f28912e, this.f28913f, this.f28914g, this.f28908a, this.f28915h);
    }
}
