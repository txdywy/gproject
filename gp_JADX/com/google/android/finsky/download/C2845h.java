package com.google.android.finsky.download;

import android.net.Uri;
import com.google.android.finsky.utils.ad;

public final class C2845h {
    public final Uri f15276a;
    public final long f15277b;
    public final long f15278c;
    public final int f15279d;
    public final String f15280e;

    public C2845h(Uri uri, String str, long j, long j2, int i) {
        this.f15276a = uri;
        this.f15280e = str;
        this.f15277b = j;
        this.f15278c = j2;
        this.f15279d = i;
    }

    public final String toString() {
        long j = this.f15277b;
        long j2 = this.f15278c;
        return j + "/" + j2 + " Status: " + this.f15279d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2845h)) {
            return false;
        }
        C2845h c2845h = (C2845h) obj;
        if (this.f15277b == c2845h.f15277b && this.f15278c == c2845h.f15278c && this.f15279d == c2845h.f15279d && ad.m21692a(this.f15280e, c2845h.f15280e) && ad.m21692a(this.f15276a, c2845h.f15276a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15276a.hashCode();
    }
}
