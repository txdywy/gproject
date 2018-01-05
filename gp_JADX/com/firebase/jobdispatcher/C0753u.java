package com.firebase.jobdispatcher;

import android.os.Bundle;
import com.firebase.jobdispatcher.ValidationEnforcer.ValidationException;
import java.util.List;

public final class C0753u implements C0751z {
    public final ValidationEnforcer f4701a;
    public String f4702b;
    public Bundle f4703c;
    public String f4704d;
    public ag f4705e = ao.f4673a;
    public int f4706f = 1;
    public int[] f4707g;
    public am f4708h = am.f4669a;
    public boolean f4709i = false;
    public boolean f4710j = false;

    C0753u(ValidationEnforcer validationEnforcer) {
        this.f4701a = validationEnforcer;
    }

    C0753u(ValidationEnforcer validationEnforcer, C0751z c0751z) {
        this.f4701a = validationEnforcer;
        this.f4704d = c0751z.mo1122e();
        this.f4702b = c0751z.mo1126i();
        this.f4705e = c0751z.mo1123f();
        this.f4710j = c0751z.mo1125h();
        this.f4706f = c0751z.mo1124g();
        this.f4707g = c0751z.mo1118a();
        this.f4703c = c0751z.mo1119b();
        this.f4708h = c0751z.mo1120c();
    }

    public final C0753u m4879a(int i) {
        Object obj = new int[(this.f4707g == null ? 1 : this.f4707g.length + 1)];
        if (!(this.f4707g == null || this.f4707g.length == 0)) {
            System.arraycopy(this.f4707g, 0, obj, 0, this.f4707g.length);
        }
        obj[obj.length - 1] = i;
        this.f4707g = obj;
        return this;
    }

    public final C0752t m4890j() {
        List a = this.f4701a.mo1109a(this);
        if (a == null) {
            return new C0752t(this);
        }
        throw new ValidationException("JobParameters is invalid", a);
    }

    public final String mo1126i() {
        return this.f4702b;
    }

    public final C0753u m4880a(Class cls) {
        this.f4702b = cls.getName();
        return this;
    }

    public final String mo1122e() {
        return this.f4704d;
    }

    public final ag mo1123f() {
        return this.f4705e;
    }

    public final int mo1124g() {
        return this.f4706f;
    }

    public final boolean mo1125h() {
        return this.f4710j;
    }

    public final int[] mo1118a() {
        return this.f4707g == null ? new int[0] : this.f4707g;
    }

    public final Bundle mo1119b() {
        return this.f4703c;
    }

    public final am mo1120c() {
        return this.f4708h;
    }

    public final boolean mo1121d() {
        return this.f4709i;
    }
}
