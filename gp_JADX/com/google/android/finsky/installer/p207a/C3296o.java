package com.google.android.finsky.installer.p207a;

import android.text.TextUtils;
import com.google.android.finsky.utils.ad;
import java.util.Arrays;

final class C3296o {
    public final String f17051a;
    public final String f17052b;
    public boolean f17053c = false;
    public boolean f17054d = false;

    public C3296o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Calling package and caller ID must not be empty");
        }
        this.f17051a = str;
        this.f17052b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3296o c3296o = (C3296o) obj;
        if (ad.m21692a(this.f17051a, c3296o.f17051a) && ad.m21692a(this.f17052b, c3296o.f17052b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17051a, this.f17052b});
    }

    public final String toString() {
        String str = this.f17051a;
        String str2 = this.f17052b;
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(":").append(str2).toString();
    }
}
