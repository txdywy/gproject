package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.cv.a.af;
import com.google.android.finsky.cv.a.co;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.eu;
import com.google.android.finsky.cv.a.j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.activities.cw implements View$OnClickListener
{

    public final com.google.android.finsky.activities.cu a;

    cw(com.google.android.finsky.activities.cu p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        if (this.a.D.bK())
            v1 = this.a.D.a.s.e.l.c;
        else
            v1 = 0;
        this.a.z.a(v1.d, "", this.a.D.a.f, com.google.android.finsky.m.a.dn(), this.a.T, 0, this.a.S);
        if (this.a.D.a.e == 64)
            this.a.d(144);
        if (this.a.D.a.e == 5)
            this.a.d(143);
    }

}
