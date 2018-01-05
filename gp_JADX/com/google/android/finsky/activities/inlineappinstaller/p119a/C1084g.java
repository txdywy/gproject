package com.google.android.finsky.activities.inlineappinstaller.p119a;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public final class C1084g {
    public final C1612l f6939a;

    public C1084g(C1612l c1612l) {
        this.f6939a = c1612l;
    }

    public final void m6725a(Document document, View view) {
        int i = 0;
        FifeImageView fifeImageView = (FifeImageView) view.findViewById(C7582R.id.application_icon);
        if (document != null) {
            LayoutParams layoutParams = fifeImageView.getLayoutParams();
            bd a = af.m9220a(document, layoutParams.width, layoutParams.height, DocImageView.f13711a);
            if (a != null) {
                this.f6939a.m9288a(fifeImageView, a.f11860f, a.f11863i);
                fifeImageView.setVisibility(0);
                i = 1;
            }
        }
        if (i == 0) {
            fifeImageView.setVisibility(8);
        }
    }
}
