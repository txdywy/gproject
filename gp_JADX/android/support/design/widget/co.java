package android.support.design.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

final class co {
    public static final ThreadLocal f956a = new ThreadLocal();
    public static final ThreadLocal f957b = new ThreadLocal();

    static void m769a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix2 = (Matrix) f956a.get();
        if (matrix2 == null) {
            matrix2 = new Matrix();
            f956a.set(matrix2);
            matrix = matrix2;
        } else {
            matrix2.reset();
            matrix = matrix2;
        }
        m770a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f957b.get();
        if (rectF == null) {
            rectF = new RectF();
            f957b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    private static void m770a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m770a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
