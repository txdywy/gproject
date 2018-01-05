package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p198f.C3026a;

final class ca implements OnClickListener {
    public final /* synthetic */ String f6589a;
    public final /* synthetic */ C3026a f6590b;
    public final /* synthetic */ bq f6591c;

    ca(bq bqVar, String str, C3026a c3026a) {
        this.f6591c = bqVar;
        this.f6589a = str;
        this.f6590b = c3026a;
    }

    public final void onClick(View view) {
        this.f6591c.m6350d(214);
        this.f6591c.m6380a(this.f6589a, this.f6590b.f15830r, false);
    }
}
