package com.google.android.finsky.detailspage.videowatchaction;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;

final class C2680f implements OnChildClickListener {
    public final /* synthetic */ OnItemClickListener f14790a;
    public final /* synthetic */ C2679e f14791b;

    C2680f(C2679e c2679e, OnItemClickListener onItemClickListener) {
        this.f14791b = c2679e;
        this.f14790a = onItemClickListener;
    }

    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        this.f14791b.f14789d = Integer.valueOf(this.f14791b.m14517a(i2));
        expandableListView.collapseGroup(i);
        if (this.f14790a != null) {
            this.f14790a.onItemClick(expandableListView, view, i2, j);
        }
        return true;
    }
}
