package io.reactivex.internal.p565h;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.p554d.C7773a;
import org.p561a.C7859b;

public enum C7862c implements C7859b {
    ;

    private C7862c(String str) {
    }

    public final void mo6566a() {
    }

    public final void mo6567f() {
    }

    public static boolean m37731a(C7859b c7859b, C7859b c7859b2) {
        if (c7859b2 == null) {
            C7773a.m37567a(new NullPointerException("next is null"));
            return false;
        } else if (c7859b == null) {
            return true;
        } else {
            c7859b2.mo6567f();
            C7773a.m37567a(new ProtocolViolationException("Subscription already set!"));
            return false;
        }
    }

    public static boolean m37732b() {
        if (Long.MAX_VALUE > 0) {
            return true;
        }
        C7773a.m37567a(new IllegalArgumentException("n > 0 required but it was " + Long.MAX_VALUE));
        return false;
    }
}
