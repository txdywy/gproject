package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.actionbuttons.at;
import com.google.android.finsky.p198f.C3026a;

final class by implements OnClickListener {
    public final /* synthetic */ String f6583a;
    public final /* synthetic */ C3026a f6584b;
    public final /* synthetic */ boolean f6585c;
    public final /* synthetic */ bq f6586d;

    by(bq bqVar, String str, C3026a c3026a, boolean z) {
        this.f6586d = bqVar;
        this.f6583a = str;
        this.f6584b = c3026a;
        this.f6585c = z;
    }

    public final void onClick(View view) {
        this.f6586d.m6350d(215);
        bq bqVar = this.f6586d;
        String str = this.f6583a;
        boolean z = this.f6584b.f15829q;
        String str2 = this.f6584b.f15830r;
        boolean z2 = this.f6584b.f15822j;
        boolean z3 = this.f6584b.f15821i;
        boolean z4 = this.f6585c;
        if (z) {
            bqVar.m6380a(str, str2, true);
        } else {
            at.m5929a(str, bqVar.A, z2, z3, z4);
        }
    }
}
