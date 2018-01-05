package com.google.android.wallet.ui.p397d;

import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import com.google.android.wallet.p383e.C6617a;

public final class C6802e {
    public static int m30946a(ContextThemeWrapper contextThemeWrapper) {
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(new int[]{C6617a.uicPopupRedirectActivityTheme});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
