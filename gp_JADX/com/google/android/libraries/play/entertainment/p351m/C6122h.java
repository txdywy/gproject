package com.google.android.libraries.play.entertainment.p351m;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C6122h {
    @TargetApi(16)
    public static void m28132a(View view, Drawable drawable) {
        if (C6115a.m28098b(16)) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }

    public static int[] m28134a(int i, int i2, float f) {
        int i3;
        int mode = MeasureSpec.getMode(i);
        int i4 = mode == MemoryMappedFileBuffer.DEFAULT_SIZE ? 1 : 0;
        int mode2 = MeasureSpec.getMode(i2);
        if (mode2 == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((i4 != 0 && i3 != 0) || ((mode == 0 && mode2 == 0) || Float.isNaN(f) || f < 5.960465E-8f || f > 1.6777215E7f)) {
            return null;
        }
        int size;
        if (i4 != 0) {
            size = MeasureSpec.getSize(i);
            i4 = Math.round(((float) size) / f);
            if (mode2 == Integer.MIN_VALUE) {
                i4 = Math.min(i4, MeasureSpec.getSize(i2));
            }
        } else if (i3 != 0) {
            i4 = MeasureSpec.getSize(i2);
            size = Math.round(((float) i4) * f);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(size, MeasureSpec.getSize(i));
            }
        } else {
            float size2;
            float size3 = mode == Integer.MIN_VALUE ? (float) MeasureSpec.getSize(i) : 1.6777215E7f;
            if (mode2 == Integer.MIN_VALUE) {
                size2 = (float) MeasureSpec.getSize(i2);
            } else {
                size2 = 1.6777215E7f;
            }
            if (size3 / size2 < f) {
                size = (int) size3;
                i4 = Math.round(((float) size) / f);
            } else {
                i4 = (int) size2;
                size = Math.round(((float) i4) * f);
            }
        }
        return new int[]{size, i4};
    }

    public static void m28131a(View view, Rect rect) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(rect.left - view.getPaddingLeft(), rect.top - view.getPaddingTop(), 0, 0);
            marginLayoutParams.width = (rect.width() + view.getPaddingLeft()) + view.getPaddingRight();
            marginLayoutParams.height = (rect.height() + view.getPaddingTop()) + view.getPaddingBottom();
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static boolean m28133a(View view, float f, float f2) {
        return f >= view.getX() && f < view.getX() + ((float) view.getWidth()) && f2 >= view.getY() && f2 < view.getY() + ((float) view.getHeight());
    }
}
