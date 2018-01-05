package android.support.design.widget;

import java.lang.ref.WeakReference;

final class bu {
    public final WeakReference f897a;
    public int f898b;
    public boolean f899c;

    bu(int i, bt btVar) {
        this.f897a = new WeakReference(btVar);
        this.f898b = i;
    }

    final boolean m720a(bt btVar) {
        return btVar != null && this.f897a.get() == btVar;
    }
}
