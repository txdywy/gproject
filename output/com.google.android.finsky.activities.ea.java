package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.pagesystem.b;

public final class com.google.android.finsky.activities.ea implements View$OnClickListener
{

    public final com.google.android.finsky.d.o a;
    public final com.google.android.finsky.activities.dx b;

    ea(com.google.android.finsky.activities.dx p0, com.google.android.finsky.d.o p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.bw.b(new com.google.android.finsky.d.d(this.a));
        this.b.bp.a(this.b.a.a.w, 0, this.b.h, this.b.bu, 0, 0, this.b.bw);
    }

}
