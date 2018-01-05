package com.google.android.finsky.bg;

import android.view.ViewGroup.LayoutParams;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;

public final class C1612l {
    public final C1294w f8531a;

    public C1612l(C1294w c1294w) {
        this.f8531a = c1294w;
    }

    public final void m9288a(FifeImageView fifeImageView, String str, boolean z) {
        fifeImageView.a(str, z, this.f8531a);
    }

    public final void m9287a(FifeImageView fifeImageView, bd bdVar, int i) {
        if (bdVar != null) {
            if (i != -1) {
                float a = C1617r.m9292a(i);
                if (fifeImageView.getLayoutParams().width > 0) {
                    LayoutParams layoutParams = fifeImageView.getLayoutParams();
                    layoutParams.height = (int) (a * ((float) layoutParams.width));
                }
            }
            m9288a(fifeImageView, bdVar.f11860f, bdVar.f11863i);
            fifeImageView.setVisibility(0);
        }
    }
}
