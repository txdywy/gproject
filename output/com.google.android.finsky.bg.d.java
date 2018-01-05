package com.google.android.finsky.bg;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.utils.bb;

protected final class com.google.android.finsky.bg.d extends LayoutInflater
{

    public static final String[] a;

    static {
        v0 = new String[3];
        v0[0] = "android.widget.";
        v0[1] = "android.webkit.";
        v0[2] = "android.app.";
        com.google.android.finsky.bg.d.a = v0;
    }

    d(Context p0) {
        LayoutInflater(p0);
    }

    public static com.google.android.finsky.bg.d a(Context p0) {
        v0 = p0.getResources();
        return new com.google.android.finsky.bg.d(new com.google.android.finsky.bg.e(p0, new Resources(p0.getAssets(), v0.getDisplayMetrics(), v0.getConfiguration())));
    }

    public final LayoutInflater cloneInContext(Context p0) {
        return new com.google.android.finsky.bg.d(p0);
    }

    public final View inflate(int p0, ViewGroup p1, boolean p2) {
        if (com.google.android.finsky.utils.bb.c())
            throw new IllegalStateException(String.valueOf(this.getClass().getName()).concat("'s inflate should not be called from the main thread."));
        try {
            v0 = super.inflate(p0, p1, p2);
        }
        catch (RuntimeException ex) {
            v0 = 0;
        }
        return v0;
    }

    protected final View onCreateView(String p0, AttributeSet p1) {
  4:    v1 = 0;
  5:    if (v1 >= com.google.android.finsky.bg.d.a.length) {
 21:        v0 = super.onCreateView(p0, p1);
 25:        return v0;
        }
  9:    v0 = this.createView(p0, com.google.android.finsky.bg.d.a[v1], p1);
 13:    if (v0 != 0)
 15:        return v0;
 19:    v1 = v1 + 1;
 20:    goto 5;
 26:    try
            run 9...12
        catch (ClassNotFoundException ex) {
  9:        goto 16;
        }
    }

}
