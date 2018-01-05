package io.reactivex.p548a.p550b;

import android.os.Handler;
import io.reactivex.C7754h;
import io.reactivex.C7757j;
import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.TimeUnit;

final class C7755d extends C7754h {
    public final Handler f40275a;

    C7755d(Handler handler) {
        this.f40275a = handler;
    }

    public final C7756b mo6527a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        } else {
            Object c7759f = new C7759f(this.f40275a, C7773a.m37566a(runnable));
            this.f40275a.postDelayed(c7759f, Math.max(0, timeUnit.toMillis(j)));
            return c7759f;
        }
    }

    public final C7757j mo6528a() {
        return new C7758e(this.f40275a);
    }
}
