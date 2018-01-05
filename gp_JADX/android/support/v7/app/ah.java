package android.support.v7.app;

import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

final class ah extends ao {
    ah(Context context, Window window, ab abVar) {
        super(context, window, abVar);
    }

    final Callback mo544a(Callback callback) {
        return new ai(this, callback);
    }
}
