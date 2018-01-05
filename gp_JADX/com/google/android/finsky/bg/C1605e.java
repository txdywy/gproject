package com.google.android.finsky.bg;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

final class C1605e extends ContextWrapper {
    public final /* synthetic */ Resources f8516a;

    C1605e(Context context, Resources resources) {
        this.f8516a = resources;
        super(context);
    }

    public final Resources getResources() {
        return this.f8516a;
    }
}
