package com.google.android.finsky.billing;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.wallet.common.pub.e;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class BillingService extends Service
{

    public final com.google.android.finsky.d.a a;
    public String b;

    BillingService() {
        Service();
        this.a = com.google.android.finsky.m.a.aR();
        new com.google.android.wallet.common.pub.e();
    }

    static Bundle a(int p0, com.google.android.finsky.d.w p1, String p2, Throwable p3) {
        p1.a(BillingService.a(p2, 0, p3).a(p0));
        v0 = new Bundle();
        v0.putInt("RESPONSE_CODE", p0);
        return v0;
    }

    static com.google.android.finsky.d.c a(String p0, boolean p1, Throwable p2) {
        return new com.google.android.finsky.d.c(375).c(p0).a(p1).a(p2);
    }

    final Signature a(String p0) {
        v0 = 0;
        try {
            v1 = this.getPackageManager().getPackageInfo(p0, 64).signatures;
            if (v1 != 0 && v1.length != 0)
                v0 = v1[0];
            return v0;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return v0;
        }
    }

    public Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public AssetManager getAssets() {
        return com.google.b.a.a.a.a.a.c.b(this);
    }

    public Resources getResources() {
        return com.google.b.a.a.a.a.a.c.a(this);
    }

    public Resources$Theme getTheme() {
        return com.google.b.a.a.a.a.a.c.c(this);
    }

    public IBinder onBind(Intent p0) {
        return new com.google.android.finsky.billing.e(this);
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
