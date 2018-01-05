package com.google.android.finsky.dialogbuilder.p137a;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.wireless.android.finsky.dfe.c.a.dc;

final class ad implements OnItemSelectedListener {
    public final C2797e f15017a;
    public final C2792h f15018b;
    public final dc f15019c;
    public Integer f15020d;

    ad(C2797e c2797e, C2792h c2792h, dc dcVar, Integer num) {
        this.f15017a = c2797e;
        this.f15018b = c2792h;
        this.f15019c = dcVar;
        this.f15020d = num;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (((this.f15019c.a & 1) != 0 ? 1 : null) != null) {
            this.f15018b.m14870a(this.f15019c.d, this.f15019c.c[i]);
        }
        if (!(this.f15020d == null || this.f15020d.intValue() == i || this.f15019c.e == null)) {
            this.f15017a.mo3138a(this.f15019c.e);
        }
        this.f15020d = Integer.valueOf(i);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
