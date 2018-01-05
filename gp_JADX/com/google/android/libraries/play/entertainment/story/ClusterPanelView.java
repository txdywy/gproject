package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6122h;
import com.google.android.play.p184e.C2629a;

public class ClusterPanelView extends LinearLayout implements C2629a {
    public RecyclerView f30303a;

    public ClusterPanelView(Context context) {
        this(context, null);
    }

    public ClusterPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f30303a = (RecyclerView) findViewById(C6089g.slider_recycler_view);
    }

    public final boolean mo2996a(float f, float f2) {
        return C6122h.m28133a((View) C6116b.m28100a(this.f30303a), f, f2);
    }

    public final void as_() {
    }

    public int getHorizontalScrollerTop() {
        return ((RecyclerView) C6116b.m28100a(this.f30303a)).getTop();
    }

    public int getHorizontalScrollerBottom() {
        return ((RecyclerView) C6116b.m28100a(this.f30303a)).getBottom();
    }
}
