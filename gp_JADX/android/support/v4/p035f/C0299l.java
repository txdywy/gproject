package android.support.v4.p035f;

import android.os.Handler;
import java.util.concurrent.Callable;

final class C0299l implements Runnable {
    public final /* synthetic */ Callable f1696a;
    public final /* synthetic */ Handler f1697b;
    public final /* synthetic */ C0290o f1698c;

    C0299l(Callable callable, Handler handler, C0290o c0290o) {
        this.f1696a = callable;
        this.f1697b = handler;
        this.f1698c = c0290o;
    }

    public final void run() {
        Object call;
        try {
            call = this.f1696a.call();
        } catch (Exception e) {
            call = null;
        }
        this.f1697b.post(new C0300m(this, call));
    }
}
