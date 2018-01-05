package com.google.android.finsky.au;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.finsky.cm.C2296c;
import com.google.android.finsky.p107l.C3646a;
import com.google.wireless.android.finsky.b.a;
import java.io.File;
import java.io.OutputStream;

public final class C1521c extends C1518d {
    public final C3646a f8221a;
    public final C2296c f8222b;
    public final Context f8223c;

    public C1521c(Context context, C3646a c3646a, C2296c c2296c, String str, String str2, a aVar) {
        super(str, str2, aVar.b, aVar.d, aVar.e, aVar.f, C1522e.m8908a(aVar), aVar.q);
        this.f8221a = c3646a;
        this.f8222b = c2296c;
        this.f8223c = context;
    }

    public final boolean mo2274a() {
        return true;
    }

    public final File mo2275b() {
        try {
            ApplicationInfo applicationInfo = this.f8223c.getPackageManager().getApplicationInfo(this.f, 0);
            String str = applicationInfo.sourceDir;
            String str2 = applicationInfo.publicSourceDir;
            if (TextUtils.isEmpty(str) || !str.equals(str2)) {
                return null;
            }
            return new File(str);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public final int mo2276c() {
        return this.f8221a.f18023c.mo2859g(this.f);
    }

    public final OutputStream mo2280e() {
        return this.f8222b.mo2839a(this.f, this.f, this.g);
    }

    public final void mo2278a(OutputStream outputStream) {
        this.f8222b.mo2840a(outputStream);
    }

    public final void mo2281f() {
        this.f8222b.mo2853b(this.f);
    }

    public final boolean mo2279a(boolean z) {
        return this.f8222b.mo2852a(z);
    }

    public final String mo2273a(String str) {
        return str;
    }

    public final boolean mo2282g() {
        return false;
    }

    public final boolean mo2277d() {
        return true;
    }
}
