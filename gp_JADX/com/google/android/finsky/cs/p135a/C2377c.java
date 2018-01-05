package com.google.android.finsky.cs.p135a;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.cs.C2376e;
import com.google.android.finsky.cs.C2406a;
import com.google.android.finsky.cs.C2409f;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.p179a.p352a.C6201l;
import java.util.Map;

public abstract class C2377c implements C2376e {
    public boolean f11640a;
    public Map f11641b;
    public Map f11642c;
    public C2398f f11643d;

    public C2377c() {
        ((C1370n) C3947d.m18649a(C1370n.class)).mo1792a(this);
        if (((Boolean) C0954a.aA.m5760a()).booleanValue()) {
            this.f11640a = true;
        }
    }

    public final boolean mo2878c() {
        return this.f11640a;
    }

    public final void mo2879d() {
        C0954a.aA.m5763a(Boolean.valueOf(false));
        this.f11640a = false;
    }

    public final long mo2875a(String str, String str2, String str3) {
        return ((Long) m12033a(str, str2, str3, Long.class)).longValue();
    }

    public final boolean mo2877b(String str, String str2, String str3) {
        return ((Boolean) m12033a(str, str2, str3, Boolean.class)).booleanValue();
    }

    private final Object m12033a(String str, String str2, String str3, Class cls) {
        Object a;
        Object obj;
        String a2 = C2406a.m12110a(str, str2);
        if (mo2883a(a2)) {
            a = C2377c.m12032a(this.f11643d.m12092b(str3), a2);
        } else {
            a = C2377c.m12032a(this.f11643d.m12089a(), a2);
        }
        if (mo2883a(a2)) {
            obj = this.f11641b.get(a2);
        } else {
            obj = this.f11642c.get(a2);
        }
        if (a == null) {
            return cls.cast(obj);
        }
        try {
            return cls.cast(a);
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Unexpected experiment flag type found for flag %s", a2);
            return cls.cast(obj);
        }
    }

    private final boolean mo2883a(String str) {
        return this.f11641b.containsKey(str);
    }

    public final String mo2880e(String str) {
        return this.f11643d.m12090a(str);
    }

    public final C6201l mo2881f(String str) {
        return C2377c.m12031a(this.f11643d.m12092b(str));
    }

    public final C6201l mo2876b() {
        return C2377c.m12031a(this.f11643d.m12089a());
    }

    private static Object m12032a(C2409f c2409f, String str) {
        if (c2409f == null) {
            return null;
        }
        return c2409f.f11707a.get(str);
    }

    private static C6201l m12031a(C2409f c2409f) {
        if (c2409f == null) {
            return null;
        }
        return c2409f.f11708b;
    }
}
