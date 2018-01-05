package com.android.volley.p060a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.android.volley.C0656n;

public class ab extends ImageView {
    public String f4046a;
    public int f4047b;
    public int f4048c;
    public C0675q f4049d;
    public C0681w f4050e;

    public ab(Context context) {
        this(context, null);
    }

    public ab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void m4395a(String str, C0675q c0675q) {
        this.f4046a = str;
        this.f4049d = c0675q;
        m4394a(false);
    }

    public void setDefaultImageResId(int i) {
        this.f4047b = i;
    }

    public void setErrorImageResId(int i) {
        this.f4048c = i;
    }

    private final void m4394a(boolean z) {
        Object obj;
        Object obj2;
        int width = getWidth();
        int height = getHeight();
        ScaleType scaleType = getScaleType();
        Object obj3 = null;
        if (getLayoutParams() != null) {
            obj = getLayoutParams().width == -2 ? 1 : null;
            obj3 = getLayoutParams().height == -2 ? 1 : null;
            obj2 = obj;
        } else {
            obj2 = null;
        }
        obj = (obj2 == null || obj3 == null) ? null : 1;
        if (width != 0 || height != 0 || obj != null) {
            if (TextUtils.isEmpty(this.f4046a)) {
                if (this.f4050e != null) {
                    this.f4050e.m4471a();
                    this.f4050e = null;
                }
                m4393a();
                return;
            }
            if (!(this.f4050e == null || this.f4050e.f4114d == null)) {
                if (!this.f4050e.f4114d.equals(this.f4046a)) {
                    this.f4050e.m4471a();
                    m4393a();
                } else {
                    return;
                }
            }
            if (obj2 != null) {
                width = 0;
            }
            if (obj3 != null) {
                height = 0;
            }
            C0675q c0675q = this.f4049d;
            String str = this.f4046a;
            C0658x acVar = new ac(this, z);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
            }
            C0681w c0681w;
            String stringBuilder = new StringBuilder(str.length() + 12).append("#W").append(width).append("#H").append(height).append("#S").append(scaleType.ordinal()).append(str).toString();
            Bitmap a = c0675q.f4097c.m4469a(stringBuilder);
            if (a != null) {
                c0681w = new C0681w(c0675q, a, str, null, null);
                acVar.mo1063a(c0681w, true);
            } else {
                c0681w = new C0681w(c0675q, null, str, stringBuilder, acVar);
                acVar.mo1063a(c0681w, true);
                C0679u c0679u = (C0679u) c0675q.f4098d.get(stringBuilder);
                if (c0679u != null) {
                    c0679u.f4110d.add(c0681w);
                } else {
                    C0656n c0682y = new C0682y(str, new C0676r(c0675q, stringBuilder), width, height, scaleType, Config.RGB_565, new C0677s(c0675q, stringBuilder));
                    c0675q.f4095a.m4510a(c0682y);
                    c0675q.f4098d.put(stringBuilder, new C0679u(c0682y, c0681w));
                }
            }
            this.f4050e = c0681w;
        }
    }

    private final void m4393a() {
        if (this.f4047b != 0) {
            setImageResource(this.f4047b);
        } else {
            setImageBitmap(null);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m4394a(true);
    }

    protected void onDetachedFromWindow() {
        if (this.f4050e != null) {
            this.f4050e.m4471a();
            setImageBitmap(null);
            this.f4050e = null;
        }
        super.onDetachedFromWindow();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }
}
