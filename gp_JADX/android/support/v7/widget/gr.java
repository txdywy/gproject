package android.support.v7.widget;

import android.view.View;

public abstract class gr extends eq {
    public static final boolean DEBUG = false;
    public static final String TAG = "SimpleItemAnimator";
    public boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(fr frVar);

    public abstract boolean animateChange(fr frVar, fr frVar2, int i, int i2, int i3, int i4);

    public abstract boolean animateMove(fr frVar, int i, int i2, int i3, int i4);

    public abstract boolean animateRemove(fr frVar);

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }

    public boolean canReuseUpdatedViewHolder(fr frVar) {
        return !this.mSupportsChangeAnimations || frVar.m3273j();
    }

    public boolean animateDisappearance(fr frVar, et etVar, et etVar2) {
        int i = etVar.f3435a;
        int i2 = etVar.f3436b;
        View view = frVar.f3211a;
        int left = etVar2 == null ? view.getLeft() : etVar2.f3435a;
        int top = etVar2 == null ? view.getTop() : etVar2.f3436b;
        if (frVar.m3276m() || (i == left && i2 == top)) {
            return animateRemove(frVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(frVar, i, i2, left, top);
    }

    public boolean animateAppearance(fr frVar, et etVar, et etVar2) {
        if (etVar == null || (etVar.f3435a == etVar2.f3435a && etVar.f3436b == etVar2.f3436b)) {
            return animateAdd(frVar);
        }
        return animateMove(frVar, etVar.f3435a, etVar.f3436b, etVar2.f3435a, etVar2.f3436b);
    }

    public boolean animatePersistence(fr frVar, et etVar, et etVar2) {
        if (etVar.f3435a == etVar2.f3435a && etVar.f3436b == etVar2.f3436b) {
            dispatchMoveFinished(frVar);
            return false;
        }
        return animateMove(frVar, etVar.f3435a, etVar.f3436b, etVar2.f3435a, etVar2.f3436b);
    }

    public boolean animateChange(fr frVar, fr frVar2, et etVar, et etVar2) {
        int i;
        int i2;
        int i3 = etVar.f3435a;
        int i4 = etVar.f3436b;
        if (frVar2.m3265b()) {
            i = etVar.f3435a;
            i2 = etVar.f3436b;
        } else {
            i = etVar2.f3435a;
            i2 = etVar2.f3436b;
        }
        return animateChange(frVar, frVar2, i3, i4, i, i2);
    }

    public final void dispatchRemoveFinished(fr frVar) {
        onRemoveFinished(frVar);
        dispatchAnimationFinished(frVar);
    }

    public final void dispatchMoveFinished(fr frVar) {
        onMoveFinished(frVar);
        dispatchAnimationFinished(frVar);
    }

    public final void dispatchAddFinished(fr frVar) {
        onAddFinished(frVar);
        dispatchAnimationFinished(frVar);
    }

    public final void dispatchChangeFinished(fr frVar, boolean z) {
        onChangeFinished(frVar, z);
        dispatchAnimationFinished(frVar);
    }

    public final void dispatchRemoveStarting(fr frVar) {
        onRemoveStarting(frVar);
    }

    public final void dispatchMoveStarting(fr frVar) {
        onMoveStarting(frVar);
    }

    public final void dispatchAddStarting(fr frVar) {
        onAddStarting(frVar);
    }

    public final void dispatchChangeStarting(fr frVar, boolean z) {
        onChangeStarting(frVar, z);
    }

    public void onRemoveStarting(fr frVar) {
    }

    public void onRemoveFinished(fr frVar) {
    }

    public void onAddStarting(fr frVar) {
    }

    public void onAddFinished(fr frVar) {
    }

    public void onMoveStarting(fr frVar) {
    }

    public void onMoveFinished(fr frVar) {
    }

    public void onChangeStarting(fr frVar, boolean z) {
    }

    public void onChangeFinished(fr frVar, boolean z) {
    }
}
