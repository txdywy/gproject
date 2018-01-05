package com.google.android.finsky.download;

import android.net.Uri;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.HashSet;
import java.util.Set;

public class C2842e implements C2839b {
    public static final Set f15259a = new HashSet();
    public final String f15260b;
    public Uri f15261c;
    public final String f15262d;
    public final String f15263e;
    public final String f15264f;
    public final int f15265g;
    public String f15266h = null;
    public final Uri f15267i;
    public int f15268j;
    public C2845h f15269k;
    public int f15270l;
    public long f15271m;
    public final long f15272n;
    public final boolean f15273o;
    public final boolean f15274p;
    public Set f15275q;

    public C2842e(String str, String str2, String str3, String str4, int i, Uri uri, long j, long j2, boolean z, boolean z2, Set set) {
        this.f15260b = str;
        this.f15262d = str2;
        this.f15263e = str3;
        this.f15264f = str4;
        this.f15265g = i;
        this.f15267i = uri;
        this.f15271m = j;
        this.f15272n = j2;
        this.f15273o = z;
        this.f15274p = z2;
        this.f15275q = set;
        mo3148a(0);
    }

    public final C2845h mo3163m() {
        bb.m21791a();
        return this.f15269k;
    }

    public final long mo3164n() {
        bb.m21791a();
        return this.f15269k == null ? 0 : this.f15269k.f15277b;
    }

    public final void mo3150a(C2845h c2845h) {
        bb.m21791a();
        this.f15269k = c2845h;
        if (this.f15271m == -1 && c2845h != null && c2845h.f15278c > 0) {
            this.f15271m = c2845h.f15278c;
        }
    }

    public final String mo3147a() {
        return this.f15263e;
    }

    public final String mo3151b() {
        return this.f15264f;
    }

    public final String mo3154d() {
        return this.f15262d;
    }

    public final int mo3155e() {
        return this.f15265g;
    }

    public final boolean mo3165o() {
        return this.f15268j == 4 || this.f15268j == 5 || this.f15268j == 3;
    }

    public final String mo3153c() {
        return this.f15260b;
    }

    public final Uri mo3162l() {
        bb.m21791a();
        return this.f15261c;
    }

    public final void mo3149a(Uri uri) {
        this.f15261c = uri;
    }

    public final long mo3156f() {
        return this.f15272n;
    }

    public final int mo3166p() {
        bb.m21791a();
        return this.f15268j;
    }

    public final Uri mo3157g() {
        return this.f15267i;
    }

    public final Set mo3158h() {
        return this.f15275q;
    }

    public final synchronized String mo3159i() {
        if (this.f15266h == null) {
            this.f15266h = Uri.parse(this.f15260b).getQueryParameter("cpn");
            if (this.f15266h == null) {
                this.f15266h = "";
            }
        }
        return this.f15266h;
    }

    public final boolean mo3160j() {
        return this.f15274p;
    }

    public final boolean mo3161k() {
        return this.f15273o;
    }

    public final void mo3148a(int i) {
        if (mo3165o()) {
            throw new IllegalStateException("Received state update when already completed.");
        }
        if (this.f15268j == i) {
            FinskyLog.m21659a("Duplicate state set for '%s' (%d). Already in that state", this, Integer.valueOf(this.f15268j));
        } else {
            FinskyLog.m21659a("%s from %d to %d.", this, Integer.valueOf(this.f15268j), Integer.valueOf(i));
        }
        this.f15268j = i;
    }

    public int hashCode() {
        return this.f15260b.hashCode();
    }

    public final void mo3152b(int i) {
        this.f15270l = i;
    }

    public final int mo3167q() {
        return this.f15270l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2842e)) {
            return false;
        }
        return this.f15260b.equals(((C2842e) obj).f15260b);
    }

    public String mo3168r() {
        if (this.f15265g == 1) {
            return "com.android.vending";
        }
        return this.f15263e;
    }

    public String toString() {
        String r = mo3168r();
        if (this.f15264f == null) {
            return r;
        }
        return String.format("%s (node %s)", new Object[]{r, this.f15264f});
    }
}
