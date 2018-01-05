package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.CancellationSignal;

public final class C0328b {
    public boolean f1774a;
    public C0329c f1775b;
    public Object f1776c;

    public final boolean m1724a() {
        boolean z;
        synchronized (this) {
            z = this.f1774a;
        }
        return z;
    }

    public final Object m1725b() {
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        Object obj;
        synchronized (this) {
            if (this.f1776c == null) {
                this.f1776c = new CancellationSignal();
                if (this.f1774a) {
                    ((CancellationSignal) this.f1776c).cancel();
                }
            }
            obj = this.f1776c;
        }
        return obj;
    }
}
