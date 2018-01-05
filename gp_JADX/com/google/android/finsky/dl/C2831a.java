package com.google.android.finsky.dl;

import android.os.Build;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0968o;

public final class C2831a {
    public volatile boolean f15220a = false;
    public final int f15221b;

    public C2831a(int i) {
        this.f15221b = i;
    }

    public final boolean m14979a() {
        if (this.f15220a) {
            return true;
        }
        Object obj = Build.FINGERPRINT;
        if (obj.equals((String) C0968o.f5928e.m5760a())) {
            return false;
        }
        this.f15220a = true;
        C0968o.f5928e.m5763a(obj);
        return true;
    }

    public final boolean m14980b() {
        if (((Integer) C0954a.f5832b.m5760a()).intValue() == this.f15221b) {
            return false;
        }
        C0954a.f5832b.m5763a(Integer.valueOf(this.f15221b));
        return true;
    }
}
