package android.support.v7.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.view.ai;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

public class bx extends gr {
    public static final boolean DEBUG = false;
    public static TimeInterpolator sDefaultInterpolator;
    public ArrayList mAddAnimations = new ArrayList();
    public ArrayList mAdditionsList = new ArrayList();
    public ArrayList mChangeAnimations = new ArrayList();
    public ArrayList mChangesList = new ArrayList();
    public ArrayList mMoveAnimations = new ArrayList();
    public ArrayList mMovesList = new ArrayList();
    public ArrayList mPendingAdditions = new ArrayList();
    public ArrayList mPendingChanges = new ArrayList();
    public ArrayList mPendingMoves = new ArrayList();
    public ArrayList mPendingRemovals = new ArrayList();
    public ArrayList mRemoveAnimations = new ArrayList();

    public void runPendingAnimations() {
        int i;
        int i2;
        int i3;
        int i4 = !this.mPendingRemovals.isEmpty() ? 1 : 0;
        if (this.mPendingMoves.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        if (this.mPendingChanges.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (this.mPendingAdditions.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (i4 != 0 || i != 0 || i3 != 0 || i2 != 0) {
            Runnable byVar;
            ArrayList arrayList = this.mPendingRemovals;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                animateRemoveImpl((fr) obj);
            }
            this.mPendingRemovals.clear();
            if (i != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                byVar = new by(this, arrayList);
                if (i4 != 0) {
                    ai.m1831a(((ch) arrayList.get(0)).f3269a.f3211a, byVar, getRemoveDuration());
                } else {
                    byVar.run();
                }
            }
            if (i2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList);
                this.mPendingChanges.clear();
                byVar = new bz(this, arrayList);
                if (i4 != 0) {
                    ai.m1831a(((cg) arrayList.get(0)).f3263a.f3211a, byVar, getRemoveDuration());
                } else {
                    byVar.run();
                }
            }
            if (i3 != 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList2);
                this.mPendingAdditions.clear();
                Runnable caVar = new ca(this, arrayList2);
                if (i4 == 0 && i == 0 && i2 == 0) {
                    caVar.run();
                    return;
                }
                long removeDuration;
                long moveDuration;
                long changeDuration;
                if (i4 != 0) {
                    removeDuration = getRemoveDuration();
                } else {
                    removeDuration = 0;
                }
                if (i != 0) {
                    moveDuration = getMoveDuration();
                } else {
                    moveDuration = 0;
                }
                if (i2 != 0) {
                    changeDuration = getChangeDuration();
                } else {
                    changeDuration = 0;
                }
                ai.m1831a(((fr) arrayList2.get(0)).f3211a, caVar, removeDuration + Math.max(moveDuration, changeDuration));
            }
        }
    }

    public boolean animateRemove(fr frVar) {
        resetAnimation(frVar);
        this.mPendingRemovals.add(frVar);
        return true;
    }

    private void animateRemoveImpl(fr frVar) {
        View view = frVar.f3211a;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(frVar);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new cb(this, frVar, animate, view)).start();
    }

    public boolean animateAdd(fr frVar) {
        resetAnimation(frVar);
        frVar.f3211a.setAlpha(0.0f);
        this.mPendingAdditions.add(frVar);
        return true;
    }

    void animateAddImpl(fr frVar) {
        View view = frVar.f3211a;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(frVar);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new cc(this, frVar, view, animate)).start();
    }

    public boolean animateMove(fr frVar, int i, int i2, int i3, int i4) {
        View view = frVar.f3211a;
        int translationX = i + ((int) frVar.f3211a.getTranslationX());
        int translationY = i2 + ((int) frVar.f3211a.getTranslationY());
        resetAnimation(frVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(frVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.mPendingMoves.add(new ch(frVar, translationX, translationY, i3, i4));
        return true;
    }

    void animateMoveImpl(fr frVar, int i, int i2, int i3, int i4) {
        View view = frVar.f3211a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(frVar);
        animate.setDuration(getMoveDuration()).setListener(new cd(this, frVar, i5, view, i6, animate)).start();
    }

    public boolean animateChange(fr frVar, fr frVar2, int i, int i2, int i3, int i4) {
        if (frVar == frVar2) {
            return animateMove(frVar, i, i2, i3, i4);
        }
        float translationX = frVar.f3211a.getTranslationX();
        float translationY = frVar.f3211a.getTranslationY();
        float alpha = frVar.f3211a.getAlpha();
        resetAnimation(frVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        frVar.f3211a.setTranslationX(translationX);
        frVar.f3211a.setTranslationY(translationY);
        frVar.f3211a.setAlpha(alpha);
        if (frVar2 != null) {
            resetAnimation(frVar2);
            frVar2.f3211a.setTranslationX((float) (-i5));
            frVar2.f3211a.setTranslationY((float) (-i6));
            frVar2.f3211a.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new cg(frVar, frVar2, i, i2, i3, i4));
        return true;
    }

    void animateChangeImpl(cg cgVar) {
        View view = null;
        fr frVar = cgVar.f3263a;
        View view2 = frVar == null ? null : frVar.f3211a;
        fr frVar2 = cgVar.f3264b;
        if (frVar2 != null) {
            view = frVar2.f3211a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(cgVar.f3263a);
            duration.translationX((float) (cgVar.f3267e - cgVar.f3265c));
            duration.translationY((float) (cgVar.f3268f - cgVar.f3266d));
            duration.alpha(0.0f).setListener(new ce(this, cgVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.mChangeAnimations.add(cgVar.f3264b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new cf(this, cgVar, animate, view)).start();
        }
    }

    private void endChangeAnimation(List list, fr frVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            cg cgVar = (cg) list.get(size);
            if (endChangeAnimationIfNecessary(cgVar, frVar) && cgVar.f3263a == null && cgVar.f3264b == null) {
                list.remove(cgVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(cg cgVar) {
        if (cgVar.f3263a != null) {
            endChangeAnimationIfNecessary(cgVar, cgVar.f3263a);
        }
        if (cgVar.f3264b != null) {
            endChangeAnimationIfNecessary(cgVar, cgVar.f3264b);
        }
    }

    private boolean endChangeAnimationIfNecessary(cg cgVar, fr frVar) {
        boolean z = false;
        if (cgVar.f3264b == frVar) {
            cgVar.f3264b = null;
        } else if (cgVar.f3263a != frVar) {
            return false;
        } else {
            cgVar.f3263a = null;
            z = true;
        }
        frVar.f3211a.setAlpha(1.0f);
        frVar.f3211a.setTranslationX(0.0f);
        frVar.f3211a.setTranslationY(0.0f);
        dispatchChangeFinished(frVar, z);
        return true;
    }

    public void endAnimation(fr frVar) {
        int size;
        View view = frVar.f3211a;
        view.animate().cancel();
        for (size = this.mPendingMoves.size() - 1; size >= 0; size--) {
            if (((ch) this.mPendingMoves.get(size)).f3269a == frVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(frVar);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, frVar);
        if (this.mPendingRemovals.remove(frVar)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(frVar);
        }
        if (this.mPendingAdditions.remove(frVar)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(frVar);
        }
        for (size = this.mChangesList.size() - 1; size >= 0; size--) {
            ArrayList arrayList = (ArrayList) this.mChangesList.get(size);
            endChangeAnimation(arrayList, frVar);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size);
            }
        }
        for (int size2 = this.mMovesList.size() - 1; size2 >= 0; size2--) {
            arrayList = (ArrayList) this.mMovesList.get(size2);
            int size3 = arrayList.size() - 1;
            while (size3 >= 0) {
                if (((ch) arrayList.get(size3)).f3269a == frVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(frVar);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(size2);
                    }
                } else {
                    size3--;
                }
            }
        }
        for (size = this.mAdditionsList.size() - 1; size >= 0; size--) {
            arrayList = (ArrayList) this.mAdditionsList.get(size);
            if (arrayList.remove(frVar)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(frVar);
                if (arrayList.isEmpty()) {
                    this.mAdditionsList.remove(size);
                }
            }
        }
        this.mRemoveAnimations.remove(frVar);
        this.mAddAnimations.remove(frVar);
        this.mChangeAnimations.remove(frVar);
        this.mMoveAnimations.remove(frVar);
        dispatchFinishedWhenDone();
    }

    private void resetAnimation(fr frVar) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        frVar.f3211a.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(frVar);
    }

    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    public void endAnimations() {
        int size;
        for (size = this.mPendingMoves.size() - 1; size >= 0; size--) {
            ch chVar = (ch) this.mPendingMoves.get(size);
            View view = chVar.f3269a.f3211a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(chVar.f3269a);
            this.mPendingMoves.remove(size);
        }
        for (size = this.mPendingRemovals.size() - 1; size >= 0; size--) {
            dispatchRemoveFinished((fr) this.mPendingRemovals.get(size));
            this.mPendingRemovals.remove(size);
        }
        for (size = this.mPendingAdditions.size() - 1; size >= 0; size--) {
            fr frVar = (fr) this.mPendingAdditions.get(size);
            frVar.f3211a.setAlpha(1.0f);
            dispatchAddFinished(frVar);
            this.mPendingAdditions.remove(size);
        }
        for (size = this.mPendingChanges.size() - 1; size >= 0; size--) {
            endChangeAnimationIfNecessary((cg) this.mPendingChanges.get(size));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            int size2;
            ArrayList arrayList;
            int size3;
            for (size2 = this.mMovesList.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.mMovesList.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    ch chVar2 = (ch) arrayList.get(size3);
                    View view2 = chVar2.f3269a.f3211a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(chVar2.f3269a);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (size2 = this.mAdditionsList.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.mAdditionsList.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    fr frVar2 = (fr) arrayList.get(size3);
                    frVar2.f3211a.setAlpha(1.0f);
                    dispatchAddFinished(frVar2);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.mAdditionsList.remove(arrayList);
                    }
                }
            }
            for (size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
                arrayList = (ArrayList) this.mChangesList.get(size2);
                for (size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    endChangeAnimationIfNecessary((cg) arrayList.get(size3));
                    if (arrayList.isEmpty()) {
                        this.mChangesList.remove(arrayList);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    void cancelAll(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((fr) list.get(size)).f3211a.animate().cancel();
        }
    }

    public boolean canReuseUpdatedViewHolder(fr frVar, List list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(frVar, list);
    }
}
