package android.support.v7.widget;

import android.util.SparseArray;

public final class fo {
    public int f3464a = -1;
    public SparseArray f3465b;
    public int f3466c = 0;
    public int f3467d = 0;
    public int f3468e = 1;
    public int f3469f = 0;
    public boolean f3470g = false;
    public boolean f3471h = false;
    public boolean f3472i = false;
    public boolean f3473j = false;
    public boolean f3474k = false;
    public int f3475l;
    public long f3476m;
    public int f3477n;

    final void m3706a(int i) {
        if ((this.f3468e & i) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3468e));
        }
    }

    public final Object m3708b(int i) {
        if (this.f3465b == null) {
            return null;
        }
        return this.f3465b.get(i);
    }

    public final void m3707a(int i, Object obj) {
        if (this.f3465b == null) {
            this.f3465b = new SparseArray();
        }
        this.f3465b.put(i, obj);
    }

    public final int m3705a() {
        return this.f3471h ? this.f3466c - this.f3467d : this.f3469f;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3464a + ", mData=" + this.f3465b + ", mItemCount=" + this.f3469f + ", mPreviousLayoutItemCount=" + this.f3466c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3467d + ", mStructureChanged=" + this.f3470g + ", mInPreLayout=" + this.f3471h + ", mRunSimpleAnimations=" + this.f3473j + ", mRunPredictiveAnimations=" + this.f3474k + '}';
    }
}
