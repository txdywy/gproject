package com.google.android.wallet.ui.card;

import android.view.View;
import android.widget.ImageView;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.android.wallet.common.util.C6598j;
import com.google.android.wallet.common.util.C6600l;

public final class C6738d {
    public final ImageView[] f33263a;
    public final ImageView[] f33264b;
    public final View f33265c;
    public ad f33266d;
    public boolean f33267e;

    public C6738d(ImageView[] imageViewArr, ImageView[] imageViewArr2, View view) {
        this.f33263a = imageViewArr;
        this.f33264b = imageViewArr2;
        this.f33265c = view;
    }

    protected final int m30539a(ad adVar) {
        return C6738d.m30538a(this.f33263a, adVar);
    }

    protected final int m30541b(ad adVar) {
        return C6738d.m30538a(this.f33264b, adVar);
    }

    private static int m30538a(ImageView[] imageViewArr, ad adVar) {
        if (imageViewArr == null || adVar == null) {
            return -1;
        }
        int length = imageViewArr.length;
        for (int i = 0; i < length; i++) {
            if (C6598j.m29927a(adVar.c, ((ad) imageViewArr[i].getTag()).c)) {
                return i;
            }
        }
        return -1;
    }

    public final void m30542c(ad adVar) {
        if (!C6600l.m29952a(adVar, this.f33266d)) {
            int b;
            int i;
            int a = m30539a(adVar);
            if (a == -1) {
                b = m30541b(adVar);
            } else {
                b = -1;
            }
            float f = (a == -1 && b == -1 && !this.f33267e) ? 1.0f : 0.0f;
            int length = this.f33263a.length;
            for (i = 0; i < length; i++) {
                if (i == a) {
                    this.f33263a[i].animate().alpha(1.0f);
                    if (!this.f33267e) {
                        this.f33263a[i].animate().x((float) this.f33263a[0].getLeft());
                    }
                } else {
                    this.f33263a[i].animate().alpha(f);
                    if (!this.f33267e) {
                        this.f33263a[i].animate().translationX(0.0f);
                    }
                }
            }
            i = this.f33264b.length;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 == b) {
                    this.f33264b[i2].animate().alpha(1.0f);
                } else {
                    this.f33264b[i2].animate().alpha(0.0f);
                }
            }
            if (this.f33267e) {
                if (a == -1 && b == -1) {
                    this.f33265c.animate().alpha(1.0f);
                } else {
                    this.f33265c.animate().alpha(0.0f);
                }
            }
            this.f33266d = adVar;
        }
    }

    public final void m30540a() {
        if (!this.f33267e) {
            int b;
            int i;
            int a = m30539a(this.f33266d);
            if (a == -1) {
                b = m30541b(this.f33266d);
            } else {
                b = -1;
            }
            int length = this.f33263a.length;
            for (i = 0; i < length; i++) {
                this.f33263a[i].animate().cancel();
                this.f33263a[i].setX((float) this.f33263a[0].getLeft());
                if (i == a) {
                    this.f33263a[i].setAlpha(1.0f);
                } else {
                    this.f33263a[i].setAlpha(0.0f);
                }
            }
            length = this.f33264b.length;
            for (i = 0; i < length; i++) {
                this.f33264b[i].animate().cancel();
                if (i == b) {
                    this.f33264b[i].setAlpha(1.0f);
                } else {
                    this.f33264b[i].setAlpha(0.0f);
                }
            }
            this.f33265c.animate().cancel();
            this.f33265c.setVisibility(0);
            if (a == -1 && b == -1) {
                this.f33265c.setAlpha(1.0f);
            } else {
                this.f33265c.setAlpha(0.0f);
            }
        }
        this.f33267e = true;
    }
}
