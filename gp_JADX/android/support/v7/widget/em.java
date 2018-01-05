package android.support.v7.widget;

import android.support.v4.os.C0330d;
import android.view.ViewGroup;

public abstract class em {
    public final en f3433a = new en();
    public boolean f3434b = false;

    public abstract int mo1039a();

    public abstract fr mo1041a(ViewGroup viewGroup, int i);

    public abstract void mo1042a(fr frVar, int i);

    public final fr m3626b(ViewGroup viewGroup, int i) {
        C0330d.m1728a("RV CreateView");
        fr a = mo1041a(viewGroup, i);
        a.f3216f = i;
        C0330d.m1727a();
        return a;
    }

    public int mo1040a(int i) {
        return 0;
    }

    public final void b_(boolean z) {
        if (this.f3433a.m3637a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3434b = z;
    }

    public long mo1043b(int i) {
        return -1;
    }

    public void mo1132a(fr frVar) {
    }

    public boolean mo1134b(fr frVar) {
        return false;
    }

    public void mo5196a(eo eoVar) {
        this.f3433a.registerObserver(eoVar);
    }

    public void mo5197b(eo eoVar) {
        this.f3433a.unregisterObserver(eoVar);
    }

    public void mo2578a(RecyclerView recyclerView) {
    }

    public void mo2579b(RecyclerView recyclerView) {
    }

    public final void m3631c(int i) {
        this.f3433a.m3636a(i, 1, null);
    }

    public final void m3619a(int i, int i2) {
        this.f3433a.m3636a(i, i2, null);
    }

    public final void m3620a(int i, int i2, Object obj) {
        this.f3433a.m3636a(i, i2, obj);
    }

    public final void m3627b(int i, int i2) {
        this.f3433a.m3640c(i, i2);
    }

    public final void m3632c(int i, int i2) {
        this.f3433a.m3635a(i, i2);
    }

    public final void m3633d(int i) {
        this.f3433a.m3639b(i, 1);
    }

    public final void m3634d(int i, int i2) {
        this.f3433a.m3639b(i, i2);
    }
}
