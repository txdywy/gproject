package io.reactivex.p554d;

import com.google.p409c.p410a.p411a.p412a.p413a.C6918a;
import io.reactivex.C7754h;
import io.reactivex.C7772c;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.p557b.C7811n;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.p553c.C7767b;
import io.reactivex.p553c.C7768c;
import io.reactivex.p553c.C7769d;
import io.reactivex.p553c.C7770e;
import java.util.concurrent.Callable;

public final class C7773a {
    public static volatile C7769d f40284a;
    public static volatile C7770e f40285b;
    public static volatile C7770e f40286c;
    public static volatile C7770e f40287d;
    public static volatile C7770e f40288e;
    public static volatile C7770e f40289f;
    public static volatile C7770e f40290g;
    public static volatile C7770e f40291h;
    public static volatile C7770e f40292i;
    public static volatile C7770e f40293j;
    public static volatile C7767b f40294k;
    public static volatile C7767b f40295l;
    public static volatile C7767b f40296m;
    public static volatile C7768c f40297n;
    public static volatile boolean f40298o;

    public static void m37567a(Throwable th) {
        Object obj = 1;
        C7769d c7769d = f40284a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            if (!((th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException))) {
                obj = null;
            }
            if (obj == null) {
                th = new UndeliverableException(th);
            }
        }
        if (c7769d != null) {
            try {
                c7769d.mo6543a(th);
                return;
            } catch (Throwable th2) {
                C6918a.m31584a(th2);
                C7773a.m37569b(th2);
            }
        }
        C6918a.m31584a(th);
        C7773a.m37569b(th);
    }

    private static void m37569b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static Runnable m37566a(Runnable runnable) {
        C7770e c7770e = f40285b;
        return c7770e == null ? runnable : (Runnable) C7773a.m37565a(c7770e, (Object) runnable);
    }

    public static C7772c m37561a(C7772c c7772c) {
        C7770e c7770e = f40292i;
        if (c7770e != null) {
            return (C7772c) C7773a.m37565a(c7770e, (Object) c7772c);
        }
        return c7772c;
    }

    public static boolean m37568a() {
        C7768c c7768c = f40297n;
        if (c7768c == null) {
            return false;
        }
        try {
            return c7768c.m37555a();
        } catch (Throwable th) {
            RuntimeException a = ExceptionHelper.m37735a(th);
        }
    }

    public static Object m37565a(C7770e c7770e, Object obj) {
        try {
            return c7770e.mo6544a(obj);
        } catch (Throwable th) {
            RuntimeException a = ExceptionHelper.m37735a(th);
        }
    }

    public static Object m37564a(C7767b c7767b) {
        try {
            return c7767b.m37554a();
        } catch (Throwable th) {
            RuntimeException a = ExceptionHelper.m37735a(th);
        }
    }

    public static C7754h m37563a(Callable callable) {
        try {
            return (C7754h) C7811n.m37615a(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            RuntimeException a = ExceptionHelper.m37735a(th);
        }
    }

    public static C7754h m37562a(C7770e c7770e, Callable callable) {
        return (C7754h) C7811n.m37615a(C7773a.m37565a(c7770e, (Object) callable), "Scheduler Callable result can't be null");
    }
}
