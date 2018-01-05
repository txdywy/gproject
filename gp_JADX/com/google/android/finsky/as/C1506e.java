package com.google.android.finsky.as;

import android.content.Context;
import com.google.android.gms.common.C5106e;

public final class C1506e {
    public final Context f8194a;
    public Boolean f8195b = null;
    public Boolean f8196c = null;
    public Boolean f8197d = null;
    public Integer f8198e = null;

    public C1506e(Context context) {
        this.f8194a = context;
    }

    public final synchronized boolean m8838a() {
        boolean z = false;
        boolean z2 = true;
        synchronized (this) {
            if (this.f8195b == null) {
                if (m8840c() && m8842e() && C1503a.m8831b(this.f8194a)) {
                    if (6 != m8843f()) {
                        z2 = false;
                    }
                    this.f8195b = Boolean.valueOf(z2);
                } else if (C1503a.m8830a(this.f8194a)) {
                    if (4 != m8843f()) {
                        z2 = false;
                    }
                    this.f8195b = Boolean.valueOf(z2);
                } else if (m8840c()) {
                    if (3 != m8843f()) {
                        z2 = false;
                    }
                    this.f8195b = Boolean.valueOf(z2);
                } else if (C1503a.m8831b(this.f8194a)) {
                    if (5 != m8843f()) {
                        z2 = false;
                    }
                    this.f8195b = Boolean.valueOf(z2);
                } else if (C1503a.m8833d(this.f8194a)) {
                    if (7 != m8843f()) {
                        z2 = false;
                    }
                    this.f8195b = Boolean.valueOf(z2);
                } else if (m8842e()) {
                    if (2 == m8843f() || 3 == m8843f() || m8843f() == 0) {
                        z = true;
                    }
                    this.f8195b = Boolean.valueOf(z);
                } else {
                    if (m8843f() == 0 || 1 == m8843f()) {
                        z = true;
                    }
                    this.f8195b = Boolean.valueOf(z);
                }
            }
            z = this.f8195b.booleanValue();
        }
        return z;
    }

    public final boolean m8839b() {
        return 3 == m8843f() && m8840c();
    }

    public final synchronized boolean m8840c() {
        if (this.f8196c == null) {
            this.f8196c = Boolean.valueOf(C5106e.m23704c(this.f8194a));
        }
        return this.f8196c.booleanValue();
    }

    public final boolean m8841d() {
        return (2 == m8843f() || 6 == m8843f()) && m8842e();
    }

    public final synchronized boolean m8842e() {
        if (this.f8197d == null) {
            this.f8197d = Boolean.valueOf(this.f8194a.getPackageManager().hasSystemFeature("com.google.android.feature.services_updater"));
        }
        return this.f8197d.booleanValue();
    }

    public final int m8843f() {
        if (this.f8198e == null) {
            this.f8198e = Integer.valueOf(0);
        }
        return this.f8198e.intValue();
    }
}
