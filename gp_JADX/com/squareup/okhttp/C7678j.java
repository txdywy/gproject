package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;

public final class C7678j {
    public final String f39714a;
    public final String f39715b;

    public C7678j(String str, String str2) {
        this.f39714a = str;
        this.f39715b = str2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7678j) && k.a(this.f39714a, ((C7678j) obj).f39714a) && k.a(this.f39715b, ((C7678j) obj).f39715b);
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        if (this.f39715b != null) {
            hashCode = this.f39715b.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + 899) * 31;
        if (this.f39714a != null) {
            i = this.f39714a.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.f39714a + " realm=\"" + this.f39715b + "\"";
    }
}
