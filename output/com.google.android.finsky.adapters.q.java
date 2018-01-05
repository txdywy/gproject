package com.google.android.finsky.adapters;

import android.database.DataSetObservable;
import android.graphics.drawable.Drawable;
import com.google.android.finsky.cv.a.bf;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.adapters.q
{

    public final int a;
    public final Drawable[] b;
    public final bf[] c;
    public final DataSetObservable d;
    public com.google.android.finsky.adapters.s e;

    q(int p0, com.google.android.finsky.adapters.s p1) {
        this.a = p0;
        this.b = new Drawable[this.a];
        this.c = new bf[this.a];
        this.d = new DataSetObservable();
        this.e = p1;
    }

    public final void a(int p0, Drawable p1) {
        this.b[p0] = p1;
        this.d.notifyChanged();
    }

    public final void a(int p0, com.google.android.finsky.cv.a.bf p1, float p2) {
        if (this.b[p0] != 0) {
            p1.b = (int)((float)this.b[p0].getIntrinsicWidth() * p2);
            p1.c = (int)((float)this.b[p0].getIntrinsicHeight() * p2);
        }
        else if (this.c[p0] != 0) {
            p1.b = this.c[p0].b;
            p1.c = this.c[p0].c;
        }
        else {
            p1.b = 0;
            p1.c = 0;
        }
    }

    public final void a(Drawable[] p0, bf[] p1) {
        v0 = 0;
        if (p0.length != this.a)
            FinskyLog.e("Number of images don't match", new Object[0]);
        else {
            while (v0 < this.a) {
                this.b[v0] = p0[v0];
                this.c[v0] = p1[v0];
                v0 = v0 + 1;
            }
            this.d.notifyChanged();
        }
    }

}
