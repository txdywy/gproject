package com.google.android.finsky.wear;

import android.text.TextUtils;
import com.google.android.finsky.p111d.C2482j;
import com.google.wireless.android.a.a.a.a.cv;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;

public final class C4789j {
    public final bo f24995a = C2482j.m13310e();
    public String f24996b;
    public C4784e f24997c;

    public C4789j(int i, C4784e c4784e) {
        this.f24997c = c4784e;
        this.f24995a.m28992a(i);
        this.f24995a.f31682H = new cv();
    }

    public final C4789j m22535a(String str) {
        if (!TextUtils.isEmpty(str)) {
            cv cvVar = this.f24995a.f31682H;
            if (str == null) {
                throw new NullPointerException();
            }
            cvVar.a |= 2;
            cvVar.c = str;
        }
        return this;
    }

    public final C4789j m22537b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f24995a.m28994a(str);
        }
        return this;
    }

    public final C4789j m22538c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f24995a.m28999b(str);
        }
        return this;
    }

    public final C4789j m22533a(int i) {
        if (i != 0) {
            this.f24995a.m28998b(i);
        }
        return this;
    }

    public final C4789j m22539d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f24995a.m29000c(str);
        }
        return this;
    }

    public final C4789j m22534a(t tVar) {
        this.f24995a.f31712l = tVar;
        return this;
    }

    public final bo m22536a() {
        if (this.f24995a.f31712l == null) {
            this.f24995a.f31712l = new t();
        }
        t tVar = this.f24995a.f31712l;
        tVar.a |= 128;
        tVar.i = true;
        if (!TextUtils.isEmpty(this.f24996b) && this.f24997c.m22523b()) {
            C4788i b = this.f24997c.m22522b(this.f24996b);
            if (b != null) {
                cv cvVar = this.f24995a.f31682H;
                String str = b.f24982m;
                if (str == null) {
                    throw new NullPointerException();
                }
                cvVar.a |= 1;
                cvVar.b = str;
            }
        }
        return this.f24995a;
    }
}
