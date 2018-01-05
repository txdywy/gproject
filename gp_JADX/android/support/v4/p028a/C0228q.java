package android.support.v4.p028a;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

final class C0228q extends FutureTask {
    public final /* synthetic */ C0213n f1245a;

    C0228q(C0213n c0213n, Callable callable) {
        this.f1245a = c0213n;
        super(callable);
    }

    protected final void done() {
        try {
            this.f1245a.m1104c(get());
        } catch (Throwable e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException e3) {
            this.f1245a.m1104c(null);
        } catch (Throwable e4) {
            RuntimeException runtimeException = new RuntimeException("An error occurred while executing doInBackground()", e4);
        }
    }
}
