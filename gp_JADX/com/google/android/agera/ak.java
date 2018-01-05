package com.google.android.agera;

import java.util.Collections;
import java.util.List;

public final class ak {
    public static final ak f5662a = new ak(null, f5664c);
    public static final ak f5663b;
    public static final Throwable f5664c;
    public final Object f5665d;
    public volatile transient List f5666e;
    public final Throwable f5667f;

    private ak(Object obj, Throwable th) {
        int i;
        int i2 = 1;
        if (obj != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (th == null) {
            i2 = 0;
        }
        C0917x.m5641b(i2 ^ i, "Illegal Result arguments");
        this.f5665d = obj;
        this.f5667f = th;
        this.f5666e = obj != null ? null : Collections.emptyList();
    }

    public static ak m5593a(Object obj) {
        return new ak(C0917x.m5639a(obj), null);
    }

    public static ak m5594a(Throwable th) {
        if (th == f5664c) {
            return f5662a;
        }
        return new ak(null, (Throwable) C0917x.m5639a(th));
    }

    public final boolean m5595a() {
        return this.f5665d != null;
    }

    public final Object m5596b() {
        if (this.f5665d != null) {
            return this.f5665d;
        }
        throw new FailedResultException(this.f5667f);
    }

    public final List m5597c() {
        List list = this.f5666e;
        if (list == null) {
            synchronized (this) {
                list = this.f5666e;
                if (list == null) {
                    list = Collections.singletonList(this.f5665d);
                    this.f5666e = list;
                }
            }
        }
        return list;
    }

    public final Throwable m5598d() {
        C0917x.m5640a(this.f5667f != null, "Not a failure");
        return this.f5667f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ak akVar = (ak) obj;
        if (this.f5665d == null ? akVar.f5665d != null : !this.f5665d.equals(akVar.f5665d)) {
            return false;
        }
        if (this.f5667f != null) {
            if (this.f5667f.equals(akVar.f5667f)) {
                return true;
            }
        } else if (akVar.f5667f == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        if (this.f5665d != null) {
            hashCode = this.f5665d.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode *= 31;
        if (this.f5667f != null) {
            i = this.f5667f.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        if (this == f5662a) {
            return "Result{Absent}";
        }
        if (this == f5663b) {
            return "Result{Failure}";
        }
        if (this.f5665d != null) {
            String valueOf = String.valueOf(this.f5665d);
            return new StringBuilder(String.valueOf(valueOf).length() + 23).append("Result{Success; value=").append(valueOf).append("}").toString();
        }
        valueOf = String.valueOf(this.f5667f);
        return new StringBuilder(String.valueOf(valueOf).length() + 25).append("Result{Failure; failure=").append(valueOf).append("}").toString();
    }

    static {
        Throwable th = new Throwable("Attempt failed");
        th.setStackTrace(new StackTraceElement[0]);
        f5663b = new ak(null, th);
        th = new NullPointerException("Value is absent");
        f5664c = th;
        th.setStackTrace(new StackTraceElement[0]);
    }
}
