package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

class ao extends ak {
    public final UiModeManager f2296w;

    ao(Context context, Window window, ab abVar) {
        super(context, window, abVar);
        this.f2296w = (UiModeManager) context.getSystemService("uimode");
    }

    Callback mo544a(Callback callback) {
        return new ap(this, callback);
    }

    final int mo545f(int i) {
        if (i == 0 && this.f2296w.getNightMode() == 0) {
            return -1;
        }
        return super.mo545f(i);
    }
}
