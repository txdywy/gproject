package com.google.android.finsky.stream.p248a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.finsky.frameworkviews.C3141d;
import com.google.android.finsky.frameworkviews.C3145o;
import com.google.android.finsky.playcard.C3908i;
import com.google.android.finsky.playcard.C3909l;
import com.squareup.leakcanary.C7582R;

public final class C4238h {
    public static void m19670a(RecyclerView recyclerView) {
        recyclerView.setScrollingTouchSlop(1);
        Context context = recyclerView.getContext();
        recyclerView.m278a(new C3141d(context, C7582R.color.play_card_light_background));
        recyclerView.m278a(new C3145o(context.getResources()));
        recyclerView.m278a(new C3909l());
        recyclerView.m278a(new C3908i(context));
    }
}
