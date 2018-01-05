package io.reactivex.p548a.p550b;

import android.os.Handler;
import android.os.Message;
import io.reactivex.C7757j;
import io.reactivex.internal.p552a.C7795c;
import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.TimeUnit;

final class C7758e extends C7757j {
    public final Handler f40276a;
    public volatile boolean f40277b;

    C7758e(Handler handler) {
        this.f40276a = handler;
    }

    public final C7756b mo6529a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        } else if (this.f40277b) {
            return C7795c.INSTANCE;
        } else {
            C7756b c7759f = new C7759f(this.f40276a, C7773a.m37566a(runnable));
            Message obtain = Message.obtain(this.f40276a, c7759f);
            obtain.obj = this;
            this.f40276a.sendMessageDelayed(obtain, Math.max(0, timeUnit.toMillis(j)));
            if (!this.f40277b) {
                return c7759f;
            }
            this.f40276a.removeCallbacks(c7759f);
            return C7795c.INSTANCE;
        }
    }

    public final void mo6530a() {
        this.f40277b = true;
        this.f40276a.removeCallbacksAndMessages(this);
    }
}
