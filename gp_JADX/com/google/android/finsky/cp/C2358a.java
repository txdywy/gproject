package com.google.android.finsky.cp;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.wireless.android.a.a.a.a.bd;

public final class C2358a {
    public final Context f11565a;
    public final C1463g f11566b;
    public final Handler f11567c;

    public C2358a(Context context, C1463g c1463g, Handler handler) {
        this.f11565a = context;
        this.f11566b = c1463g;
        this.f11567c = handler;
    }

    final void m11982a(int i, String str, Exception exception, PackageInfo packageInfo) {
        C2474c c2474c = new C2474c(147);
        c2474c.m13210a(i).m13236a(str);
        if (exception != null) {
            c2474c.m13238a((Throwable) exception);
        }
        if (packageInfo != null) {
            bd bdVar = new bd();
            String str2 = packageInfo.packageName;
            if (str2 == null) {
                throw new NullPointerException();
            }
            bdVar.a |= 1;
            bdVar.b = str2;
            int i2 = packageInfo.versionCode;
            bdVar.a |= 2;
            bdVar.c = i2;
            c2474c.f13342a.f31687M = bdVar;
        }
        this.f11566b.dc().m13319a(c2474c.f13342a, null);
    }
}
