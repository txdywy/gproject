package com.google.android.finsky.activities.inlineappinstaller.a;

import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.play.image.FifeImageView;

public final class com.google.android.finsky.activities.inlineappinstaller.a.g
{

    public final com.google.android.finsky.bg.l a;

    g(com.google.android.finsky.bg.l p0) {
        this.a = p0;
    }

    public final void a(Document p0, View p1) {
        v1 = 0;
        v0 = (FifeImageView)p1.findViewById(2131755855);
        if (p0 != 0) {
            v2 = v0.getLayoutParams();
            v2 = com.google.android.finsky.bg.af.a(p0, v2.width, v2.height, DocImageView.a);
            if (v2 != 0) {
                this.a.a(v0, v2.f, v2.i);
                v0.setVisibility(0);
                v1 = 1;
            }
        }
        if (v1 == 0)
            v0.setVisibility(8);
    }

}
