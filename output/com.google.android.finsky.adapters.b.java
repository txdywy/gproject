package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.adapters.b implements View$OnClickListener
{

    public final CardRecyclerViewAdapter a;
    public final Document b;
    public final com.google.android.finsky.d.ad c;

    b(CardRecyclerViewAdapter p0, Document p1, com.google.android.finsky.d.ad p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final void onClick(View p0) {
        this.a.q.a(this.b, this.c, this.a.n);
    }

}
