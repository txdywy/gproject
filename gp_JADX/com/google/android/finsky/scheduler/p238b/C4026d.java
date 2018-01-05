package com.google.android.finsky.scheduler.p238b;

import android.support.v4.p037h.C0304u;
import android.support.v4.p037h.C0305a;
import com.google.android.finsky.scheduler.p236a.p237a.C4014c;
import com.google.android.finsky.scheduler.p236a.p237a.C4015d;
import com.google.android.finsky.scheduler.p236a.p237a.C4017f;
import com.google.android.finsky.utils.C4678i;
import java.util.Arrays;

public final class C4026d {
    public final C4017f f20249a;

    C4026d(C4017f c4017f) {
        this.f20249a = c4017f;
    }

    public final C4023a m18856a() {
        return new C4024b(this.f20249a.f20179g).m18841b();
    }

    public final C4028f[] m18857b() {
        C4028f[] c4028fArr = new C4028f[this.f20249a.f20181i.length];
        for (int i = 0; i < c4028fArr.length; i++) {
            c4028fArr[i] = new C4029g(this.f20249a.f20181i[i]).m18876b();
        }
        return c4028fArr;
    }

    public final int m18858c() {
        return this.f20249a.f20181i.length;
    }

    public final C4025c m18859d() {
        C4014c c4014c = this.f20249a.f20182j;
        if (c4014c == null || c4014c.f20162a == null) {
            return null;
        }
        C0304u c0305a = new C0305a(c4014c.f20162a.length);
        for (C4015d c4015d : c4014c.f20162a) {
            c0305a.put(c4015d.f20165c, c4015d.f20166d);
        }
        return new C4025c(c0305a);
    }

    public final boolean m18860e() {
        return C4678i.m21812a() > this.f20249a.f20178f + this.f20249a.f20179g.f20155c;
    }

    public final C4027e m18861f() {
        return new C4027e(this.f20249a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof C4026d)) {
            return false;
        }
        C4026d c4026d = (C4026d) obj;
        if (c4026d.f20249a.f20174b == this.f20249a.f20174b && c4026d.f20249a.f20176d == this.f20249a.f20176d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f20249a.f20176d, this.f20249a.f20174b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20249a);
        return new StringBuilder(String.valueOf(valueOf).length() + 30).append("JobParameters{mJobParameters=").append(valueOf).append('}').toString();
    }
}
