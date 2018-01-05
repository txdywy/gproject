package com.google.android.finsky.notification;

import com.google.android.finsky.utils.ad;
import java.util.Arrays;

public final class C3778a {
    public String f18984a;
    public int f18985b;
    public C3820u f18986c;

    public C3778a(String str, int i, C3820u c3820u) {
        this.f18984a = str;
        this.f18985b = i;
        this.f18986c = c3820u;
    }

    public C3778a(C3778a c3778a) {
        this.f18984a = c3778a.f18984a;
        this.f18985b = c3778a.f18985b;
        this.f18986c = c3778a.f18986c == null ? null : new C3820u(c3778a.f18986c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3778a c3778a = (C3778a) obj;
        if (this.f18985b == c3778a.f18985b && ad.m21692a(this.f18984a, c3778a.f18984a) && ad.m21692a(this.f18986c, c3778a.f18986c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18985b), this.f18984a, this.f18986c});
    }

    public final String toString() {
        String str = this.f18984a;
        int i = this.f18985b;
        String valueOf = String.valueOf(this.f18986c);
        return new StringBuilder((String.valueOf(str).length() + 67) + String.valueOf(valueOf).length()).append("NotificationAction{mTitle='").append(str).append('\'').append(", mIconResId=").append(i).append(", mIntentData=").append(valueOf).append('}').toString();
    }
}
