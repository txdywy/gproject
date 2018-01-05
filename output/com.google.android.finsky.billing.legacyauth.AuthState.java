package com.google.android.finsky.billing.legacyauth;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.support.v4.c.a.a;
import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.e.e;
import com.google.android.finsky.providers.d;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.z;

public class AuthState implements Parcelable
{

    public static final Parcelable$Creator CREATOR;
    public final boolean a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final String f;
    public final String g;
    public final com.google.android.finsky.billing.e.e h;
    public Context i;
    public com.google.android.finsky.ba.c j;
    public boolean k;

    static {
        AuthState.CREATOR = new com.google.android.finsky.billing.legacyauth.h();
    }

    AuthState(boolean p0, String p1, String p2, int p3, boolean p4, boolean p5, String p6, String p7) {
        ((com.google.android.finsky.billing.legacyauth.j)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.legacyauth.j)).a(this);
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.h = new com.google.android.finsky.billing.e.e(android.support.v4.c.a.a.a(this.i));
        if (p4 != 0 && this.h.a())
            v0 = 1;
        else
            v0 = 0;
        this.k = v0;
        this.e = p5;
        this.f = p6;
        this.g = p7;
    }

    public final int a() {
        if (this.k != 0)
            v0 = 3;
        else if (this.a != 0)
            v0 = 2;
        else
            v0 = 1;
        return v0;
    }

    public final String a(String p0) {
        if (this.k != 0)
            throw new IllegalStateException("Call for fingerprint is not supported");
        if (this.a != 0)
            v0 = this.b;
        else
            v0 = ((String)com.google.android.finsky.aa.b.dc.b()).replace("%email%", p0);
        return v0;
    }

    public final com.google.wireless.android.a.a.a.a.z b() {
        if (this.k != 0)
            v0 = 3;
        else if (this.a != 0)
            v0 = 2;
        else
            v0 = 1;
        v1 = new com.google.wireless.android.a.a.a.a.z();
        v1.a(v0);
        if (this.e != 0)
            v1.d();
        return v1;
    }

    public final String b(String p0) {
        if (this.k != 0)
            throw new IllegalStateException("Call for fingerprint is not supported");
        if (this.a != 0 && this.j.j(p0).a(12603105) && !TextUtils.isEmpty(this.c))
            v0 = this.c;
        else if (this.a == 0 && this.j.j(p0).a(12606634) && !TextUtils.isEmpty(this.f))
            v0 = this.f;
        else
            v0 = this.a(p0);
        return v0;
    }

    public final int c() {
        if (this.k == 0)
            v0 = 2131951843;
        else if (this.a != 0)
            v0 = 2131953355;
        else
            v0 = 2131953354;
        return v0;
    }

    public final int d() {
        if (this.k != 0)
            v0 = 2131952200;
        else if (this.a != 0)
            v0 = 2131952848;
        else
            v0 = 2131952741;
        return v0;
    }

    public int describeContents() {
        return 0;
    }

    public final int e() {
        if (this.k != 0)
            throw new IllegalStateException("Call for fingerprint is not supported");
        if (this.a != 0)
            v0 = 2131952986;
        else
            v0 = 2131952743;
        return v0;
    }

    public final int f() {
        if (this.k != 0)
            throw new IllegalStateException("Call for fingerprint is not supported");
        if (this.a != 0)
            v0 = 2131952377;
        else
            v0 = 2131952375;
        return v0;
    }

    public void writeToParcel(Parcel p0, int p1) {
        v1 = 1;
        if (this.a != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.writeInt(v0);
        p0.writeString(this.b);
        p0.writeString(this.c);
        p0.writeInt(this.d);
        if (this.k != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.writeInt(v0);
        if (this.e == 0)
            v1 = 0;
        p0.writeInt(v1);
        p0.writeString(this.f);
        p0.writeString(this.g);
    }

}
