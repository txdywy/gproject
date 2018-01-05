package com.google.android.finsky.actionbuttons;

import android.view.View;
import android.view.View$OnClickListener;
import com.google.android.finsky.b.f;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.actionbuttons.r implements View$OnClickListener
{

    public final View$OnClickListener a;
    public final com.google.android.finsky.actionbuttons.q b;

    r(com.google.android.finsky.actionbuttons.q p0, View$OnClickListener p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        if (this.b.r != 0 && this.b.f.a.f == 3)
            this.b.k.a(this.b.a, this.b.f, "23", p0.getWidth(), p0.getHeight(), this.b.g.g());
        this.a.onClick(p0);
    }

}
