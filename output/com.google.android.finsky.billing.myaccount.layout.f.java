package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.ga;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.billing.myaccount.layout.f implements View$OnClickListener
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.cv.a.ga b;
    public final com.google.android.finsky.navigationmanager.a c;
    public final DfeToc d;
    public final Document e;
    public final RewardRowView f;

    f(RewardRowView p0, com.google.android.finsky.d.w p1, com.google.android.finsky.cv.a.ga p2, com.google.android.finsky.navigationmanager.a p3, DfeToc p4, Document p5) {
        this.f = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
    }

    public final void onClick(View p0) {
        this.a.b(new com.google.android.finsky.d.d(this.f));
        if (this.b.f != 0) {
            v5 = new Document(this.b.f);
            if (v5.a.e == 1)
                v7 = 2;
            else
                v7 = 0;
        }
        else {
            v7 = 0;
            v5 = 0;
        }
        this.c.a(this.b.e, 0, this.d, p0.getContext().getPackageManager(), v5, this.e.a.c, v7, -1, 0, 0, this.a);
    }

}
