package com.google.android.gms.phenotype.core;

import android.util.Base64;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public final class C5516b {
    public final String f28352a;
    public final byte[] f28353b;
    public final String f28354c;
    public final C5514a[] f28355d;
    public final Map f28356e = new TreeMap();
    public final boolean f28357f;
    public final long f28358g;

    public C5516b(String str, String str2, C5514a[] c5514aArr, boolean z, byte[] bArr, long j) {
        this.f28352a = str;
        this.f28354c = str2;
        this.f28355d = c5514aArr;
        this.f28357f = z;
        this.f28353b = bArr;
        this.f28358g = j;
        for (C5514a c5514a : c5514aArr) {
            this.f28356e.put(Integer.valueOf(c5514a.f28339a), c5514a);
        }
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("Configurations('");
        stringBuilder.append(this.f28352a);
        stringBuilder.append('\'');
        stringBuilder.append(", ");
        stringBuilder.append('\'');
        stringBuilder.append(this.f28354c);
        stringBuilder.append('\'');
        stringBuilder.append(", ");
        stringBuilder.append('(');
        for (C5514a append : this.f28356e.values()) {
            stringBuilder.append(append);
            stringBuilder.append(", ");
        }
        stringBuilder.append(')');
        stringBuilder.append(", ");
        stringBuilder.append(this.f28357f);
        stringBuilder.append(", ");
        if (this.f28353b == null) {
            str = "null";
        } else {
            str = Base64.encodeToString(this.f28353b, 3);
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(this.f28358g);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5516b)) {
            return false;
        }
        C5516b c5516b = (C5516b) obj;
        if (C5534m.m26476a(this.f28352a, c5516b.f28352a) && C5534m.m26476a(this.f28354c, c5516b.f28354c) && this.f28356e.equals(c5516b.f28356e) && this.f28357f == c5516b.f28357f && Arrays.equals(this.f28353b, c5516b.f28353b) && this.f28358g == c5516b.f28358g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28352a, this.f28354c, this.f28356e, Boolean.valueOf(this.f28357f), this.f28353b, Long.valueOf(this.f28358g)});
    }
}
