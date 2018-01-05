package com.google.android.finsky.detailscomponents;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.google.android.finsky.bg.C1611k;

public final class C2583i extends ev {
    public int f13772a;

    public C2583i(Resources resources, boolean z, C1611k c1611k) {
        int l = C1611k.m9270l(resources);
        this.f13772a = (l - Math.min(l, z ? l : c1611k.m9281f(resources))) / 2;
    }

    public final void mo785a(Rect rect, View view, RecyclerView recyclerView, fo foVar) {
        int i = view instanceof C2584j ? 0 : this.f13772a;
        if (view instanceof C2585k) {
            i += ((C2585k) view).getMarginOffset();
        }
        rect.set(i, 0, i, 0);
    }
}
