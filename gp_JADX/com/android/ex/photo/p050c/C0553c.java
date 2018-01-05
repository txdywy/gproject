package com.android.ex.photo.p050c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class C0553c {
    public Drawable f3751a;
    public Bitmap f3752b;
    public int f3753c;

    public final Drawable m4076a(Resources resources) {
        if (resources == null) {
            throw new IllegalArgumentException("resources can not be null!");
        } else if (this.f3751a != null) {
            return this.f3751a;
        } else {
            if (this.f3752b == null) {
                return null;
            }
            return new BitmapDrawable(resources, this.f3752b);
        }
    }
}
