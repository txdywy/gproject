package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.volley.a.q;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.p383e.C6626j;
import com.squareup.haha.perflib.HprofParser;

public class ImageWithCaptionView extends FifeNetworkImageView {
    public int f33402o;
    public ad f33403p;
    public ColorStateList f33404q;
    public boolean f33405r;

    public ImageWithCaptionView(Context context) {
        super(context);
        m30635a(context, null);
    }

    public ImageWithCaptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30635a(context, attributeSet);
    }

    public ImageWithCaptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30635a(context, attributeSet);
    }

    private final void m30635a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6626j.WalletUicImageWithCaptionView);
        setErrorImageResId(obtainStyledAttributes.getResourceId(C6626j.WalletUicImageWithCaptionView_internalUicErrorImage, 0));
        setDefaultImageResId(obtainStyledAttributes.getResourceId(C6626j.WalletUicImageWithCaptionView_internalUicDefaultImage, 0));
        obtainStyledAttributes.recycle();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putInt("defaultImageResId", this.f33402o);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f33402o = bundle.getInt("defaultImageResId");
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setDefaultImageResId(int i) {
        super.setDefaultImageResId(i);
        this.f33402o = i;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Object obj = (this.f33403p == null || !this.f33403p.h) ? null : 1;
        if (obj != null && (getDrawable() instanceof BitmapDrawable)) {
            Bitmap a = ci.m30843a(((BitmapDrawable) getDrawable()).getBitmap());
            if (a != null) {
                setImageBitmap(a);
                invalidate();
            }
        }
    }

    public final void m30637a(ad adVar, q qVar, boolean z) {
        m30638a(adVar, qVar, z, null);
    }

    public final void m30638a(ad adVar, q qVar, boolean z, LogContext logContext) {
        this.f33403p = adVar;
        if (adVar == null) {
            m30636a(qVar, this.f33402o);
            return;
        }
        if (C6600l.m29953a(adVar.c)) {
            int a = ci.m30839a(getContext(), adVar.c, this.f33402o);
            super.setDefaultImageResId(a);
            m30636a(qVar, a);
        } else if (C6600l.m29965c(adVar.c)) {
            byte[] decode = Base64.decode(adVar.c.substring(adVar.c.indexOf(";base64,") + 8), 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (logContext != null) {
                C6537a.m29685a(logContext, adVar.b, decodeByteArray == null ? 4 : 1);
            }
            if (decodeByteArray != null) {
                setImageBitmap(decodeByteArray);
                setAdjustViewBounds(true);
                this.f33405r = true;
            }
        } else {
            super.setDefaultImageResId(this.f33402o);
            m30606a(adVar.c, qVar, z);
        }
        setContentDescription(adVar.g);
    }

    public void setTintListOnImageResource(ColorStateList colorStateList) {
        this.f33404q = colorStateList;
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        if (this.f33404q != null) {
            ci.m30864a((ImageView) this, this.f33404q);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setEnabled(isEnabled());
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null || !this.f33405r) {
            super.setImageBitmap(bitmap);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (getDrawable() != null && !getDrawable().isStateful()) {
            setAlpha(z ? HprofParser.ROOT_UNKNOWN : 77);
        }
    }

    private final void m30636a(q qVar, int i) {
        a(null, qVar);
        setImageResource(i);
    }

    public static ImageWithCaptionView m30634a(ad adVar, Context context, ViewGroup viewGroup, int i, int i2, LogContext logContext) {
        LayoutParams marginLayoutParams;
        ImageWithCaptionView imageWithCaptionView = new ImageWithCaptionView(context);
        imageWithCaptionView.setId(i);
        imageWithCaptionView.m30638a(adVar, C6600l.m29933a(context), ((Boolean) C6489e.f32495a.a()).booleanValue(), logContext);
        if (C6600l.m29953a(adVar.c)) {
            marginLayoutParams = new MarginLayoutParams(-2, -2);
        } else if (adVar.e <= 0 || adVar.f <= 0) {
            marginLayoutParams = new MarginLayoutParams(-1, -2);
        } else {
            marginLayoutParams = new MarginLayoutParams(adVar.e, adVar.f);
        }
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = i2;
        if (viewGroup instanceof LinearLayout) {
            LayoutParams layoutParams = new LinearLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = 1;
            marginLayoutParams = layoutParams;
        }
        imageWithCaptionView.setLayoutParams(marginLayoutParams);
        return imageWithCaptionView;
    }
}
