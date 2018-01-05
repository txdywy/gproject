package android.support.v7.widget;

import android.database.Observable;

public final class en extends Observable {
    en() {
    }

    public final boolean m3637a() {
        return !this.mObservers.isEmpty();
    }

    public final void m3638b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((eo) this.mObservers.get(size)).mo872a();
        }
    }

    public final void m3636a(int i, int i2, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((eo) this.mObservers.get(size)).mo874a(i, i2, obj);
        }
    }

    public final void m3635a(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((eo) this.mObservers.get(size)).mo875b(i, i2);
        }
    }

    public final void m3639b(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((eo) this.mObservers.get(size)).mo876c(i, i2);
        }
    }

    public final void m3640c(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((eo) this.mObservers.get(size)).mo873a(i, i2, 1);
        }
    }
}
