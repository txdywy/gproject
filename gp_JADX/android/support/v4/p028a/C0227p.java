package android.support.v4.p028a;

import android.os.Binder;
import android.os.Process;

final class C0227p extends C0226u {
    public final /* synthetic */ C0213n f1244a;

    C0227p(C0213n c0213n) {
        this.f1244a = c0213n;
    }

    public final Object call() {
        this.f1244a.f1214m.set(true);
        Object obj = null;
        try {
            Process.setThreadPriority(10);
            obj = this.f1244a.mo269a();
            Binder.flushPendingCommands();
            this.f1244a.m1105d(obj);
            return obj;
        } catch (Throwable th) {
            this.f1244a.m1105d(obj);
        }
    }
}
