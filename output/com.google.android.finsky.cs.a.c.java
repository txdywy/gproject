package com.google.android.finsky.cs.a;

import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.cs.a;
import com.google.android.finsky.cs.f;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.a.a.l;
import java.util.Map;

public final class com.google.android.finsky.cs.a.c implements com.google.android.finsky.cs.e
{

    public boolean a;
    public Map b;
    public Map c;
    public com.google.android.finsky.cs.a.f d;

    c() {
        ((com.google.android.finsky.cs.a.n)com.google.android.finsky.providers.d.a(com.google.android.finsky.cs.a.n)).a(this);
        if (((Boolean)com.google.android.finsky.aa.a.aA.a()).booleanValue())
            this.a = 1;
    }

    private static com.google.android.play.a.a.l a(com.google.android.finsky.cs.f p0) {
        if (p0 == 0)
            v0 = 0;
        else
            v0 = p0.b;
        return v0;
    }

    private static Object a(com.google.android.finsky.cs.f p0, String p1) {
        if (p0 == 0)
            v0 = 0;
        else
            v0 = p0.a.get(p1);
        return v0;
    }

    private final Object a(String p0, String p1, String p2, Class p3) {
        v2 = com.google.android.finsky.cs.a.a(p0, p1);
        if (this.a(v2))
            v0 = com.google.android.finsky.cs.a.c.a(this.d.b(p2), v2);
        else
            v0 = com.google.android.finsky.cs.a.c.a(this.d.a(), v2);
        if (this.a(v2))
            v1 = this.b.get(v2);
        else
            v1 = this.c.get(v2);
        if (v0 != 0) {
            try {
                v0 = p3.cast(v0);
            }
            catch (ClassCastException ex) {
                v4 = new Object[1];
                v4[0] = v2;
                FinskyLog.b(ex, "Unexpected experiment flag type found for flag %s", v4);
                v0 = p3.cast(v1);
            }
        }
        else {
            try {
                v0 = p3.cast(v1);
            }
            catch (ClassCastException ex) {
                v4 = new Object[1];
                v4[0] = v2;
                FinskyLog.b(ex, "Unexpected experiment flag type found for flag %s", v4);
                v0 = p3.cast(v1);
            }
        }
        return v0;
    }

    private final boolean a(String p0) {
        return this.b.containsKey(p0);
    }

    public final long a(String p0, String p1, String p2) {
        return ((Long)this.a(p0, p1, p2, Long)).longValue();
    }

    public final com.google.android.play.a.a.l b() {
        return com.google.android.finsky.cs.a.c.a(this.d.a());
    }

    public final boolean b(String p0, String p1, String p2) {
        return ((Boolean)this.a(p0, p1, p2, Boolean)).booleanValue();
    }

    public final boolean c() {
        return this.a;
    }

    public final void d() {
        com.google.android.finsky.aa.a.aA.a(Boolean.valueOf(0));
        this.a = 0;
    }

    public final String e(String p0) {
        return this.d.a(p0);
    }

    public final com.google.android.play.a.a.l f(String p0) {
        return com.google.android.finsky.cs.a.c.a(this.d.b(p0));
    }

}
