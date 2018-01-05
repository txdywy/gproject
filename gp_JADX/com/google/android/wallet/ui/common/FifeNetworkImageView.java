package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.android.volley.a.ab;
import com.android.volley.a.q;
import com.google.android.wallet.p383e.C6626j;

public class FifeNetworkImageView extends ab {
    public q f33340d;
    public boolean f33341f;
    public boolean f33342g;
    public int f33343h;
    public ad f33344i;
    public String f33345j;
    public String f33346k;
    public boolean f33347l;
    public float f33348m;
    public int f33349n;

    public FifeNetworkImageView(Context context) {
        super(context);
    }

    public FifeNetworkImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30604a(context, attributeSet);
    }

    public FifeNetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30604a(context, attributeSet);
    }

    private final void m30604a(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6626j.WalletUicFifeNetworkImageView);
        this.f33348m = obtainStyledAttributes.getFloat(C6626j.WalletUicFifeNetworkImageView_internalUicAspectRatio, -1.0f);
        this.f33349n = obtainStyledAttributes.getInt(C6626j.WalletUicFifeNetworkImageView_internalUicDominantDimension, -1);
        if (this.f33348m == -1.0f) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f33349n != -1) {
            i2 = 0;
        }
        if ((i ^ i2) != 0) {
            throw new RuntimeException("Both internalUicAspectRatio and internalUicDominantDimension must be specified.");
        }
        obtainStyledAttributes.recycle();
    }

    public void setFadeIn(boolean z) {
        this.f33341f = z;
        if (this.f33341f) {
            this.f33343h = getContext().getResources().getInteger(17694720);
        }
    }

    public void setLazyLoad(boolean z) {
        this.f33342g = z;
    }

    public final void m30606a(String str, q qVar, boolean z) {
        this.f33340d = qVar;
        this.f33347l = z;
        int width = getWidth();
        int height = getHeight();
        if (width == 0 && height == 0) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
                width = layoutParams.width;
                height = layoutParams.height;
            }
        }
        if (height == 0 || width == 0) {
            this.f33345j = str;
            return;
        }
        this.f33345j = null;
        a(ci.m30849a(str, width, height, this.f33347l), this.f33340d);
    }

    public final void m30605a(String str, q qVar) {
        if (this.f33342g) {
            this.f33346k = str;
        } else {
            super.a(str, qVar);
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f33342g = false;
        if (this.f33346k != null) {
            super.a(this.f33346k, this.f33340d);
            this.f33346k = null;
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.f33348m > 0.0f) {
            int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
            int defaultSize2 = getDefaultSize(getSuggestedMinimumHeight(), i2);
            if (this.f33349n == 0) {
                defaultSize = Math.max((int) (((float) defaultSize2) * this.f33348m), getSuggestedMinimumWidth());
            } else if (this.f33349n == 1) {
                defaultSize2 = Math.max((int) (((float) defaultSize) / this.f33348m), getSuggestedMinimumHeight());
            }
            setMeasuredDimension(defaultSize, defaultSize2);
            return;
        }
        super.onMeasure(i, i2);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f33345j != null) {
            String str = this.f33345j;
            this.f33345j = null;
            post(new ac(this, str));
        }
    }

    public void setOnLoadedListener(ad adVar) {
        this.f33344i = adVar;
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f33344i != null) {
            this.f33344i.mo5538a(bitmap);
        }
        if (this.f33341f) {
            int i;
            if (getVisibility() == 0 && getAlpha() == 1.0f) {
                i = 1;
            } else {
                i = 0;
            }
            if (i != 0) {
                ci.m30858a((View) this, 0, (long) this.f33343h, null);
            }
        }
    }
}
