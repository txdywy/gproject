package com.google.android.finsky.billing.lightpurchase.vr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.play.image.FifeImageView;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class SwitchPurchaseContextActivity extends Activity {
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
        FifeImageView fifeImageView = new FifeImageView(this);
        fifeImageView.setLayoutParams(new LayoutParams(-1, -1));
        C1473m.f7980a.ar().m9288a(fifeImageView, (String) C0955b.gR.m28964b(), true);
        setContentView(fifeImageView);
        if (bundle == null) {
            startActivityForResult((Intent) getIntent().getParcelableExtra("purchaseIntent"), 1);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 1:
                setResult(i2, intent);
                super.finish();
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }
}
