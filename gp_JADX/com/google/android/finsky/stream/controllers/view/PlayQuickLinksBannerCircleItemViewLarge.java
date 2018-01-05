package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.a;

public class PlayQuickLinksBannerCircleItemViewLarge extends al implements ae {
    public PlayQuickLinksBannerCircleItemViewLarge(Context context) {
        this(context, null);
    }

    public PlayQuickLinksBannerCircleItemViewLarge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayQuickLinksBannerCircleItemViewLarge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void mo4247a(Document document, C3748a c3748a, DfeToc dfeToc, C1294w c1294w, ad adVar, C2495w c2495w) {
        super.mo4247a(document, c3748a, dfeToc, c1294w, adVar, c2495w);
        this.e = C1607g.m9236a(document.aj(), this.e);
        this.d.setBitmapTransformation(a.a(getResources(), this.e));
    }

    public int getPlayStoreUiElementType() {
        return 101;
    }
}
