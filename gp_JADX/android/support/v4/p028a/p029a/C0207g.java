package android.support.v4.p028a.p029a;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class C0207g {
    public abstract void mo754a();

    public abstract void mo755a(Typeface typeface);

    public final void m1069a(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new C0208h(this, typeface));
    }

    public final void m1070a(Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new C0209i(this));
    }
}
