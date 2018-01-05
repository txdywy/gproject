package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public abstract class af {
    public final DataSetObservable f1845a = new DataSetObservable();
    public DataSetObserver f1846b;

    public abstract int mo961a();

    public abstract boolean mo959a(View view, Object obj);

    public Object mo1372a(ViewGroup viewGroup, int i) {
        return mo956a((View) viewGroup, i);
    }

    public void mo1373a(ViewGroup viewGroup, int i, Object obj) {
        mo957a((View) viewGroup, i, obj);
    }

    public void mo1377b() {
        mo960c();
    }

    @Deprecated
    public Object mo956a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void mo957a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    @Deprecated
    public void mo958a(Object obj) {
    }

    @Deprecated
    public void mo960c() {
    }

    public int mo963b(Object obj) {
        return -1;
    }

    public final void M_() {
        synchronized (this) {
            if (this.f1846b != null) {
                this.f1846b.onChanged();
            }
        }
        this.f1845a.notifyChanged();
    }

    public final void m1808a(DataSetObserver dataSetObserver) {
        this.f1845a.registerObserver(dataSetObserver);
    }

    public final void m1816b(DataSetObserver dataSetObserver) {
        this.f1845a.unregisterObserver(dataSetObserver);
    }

    final void m1818c(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f1846b = dataSetObserver;
        }
    }

    public CharSequence mo1371a(int i) {
        return null;
    }

    public float mo1376b(int i) {
        return 1.0f;
    }
}
