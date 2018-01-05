package com.google.android.finsky.adapters;

import android.database.DataSetObservable;
import android.graphics.drawable.Drawable;
import com.google.android.finsky.cv.p177a.bf;
import com.google.android.finsky.utils.FinskyLog;

public final class C1174q {
    public final int f7222a;
    public final Drawable[] f7223b = new Drawable[this.f7222a];
    public final bf[] f7224c = new bf[this.f7222a];
    public final DataSetObservable f7225d = new DataSetObservable();
    public C1176s f7226e;

    public C1174q(int i, C1176s c1176s) {
        this.f7222a = i;
        this.f7226e = c1176s;
    }

    public final void m7106a(Drawable[] drawableArr, bf[] bfVarArr) {
        int i = 0;
        if (drawableArr.length != this.f7222a) {
            FinskyLog.m21669e("Number of images don't match", new Object[0]);
            return;
        }
        while (i < this.f7222a) {
            this.f7223b[i] = drawableArr[i];
            this.f7224c[i] = bfVarArr[i];
            i++;
        }
        this.f7225d.notifyChanged();
    }

    public final void m7104a(int i, Drawable drawable) {
        this.f7223b[i] = drawable;
        this.f7225d.notifyChanged();
    }

    public final void m7105a(int i, bf bfVar, float f) {
        Drawable drawable = this.f7223b[i];
        if (drawable != null) {
            bfVar.f11878b = (int) (((float) drawable.getIntrinsicWidth()) * f);
            bfVar.f11879c = (int) (((float) drawable.getIntrinsicHeight()) * f);
        } else if (this.f7224c[i] != null) {
            bfVar.f11878b = this.f7224c[i].f11878b;
            bfVar.f11879c = this.f7224c[i].f11879c;
        } else {
            bfVar.f11878b = 0;
            bfVar.f11879c = 0;
        }
    }
}
