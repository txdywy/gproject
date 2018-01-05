package com.google.android.instantapps.common.p217e;

final class C5739a extends bq {
    public final String f29027a;
    public final String f29028b;
    public final boolean f29029c;
    public final boolean f29030d;
    public final boolean f29031e;
    public final boolean f29032f;
    public final boolean f29033g;

    C5739a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f29027a = str;
        this.f29028b = str2;
        this.f29029c = z;
        this.f29030d = z2;
        this.f29031e = z3;
        this.f29032f = z4;
        this.f29033g = z5;
    }

    public final String mo5143a() {
        return this.f29027a;
    }

    public final String mo5144b() {
        return this.f29028b;
    }

    public final boolean mo5145c() {
        return this.f29029c;
    }

    public final boolean mo5146d() {
        return this.f29030d;
    }

    public final boolean mo5147e() {
        return this.f29031e;
    }

    public final boolean mo5148f() {
        return this.f29032f;
    }

    public final boolean mo5149g() {
        return this.f29033g;
    }

    public final String toString() {
        String str = this.f29027a;
        String str2 = this.f29028b;
        boolean z = this.f29029c;
        boolean z2 = this.f29030d;
        boolean z3 = this.f29031e;
        boolean z4 = this.f29032f;
        return new StringBuilder((String.valueOf(str).length() + 178) + String.valueOf(str2).length()).append("SpeedBumpSignals{loadingPackageName=").append(str).append(", callingPackageName=").append(str2).append(", optedInJustNow=").append(z).append(", isNfc=").append(z2).append(", isUserConfirmedLaunch=").append(z3).append(", isInternalNavigation=").append(z4).append(", isPreviouslyLaunched=").append(this.f29033g).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bq)) {
            return false;
        }
        bq bqVar = (bq) obj;
        if (this.f29027a.equals(bqVar.mo5143a()) && this.f29028b.equals(bqVar.mo5144b()) && this.f29029c == bqVar.mo5145c() && this.f29030d == bqVar.mo5146d() && this.f29031e == bqVar.mo5147e() && this.f29032f == bqVar.mo5148f() && this.f29033g == bqVar.mo5149g()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        int hashCode = ((this.f29029c ? 1231 : 1237) ^ ((((this.f29027a.hashCode() ^ 1000003) * 1000003) ^ this.f29028b.hashCode()) * 1000003)) * 1000003;
        if (this.f29030d) {
            i = 1231;
        } else {
            i = 1237;
        }
        hashCode = (i ^ hashCode) * 1000003;
        if (this.f29031e) {
            i = 1231;
        } else {
            i = 1237;
        }
        hashCode = (i ^ hashCode) * 1000003;
        if (this.f29032f) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = (i ^ hashCode) * 1000003;
        if (!this.f29033g) {
            i2 = 1237;
        }
        return i ^ i2;
    }
}
