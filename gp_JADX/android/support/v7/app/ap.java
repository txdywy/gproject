package android.support.v7.app;

import android.view.ActionMode;
import android.view.Window.Callback;

class ap extends al {
    public final /* synthetic */ ao f2298d;

    ap(ao aoVar, Callback callback) {
        this.f2298d = aoVar;
        super(aoVar, callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.f2298d.mo546o()) {
            switch (i) {
                case 0:
                    return m2458a(callback);
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
