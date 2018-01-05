package com.google.android.finsky.adapters.p121a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.MyReviewReplyLayout;
import com.google.android.finsky.layout.structuredreviews.C1142f;
import com.google.android.finsky.layout.structuredreviews.C3721a;
import com.google.android.finsky.layout.structuredreviews.ReviewRatedLayout;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public final class C1143b extends C1141a implements C1142f {
    public final Document f7136g;
    public final C1144c f7137h;
    public final C2495w f7138i;

    public C1143b(Context context, Document document, C1144c c1144c, ad adVar, C2495w c2495w) {
        super(context, null, null, adVar);
        this.f7136g = document;
        this.f7137h = c1144c;
        this.f7138i = c2495w;
    }

    public final int mo1466h() {
        return C7582R.layout.review_rated;
    }

    public final void mo1467i() {
        if (this.f7137h != null) {
            this.f7137h.mo3084b();
        }
    }

    public final void mo1468j() {
        if (this.f7137h != null) {
            this.f7137h.mo3086d();
        }
    }

    protected final int mo1464a() {
        return 6001;
    }

    public final /* synthetic */ void mo1465a(C3721a c3721a, iu iuVar, Bundle bundle) {
        String str;
        ReviewRatedLayout reviewRatedLayout = (ReviewRatedLayout) c3721a;
        CharSequence charSequence = iuVar.f12720h;
        int i = iuVar.f12717e;
        if (iuVar.f12716d != null) {
            str = iuVar.f12716d.f12100g;
        } else {
            str = "";
        }
        reviewRatedLayout.m17599a(charSequence, i, str, iuVar.f12724l, this.f7131b, this.f7138i);
        reviewRatedLayout.setRatedActionListener(this);
        if (iuVar.m12828d()) {
            Document document = this.f7136g;
            if (reviewRatedLayout.f18821e == null) {
                reviewRatedLayout.f18821e = (MyReviewReplyLayout) reviewRatedLayout.f18822f.inflate();
            }
            reviewRatedLayout.f18821e.m17326a(document, iuVar);
        } else if (reviewRatedLayout.f18821e != null) {
            reviewRatedLayout.f18821e.setVisibility(8);
        }
    }
}
