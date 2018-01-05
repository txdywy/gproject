package com.google.android.finsky.stream.controllers.inlinetopcharts.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.finsky.recyclerview.C3988i;

final class C4429i extends C3988i {
    C4429i(Context context, int i) {
        super(context, i);
    }

    public final boolean mo4205a(View view, RecyclerView recyclerView) {
        return RecyclerView.m262d(view) != recyclerView.getAdapter().mo1039a() + -1;
    }
}
