package android.support.p027e;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

class bt implements by {
    bt() {
    }

    public bp mo234a(View view) {
        return bm.m919c(view);
    }

    public cf mo238b(View view) {
        return new cd(view.getWindowToken());
    }

    public void mo235a(View view, float f) {
        Float f2 = (Float) view.getTag(ak.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    public float mo240c(View view) {
        Float f = (Float) view.getTag(ak.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    public void mo241d(View view) {
        if (view.getTag(ak.save_non_transition_alpha) == null) {
            view.setTag(ak.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    public void mo242e(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(ak.save_non_transition_alpha, null);
        }
    }

    public void mo237a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo237a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void mo239b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo239b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    public void mo236a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }
}
