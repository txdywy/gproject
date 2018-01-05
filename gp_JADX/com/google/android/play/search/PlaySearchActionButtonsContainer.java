package com.google.android.play.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.play.g;

public class PlaySearchActionButtonsContainer extends LinearLayout implements C6407o {
    public C6420m f32293a;
    public PlaySearchActionButton f32294b;

    public PlaySearchActionButtonsContainer(Context context) {
        this(context, null);
    }

    public PlaySearchActionButtonsContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchActionButtonsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f32294b = (PlaySearchActionButton) findViewById(g.action_button);
    }

    public void setPlaySearchController(C6420m c6420m) {
        this.f32294b.setPlaySearchController(c6420m);
        this.f32293a = c6420m;
        this.f32293a.m29442a((C6407o) this);
    }

    public final void mo5425a(int i) {
        int i2 = 0;
        int i3 = i == 1 ? 0 : 8;
        if (getChildCount() != 1) {
            while (i2 < getChildCount()) {
                View childAt = getChildAt(i2);
                if (childAt != this.f32294b) {
                    childAt.setVisibility(i3);
                }
                i2++;
            }
        }
    }

    public final void mo5428a(String str, boolean z) {
    }

    public final void mo5426a(C6429w c6429w) {
    }

    public final boolean mo5429b(C6429w c6429w) {
        return false;
    }

    public final void mo5427a(String str) {
    }
}
