package com.android.ex.photo;

import android.os.Build$VERSION;

public final class com.android.ex.photo.k implements View$OnSystemUiVisibilityChangeListener
{

    public final com.android.ex.photo.j a;

    k(com.android.ex.photo.j p0) {
        this.a = p0;
    }

    public final void onSystemUiVisibilityChange(int p0) {
        if (Build$VERSION.SDK_INT >= 19 && p0 == 0 && this.a.d == 3846)
            this.a.a(0, 1);
    }

}
