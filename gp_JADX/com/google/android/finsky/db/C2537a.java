package com.google.android.finsky.db;

import android.content.Context;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aa;

public final class C2537a {
    public Context f13591a;
    public String f13592b;
    public String f13593c;

    public C2537a(Context context) {
        this.f13591a = context;
    }

    public final synchronized String m13497a() {
        if (this.f13592b == null) {
            m13496c();
        }
        return this.f13592b;
    }

    public final synchronized String m13498b() {
        if (this.f13593c == null) {
            m13496c();
        }
        return this.f13593c;
    }

    private final synchronized void m13496c() {
        try {
            byte[] toByteArray = this.f13591a.getPackageManager().getPackageInfo(this.f13591a.getPackageName(), 64).signatures[0].toByteArray();
            this.f13592b = aa.m21683a(toByteArray);
            this.f13593c = C4688t.m21838a(toByteArray);
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Unable to find package info for %s", r1);
            this.f13592b = "signature-hash-NameNotFoundException";
            this.f13593c = "certificate-hash-NameNotFoundException";
        }
    }
}
