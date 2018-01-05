package android.support.v7.app;

import android.content.res.Resources.NotFoundException;
import java.lang.Thread.UncaughtExceptionHandler;

final class ae implements UncaughtExceptionHandler {
    public final /* synthetic */ UncaughtExceptionHandler f2262a;

    ae(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f2262a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Object obj = null;
        if (th instanceof NotFoundException) {
            String message = th.getMessage();
            if (message != null && (message.contains("drawable") || message.contains("Drawable"))) {
                obj = 1;
            }
        }
        if (obj != null) {
            Throwable notFoundException = new NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f2262a.uncaughtException(thread, notFoundException);
            return;
        }
        this.f2262a.uncaughtException(thread, th);
    }
}
