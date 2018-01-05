package com.google.android.finsky.adapters;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.controllers.headerspacer.C4413a;

public final class C1154a extends ev {
    public final Paint f7149a = new Paint();

    public C1154a(int i) {
        this.f7149a.setColor(i);
    }

    public final void mo784a(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        View b;
        int bottom;
        em adapter = recyclerView.getAdapter();
        if ((adapter instanceof C4279n) && (((C4279n) adapter).f21580d.get(0) instanceof C4413a)) {
            b = recyclerView.getLayoutManager().mo736b(0);
        } else {
            b = null;
        }
        if (b != null) {
            bottom = b.getBottom();
        } else {
            bottom = 0;
        }
        canvas.drawRect(0.0f, (float) bottom, (float) recyclerView.getWidth(), (float) recyclerView.getHeight(), this.f7149a);
    }
}
