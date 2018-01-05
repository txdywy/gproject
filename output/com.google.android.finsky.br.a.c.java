package com.google.android.finsky.br.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.finsky.api.l;
import com.google.android.finsky.as.a;
import com.google.android.finsky.bn.c;
import com.google.android.finsky.br.b;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.l.a;
import com.google.android.finsky.l.b;

public final class com.google.android.finsky.br.a.c extends com.google.android.finsky.br.a.h
{

    public final com.google.android.finsky.br.a.a a;

    c(com.google.android.finsky.br.a.a p0) {
        this.a = p0;
        com.google.android.finsky.br.a.h(0);
    }

    private static Intent a(Context p0, Document p1, String p2, String p3) {
        v0 = p0.getPackageManager().getLaunchIntentForPackage("com.android.vending");
        v0.setAction(p2);
        v0.setFlags(268435456);
        com.google.android.finsky.br.a.c.a(v0, "account", p3);
        v0.putExtra("asset_package", p1.N().k);
        return v0;
    }

    public final Intent a(Context p0, Document p1, String p2) {
        v2 = p1.N().k;
        v0 = this.a.e.a(v2);
        if (v0 != 0 && v0.d != 0)
            v0 = v0.d.n;
        else
            v0 = 0;
        v1 = p0.getPackageManager();
        if (!TextUtils.isEmpty(v0))
            v0 = com.google.android.finsky.br.a.a.b(v1, this.a.a(v2, v0));
        else
            v0 = 0;
        if (v0 == 0) {
            if (com.google.android.finsky.as.a.a(this.a.a))
                v0 = v1.getLeanbackLaunchIntentForPackage(v2);
            else
                v0 = v1.getLaunchIntentForPackage(v2);
            if (v0 == 0)
                v0 = this.a.c.a(this.a.a, v2, 0, 0, com.google.android.finsky.api.l.a(v2), this.a.b.a(0));
        }
        if (v0 == 0)
            v0 = com.google.android.finsky.br.a.c.a(p0, p1, "android.intent.action.RUN", p2);
        v0.setFlags(268435456);
        return v0;
    }

    public final Intent a(Context p0, String p1) {
        v0 = new Intent("com.google.android.finsky.VIEW_MY_DOWNLOADS");
        v0.setClass(p0, com.google.android.finsky.br.a.j.a());
        v0.setFlags(268435456);
        com.google.android.finsky.br.a.c.a(v0, "account", p1);
        return v0;
    }

    public final String a() {
        return "com.android.vending";
    }

    public final Intent b(Context p0, Document p1, String p2) {
        return com.google.android.finsky.br.a.c.a(p0, p1, "android.intent.action.VIEW", p2);
    }

}
