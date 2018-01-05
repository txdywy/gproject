package com.google.android.finsky.dfemodel;

import com.google.android.finsky.api.C1254c;
import java.util.Arrays;

public abstract class C2712a extends C2711x {
    public Document f14908a;
    public C1254c f14909b;

    protected C2712a(C1254c c1254c, String str, boolean z) {
        super(str, z);
        this.f14909b = c1254c;
    }

    protected C2712a(C1254c c1254c, Document document, boolean z) {
        super(Arrays.asList(document.m14643b()), document.m14652g(), z);
        this.f14908a = document;
        this.f14909b = c1254c;
    }

    public final int mo3119b() {
        if (m14707c()) {
            return this.f14908a.f14885a.f12099f;
        }
        return 0;
    }

    public final boolean m14707c() {
        if (this.f14908a != null) {
            boolean z;
            if ((this.f14908a.f14885a.f12095b & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int mo3121d() {
        if (mo3122e()) {
            return this.f14908a.m14648e();
        }
        return 0;
    }

    public final boolean mo3122e() {
        return this.f14908a != null && this.f14908a.m14651f();
    }

    public void mo3118a(String str) {
        this.f14908a.m14645c();
        super.mo3118a(str);
    }

    protected final String mo3120b(Object obj) {
        if (this.f14908a == null) {
            return null;
        }
        return this.f14908a.m14652g();
    }
}
