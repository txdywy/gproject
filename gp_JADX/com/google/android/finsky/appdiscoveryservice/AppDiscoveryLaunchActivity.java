package com.google.android.finsky.appdiscoveryservice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.eq;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2476e;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.a.a.a.a.br;

public class AppDiscoveryLaunchActivity extends Activity {
    public C2471a f7737a;
    public C2495w f7738b;

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

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1320b) C3947d.m18649a(C1320b.class)).mo1707a(this);
        Intent intent = getIntent();
        if (intent == null) {
            FinskyLog.m21667d("No intent found.", new Object[0]);
            finish();
            return;
        }
        String valueOf = String.valueOf(intent);
        FinskyLog.m21662b(new StringBuilder(String.valueOf(valueOf).length() + 25).append("Found suggestion intent: ").append(valueOf).toString(), new Object[0]);
        Uri data = intent.getData();
        if (data == null) {
            FinskyLog.m21667d("Failed to obtain intent URI.", new Object[0]);
            finish();
            return;
        }
        this.f7738b = this.f7737a.m13180a(bundle, intent);
        if (this.f7738b != null) {
            String stringExtra = intent.getStringExtra("callingPackageName");
            C2476e c2476e = new C2476e(12);
            if (intent.hasExtra("callingPackageName")) {
                c2476e.f13346a.a(stringExtra);
            }
            if (intent.hasExtra("callingVersionCode")) {
                br brVar = c2476e.f13346a;
                int intExtra = intent.getIntExtra("callingVersionCode", -1);
                brVar.a |= eq.FLAG_MOVED;
                brVar.m = intExtra;
            }
            if (intent.hasExtra("serverLogsCookie")) {
                c2476e.m13263a(intent.getByteArrayExtra("serverLogsCookie"));
            }
            this.f7738b.m13369a(c2476e);
            int i = 1;
            if (!data.toString().startsWith("https://play.google.com/store/apps/details")) {
                i = 24;
            }
            this.f7738b.m13369a(new C2476e(i));
        } else {
            FinskyLog.m21667d("Failed to create logging context.", new Object[0]);
        }
        startActivity(new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(getIntent().getData()));
        finish();
    }
}
