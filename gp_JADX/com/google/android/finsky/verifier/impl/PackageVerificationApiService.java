package com.google.android.finsky.verifier.impl;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.gms.common.C5107g;
import com.google.android.gms.internal.dr;
import com.google.android.p254g.p255a.C4739d;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class PackageVerificationApiService extends Service {
    public C1461c f24303a;
    public final C4739d f24304b = new aa(this);

    public PackageVerificationApiService() {
        ((ac) C3947d.m18649a(ac.class)).mo1973a(this);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    protected final boolean m21998a(int i) {
        boolean z;
        PackageManager packageManager = getPackageManager();
        C5107g a = C5107g.m23705a((Context) this);
        String[] packagesForUid = dr.f26667b.m24299a(a.f25971b).f26666a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            z = false;
        } else {
            for (String a2 : packagesForUid) {
                if (a.m23710a(a2)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (!z) {
            return false;
        }
        String[] packagesForUid2 = packageManager.getPackagesForUid(i);
        if (packagesForUid2 == null) {
            return false;
        }
        for (String equals : packagesForUid2) {
            if (equals.equals("com.google.android.gms")) {
                return true;
            }
        }
        return false;
    }

    public IBinder onBind(Intent intent) {
        return this.f24304b;
    }
}
