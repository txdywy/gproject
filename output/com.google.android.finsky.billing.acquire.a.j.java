package com.google.android.finsky.billing.acquire.a;

import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.dialogbuilder.e;
import com.google.android.finsky.dialogbuilder.j;
import com.google.wireless.android.finsky.dfe.c.a.x;

public final class com.google.android.finsky.billing.acquire.a.j implements View$OnClickListener
{

    public final com.google.android.finsky.dialogbuilder.e a;
    public final com.google.android.finsky.billing.acquire.a.i b;

    j(com.google.android.finsky.billing.acquire.a.i p0, com.google.android.finsky.dialogbuilder.e p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        if (this.b.c.getVisibility() == 0) {
            this.b.c.setVisibility(8);
            this.b.a.a(this.b.b.d, this.b.d, this.a);
        }
        else {
            this.b.c.setVisibility(0);
            this.b.a.a(this.b.b.e, this.b.d, this.a);
        }
    }

}
