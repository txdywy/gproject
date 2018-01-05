package com.google.android.gms.phenotype.core;

public final class C5532k {
    public final String f28390a;
    public final String f28391b;
    public final C5530i f28392c;
    public final boolean f28393d = false;

    public C5532k(String str, String str2, C5530i c5530i) {
        this.f28390a = str;
        this.f28391b = str2;
        this.f28392c = c5530i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5532k)) {
            return false;
        }
        C5532k c5532k = (C5532k) obj;
        if (C5534m.m26476a(this.f28390a, c5532k.f28390a) && C5534m.m26476a(this.f28391b, c5532k.f28391b) && C5534m.m26476a(this.f28392c, c5532k.f28392c) && this.f28393d == c5532k.f28393d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return m26475a(new StringBuilder());
    }

    public final String m26475a(StringBuilder stringBuilder) {
        stringBuilder.append("FlagOverride(");
        stringBuilder.append(this.f28390a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f28391b);
        stringBuilder.append(", ");
        this.f28392c.m26470a(stringBuilder);
        stringBuilder.append(", ");
        stringBuilder.append(this.f28393d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
