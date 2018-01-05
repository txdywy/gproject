package com.android.ex.photo.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class com.android.ex.photo.c.c
{

    public Drawable a;
    public Bitmap b;
    public int c;

    c() {
    }

    public final Drawable a(Resources p0) {
        if (p0 == 0)
            throw new IllegalArgumentException("resources can not be null!");
        if (this.a != 0)
            v0 = this.a;
        else if (this.b == 0)
            v0 = 0;
        else
            v0 = new BitmapDrawable(p0, this.b);
        return v0;
    }

}
