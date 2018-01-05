package com.google.android.finsky.billing.gifting;

import android.view.View;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.billing.gifting.h implements View$OnClickListener
{

    public final com.google.android.finsky.cv.a.cv a;
    public final com.google.android.finsky.d.w b;
    public final com.google.android.finsky.d.o c;
    public final PlayCreditGiftingRow d;

    h(PlayCreditGiftingRow p0, com.google.android.finsky.cv.a.cv p1, com.google.android.finsky.d.w p2, com.google.android.finsky.d.o p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void onClick(View p0) {
        this.d.b.a(new Document(this.a), this.a.n[0].B);
        this.b.b(new com.google.android.finsky.d.d(this.c));
    }

}
