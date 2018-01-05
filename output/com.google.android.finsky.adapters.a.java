package com.google.android.finsky.adapters;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.ew;
import android.support.v7.widget.fo;
import android.view.View;
import com.google.android.finsky.stream.base.n;
import com.google.android.finsky.stream.controllers.headerspacer.a;
import java.util.List;

public final class com.google.android.finsky.adapters.a extends android.support.v7.widget.ev
{

    public final Paint a;

    a(int p0) {
        android.support.v7.widget.ev();
        this.a = new Paint();
        this.a.setColor(p0);
    }

    public final void a(Canvas p0, RecyclerView p1, android.support.v7.widget.fo p2) {
        v0 = p1.getAdapter();
        if (v0 instanceof com.google.android.finsky.stream.base.n && ((com.google.android.finsky.stream.base.n)v0).d.get(0) instanceof com.google.android.finsky.stream.controllers.headerspacer.a)
            v0 = p1.getLayoutManager().b(0);
        else
            v0 = 0;
        if (v0 != 0)
            v0 = v0.getBottom();
        else
            v0 = 0;
        p0.drawRect(0, (float)v0, (float)p1.getWidth(), (float)p1.getHeight(), this.a);
    }

}
