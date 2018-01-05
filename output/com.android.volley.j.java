package com.android.volley;

import android.text.TextUtils;

public final class com.android.volley.j
{

    public final String a;
    public final String b;

    j(String p0, String p1) {
        this.a = p0;
        this.b = p1;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (this != p0) {
            if (p0 == 0 || this.getClass() != p0.getClass())
                v0 = 0;
            else if ((!TextUtils.equals(this.a, ((com.android.volley.j)p0).a)) || !TextUtils.equals(this.b, ((com.android.volley.j)p0).b))
                v0 = 0;
        }
        return v0;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public final String toString() {
        return (String.valueOf(this.a).length() + 20 + String.valueOf(this.b).length()) + "Header[name=" + this.a + ",value=" + this.b + "]";
    }

}
