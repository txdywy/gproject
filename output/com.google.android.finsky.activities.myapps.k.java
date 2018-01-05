package com.google.android.finsky.activities.myapps;

import android.support.v7.widget.fr;
import android.view.View;
import java.util.ArrayList;

public final class com.google.android.finsky.activities.myapps.k implements View$OnClickListener
{

    public final com.google.android.finsky.activities.myapps.j a;

    k(com.google.android.finsky.activities.myapps.j p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        v1 = ((com.google.android.finsky.activities.myapps.l)p0.getTag()).d();
        ((com.google.android.finsky.activities.myapps.i)this.a.e.f.get(v1)).a();
        ((com.google.android.finsky.activities.myapps.i)this.a.e.f.get(this.a.e.a)).a();
        this.a.e.f.get(v1);
        this.a.e.a = v1;
    }

}
