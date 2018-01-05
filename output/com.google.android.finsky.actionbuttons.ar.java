package com.google.android.finsky.actionbuttons;

import android.view.View;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.actionbuttons.ar implements View$OnClickListener
{

    public final com.google.android.finsky.actionbuttons.aq a;

    ar(com.google.android.finsky.actionbuttons.aq p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        if (this.a.o != 0)
            this.a.o.d();
        this.a.c.b(new com.google.android.finsky.d.d(this.a.d).a(222));
    }

}
