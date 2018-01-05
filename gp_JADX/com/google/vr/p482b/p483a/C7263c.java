package com.google.vr.p482b.p483a;

import android.os.Handler;
import android.os.Looper;
import com.google.vr.p479a.p480a.C7243f;
import com.google.vr.p479a.p480a.C7250m;
import com.google.vr.p479a.p480a.p481a.C7232a;
import com.google.vr.p482b.p483a.p484a.C7253a;
import com.google.vr.p482b.p483a.p484a.C7255e;
import java.util.concurrent.Executor;

public final class C7263c {
    public static final Handler f35528a = new Handler(Looper.getMainLooper());
    public final C7255e f35529b;

    C7263c(C7255e c7255e) {
        this.f35529b = c7255e;
    }

    public final C7253a m34024a() {
        try {
            return C7253a.m33899a(this.f35529b.mo6353a());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final C7243f m34023a(String str) {
        try {
            C7255e c7255e = this.f35529b;
            String str2 = "finsky:entities/";
            String valueOf = String.valueOf(str);
            return c7255e.mo6352a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final Executor m34026b() {
        try {
            return (Executor) C7250m.m33872a(this.f35529b.mo6356b());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final C7232a m34027c() {
        try {
            return new C7232a(this.f35529b.mo6358c());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void m34025a(Runnable runnable, Runnable runnable2) {
        try {
            this.f35529b.mo6354a(new C7264d(runnable, runnable2));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
