package com.android.volley.a;

import android.content.Context;
import android.graphics.Bitmap$Config;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.android.volley.r;
import java.util.HashMap;
import java.util.LinkedList;

public class com.android.volley.a.ab extends ImageView
{

    public String a;
    public int b;
    public int c;
    public com.android.volley.a.q d;
    public com.android.volley.a.w e;

    ab(Context p0) {
        com.android.volley.a.ab(p0, 0);
    }

    ab(Context p0, AttributeSet p1) {
        com.android.volley.a.ab(p0, p1, 0);
    }

    ab(Context p0, AttributeSet p1, int p2) {
        ImageView(p0, p1, p2);
    }

    private final void a() {
        if (this.b != 0)
            this.setImageResource(this.b);
        else
            this.setImageBitmap(0);
    }

    private final void a(boolean p0) {
        v8 = this.getWidth();
        v9 = this.getHeight();
        v10 = this.getScaleType();
        v1 = 0;
        if (this.getLayoutParams() != 0) {
            if (this.getLayoutParams().width == -2)
                v0 = 1;
            else
                v0 = 0;
            if (this.getLayoutParams().height == -2)
                v1 = 1;
            else
                v1 = 0;
            v2 = v0;
        }
        else
            v2 = 0;
        if (v2 != 0 && v1 != 0)
            v0 = 1;
        else
            v0 = 0;
        if (v8 != 0 || v9 != 0 || v0 != 0) {
            if (TextUtils.isEmpty(this.a)) {
                if (this.e != 0) {
                    this.e.a();
                    this.e = 0;
                }
                this.a();
                return;
            }
            if (this.e != 0 && this.e.d != 0) {
                if (this.e.d.equals(this.a))
                    return;
                this.e.a();
                this.a();
            }
            if (v2 != 0)
                v8 = 0;
            if (v1 != 0)
                v9 = 0;
            v6 = new com.android.volley.a.ac(this, p0);
            if (Looper.myLooper() != Looper.getMainLooper())
                throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
            v4 = (this.a.length() + 12) + "#W" + v8 + "#H" + v9 + "#S" + v10.ordinal() + this.a;
            v2 = this.d.c.a(v4);
            if (v2 != 0) {
                v0 = new com.android.volley.a.w(this.d, v2, this.a, 0, 0);
                v6.a(v0, 1);
            }
            else {
                v0 = new com.android.volley.a.w(this.d, 0, this.a, v4, v6);
                v6.a(v0, 1);
                v2 = (com.android.volley.a.u)this.d.d.get(v4);
                if (v2 != 0)
                    v2.d.add(v0);
                else {
                    v5 = new com.android.volley.a.y(this.a, new com.android.volley.a.r(this.d, v4), v8, v9, v10, Bitmap$Config.RGB_565, new com.android.volley.a.s(this.d, v4));
                    this.d.a.a(v5);
                    this.d.d.put(v4, new com.android.volley.a.u(v5, v0));
                }
            }
            this.e = v0;
        }
    }

    public void a(String p0, com.android.volley.a.q p1) {
        this.a = p0;
        this.d = p1;
        this.a(0);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.invalidate();
    }

    protected void onDetachedFromWindow() {
        if (this.e != 0) {
            this.e.a();
            this.setImageBitmap(0);
            this.e = 0;
        }
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        super.onLayout(p0, p1, p2, p3, p4);
        this.a(1);
    }

    public void setDefaultImageResId(int p0) {
        this.b = p0;
    }

    public void setErrorImageResId(int p0) {
        this.c = p0;
    }

}
