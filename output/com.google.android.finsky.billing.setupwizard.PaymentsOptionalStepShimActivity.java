package com.google.android.finsky.billing.setupwizard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.Bundle;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.billing.promptforfop.SetupWizardPromptForFopActivity;
import com.google.android.finsky.m;
import com.google.android.finsky.setup.cs;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class PaymentsOptionalStepShimActivity extends Activity
{

    PaymentsOptionalStepShimActivity() {
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

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        v0 = SetupWizardPromptForFopActivity.a(com.google.android.finsky.m.a.U().d()[0]);
        v0.putExtras(this.getIntent());
        v0.addFlags(33554432);
        this.startActivity(v0);
        this.finish();
        com.google.android.finsky.setup.cs.a(this, 0);
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
