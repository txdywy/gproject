package com.firebase.jobdispatcher;

import android.os.Bundle;
import java.util.Arrays;
import org.json.JSONObject;

final class C0755x implements C0751z {
    public final String f4712a;
    public final String f4713b;
    public final ag f4714c;
    public final boolean f4715d;
    public final int f4716e;
    public final int[] f4717f;
    public final Bundle f4718g;
    public final am f4719h;
    public final boolean f4720i;
    public final ap f4721j;

    C0755x(C0756y c0756y) {
        this.f4712a = c0756y.f4722a;
        this.f4713b = c0756y.f4723b;
        this.f4714c = c0756y.f4724c;
        this.f4719h = c0756y.f4729h;
        this.f4715d = c0756y.f4725d;
        this.f4716e = c0756y.f4726e;
        this.f4717f = c0756y.f4727f;
        this.f4718g = c0756y.f4728g;
        this.f4720i = c0756y.f4730i;
        this.f4721j = c0756y.f4731j;
    }

    public final String mo1126i() {
        return this.f4713b;
    }

    public final String mo1122e() {
        return this.f4712a;
    }

    public final ag mo1123f() {
        return this.f4714c;
    }

    public final int mo1124g() {
        return this.f4716e;
    }

    public final boolean mo1125h() {
        return this.f4715d;
    }

    public final int[] mo1118a() {
        return this.f4717f;
    }

    public final Bundle mo1119b() {
        return this.f4718g;
    }

    public final am mo1120c() {
        return this.f4719h;
    }

    public final boolean mo1121d() {
        return this.f4720i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C0755x c0755x = (C0755x) obj;
        if (this.f4712a.equals(c0755x.f4712a) && this.f4713b.equals(c0755x.f4713b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4712a.hashCode() * 31) + this.f4713b.hashCode();
    }

    public final String toString() {
        String quote = JSONObject.quote(this.f4712a);
        String str = this.f4713b;
        String valueOf = String.valueOf(this.f4714c);
        boolean z = this.f4715d;
        int i = this.f4716e;
        String arrays = Arrays.toString(this.f4717f);
        String valueOf2 = String.valueOf(this.f4718g);
        String valueOf3 = String.valueOf(this.f4719h);
        boolean z2 = this.f4720i;
        String valueOf4 = String.valueOf(this.f4721j);
        return new StringBuilder(((((((String.valueOf(quote).length() + 159) + String.valueOf(str).length()) + String.valueOf(valueOf).length()) + String.valueOf(arrays).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("JobInvocation{tag='").append(quote).append('\'').append(", service='").append(str).append('\'').append(", trigger=").append(valueOf).append(", recurring=").append(z).append(", lifetime=").append(i).append(", constraints=").append(arrays).append(", extras=").append(valueOf2).append(", retryStrategy=").append(valueOf3).append(", replaceCurrent=").append(z2).append(", triggerReason=").append(valueOf4).append('}').toString();
    }
}
