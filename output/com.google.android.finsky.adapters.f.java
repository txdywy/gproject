package com.google.android.finsky.adapters;

import android.view.View;
import com.google.android.finsky.layout.CategoryRow;
import com.google.android.finsky.navigationmanager.a;
import com.google.wireless.android.finsky.dfe.nano.x;

public final class com.google.android.finsky.adapters.f implements View$OnClickListener
{

    public final com.google.wireless.android.finsky.dfe.nano.x a;
    public final CategoryRow b;
    public final com.google.android.finsky.adapters.e c;

    f(com.google.android.finsky.adapters.e p0, com.google.wireless.android.finsky.dfe.nano.x p1, CategoryRow p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        this.c.d.a(this.a.e, this.a.c, this.c.e, this.c.f, this.c.g, this.b, this.c.A);
    }

}
