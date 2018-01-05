package com.google.android.play.p203b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.google.android.play.C6276b;
import com.google.android.play.k;

@TargetApi(5)
class C6272l implements C3918i {
    C6272l() {
    }

    public void mo3865a(View view, Context context, AttributeSet attributeSet, int i) {
        TypedArray a = C6272l.m28800a(context, attributeSet, i);
        Drawable c6275o = new C6275o(context.getResources(), a.getColorStateList(k.PlayCardViewGroup_playCardBackgroundColor), C6272l.m28798a(context, a), C6272l.m28802b(context, a), (float) C6272l.m28799a(a));
        c6275o.f16235H = C6272l.m28801a(view, a);
        view.setBackgroundDrawable(c6275o);
        a.recycle();
    }

    protected static TypedArray m28800a(Context context, AttributeSet attributeSet, int i) {
        return context.obtainStyledAttributes(attributeSet, k.PlayCardViewGroup, i, 0);
    }

    protected static float m28798a(Context context, TypedArray typedArray) {
        int dimensionPixelSize = context.getTheme().obtainStyledAttributes(new int[]{C6276b.playCardCornerRadius}).getDimensionPixelSize(0, -1);
        if (dimensionPixelSize < 0) {
            return (float) typedArray.getDimensionPixelSize(k.PlayCardViewGroup_playCardCornerRadius, 0);
        }
        return (float) dimensionPixelSize;
    }

    protected static float m28802b(Context context, TypedArray typedArray) {
        int dimensionPixelSize = context.getTheme().obtainStyledAttributes(new int[]{C6276b.playCardElevation}).getDimensionPixelSize(0, -1);
        if (dimensionPixelSize < 0) {
            return (float) typedArray.getDimensionPixelOffset(k.PlayCardViewGroup_playCardElevation, 0);
        }
        return (float) dimensionPixelSize;
    }

    protected static int m28799a(TypedArray typedArray) {
        return typedArray.getDimensionPixelSize(k.PlayCardViewGroup_playCardInset, 0);
    }

    protected static Rect m28801a(View view, TypedArray typedArray) {
        int i;
        int i2;
        Object obj = 1;
        if (ai.f1848a.mo400k(view) != 1) {
            obj = null;
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(k.PlayCardViewGroup_playCardInsetStart, -1);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(k.PlayCardViewGroup_playCardInsetTop, -1);
        int dimensionPixelSize3 = typedArray.getDimensionPixelSize(k.PlayCardViewGroup_playCardInsetEnd, -1);
        int dimensionPixelSize4 = typedArray.getDimensionPixelSize(k.PlayCardViewGroup_playCardInsetBottom, -1);
        if (obj != null) {
            i = dimensionPixelSize3;
        } else {
            i = dimensionPixelSize;
        }
        if (obj != null) {
            i2 = dimensionPixelSize;
        } else {
            i2 = dimensionPixelSize3;
        }
        return new Rect(i, dimensionPixelSize2, i2, dimensionPixelSize4);
    }

    public final void mo3864a(View view, int i) {
        Drawable background = view.getBackground();
        if (background instanceof C3140h) {
            ((C3140h) background).m16037b(i);
        } else {
            Log.w("CardViewGroupDelegates", "Unable to set background color. CardView is not using a CardViewBackgroundDrawable");
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
                    Log.w("CardViewGroupDelegates", "Unable to set background - ColorStateList not found.", e);
                    return;
                }
            }
            Log.w("CardViewGroupDelegates", "Unable to set background. CardView is not using a CardViewBackgroundDrawable.");
        }
    }
}
