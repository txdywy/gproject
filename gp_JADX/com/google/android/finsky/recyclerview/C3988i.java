package com.google.android.finsky.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.util.Log;
import android.view.View;

public class C3988i extends ev {
    public static final int[] f20082a = new int[]{16843284};
    public Drawable f20083b;
    public int f20084c;
    public final Rect f20085d = new Rect();

    public C3988i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f20082a);
        this.f20083b = obtainStyledAttributes.getDrawable(0);
        if (this.f20083b == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this FinskyDividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.f20084c = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    public final void mo784a(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        int i = 0;
        if (recyclerView.getLayoutManager() != null && this.f20083b != null) {
            int paddingLeft;
            int width;
            int childCount;
            View childAt;
            int round;
            if (this.f20084c == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    paddingLeft = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    paddingLeft = 0;
                }
                childCount = recyclerView.getChildCount();
                while (i < childCount) {
                    childAt = recyclerView.getChildAt(i);
                    if (mo4205a(childAt, recyclerView)) {
                        RecyclerView.m254a(childAt, this.f20085d);
                        round = Math.round(childAt.getTranslationY()) + this.f20085d.bottom;
                        this.f20083b.setBounds(paddingLeft, round - this.f20083b.getIntrinsicHeight(), width, round);
                        this.f20083b.draw(canvas);
                    }
                    i++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingTop();
                width = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), paddingLeft, recyclerView.getWidth() - recyclerView.getPaddingRight(), width);
            } else {
                width = recyclerView.getHeight();
                paddingLeft = 0;
            }
            childCount = recyclerView.getChildCount();
            while (i < childCount) {
                childAt = recyclerView.getChildAt(i);
                if (mo4205a(childAt, recyclerView)) {
                    recyclerView.getLayoutManager();
                    RecyclerView.m260b(childAt, this.f20085d);
                    round = Math.round(childAt.getTranslationX()) + this.f20085d.right;
                    this.f20083b.setBounds(round - this.f20083b.getIntrinsicWidth(), paddingLeft, round, width);
                    this.f20083b.draw(canvas);
                }
                i++;
            }
            canvas.restore();
        }
    }

    public final void mo785a(Rect rect, View view, RecyclerView recyclerView, fo foVar) {
        if (this.f20083b == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f20084c == 1) {
            rect.set(0, 0, 0, this.f20083b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f20083b.getIntrinsicWidth(), 0);
        }
    }

    public boolean mo4205a(View view, RecyclerView recyclerView) {
        return true;
    }
}
