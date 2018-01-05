package com.google.android.finsky.stream.myapps;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final /* synthetic */ class C4538e implements OnClickListener {
    public final C2495w f23228a;
    public final View f23229b;
    public final Runnable f23230c;

    C4538e(C2495w c2495w, View view, Runnable runnable) {
        this.f23228a = c2495w;
        this.f23229b = view;
        this.f23230c = runnable;
    }

    public final void onClick(View view) {
        C2495w c2495w = this.f23228a;
        View view2 = this.f23229b;
        Runnable runnable = this.f23230c;
        c2495w.m13379b(new C2475d((ad) view2).m13256a(2842));
        runnable.run();
    }
}
