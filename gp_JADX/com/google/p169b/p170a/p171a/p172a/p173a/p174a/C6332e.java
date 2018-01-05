package com.google.p169b.p170a.p171a.p172a.p173a.p174a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;

public final class C6332e extends ContextWrapper {
    public C6332e(Context context) {
        super(context);
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
        C6331c.m28984a((Context) this, i);
    }
}
