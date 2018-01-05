package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cv.p177a.ga;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class C2016f implements OnClickListener {
    public final /* synthetic */ C2495w f10424a;
    public final /* synthetic */ ga f10425b;
    public final /* synthetic */ C3748a f10426c;
    public final /* synthetic */ DfeToc f10427d;
    public final /* synthetic */ Document f10428e;
    public final /* synthetic */ RewardRowView f10429f;

    C2016f(RewardRowView rewardRowView, C2495w c2495w, ga gaVar, C3748a c3748a, DfeToc dfeToc, Document document) {
        this.f10429f = rewardRowView;
        this.f10424a = c2495w;
        this.f10425b = gaVar;
        this.f10426c = c3748a;
        this.f10427d = dfeToc;
        this.f10428e = document;
    }

    public final void onClick(View view) {
        Document document;
        int i;
        this.f10424a.m13379b(new C2475d(this.f10429f));
        if (this.f10425b.f12405f != null) {
            document = new Document(this.f10425b.f12405f);
            i = document.f14885a.f12098e == 1 ? 2 : 0;
        } else {
            i = 0;
            document = null;
        }
        this.f10426c.mo3641a(this.f10425b.f12404e, null, this.f10427d, view.getContext().getPackageManager(), document, this.f10428e.f14885a.f12096c, i, -1, null, 0, this.f10424a);
    }
}
