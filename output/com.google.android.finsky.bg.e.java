package com.google.android.finsky.bg;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

public final class com.google.android.finsky.bg.e extends ContextWrapper
{

    public final Resources a;

    e(Context p0, Resources p1) {
        this.a = p1;
        ContextWrapper(p0);
    }

    public final Resources getResources() {
        return this.a;
    }

}
