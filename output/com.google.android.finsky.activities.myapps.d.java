package com.google.android.finsky.activities.myapps;

import android.content.res.Resources;
import android.view.View;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.activities.myapps.d implements View$OnClickListener
{

    public final com.google.android.finsky.navigationmanager.a a;
    public final String b;
    public final DfeToc c;
    public final com.google.android.finsky.d.w d;
    public final MyAppsEmptyView e;

    d(MyAppsEmptyView p0, com.google.android.finsky.navigationmanager.a p1, String p2, DfeToc p3, com.google.android.finsky.d.w p4) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }

    public final void onClick(View p0) {
        this.a.a(this.b, this.e.getResources().getString(2131952237), 3, this.c, this.d);
    }

}
