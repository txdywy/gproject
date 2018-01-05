package com.google.android.play.p203b;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0357n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.google.android.play.C6282d;
import com.google.android.play.k;
import com.google.android.play.layout.p;
import com.google.android.play.layout.q;

class C6268f implements C6266d {
    C6268f() {
    }

    public final void mo3865a(View view, Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.PlayCardBubbleViewGroup, i, 0);
        int a = C0357n.m2043a(obtainStyledAttributes.getInt(k.PlayCardBubbleViewGroup_playCardBubbleGravity, 48), com.google.android.play.utils.k.b(view.getContext()) ? 0 : 1);
        float dimension = obtainStyledAttributes.getDimension(k.PlayCardBubbleViewGroup_playCardBubbleSize, 0.0f);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(k.PlayCardBubbleViewGroup_playCardBubbleOffset, 0);
        int i2 = obtainStyledAttributes.getInt(k.PlayCardBubbleViewGroup_playCardBubblePosition, 1);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, k.PlayCardViewGroup, i, 0);
        Resources resources = context.getResources();
        float dimension2 = obtainStyledAttributes2.getDimension(k.PlayCardViewGroup_playCardCornerRadius, 0.0f);
        float dimensionPixelSize = (float) obtainStyledAttributes2.getDimensionPixelSize(k.PlayCardViewGroup_playCardInset, 0);
        float dimension3 = obtainStyledAttributes2.getDimension(k.PlayCardViewGroup_playCardElevation, 0.0f);
        view.setBackgroundDrawable(new C6263a(resources, obtainStyledAttributes2.getColorStateList(k.PlayCardViewGroup_playCardBackgroundColor), dimension2, dimensionPixelSize, dimension3, dimension, a, dimensionPixelOffset, i2));
        if (view instanceof q) {
            ((q) view).setForeground(mo5368a(resources, dimension2, dimensionPixelSize, dimension3, dimension, a, dimensionPixelOffset, i2));
        }
        int[] iArr = new int[]{view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()};
        if (view instanceof p) {
            ((p) view).a();
        }
        int i3 = iArr[0] + ((int) (a == 3 ? dimension : 0.0f));
        int i4 = iArr[1] + ((int) (a == 48 ? dimension : 0.0f));
        int i5 = ((int) (a == 5 ? dimension : 0.0f)) + iArr[2];
        int i6 = iArr[3];
        if (a != 80) {
            dimension = 0.0f;
        }
        view.setPadding(i3, i4, i5, i6 + ((int) dimension));
        obtainStyledAttributes2.recycle();
    }

    protected Drawable mo5368a(Resources resources, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        return new C6264b(resources, C6282d.play_overlay_highlight_fill, f, f2, f3, f4, i, i2, i3);
    }

    public final void mo3864a(View view, int i) {
        Drawable background = view.getBackground();
        if (background instanceof C3140h) {
            ((C3140h) background).m16037b(i);
        } else {
            Log.w("BubbleViewGroupDelegate", "Unable to set background color. CardView is not using a CardViewBackgroundDrawable");
        }
    }

    public final void mo3866b(View view, int i) {
        if (i != 0) {
            Resources resources = view.getResources();
            Drawable background = view.getBackground();
            if (background instanceof C3140h) {
                try {
                    ((C3140h) background).m16036a(resources.getColorStateList(i));
                    return;
                } catch (Throwable e) {
                    Log.w("BubbleViewGroupDelegate", "Unable to set background - ColorStateList not found.", e);
                    return;
                }
            }
            Log.w("BubbleViewGroupDelegate", "Unable to set background. CardView is not using a CardViewBackgroundDrawable.");
        }
    }

    private static C6263a m28785b(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C6263a) {
            return (C6263a) background;
        }
        throw new IllegalArgumentException("Given view was not initialized by this CardBubbleViewGroupDelegate");
    }

    public final void mo5367c(View view, int i) {
        C6268f.m28785b(view).m28779a(i);
        mo5369d(view, i);
    }

    protected void mo5369d(View view, int i) {
        if (view instanceof q) {
            Drawable foreground = ((q) view).getForeground();
            if (foreground instanceof C6264b) {
                C6263a c6263a = (C6264b) foreground;
            } else {
                throw new IllegalArgumentException("Given view was not initialized by this CardBubbleViewGroupDelegate");
            }
        }
        c6263a = null;
        if (c6263a != null) {
            c6263a.m28779a(i);
        }
    }

    public final int mo5366a(View view) {
        boolean b = com.google.android.play.utils.k.b(view.getContext());
        int i = C6268f.m28785b(view).f31301j;
        switch (i) {
            case 3:
                if (b) {
                    return 8388611;
                }
                return 8388613;
            case 5:
                if (b) {
                    return 8388613;
                }
                return 8388611;
            default:
                return i;
        }
    }
}
