package com.google.android.libraries.bind.card;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.google.android.libraries.bind.C5870a;
import com.google.android.libraries.bind.data.C5880k;
import com.google.android.libraries.bind.data.C5898g;
import com.google.android.libraries.bind.data.Data;

public final class C5889g extends ev {
    public static final C5898g f29412a = Data.m27344a(C5870a.BoundItemDecoration_childDecoration);
    public final Rect f29413b = new Rect();

    C5889g() {
    }

    public final void mo789b(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        super.mo789b(canvas, recyclerView, foVar);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof C5880k) {
                Data data = ((C5880k) childAt).getData();
                if (data != null && data.m27346a(f29412a)) {
                    C5890h c5890h = (C5890h) data.m27347b(f29412a);
                    RecyclerView.m254a(childAt, this.f29413b);
                    c5890h.m27339a();
                }
            }
        }
    }

    public final void mo785a(Rect rect, View view, RecyclerView recyclerView, fo foVar) {
        super.mo785a(rect, view, recyclerView, foVar);
        if (view instanceof C5880k) {
            Data data = ((C5880k) view).getData();
            if (data != null && data.m27346a(f29412a)) {
                ((C5890h) data.m27347b(f29412a)).m27340b();
            }
        }
    }
}
