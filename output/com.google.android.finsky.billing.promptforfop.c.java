package com.google.android.finsky.billing.promptforfop;

import android.view.View;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.promptforfop.c implements View$OnClickListener
{

    public final com.google.android.finsky.billing.promptforfop.b a;

    c(com.google.android.finsky.billing.promptforfop.b p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        this.a.af.b(new com.google.android.finsky.d.d(this.a).a(1008));
        v0 = this.a.al();
        if (v0 != 0)
            v0.o();
    }

}
