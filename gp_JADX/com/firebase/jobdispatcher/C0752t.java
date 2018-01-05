package com.firebase.jobdispatcher;

import android.os.Bundle;

public final class C0752t implements C0751z {
    public final String f4692a;
    public final String f4693b;
    public final ag f4694c;
    public final am f4695d;
    public final int f4696e;
    public final boolean f4697f;
    public final int[] f4698g;
    public final boolean f4699h;
    public final Bundle f4700i;

    C0752t(C0753u c0753u) {
        Bundle bundle;
        int[] iArr;
        this.f4692a = c0753u.f4702b;
        if (c0753u.f4703c == null) {
            bundle = null;
        } else {
            bundle = new Bundle(c0753u.f4703c);
        }
        this.f4700i = bundle;
        this.f4693b = c0753u.f4704d;
        this.f4694c = c0753u.f4705e;
        this.f4695d = c0753u.f4708h;
        this.f4696e = c0753u.f4706f;
        this.f4697f = c0753u.f4710j;
        if (c0753u.f4707g != null) {
            iArr = c0753u.f4707g;
        } else {
            iArr = new int[0];
        }
        this.f4698g = iArr;
        this.f4699h = c0753u.f4709i;
    }

    public final int[] mo1118a() {
        return this.f4698g;
    }

    public final Bundle mo1119b() {
        return this.f4700i;
    }

    public final am mo1120c() {
        return this.f4695d;
    }

    public final boolean mo1121d() {
        return this.f4699h;
    }

    public final String mo1122e() {
        return this.f4693b;
    }

    public final ag mo1123f() {
        return this.f4694c;
    }

    public final int mo1124g() {
        return this.f4696e;
    }

    public final boolean mo1125h() {
        return this.f4697f;
    }

    public final String mo1126i() {
        return this.f4692a;
    }
}
