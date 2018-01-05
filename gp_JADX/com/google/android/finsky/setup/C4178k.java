package com.google.android.finsky.setup;

import android.support.v4.p037h.C0320p;
import android.text.TextUtils;

public final class C4178k {
    public final C0320p f21100a;

    C4178k(String str, Integer num) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f21100a = new C0320p(str, num);
    }

    public final boolean m19500a() {
        return this.f21100a.f1762a != null;
    }

    public final boolean m19501b() {
        return ((Integer) this.f21100a.f1763b).intValue() != 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4178k) && ((C4178k) obj).f21100a.equals(this.f21100a);
    }

    public final int hashCode() {
        return this.f21100a.hashCode();
    }

    public final String toString() {
        return this.f21100a.toString();
    }
}
