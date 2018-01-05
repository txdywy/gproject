package io.reactivex.p548a.p549a;

import io.reactivex.C7754h;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.p553c.C7770e;
import java.util.concurrent.Callable;

public final class C7750a {
    public static volatile C7770e f40271a;
    public static volatile C7770e f40272b;

    public static C7754h m37524a(Callable callable) {
        try {
            C7754h c7754h = (C7754h) callable.call();
            if (c7754h != null) {
                return c7754h;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            RuntimeException a = ExceptionHelper.m37735a(th);
        }
    }

    public static Object m37525a(C7770e c7770e, Object obj) {
        try {
            return c7770e.mo6544a(obj);
        } catch (Throwable th) {
            RuntimeException a = ExceptionHelper.m37735a(th);
        }
    }
}
