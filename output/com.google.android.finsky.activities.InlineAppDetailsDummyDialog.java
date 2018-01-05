package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.Bundle;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public final class InlineAppDetailsDummyDialog extends Activity
{

    InlineAppDetailsDummyDialog() {
        Activity();
    }

    public final Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public final AssetManager getAssets() {
        return com.google.b.a.a.a.a.a.c.b(this);
    }

    public final Resources getResources() {
        return com.google.b.a.a.a.a.a.c.a(this);
    }

    public final Resources$Theme getTheme() {
        return com.google.b.a.a.a.a.a.c.c(this);
    }

    protected final void onActivityResult(int p0, int p1, Intent p2) {
        this.setResult(p1);
        this.finish();
    }

    protected final void onCreate(Bundle p0) {
        super.onCreate(p0);
        if (p0 == 0)
            this.startActivityForResult(new Intent(this.getIntent()).setClass(this, InlineAppDetailsDialog), 0);
    }

    public final void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
