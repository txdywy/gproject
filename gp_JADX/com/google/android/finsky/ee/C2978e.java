package com.google.android.finsky.ee;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.bg.C1601a;
import com.squareup.leakcanary.C7582R;

final class C2978e implements Runnable {
    public final /* synthetic */ Context f15652a;
    public final /* synthetic */ boolean f15653b;
    public final /* synthetic */ View f15654c;

    C2978e(Context context, boolean z, View view) {
        this.f15652a = context;
        this.f15653b = z;
        this.f15654c = view;
    }

    public final void run() {
        C1601a.m9199a(this.f15652a, this.f15652a.getString(this.f15653b ? C7582R.string.wishlist_removing : C7582R.string.wishlist_adding), this.f15654c, false);
    }
}
