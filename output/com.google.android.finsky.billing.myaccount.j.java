package com.google.android.finsky.billing.myaccount;

import android.net.Uri;
import android.view.View;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.e;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.billing.myaccount.j implements View$OnClickListener
{

    public final com.google.android.finsky.billing.myaccount.h a;

    j(com.google.android.finsky.billing.myaccount.h p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        this.a.bw.b(new com.google.android.finsky.d.d(this.a.al()).a(6610));
        this.a.bm.y_().a(Uri.parse((String)com.google.android.finsky.aa.b.jp.b()), 0, this.a.bw);
    }

}
