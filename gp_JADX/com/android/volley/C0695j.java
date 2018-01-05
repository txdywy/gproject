package com.android.volley;

import android.text.TextUtils;

public final class C0695j {
    public final String f4159a;
    public final String f4160b;

    public C0695j(String str, String str2) {
        this.f4159a = str;
        this.f4160b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0695j c0695j = (C0695j) obj;
        if (TextUtils.equals(this.f4159a, c0695j.f4159a) && TextUtils.equals(this.f4160b, c0695j.f4160b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4159a.hashCode() * 31) + this.f4160b.hashCode();
    }

    public final String toString() {
        String str = this.f4159a;
        String str2 = this.f4160b;
        return new StringBuilder((String.valueOf(str).length() + 20) + String.valueOf(str2).length()).append("Header[name=").append(str).append(",value=").append(str2).append("]").toString();
    }
}
