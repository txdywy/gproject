package com.google.android.finsky.adapters.a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.cv.a.iu;
import com.google.android.finsky.cv.a.jx;
import com.google.android.finsky.cv.a.ka;
import com.google.android.finsky.cv.a.kd;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.layout.structuredreviews.ReviewRatingQuestion;
import com.google.android.finsky.layout.structuredreviews.a;

public final class com.google.android.finsky.adapters.a.j extends com.google.android.finsky.adapters.a.h
{

    public final String i;

    j(Context p0, byte[] p1, CharSequence p2, com.google.android.finsky.cv.a.ka p3, int p4, com.google.android.finsky.d.ad p5) {
        com.google.android.finsky.adapters.a.h(p0, p1, p2, 0, p4, p5);
        this.i = p3.b;
    }

    protected final int a() {
        return 6003;
    }

    public final void a(int p0) {
        this.a(this.i, 4, p0);
    }

    public final void a(ReviewRatingQuestion p0, com.google.android.finsky.cv.a.iu p1) {
  4:    if (p1 == 0) goto 46;
  8:    if (p1.r == 0) goto 46;
 15:    v0 = 0;
 16:    if (v0 >= p1.r.a.length) goto 46;
 28:    if (!this.i.equals(p1.r.a[v0].c)) goto 43;
 30:    v2 = p1.r.a[v0].e;
 33:    if (p1 == 0)
 35:        v7 = 1;
        else
 48:        v7 = 0;
 39:    p0.a(this.c, v2, 3, 0, this, this, v7, 1);
 42:    return;
 43:    v0 = v0 + 1;
 45:    goto 16;
 46:    v2 = 0;
 47:    goto 32;
    }

    public final void a(com.google.android.finsky.layout.structuredreviews.a p0, com.google.android.finsky.cv.a.iu p1, Bundle p2) {
        this.a((ReviewRatingQuestion)p0, p1);
    }

}
