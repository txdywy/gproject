package com.google.android.finsky.billing.lightpurchase.vr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.view.ViewGroup$LayoutParams;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.m;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.b.a;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class SwitchPurchaseContextActivity extends Activity
{

    SwitchPurchaseContextActivity() {
        Activity();
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

    protected void onActivityResult(int p0, int p1, Intent p2) {
        switch (p0) {
            case 1:
                this.setResult(p1, p2);
                super.finish();
                break;
            default:
                super.onActivityResult(p0, p1, p2);
                break;
        }
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        v1 = new FifeImageView(this);
        v1.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
        com.google.android.finsky.m.a.ar().a(v1, (String)com.google.android.finsky.aa.b.gR.b(), 1);
        this.setContentView(v1);
        if (p0 == 0)
            this.startActivityForResult((Intent)this.getIntent().getParcelableExtra("purchaseIntent"), 1);
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
