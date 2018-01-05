package com.google.android.wallet.p366b;

import android.text.TextUtils;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.a.a.a.a.b.a.b.a.u;
import java.util.Arrays;
import java.util.Locale;

public final class C6515e {
    public final t f32578a;
    public final int f32579b;

    public C6515e(t tVar, int i) {
        this.f32578a = tVar;
        this.f32579b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6515e)) {
            return false;
        }
        C6515e c6515e = (C6515e) obj;
        if (this.f32579b == c6515e.f32579b && C6516f.m29565a(this.f32578a, c6515e.f32578a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((Integer.valueOf(this.f32579b).hashCode() * 29) + (Long.valueOf(this.f32578a.c).hashCode() * 31)) + (this.f32578a.d * 37);
        u c = C6516f.m29568c(this.f32578a);
        if (c == null) {
            return hashCode + 41;
        }
        if (c.a != null) {
            return hashCode + Arrays.hashCode(c.a);
        }
        if (!TextUtils.isEmpty(c.b)) {
            return hashCode + c.b.hashCode();
        }
        throw new IllegalArgumentException(String.format(Locale.US, "TriggerValueReference for component %d does not have a known value for newValue component value", new Object[]{Long.valueOf(this.f32578a.c)}));
    }
}
