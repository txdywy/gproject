package com.google.android.finsky.zapp;

import java.util.Objects;

final class C4845b implements C4844d {
    public final String f25140a;
    public final String f25141b;
    public final boolean f25142c;
    public final String f25143d;
    public final String f25144e;

    public C4845b(String str, String str2, boolean z, String str3, String str4) {
        this.f25140a = str;
        this.f25141b = str2;
        this.f25142c = z;
        this.f25143d = str3;
        this.f25144e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4845b)) {
            return false;
        }
        C4845b c4845b = (C4845b) obj;
        if (this.f25142c == c4845b.f25142c && Objects.equals(this.f25140a, c4845b.f25140a) && Objects.equals(this.f25141b, c4845b.f25141b) && Objects.equals(this.f25143d, c4845b.f25143d) && Objects.equals(this.f25144e, c4845b.f25144e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f25140a, this.f25141b, Boolean.valueOf(this.f25142c), this.f25143d, this.f25144e});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.f25140a);
        if (this.f25141b != null) {
            stringBuilder.append(":").append(this.f25141b);
        }
        if (this.f25142c) {
            stringBuilder.append(":permitMetered");
        }
        if (this.f25143d != null) {
            stringBuilder.append(":").append(this.f25143d);
        }
        if (this.f25144e != null) {
            stringBuilder.append(":").append(this.f25144e);
        }
        return stringBuilder.toString();
    }

    public final String mo4414a() {
        return this.f25140a;
    }

    public final String mo4415b() {
        return this.f25141b;
    }

    public final String mo4416c() {
        return this.f25143d;
    }

    public final String mo4417d() {
        return this.f25144e;
    }

    public final boolean mo4418e() {
        return this.f25142c;
    }
}
