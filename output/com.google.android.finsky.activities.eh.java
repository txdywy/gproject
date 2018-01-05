package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.jf;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.pagesystem.b;

public final class com.google.android.finsky.activities.eh implements View$OnClickListener
{

    public final String a;
    public final com.google.android.finsky.d.ad b;
    public final com.google.android.finsky.activities.ef c;

    eh(com.google.android.finsky.activities.ef p0, String p1, com.google.android.finsky.d.ad p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        if (this.c.aj.c())
            v3 = this.c.aj.a.a.f;
        else
            v3 = 0;
        this.c.bp.a(this.c.ai.f, this.a, v3, 0, this.c.k_, this.b, this.c.bw);
    }

}
