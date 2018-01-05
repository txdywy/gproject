package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public abstract class eq {
    public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    public static final int FLAG_CHANGED = 2;
    public static final int FLAG_INVALIDATED = 4;
    public static final int FLAG_MOVED = 2048;
    public static final int FLAG_REMOVED = 8;
    public long mAddDuration = 120;
    public long mChangeDuration = 250;
    public ArrayList mFinishedListeners = new ArrayList();
    public es mListener = null;
    public long mMoveDuration = 250;
    public long mRemoveDuration = 120;

    public abstract boolean animateAppearance(fr frVar, et etVar, et etVar2);

    public abstract boolean animateChange(fr frVar, fr frVar2, et etVar, et etVar2);

    public abstract boolean animateDisappearance(fr frVar, et etVar, et etVar2);

    public abstract boolean animatePersistence(fr frVar, et etVar, et etVar2);

    public abstract void endAnimation(fr frVar);

    public abstract void endAnimations();

    public abstract boolean isRunning();

    public abstract void runPendingAnimations();

    public long getMoveDuration() {
        return this.mMoveDuration;
    }

    public void setMoveDuration(long j) {
        this.mMoveDuration = j;
    }

    public long getAddDuration() {
        return this.mAddDuration;
    }

    public void setAddDuration(long j) {
        this.mAddDuration = j;
    }

    public long getRemoveDuration() {
        return this.mRemoveDuration;
    }

    public void setRemoveDuration(long j) {
        this.mRemoveDuration = j;
    }

    public long getChangeDuration() {
        return this.mChangeDuration;
    }

    public void setChangeDuration(long j) {
        this.mChangeDuration = j;
    }

    void setListener(es esVar) {
        this.mListener = esVar;
    }

    public et recordPreLayoutInformation(fo foVar, fr frVar, int i, List list) {
        et obtainHolderInfo = obtainHolderInfo();
        View view = frVar.f3211a;
        obtainHolderInfo.f3435a = view.getLeft();
        obtainHolderInfo.f3436b = view.getTop();
        view.getRight();
        view.getBottom();
        return obtainHolderInfo;
    }

    public et recordPostLayoutInformation(fo foVar, fr frVar) {
        et obtainHolderInfo = obtainHolderInfo();
        View view = frVar.f3211a;
        obtainHolderInfo.f3435a = view.getLeft();
        obtainHolderInfo.f3436b = view.getTop();
        view.getRight();
        view.getBottom();
        return obtainHolderInfo;
    }

    static int buildAdapterChangeFlagsForAnimations(fr frVar) {
        int i = frVar.f3220j & 14;
        if (frVar.m3273j()) {
            return 4;
        }
        if ((i & 4) != 0) {
            return i;
        }
        int i2 = frVar.f3214d;
        int d = frVar.m3267d();
        if (i2 == -1 || d == -1 || i2 == d) {
            return i;
        }
        return i | FLAG_MOVED;
    }

    public final void dispatchAnimationFinished(fr frVar) {
        onAnimationFinished(frVar);
        if (this.mListener != null) {
            this.mListener.mo866a(frVar);
        }
    }

    public void onAnimationFinished(fr frVar) {
    }

    public final void dispatchAnimationStarted(fr frVar) {
        onAnimationStarted(frVar);
    }

    public void onAnimationStarted(fr frVar) {
    }

    public final boolean isRunning(er erVar) {
        boolean isRunning = isRunning();
        if (erVar != null) {
            if (isRunning) {
                this.mFinishedListeners.add(erVar);
            } else {
                erVar.m3648a();
            }
        }
        return isRunning;
    }

    public boolean canReuseUpdatedViewHolder(fr frVar) {
        return true;
    }

    public boolean canReuseUpdatedViewHolder(fr frVar, List list) {
        return canReuseUpdatedViewHolder(frVar);
    }

    public final void dispatchAnimationsFinished() {
        int size = this.mFinishedListeners.size();
        for (int i = 0; i < size; i++) {
            ((er) this.mFinishedListeners.get(i)).m3648a();
        }
        this.mFinishedListeners.clear();
    }

    public et obtainHolderInfo() {
        return new et();
    }
}
