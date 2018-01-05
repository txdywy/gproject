package com.google.android.play.animation;

import android.os.Build.VERSION;
import android.support.v7.widget.bx;
import android.support.v7.widget.fr;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;

public class ShuffleAddItemAnimator extends bx {
    public static final boolean DEBUG = false;
    public static final int SHUFFLE_MODE_ALWAYS = 0;
    public static final int SHUFFLE_MODE_SINGLE_SHOT = 1;
    public ArrayList mAdditionsList;
    public boolean mChangeAnimationsDisabled;
    public boolean mHasPendingShuffle;
    public final ArrayList mPendingDefaultAdditions;
    public final ArrayList mPendingShuffleAdditions;
    public final ArrayList mRunningAddAnimations;
    public final int mShuffleMode;

    public void setChangeAnimationsDisabled(boolean z) {
        this.mChangeAnimationsDisabled = z;
    }

    public ShuffleAddItemAnimator() {
        this(0);
    }

    public ShuffleAddItemAnimator(int i) {
        this.mPendingShuffleAdditions = new ArrayList();
        this.mPendingDefaultAdditions = new ArrayList();
        this.mRunningAddAnimations = new ArrayList();
        this.mAdditionsList = new ArrayList();
        this.mChangeAnimationsDisabled = false;
        this.mHasPendingShuffle = true;
        this.mShuffleMode = i;
    }

    public void setShuffleOnNextAdd(boolean z) {
        if (this.mShuffleMode == 1) {
            this.mHasPendingShuffle = z;
            if (z) {
                this.mPendingShuffleAdditions.addAll(this.mPendingDefaultAdditions);
                this.mPendingDefaultAdditions.clear();
                return;
            }
            this.mPendingDefaultAdditions.addAll(this.mPendingShuffleAdditions);
            this.mPendingShuffleAdditions.clear();
            return;
        }
        throw new IllegalStateException("SHUFFLE_MODE_SINGLE_SHOT required.");
    }

    private boolean shouldShufflePendingAdds() {
        switch (this.mShuffleMode) {
            case 0:
                return true;
            case 1:
                return this.mHasPendingShuffle;
            default:
                throw new IllegalStateException("Unsupported shuffle mode.");
        }
    }

    public boolean animateChange(fr frVar, fr frVar2, int i, int i2, int i3, int i4) {
        if (!this.mChangeAnimationsDisabled) {
            return super.animateChange(frVar, frVar2, i, i2, i3, i4);
        }
        if (frVar != null) {
            dispatchChangeFinished(frVar, true);
        }
        if (frVar2 == null) {
            return false;
        }
        dispatchChangeFinished(frVar2, false);
        return false;
    }

    public void runPendingAnimations() {
        ArrayList arrayList = this.mPendingDefaultAdditions;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            super.animateAdd((fr) obj);
        }
        this.mPendingDefaultAdditions.clear();
        super.runPendingAnimations();
        if (shouldShufflePendingAdds() && !this.mPendingShuffleAdditions.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(this.mPendingShuffleAdditions);
            this.mAdditionsList.add(arrayList2);
            this.mPendingShuffleAdditions.clear();
            this.mHasPendingShuffle = false;
            arrayList = arrayList2;
            size = arrayList.size();
            i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                animateAddImpl((fr) obj2);
            }
            arrayList2.clear();
            this.mAdditionsList.remove(arrayList2);
        }
    }

    public boolean animateAdd(fr frVar) {
        endAnimation(frVar);
        frVar.f3211a.setAlpha(0.0f);
        if (VERSION.SDK_INT >= 18 && shouldAnimateAsShuffle(frVar) && shouldShufflePendingAdds()) {
            this.mPendingShuffleAdditions.add(frVar);
        } else {
            this.mPendingDefaultAdditions.add(frVar);
        }
        return true;
    }

    private void animateAddImpl(fr frVar) {
        View view = frVar.f3211a;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null) {
            dispatchAddFinished(frVar);
            return;
        }
        this.mRunningAddAnimations.add(frVar);
        ViewPropertyAnimator createShuffleAnimation = createShuffleAnimation(view, viewGroup);
        createShuffleAnimation.setListener(new C6244g(this, view, frVar, createShuffleAnimation)).start();
    }

    protected ViewPropertyAnimator createShuffleAnimation(View view, ViewGroup viewGroup) {
        if (!C6246i.f31256a) {
            return null;
        }
        View rootView = view.getRootView();
        view.getLocationInWindow(C6246i.f31257b);
        viewGroup.getLocationInWindow(C6246i.f31258c);
        float height = ((float) (C6246i.f31257b[1] - C6246i.f31258c[1])) / ((float) rootView.getHeight());
        float width = ((float) (C6246i.f31257b[0] - C6246i.f31258c[0])) / ((float) rootView.getWidth());
        view.getWidth();
        view.setTranslationY((float) viewGroup.getHeight());
        view.setRotation(16.0f);
        long min = Math.min(Math.max(0, (long) ((width * 150.0f) + (height * 350.0f))) + 250, 500);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY(0.0f).rotation(0.0f).setDuration(min);
        if (VERSION.SDK_INT < 21) {
            return animate;
        }
        animate.setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), 17563662));
        return animate;
    }

    protected boolean shouldAnimateAsShuffle(fr frVar) {
        return (frVar instanceof C6245h) && ((C6245h) frVar).m28756a();
    }

    public void endAnimation(fr frVar) {
        super.endAnimation(frVar);
        View view = frVar.f3211a;
        if (this.mPendingShuffleAdditions.remove(frVar)) {
            reset(view);
            dispatchAddFinished(frVar);
        }
        for (int size = this.mAdditionsList.size() - 1; size >= 0; size--) {
            ArrayList arrayList = (ArrayList) this.mAdditionsList.get(size);
            if (arrayList.remove(frVar)) {
                reset(view);
                dispatchAddFinished(frVar);
                if (arrayList.isEmpty()) {
                    this.mAdditionsList.remove(arrayList);
                }
            }
        }
        this.mRunningAddAnimations.remove(frVar);
        dispatchFinishedWhenDone();
    }

    public boolean isRunning() {
        return (!super.isRunning() && this.mPendingShuffleAdditions.isEmpty() && this.mAdditionsList.isEmpty()) ? false : true;
    }

    private void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    private void reset(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
    }

    public void endAnimations() {
        for (int size = this.mPendingShuffleAdditions.size() - 1; size >= 0; size--) {
            fr frVar = (fr) this.mPendingShuffleAdditions.get(size);
            reset(frVar.f3211a);
            dispatchAddFinished(frVar);
            this.mPendingShuffleAdditions.remove(size);
        }
        for (int size2 = this.mAdditionsList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.mAdditionsList.get(size2);
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                fr frVar2 = (fr) arrayList.get(size3);
                reset(frVar2.f3211a);
                dispatchAddFinished(frVar2);
                arrayList.remove(size3);
                if (arrayList.isEmpty()) {
                    this.mAdditionsList.remove(arrayList);
                }
            }
        }
        cancelAllAnimations(this.mRunningAddAnimations);
        super.endAnimations();
    }

    private void cancelAllAnimations(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((fr) list.get(size)).f3211a.animate().cancel();
        }
    }
}
