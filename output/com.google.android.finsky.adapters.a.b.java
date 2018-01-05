package com.google.android.finsky.adapters.a;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewStub;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.iu;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.MyReviewReplyLayout;
import com.google.android.finsky.layout.structuredreviews.ReviewRatedLayout;
import com.google.android.finsky.layout.structuredreviews.a;

public final class com.google.android.finsky.adapters.a.b extends com.google.android.finsky.adapters.a.a implements com.google.android.finsky.layout.structuredreviews.f
{

    public final Document g;
    public final com.google.android.finsky.adapters.a.c h;
    public final com.google.android.finsky.d.w i;

    b(Context p0, Document p1, com.google.android.finsky.adapters.a.c p2, com.google.android.finsky.d.ad p3, com.google.android.finsky.d.w p4) {
        com.google.android.finsky.adapters.a.a(p0, 0, 0, p3);
        this.g = p1;
        this.h = p2;
        this.i = p4;
    }

    protected final int a() {
        return 6001;
    }

    public final void a(com.google.android.finsky.layout.structuredreviews.a p0, com.google.android.finsky.cv.a.iu p1, Bundle p2) {
        if (p1.d != 0)
            v3 = p1.d.g;
        else
            v3 = "";
        ((ReviewRatedLayout)p0).a(p1.h, p1.e, v3, p1.l, this.b, this.i);
        ((ReviewRatedLayout)p0).setRatedActionListener(this);
        if (p1.d()) {
            if (((ReviewRatedLayout)p0).e == 0)
                ((ReviewRatedLayout)p0).e = (MyReviewReplyLayout)((ReviewRatedLayout)p0).f.inflate();
            ((ReviewRatedLayout)p0).e.a(this.g, p1);
        }
        else if (((ReviewRatedLayout)p0).e != 0)
            ((ReviewRatedLayout)p0).e.setVisibility(8);
    }

    public final int h() {
        return 2130969338;
    }

    public final void i() {
        if (this.h != 0)
            this.h.b();
    }

    public final void j() {
        if (this.h != 0)
            this.h.d();
    }

}
