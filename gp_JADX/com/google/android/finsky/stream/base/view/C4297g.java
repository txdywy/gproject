package com.google.android.finsky.stream.base.view;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.squareup.leakcanary.C7582R;

public final class C4297g extends ev {
    public final int f21668a;
    public final int f21669b;

    public C4297g(int i, int i2) {
        this.f21668a = i;
        this.f21669b = i2;
    }

    public final void mo785a(Rect rect, View view, RecyclerView recyclerView, fo foVar) {
        if (view.getTag(C7582R.id.accept_page_margin) == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(this.f21668a, 0, this.f21669b, 0);
        }
    }
}
