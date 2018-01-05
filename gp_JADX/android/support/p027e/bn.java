package android.support.p027e;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

final class bn extends ViewGroup {
    public ViewGroup f1098a;
    public View f1099b;
    public ArrayList f1100c = null;
    public bm f1101d;

    bn(Context context, ViewGroup viewGroup, View view, bm bmVar) {
        super(context);
        this.f1098a = viewGroup;
        this.f1099b = view;
        setRight(viewGroup.getWidth());
        setBottom(viewGroup.getHeight());
        viewGroup.addView(this);
        this.f1101d = bmVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (this.f1100c != null && this.f1100c.contains(drawable));
    }

    public final void m937a(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (!(viewGroup == this.f1098a || viewGroup.getParent() == null || !ai.f1848a.mo410t(viewGroup))) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                this.f1098a.getLocationOnScreen(iArr2);
                ai.m1847e(view, iArr[0] - iArr2[0]);
                ai.m1844d(view, iArr[1] - iArr2[1]);
            }
            viewGroup.removeView(view);
            if (view.getParent() != null) {
                viewGroup.removeView(view);
            }
        }
        super.addView(view, getChildCount() - 1);
    }

    public final void m938b(View view) {
        super.removeView(view);
        Object obj = (getChildCount() == 0 && (this.f1100c == null || this.f1100c.size() == 0)) ? 1 : null;
        if (obj != null) {
            this.f1098a.removeView(this);
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidate(drawable.getBounds());
    }

    protected final void dispatchDraw(Canvas canvas) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.f1098a.getLocationOnScreen(iArr);
        this.f1099b.getLocationOnScreen(iArr2);
        canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
        canvas.clipRect(new Rect(0, 0, this.f1099b.getWidth(), this.f1099b.getHeight()));
        super.dispatchDraw(canvas);
        int size = this.f1100c == null ? 0 : this.f1100c.size();
        for (int i = 0; i < size; i++) {
            ((Drawable) this.f1100c.get(i)).draw(canvas);
        }
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (this.f1098a != null) {
            rect.offset(iArr[0], iArr[1]);
            if (this.f1098a instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                this.f1098a.getLocationOnScreen(iArr3);
                this.f1099b.getLocationOnScreen(iArr4);
                iArr2[0] = iArr4[0] - iArr3[0];
                iArr2[1] = iArr4[1] - iArr3[1];
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
        }
        return null;
    }

    static {
        try {
            ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
        } catch (NoSuchMethodException e) {
        }
    }
}
