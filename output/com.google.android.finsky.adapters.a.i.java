package com.google.android.finsky.adapters.a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.cv.a.iu;
import com.google.android.finsky.cv.a.jx;
import com.google.android.finsky.cv.a.ka;
import com.google.android.finsky.cv.a.kd;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.layout.structuredreviews.ReviewStructuredQuestion;
import com.google.android.finsky.layout.structuredreviews.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class com.google.android.finsky.adapters.a.i extends com.google.android.finsky.adapters.a.a implements com.google.android.finsky.layout.structuredreviews.k
{

    public final String g;
    public final com.google.android.finsky.d.w h;
    public List i;

    i(Context p0, byte[] p1, CharSequence p2, com.google.android.finsky.cv.a.ka p3, com.google.android.finsky.d.ad p4, com.google.android.finsky.d.w p5) {
        com.google.android.finsky.adapters.a.a(p0, p1, p2, p4);
        this.g = p3.b;
        this.i = new ArrayList();
        this.h = p5;
        Collections.addAll(this.i, p3.d);
    }

    protected final int a() {
        return 6003;
    }

    public final void a(int p0) {
        this.h.b(new com.google.android.finsky.d.d(this.b).a(6005));
        this.a(this.g, p0, 0);
    }

    public final void a(com.google.android.finsky.layout.structuredreviews.a p0, com.google.android.finsky.cv.a.iu p1, Bundle p2) {
  0:    v4 = 0;
  8:    if (p1 == 0) goto 47;
 12:    if (p1.r == 0) goto 47;
 19:    v3 = 0;
 20:    if (v3 >= p1.r.a.length) goto 47;
 32:    if (!this.g.equals(p1.r.a[v3].c)) goto 44;
 34:    v3 = p1.r.a[v3].d;
 36:    if (p1 == 0)
 38:        v4 = 1;
 40:    ((ReviewStructuredQuestion)p0).a(this.c, this.i, v3, v4, this);
 43:    return;
 44:    v3 = v3 + 1;
 46:    goto 20;
 47:    v3 = 0;
 48:    goto 36;
    }

    public final int h() {
        return 2130969343;
    }

}
