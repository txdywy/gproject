package android.support.v4.p028a;

import android.os.SystemClock;
import android.support.v4.os.OperationCanceledException;
import java.util.concurrent.CountDownLatch;

final class C0214b extends C0213n implements Runnable {
    public final CountDownLatch f1215a = new CountDownLatch(1);
    public boolean f1216b;
    public final /* synthetic */ C0212a f1217c;

    C0214b(C0212a c0212a) {
        this.f1217c = c0212a;
    }

    private final Object m1106c() {
        try {
            return this.f1217c.mo274d();
        } catch (OperationCanceledException e) {
            if (this.f1213l.get()) {
                return null;
            }
            throw e;
        }
    }

    protected final void mo270a(Object obj) {
        try {
            C0211f c0211f = this.f1217c;
            if (c0211f.f1200b != this) {
                c0211f.m1092a(this, obj);
            } else if (c0211f.f1195t) {
                c0211f.mo272a(obj);
            } else {
                c0211f.f1198w = false;
                c0211f.f1203e = SystemClock.uptimeMillis();
                c0211f.f1200b = null;
                c0211f.mo273b(obj);
            }
            this.f1215a.countDown();
        } catch (Throwable th) {
            this.f1215a.countDown();
        }
    }

    protected final void mo271b(Object obj) {
        try {
            this.f1217c.m1092a(this, obj);
        } finally {
            this.f1215a.countDown();
        }
    }

    public final void run() {
        this.f1216b = false;
        this.f1217c.m1096c();
    }

    protected final /* synthetic */ Object mo269a() {
        return m1106c();
    }
}
