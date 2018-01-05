package com.google.android.finsky.au;

import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.ae;
import com.google.wireless.android.finsky.b.f;
import java.io.File;

public abstract class C1519a extends C1518d {
    public final C3646a f8215a;
    public final String f8216b;

    public C1519a(String str, C3646a c3646a, String str2, ae aeVar) {
        f fVar;
        long j = aeVar.d;
        String str3 = aeVar.f;
        String str4 = aeVar.g;
        String str5 = aeVar.h;
        if (aeVar.k != null) {
            fVar = aeVar.k;
        } else if (aeVar.i.isEmpty()) {
            fVar = null;
        } else {
            fVar = new f().a(aeVar.e).a(aeVar.i).d();
        }
        super(str, str2, j, str3, str4, str5, fVar, aeVar.j);
        this.f8215a = c3646a;
        this.f8216b = aeVar.c;
    }

    public final boolean mo2274a() {
        return false;
    }

    public final File mo2275b() {
        FinskyLog.m21669e("getSourceFile called for %s (%s) is not supported for splits because patching is not yet supported", this.f, this.f8216b);
        return null;
    }

    public final int mo2276c() {
        return this.f8215a.f18023c.mo2859g(this.f);
    }

    public final String mo2273a(String str) {
        return str;
    }

    public final boolean mo2277d() {
        return true;
    }
}
