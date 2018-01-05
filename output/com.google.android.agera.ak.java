package com.google.android.agera;

import java.util.Collections;
import java.util.List;

public final class com.google.android.agera.ak
{

    public static final com.google.android.agera.ak a;
    public static final com.google.android.agera.ak b;
    public static final Throwable c;
    public final Object d;
    public volatile transient List e;
    public final Throwable f;

    static {
        v0 = new Throwable("Attempt failed");
        v0.setStackTrace(new StackTraceElement[0]);
        com.google.android.agera.ak.b = new com.google.android.agera.ak(0, v0);
        v0 = new NullPointerException("Value is absent");
        com.google.android.agera.ak.c = v0;
        v0.setStackTrace(new StackTraceElement[0]);
        com.google.android.agera.ak.a = new com.google.android.agera.ak(0, com.google.android.agera.ak.c);
    }

    ak(Object p0, Throwable p1) {
        v0 = 1;
        if (p0 != 0)
            v2 = 1;
        else
            v2 = 0;
        if (p1 == 0)
            v0 = 0;
        com.google.android.agera.x.b(v0 ^ v2, "Illegal Result arguments");
        this.d = p0;
        this.f = p1;
        if (p0 != 0)
            v0 = 0;
        else
            v0 = Collections.emptyList();
        this.e = v0;
    }

    public static com.google.android.agera.ak a(Object p0) {
        return new com.google.android.agera.ak(com.google.android.agera.x.a(p0), 0);
    }

    public static com.google.android.agera.ak a(Throwable p0) {
        if (p0 == com.google.android.agera.ak.c)
            v0 = com.google.android.agera.ak.a;
        else
            v0 = new com.google.android.agera.ak(0, (Throwable)com.google.android.agera.x.a(p0));
        return v0;
    }

    public final boolean a() {
        if (this.d != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final Object b() {
        if (this.d != 0)
            return this.d;
        throw new FailedResultException(this.f);
    }

    public final List c() {
        v0 = this.e;
        if (v0 != 0)
            return v0;
        enter this;
        try {
            v0 = this.e;
            if (v0 == 0) {
                v0 = Collections.singletonList(this.d);
                this.e = v0;
            }
            exit this;
            return v0;
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    public final Throwable d() {
        if (this.f != 0)
            v0 = 1;
        else
            v0 = 0;
        com.google.android.agera.x.a(v0, "Not a failure");
        return this.f;
    }

    public final boolean equals(Object p0) {
  0:    v0 = 1;
  2:    if (this == p0)
  4:        return v0;
  5:    if (p0 == 0 || this.getClass() != p0.getClass()) {
 17:        v0 = 0;
 18:        return v0;
        }
 23:    if (this.d == 0) {
 39:        if (((com.google.android.agera.ak)p0).d != 0) {
 35:            v0 = 0;
 36:            return v0;
            }
 43:        if (this.f != 0) {
 53:            if (this.f.equals(((com.google.android.agera.ak)p0).f))
  4:                return v0;
            }
 59:        else if (((com.google.android.agera.ak)p0).f == 0)
  4:            return v0;
 55:        v0 = 0;
 56:        return v0;
        }
 33:    if (!this.d.equals(((com.google.android.agera.ak)p0).d)) {
 35:        v0 = 0;
 36:        return v0;
        }
 34:    goto 41;
 39:    if (((com.google.android.agera.ak)p0).d != 0) {
 35:        v0 = 0;
 36:        return v0;
        }
 43:    if (this.f != 0) {
 53:        if (this.f.equals(((com.google.android.agera.ak)p0).f))
  4:            return v0;
        }
 59:    else if (((com.google.android.agera.ak)p0).f == 0)
  4:        return v0;
 55:    v0 = 0;
 56:    return v0;
    }

    public final int hashCode() {
        v1 = 0;
        if (this.d != 0)
            v0 = this.d.hashCode();
        else
            v0 = 0;
        if (this.f != 0)
            v1 = this.f.hashCode();
        return v0 * 31 + v1;
    }

    public final String toString() {
        if (this == com.google.android.agera.ak.a)
            v0 = "Result{Absent}";
        else if (this == com.google.android.agera.ak.b)
            v0 = "Result{Failure}";
        else if (this.d != 0) {
            v0 = String.valueOf(this.d);
            v0 = (String.valueOf(v0).length() + 23) + "Result{Success; value=" + v0 + "}";
        }
        else {
            v0 = String.valueOf(this.f);
            v0 = (String.valueOf(v0).length() + 25) + "Result{Failure; failure=" + v0 + "}";
        }
        return v0;
    }

}
