package com.google.android.finsky.bg;

import android.view.ViewGroup$LayoutParams;
import com.google.android.finsky.cv.a.bd;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.w;

public final class com.google.android.finsky.bg.l
{

    public final com.google.android.play.image.w a;

    l(com.google.android.play.image.w p0) {
        this.a = p0;
    }

    public final void a(FifeImageView p0, com.google.android.finsky.cv.a.bd p1, int p2) {
        if (p1 != 0) {
            if (p2 != -1 && p0.getLayoutParams().width > 0) {
                v1 = p0.getLayoutParams();
                v1.height = (int)(com.google.android.finsky.bg.r.a(p2) * (float)v1.width);
            }
            this.a(p0, p1.f, p1.i);
            p0.setVisibility(0);
        }
    }

    public final void a(FifeImageView p0, String p1, boolean p2) {
        p0.a(p1, p2, this.a);
    }

}
