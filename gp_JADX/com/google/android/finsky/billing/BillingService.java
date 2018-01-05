package com.google.android.finsky.billing;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.wallet.common.pub.e;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class BillingService extends Service {
    public final C2471a f8583a = C1473m.f7980a.aR();
    public String f8584b;

    public BillingService() {
        e eVar = new e();
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

    public IBinder onBind(Intent intent) {
        return new C1830e(this);
    }

    final Signature m9353a(String str) {
        Signature signature = null;
        try {
            Signature[] signatureArr = getPackageManager().getPackageInfo(str, 64).signatures;
            if (!(signatureArr == null || signatureArr.length == 0)) {
                signature = signatureArr[0];
            }
        } catch (NameNotFoundException e) {
        }
        return signature;
    }

    static C2474c m9352a(String str, boolean z, Throwable th) {
        return new C2474c(375).m13247c(str).m13239a(z).m13238a(th);
    }

    static /* synthetic */ Bundle m9351a(int i, C2495w c2495w, String str, Throwable th) {
        c2495w.m13367a(m9352a(str, false, th).m13210a(i));
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", i);
        return bundle;
    }
}
