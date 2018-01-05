package com.google.android.finsky.billing.myaccount;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2475d;

final class C2009j implements OnClickListener {
    public final /* synthetic */ C2007h f10306a;

    C2009j(C2007h c2007h) {
        this.f10306a = c2007h;
    }

    public final void onClick(View view) {
        this.f10306a.bw.m13379b(new C2475d(this.f10306a.al()).m13256a(6610));
        this.f10306a.bm.y_().mo3635a(Uri.parse((String) C0955b.jp.m28964b()), null, this.f10306a.bw);
    }
}
