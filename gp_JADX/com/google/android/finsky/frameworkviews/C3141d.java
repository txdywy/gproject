package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.google.android.play.p203b.C6275o;
import com.squareup.leakcanary.C7582R;

public final class C3141d extends ev {
    public final Rect f16254a = new Rect();
    public Drawable f16255b = null;
    public int f16256c;
    public Context f16257d;
    public ColorStateList f16258e;
    public boolean f16259f = true;

    public C3141d(Context context, int i) {
        this.f16257d = context;
        this.f16258e = this.f16257d.getResources().getColorStateList(i);
    }

    public final void mo784a(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        this.f16254a.setEmpty();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            boolean z;
            View childAt = recyclerView.getChildAt(i);
            if ((childAt instanceof C3076f) && this.f16259f) {
                this.f16259f = false;
            }
            if (childAt instanceof C2625e) {
                z = true;
            } else if ((childAt instanceof BucketRowLayout) && (((BucketRowLayout) childAt).getChildAt(0) instanceof C2625e)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int round = Math.round(childAt.getTranslationY());
                this.f16254a.union(childAt.getLeft(), (childAt.getTop() + 0) + round, childAt.getRight(), round + childAt.getBottom());
                z = (childAt instanceof C3139a) && ((C3139a) childAt).mo4185a();
                if (z) {
                    m16040a(canvas);
                }
            } else {
                m16040a(canvas);
                this.f16259f = false;
            }
        }
        m16040a(canvas);
    }

    private final void m16040a(Canvas canvas) {
        if (!this.f16254a.isEmpty()) {
            Resources resources = this.f16257d.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.stream_intro_card_radius);
            int dimensionPixelSize2 = this.f16259f ? resources.getDimensionPixelSize(C7582R.dimen.play_card_default_inset) : 0;
            int dimensionPixelSize3 = resources.getDimensionPixelSize(C7582R.dimen.play_card_default_elevation);
            this.f16255b = new C6275o(resources, this.f16258e, (float) dimensionPixelSize, (float) dimensionPixelSize3, (float) dimensionPixelSize2);
            this.f16256c = dimensionPixelSize2 + dimensionPixelSize3;
            if (this.f16259f) {
                Rect rect = this.f16254a;
                rect.top -= this.f16256c;
                rect = this.f16254a;
                rect.bottom += this.f16256c;
            }
            this.f16255b.setBounds(this.f16254a);
            this.f16255b.draw(canvas);
            this.f16254a.setEmpty();
        }
    }
}
