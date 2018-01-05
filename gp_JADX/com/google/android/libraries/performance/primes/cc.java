package com.google.android.libraries.performance.primes;

import com.google.android.libraries.p326c.p327a.C5916a;

public final class cc {
    public final String f29866a;

    public static cc m27770a(String str) {
        return new cc((String) C5916a.m27406a((Object) str));
    }

    cc(String str) {
        this.f29866a = str;
    }

    public final String toString() {
        return this.f29866a;
    }

    public static String m27771a(cc ccVar) {
        return ccVar == null ? null : ccVar.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cc)) {
            return false;
        }
        return this.f29866a.equals(((cc) obj).f29866a);
    }

    public final int hashCode() {
        return this.f29866a.hashCode();
    }
}
