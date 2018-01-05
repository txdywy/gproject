package io.reactivex.internal.p552a;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.p557b.C7811n;
import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.atomic.AtomicReference;

public enum C7791b implements C7756b {
    ;

    private C7791b(String str) {
    }

    public static boolean m37583a(C7756b c7756b) {
        return c7756b == f40312a;
    }

    public static boolean m37586a(AtomicReference atomicReference, C7756b c7756b) {
        C7811n.m37615a((Object) c7756b, "d is null");
        if (atomicReference.compareAndSet(null, c7756b)) {
            return true;
        }
        c7756b.mo6530a();
        if (atomicReference.get() != f40312a) {
            C7791b.m37587b();
        }
        return false;
    }

    public static boolean m37588b(AtomicReference atomicReference, C7756b c7756b) {
        C7756b c7756b2;
        do {
            c7756b2 = (C7756b) atomicReference.get();
            if (c7756b2 == f40312a) {
                if (c7756b != null) {
                    c7756b.mo6530a();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(c7756b2, c7756b));
        return true;
    }

    public static boolean m37585a(AtomicReference atomicReference) {
        C7756b c7756b = (C7756b) atomicReference.get();
        C7756b c7756b2 = f40312a;
        if (c7756b != c7756b2) {
            c7756b = (C7756b) atomicReference.getAndSet(c7756b2);
            if (c7756b != c7756b2) {
                if (c7756b != null) {
                    c7756b.mo6530a();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean m37584a(C7756b c7756b, C7756b c7756b2) {
        if (c7756b2 == null) {
            C7773a.m37567a(new NullPointerException("next is null"));
            return false;
        } else if (c7756b == null) {
            return true;
        } else {
            c7756b2.mo6530a();
            C7791b.m37587b();
            return false;
        }
    }

    private static void m37587b() {
        C7773a.m37567a(new ProtocolViolationException("Disposable already set!"));
    }

    public final void mo6530a() {
    }
}
