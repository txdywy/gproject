package android.support.v7.app;

import android.support.v7.view.C0409c;
import android.support.v7.view.C0412b;
import android.support.v7.view.C0458h;
import android.view.ActionMode;
import android.view.Window.Callback;

class al extends ag {
    public final /* synthetic */ ak f2297c;

    al(ak akVar, Callback callback) {
        this.f2297c = akVar;
        super(akVar, callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (this.f2297c.mo546o()) {
            return m2458a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    final ActionMode m2458a(ActionMode.Callback callback) {
        Object c0458h = new C0458h(this.f2297c.e, callback);
        ac acVar = this.f2297c;
        if (acVar.f2268B != null) {
            acVar.f2268B.mo608c();
        }
        C0409c azVar = new az(acVar, c0458h);
        C0404a a = acVar.mo500a();
        if (a != null) {
            acVar.f2268B = a.mo590a(azVar);
            if (!(acVar.f2268B == null || acVar.i == null)) {
                acVar.i.B_();
            }
        }
        if (acVar.f2268B == null) {
            acVar.f2268B = acVar.mo521a(azVar);
        }
        C0412b c0412b = acVar.f2268B;
        if (c0412b != null) {
            return c0458h.m2708b(c0412b);
        }
        return null;
    }
}
