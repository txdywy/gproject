package com.google.android.finsky.dy;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4678i;
import java.util.Arrays;

public final class ac {
    public final String f15487a;
    public final long f15488b;
    public final byte[] f15489c;
    public final long f15490d;
    public final boolean f15491e;
    public final boolean f15492f;
    public final String f15493g;
    public final boolean f15494h;
    public final int f15495i;
    public final int f15496j;
    public final String f15497k;
    public final String f15498l;
    public final long f15499m;
    public final long f15500n;
    public final boolean f15501o;
    public final String f15502p;
    public final String f15503q;
    public final int f15504r;
    public final boolean f15505s;
    public final long f15506t;
    public final boolean f15507u;
    public final byte[] f15508v;
    public final String[] f15509w;
    public final boolean f15510x;

    public ac(String str, byte[] bArr, long j, boolean z) {
        this.f15487a = str;
        this.f15488b = 0;
        this.f15489c = bArr;
        this.f15490d = j;
        this.f15491e = z;
        this.f15492f = false;
        this.f15493g = null;
        this.f15494h = false;
        this.f15495i = 8;
        this.f15496j = 0;
        this.f15497k = null;
        this.f15498l = null;
        this.f15499m = 0;
        this.f15500n = 0;
        this.f15501o = false;
        this.f15502p = null;
        this.f15503q = null;
        this.f15504r = 0;
        this.f15506t = 0;
        this.f15505s = m15214a();
        this.f15507u = false;
        this.f15508v = null;
        this.f15509w = null;
        this.f15510x = false;
    }

    public ac(String str, long j, byte[] bArr, long j2, boolean z, String str2, boolean z2, int i, int i2, String str3, String str4, long j3, String str5, String str6, boolean z3) {
        this.f15487a = str;
        this.f15488b = j;
        this.f15489c = bArr;
        this.f15490d = j2;
        this.f15491e = z;
        this.f15492f = false;
        this.f15493g = str2;
        this.f15494h = z2;
        this.f15495i = i;
        this.f15496j = i2;
        this.f15497k = str3;
        this.f15498l = str4;
        this.f15499m = j3;
        this.f15500n = 0;
        this.f15501o = false;
        this.f15502p = str5;
        this.f15503q = str6;
        this.f15504r = 0;
        this.f15506t = 0;
        this.f15505s = m15214a();
        this.f15507u = z3;
        this.f15508v = null;
        this.f15510x = false;
        this.f15509w = null;
    }

    public ac(String str, byte[] bArr, long j, boolean z, String str2, int i, String str3, String str4, long j2, String str5, String str6, long j3) {
        this.f15487a = str;
        this.f15488b = 0;
        this.f15489c = bArr;
        this.f15490d = j;
        this.f15491e = z;
        this.f15492f = false;
        this.f15493g = str2;
        this.f15494h = true;
        this.f15495i = -1;
        this.f15496j = i;
        this.f15497k = str3;
        this.f15498l = str4;
        this.f15499m = j2;
        this.f15500n = 0;
        this.f15501o = false;
        this.f15502p = str5;
        this.f15503q = str6;
        this.f15504r = 1;
        this.f15506t = j3;
        this.f15505s = m15214a();
        this.f15507u = false;
        this.f15508v = null;
        this.f15509w = null;
        this.f15510x = false;
    }

    public ac(String str, long j, byte[] bArr, long j2, boolean z, boolean z2, String str2, int i, String str3, String str4, long j3, String str5, String str6, int i2, long j4, boolean z3) {
        this.f15487a = str;
        this.f15488b = j;
        this.f15489c = bArr;
        this.f15490d = j2;
        this.f15491e = z;
        this.f15492f = z2;
        this.f15493g = str2;
        this.f15494h = true;
        this.f15495i = -1;
        this.f15496j = i;
        this.f15497k = str3;
        this.f15498l = str4;
        this.f15499m = j3;
        this.f15500n = 0;
        this.f15501o = false;
        this.f15502p = str5;
        this.f15503q = str6;
        this.f15504r = i2;
        this.f15506t = j4;
        this.f15505s = m15214a();
        this.f15507u = z3;
        this.f15508v = null;
        this.f15509w = null;
        this.f15510x = false;
    }

    public ac(String str, long j, byte[] bArr, long j2, boolean z, boolean z2, String str2, boolean z3, int i, int i2, String str3, String str4, long j3, long j4, boolean z4, String str5, String str6, int i3, long j5, boolean z5, byte[] bArr2, String[] strArr, boolean z6) {
        this.f15487a = str;
        this.f15488b = j;
        this.f15489c = bArr;
        this.f15490d = j2;
        this.f15491e = z;
        this.f15492f = z2;
        this.f15493g = str2;
        this.f15494h = z3;
        this.f15495i = i;
        this.f15496j = i2;
        this.f15497k = str3;
        this.f15498l = str4;
        this.f15499m = j3;
        this.f15500n = j4;
        this.f15501o = z4;
        this.f15502p = str5;
        this.f15503q = str6;
        this.f15504r = i3;
        this.f15506t = j5;
        this.f15505s = m15214a();
        this.f15507u = z5;
        this.f15508v = bArr2;
        this.f15509w = strArr;
        this.f15510x = z6;
    }

    private final boolean m15214a() {
        if (this.f15496j == 0 || this.f15504r <= 1) {
            return false;
        }
        if (Math.abs(this.f15506t - C4678i.m21812a()) > ((long) Math.min(Math.pow(2.0d, (double) (this.f15504r - 1)) * ((double) ((Long) C0955b.bS.m28964b()).longValue()), (double) ((Long) C0955b.bT.m28964b()).longValue()))) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        if (this.f15488b != acVar.f15488b) {
            return false;
        }
        if (this.f15490d != acVar.f15490d) {
            return false;
        }
        if (this.f15491e != acVar.f15491e) {
            return false;
        }
        if (this.f15492f != acVar.f15492f) {
            return false;
        }
        if (this.f15494h != acVar.f15494h) {
            return false;
        }
        if (this.f15495i != acVar.f15495i) {
            return false;
        }
        if (this.f15496j != acVar.f15496j) {
            return false;
        }
        if (this.f15499m != acVar.f15499m) {
            return false;
        }
        if (this.f15500n != acVar.f15500n) {
            return false;
        }
        if (this.f15501o != acVar.f15501o) {
            return false;
        }
        if (!this.f15487a.equals(acVar.f15487a)) {
            return false;
        }
        if (!Arrays.equals(this.f15489c, acVar.f15489c)) {
            return false;
        }
        if (this.f15493g == null ? acVar.f15493g != null : !this.f15493g.equals(acVar.f15493g)) {
            return false;
        }
        if (this.f15497k == null ? acVar.f15497k != null : !this.f15497k.equals(acVar.f15497k)) {
            return false;
        }
        if (this.f15504r != acVar.f15504r) {
            return false;
        }
        if (this.f15506t != acVar.f15506t) {
            return false;
        }
        if (this.f15498l != null) {
            return this.f15498l.equals(acVar.f15498l);
        }
        if (acVar.f15498l != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 1;
        int i3 = 0;
        int hashCode = ((this.f15491e ? 1 : 0) + (((((((this.f15487a.hashCode() * 31) + ((int) (this.f15488b ^ (this.f15488b >>> 32)))) * 31) + Arrays.hashCode(this.f15489c)) * 31) + ((int) (this.f15490d ^ (this.f15490d >>> 32)))) * 31)) * 31;
        if (this.f15492f) {
            i = 1;
        } else {
            i = 0;
        }
        hashCode = (i + hashCode) * 31;
        if (this.f15493g != null) {
            i = this.f15493g.hashCode();
        } else {
            i = 0;
        }
        hashCode = (i + hashCode) * 31;
        if (this.f15494h) {
            i = 1;
        } else {
            i = 0;
        }
        hashCode = (((((i + hashCode) * 31) + this.f15495i) * 31) + this.f15496j) * 31;
        if (this.f15497k != null) {
            i = this.f15497k.hashCode();
        } else {
            i = 0;
        }
        hashCode = (i + hashCode) * 31;
        if (this.f15498l != null) {
            i = this.f15498l.hashCode();
        } else {
            i = 0;
        }
        i = (((((i + hashCode) * 31) + ((int) (this.f15499m ^ (this.f15499m >>> 32)))) * 31) + ((int) (this.f15500n ^ (this.f15500n >>> 32)))) * 31;
        if (!this.f15501o) {
            i2 = 0;
        }
        i2 = (i + i2) * 31;
        if (this.f15502p != null) {
            i = this.f15502p.hashCode();
        } else {
            i = 0;
        }
        i = (i + i2) * 31;
        if (this.f15503q != null) {
            i3 = this.f15503q.hashCode();
        }
        return ((((i + i3) * 31) + this.f15504r) * 31) + ((int) (this.f15506t ^ (this.f15506t >>> 32)));
    }
}
