package com.android.vending;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class AssetBrowserActivity extends Activity {
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3982a bK = C1473m.f7980a.bK();
        if (bK.mo3875b()) {
            bK.mo3879f();
            finish();
            return;
        }
        Intent intent = getIntent();
        intent.setClass(this, MainActivity.class);
        intent.setFlags(intent.getFlags() & -2097153);
        startActivity(intent);
        finish();
    }
}
