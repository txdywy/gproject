package com.squareup.okhttp;

import com.squareup.okhttp.internal.C7600b;
import com.squareup.okhttp.internal.C7676j;
import com.squareup.okhttp.internal.k;
import com.squareup.okhttp.internal.p527b.C7641a;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class C7680m {
    public static final C7680m f39768a;
    public final Executor f39769b;
    public final int f39770c;
    public final long f39771d;
    public Runnable f39772e;
    public final Deque f39773f;
    public final C7676j f39774g;

    private C7680m(int i, long j) {
        this(i, j, TimeUnit.MILLISECONDS);
    }

    private C7680m(int i, long j, TimeUnit timeUnit) {
        this.f39769b = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), k.a("OkHttp ConnectionPool"));
        this.f39772e = new C7681n(this);
        this.f39773f = new ArrayDeque();
        this.f39774g = new C7676j();
        this.f39770c = i;
        this.f39771d = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
        }
    }

    final long m36998a(long j) {
        C7641a c7641a = null;
        long j2 = Long.MIN_VALUE;
        synchronized (this) {
            long j3;
            int i = 0;
            int i2 = 0;
            for (C7641a c7641a2 : this.f39773f) {
                int i3;
                List list = c7641a2.f39568j;
                int i4 = 0;
                while (i4 < list.size()) {
                    if (((Reference) list.get(i4)).get() != null) {
                        i4++;
                    } else {
                        C7600b.f39286a.warning("A connection to " + c7641a2.f39559a.f39325a.f39270a + " was leaked. Did you forget to close a response body?");
                        list.remove(i4);
                        c7641a2.f39569k = true;
                        if (list.isEmpty()) {
                            c7641a2.f39570l = j - this.f39771d;
                            i3 = 0;
                            break;
                        }
                    }
                }
                i3 = list.size();
                if (i3 > 0) {
                    i2++;
                } else {
                    C7641a c7641a3;
                    int i5 = i + 1;
                    long j4 = j - c7641a2.f39570l;
                    if (j4 > j2) {
                        long j5 = j4;
                        c7641a3 = c7641a2;
                        j3 = j5;
                    } else {
                        j3 = j2;
                        c7641a3 = c7641a;
                    }
                    j2 = j3;
                    c7641a = c7641a3;
                    i = i5;
                }
            }
            if (j2 >= this.f39771d || i > this.f39770c) {
                this.f39773f.remove(c7641a);
                k.a(c7641a.f39561c);
                return 0;
            } else if (i > 0) {
                j3 = this.f39771d - j2;
                return j3;
            } else if (i2 > 0) {
                j3 = this.f39771d;
                return j3;
            } else {
                return -1;
            }
        }
    }

    static {
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long parseLong = property2 != null ? Long.parseLong(property2) : 300000;
        if (property != null && !Boolean.parseBoolean(property)) {
            f39768a = new C7680m(0, parseLong);
        } else if (property3 != null) {
            f39768a = new C7680m(Integer.parseInt(property3), parseLong);
        } else {
            f39768a = new C7680m(5, parseLong);
        }
    }
}
