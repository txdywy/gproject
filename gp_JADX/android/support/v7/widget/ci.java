package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

public final class ci extends ev {
    public static final int[] f3274a = new int[]{16843284};
    public Drawable f3275b;
    public int f3276c;
    public final Rect f3277d = new Rect();

    public ci(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3274a);
        this.f3275b = obtainStyledAttributes.getDrawable(0);
        if (this.f3275b == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.f3276c = 1;
    }

    public final void mo784a(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        int i = 0;
        if (recyclerView.getLayoutManager() != null && this.f3275b != null) {
            int paddingLeft;
            int width;
            int childCount;
            View childAt;
            int round;
            if (this.f3276c == 1) {
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
                    RecyclerView.m254a(childAt, this.f3277d);
                    round = Math.round(childAt.getTranslationY()) + this.f3277d.bottom;
                    this.f3275b.setBounds(paddingLeft, round - this.f3275b.getIntrinsicHeight(), width, round);
                    this.f3275b.draw(canvas);
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
                recyclerView.getLayoutManager();
                RecyclerView.m260b(childAt, this.f3277d);
                round = Math.round(childAt.getTranslationX()) + this.f3277d.right;
                this.f3275b.setBounds(round - this.f3275b.getIntrinsicWidth(), paddingLeft, round, width);
                this.f3275b.draw(canvas);
                i++;
            }
            canvas.restore();
        }
    }

    public final void mo785a(Rect rect, View view, RecyclerView recyclerView, fo foVar) {
        if (this.f3275b == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f3276c == 1) {
            rect.set(0, 0, 0, this.f3275b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f3275b.getIntrinsicWidth(), 0);
        }
    }
}
