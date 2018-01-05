package com.google.android.finsky.activities.myapps;

import android.view.View;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.navigationmanager.a;
import com.google.wireless.android.finsky.dfe.nano.gj;

public final class com.google.android.finsky.activities.myapps.c implements View$OnClickListener
{

    public final com.google.android.finsky.navigationmanager.a a;
    public final com.google.wireless.android.finsky.dfe.nano.gj b;
    public final DfeToc c;
    public final com.google.android.finsky.d.w d;

    c(com.google.android.finsky.navigationmanager.a p0, com.google.wireless.android.finsky.dfe.nano.gj p1, DfeToc p2, com.google.android.finsky.d.w p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public final void onClick(View p0) {
        this.a.b(this.b.e, this.b.d, 3, this.c, this.d);
    }

}
