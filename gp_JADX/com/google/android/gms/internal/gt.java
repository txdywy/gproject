package com.google.android.gms.internal;

import com.google.android.gms.common.internal.am;

public final class gt {
    public final Object f26809a;
    public Object f26810b;

    private gt(cr crVar, Object obj) {
        am.m23733a((Object) crVar);
        this.f26809a = obj;
    }

    static gt m24524a(int i, int i2) {
        Integer.valueOf(i2);
        return new gt(cr.m24271b(), Integer.valueOf(i));
    }

    static gt m24525a(long j, long j2) {
        Long.valueOf(j2);
        return new gt(cr.m24269a(), Long.valueOf(j));
    }

    static gt m24526a(String str) {
        return new gt(cr.m24272c(), str);
    }

    static gt m24527a(boolean z, boolean z2) {
        return new gt(cr.m24270a(z2), Boolean.valueOf(z));
    }

    public final Object m24528a() {
        return this.f26810b != null ? this.f26810b : this.f26809a;
    }
}
