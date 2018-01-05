package com.google.android.finsky.cs.p135a;

import android.text.TextUtils;
import com.google.android.finsky.cs.C2409f;
import com.google.android.finsky.utils.ab;
import com.google.android.play.p179a.p352a.C6201l;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.dz;
import java.util.HashMap;
import java.util.Map;

public final class C2398f {
    public final C2401i f11692a;
    public boolean f11693b;
    public boolean f11694c;
    public boolean f11695d;
    public C2409f f11696e;
    public final Map f11697f = new HashMap();
    public final Map f11698g = new HashMap();

    C2398f(C2401i c2401i) {
        this.f11692a = c2401i;
    }

    public final String m12090a(String str) {
        String str2;
        synchronized (this.f11698g) {
            if (!this.f11698g.containsKey(str)) {
                this.f11698g.put(str, m12088c(str));
            }
            str2 = (String) this.f11698g.get(str);
        }
        return str2;
    }

    private final String m12088c(String str) {
        String str2 = null;
        synchronized (this.f11698g) {
            C0757i c0757i;
            C2409f b = m12092b(str);
            C2409f a = m12089a();
            if (b == null && a == null) {
                c0757i = null;
            } else {
                String str3;
                c0757i = new dz();
                if (!(b == null || TextUtils.isEmpty(b.f11709c))) {
                    str3 = b.f11709c;
                    if (str3 == null) {
                        throw new NullPointerException();
                    }
                    c0757i.a |= 1;
                    c0757i.b = str3;
                }
                if (!(a == null || TextUtils.isEmpty(a.f11709c))) {
                    str3 = a.f11709c;
                    if (str3 == null) {
                        throw new NullPointerException();
                    }
                    c0757i.a |= 2;
                    c0757i.c = str3;
                }
            }
            if (c0757i != null) {
                str2 = ab.m21687b(c0757i);
            }
            this.f11698g.put(str, str2);
        }
        return str2;
    }

    public final C2409f m12089a() {
        C2409f c2409f;
        synchronized (this) {
            if (!this.f11693b) {
                if (this.f11694c) {
                    throw new IllegalStateException("Cannot utilize process stable experiments while loading process stable experiments!");
                }
                try {
                    this.f11694c = true;
                    this.f11696e = this.f11692a.m12099a("experiment-flags-process-stable");
                    this.f11693b = true;
                    this.f11694c = false;
                } catch (Throwable th) {
                    this.f11694c = false;
                }
            }
            c2409f = this.f11696e;
        }
        return c2409f;
    }

    public final C2409f m12092b(String str) {
        C2409f c2409f;
        synchronized (this.f11697f) {
            c2409f = (C2409f) this.f11697f.get(str);
            if (c2409f == null) {
                if (this.f11695d) {
                    throw new IllegalStateException("Cannot utilize regular experiments while loading regular experiments!");
                }
                try {
                    this.f11695d = true;
                    c2409f = this.f11692a.m12099a(C2401i.m12098b(str));
                    this.f11697f.put(str, c2409f);
                    this.f11695d = false;
                } catch (Throwable th) {
                    this.f11695d = false;
                }
            }
        }
        return c2409f;
    }

    public final boolean m12091a(C2374e c2374e, C6201l c6201l, String str) {
        C2409f a = C2401i.m12095a(c2374e, c6201l, this.f11692a.f11701a.getFilesDir(), C2401i.m12098b(str));
        if (a == null) {
            return false;
        }
        synchronized (this.f11697f) {
            this.f11697f.put(str, a);
            m12088c(str);
        }
        return true;
    }
}
