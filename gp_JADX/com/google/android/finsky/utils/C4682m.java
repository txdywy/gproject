package com.google.android.finsky.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

public final class C4682m {
    @Deprecated
    public static Activity m21821a(Context context, Class cls) {
        Object obj = context;
        while ((obj instanceof ContextWrapper) && !cls.isInstance(obj)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return cls.isInstance(obj) ? (Activity) obj : null;
    }
}
