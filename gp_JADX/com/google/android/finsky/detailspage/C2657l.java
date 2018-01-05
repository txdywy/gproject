package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.ratereview.C3973p;

final class C2657l implements OnClickListener {
    public final /* synthetic */ String f14698a;
    public final /* synthetic */ String f14699b;
    public final /* synthetic */ C3973p f14700c;
    public final /* synthetic */ C2641k f14701d;

    C2657l(C2641k c2641k, String str, String str2, C3973p c3973p) {
        this.f14701d = c2641k;
        this.f14698a = str;
        this.f14699b = str2;
        this.f14700c = c3973p;
    }

    public final void onClick(View view) {
        this.f14701d.m14186b(this.f14698a, this.f14699b, this.f14700c);
    }
}
