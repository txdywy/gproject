package com.google.android.finsky.cp;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.wireless.android.a.a.a.a.bd;
import com.google.wireless.android.a.a.a.a.bo;

final class com.google.android.finsky.cp.a
{

    public final Context a;
    public final com.google.android.finsky.d.g b;
    public final Handler c;

    a(Context p0, com.google.android.finsky.d.g p1, Handler p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    final void a(int p0, String p1, Exception p2, PackageInfo p3) {
        v0 = new com.google.android.finsky.d.c(147);
        v0.a(p0).a(p1);
        if (p2 != 0)
            v0.a(p2);
        if (p3 != 0) {
            v1 = new com.google.wireless.android.a.a.a.a.bd();
            if (p3.packageName == 0)
                throw new NullPointerException();
            v1.a = v1.a | 1;
            v1.b = p3.packageName;
            v1.a = v1.a | 2;
            v1.c = p3.versionCode;
            v0.a.M = v1;
        }
        this.b.dc().a(v0.a, 0);
    }

}
