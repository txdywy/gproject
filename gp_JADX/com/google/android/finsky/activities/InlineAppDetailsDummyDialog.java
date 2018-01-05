package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public final class InlineAppDetailsDummyDialog extends Activity {
    public final Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public final AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public final Resources getResources() {
        return C6331c.m28981a(this);
    }

    public final Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            startActivityForResult(new Intent(getIntent()).setClass(this, InlineAppDetailsDialog.class), 0);
        }
    }

    protected final void onActivityResult(int i, int i2, Intent intent) {
        setResult(i2);
        finish();
    }
}
