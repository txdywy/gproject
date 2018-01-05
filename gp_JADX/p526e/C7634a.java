package p526e;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class C7634a extends ab {
    public static final long f39531b = TimeUnit.SECONDS.toMillis(60);
    public static final long f39532c = TimeUnit.MILLISECONDS.toNanos(f39531b);
    public static C7634a f39533d;
    public boolean f39534e;
    public C7634a f39535f;
    public long f39536g;

    public final void cV_() {
        if (this.f39534e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long cX_ = cX_();
        boolean cY_ = cY_();
        if (cX_ != 0 || cY_) {
            this.f39534e = true;
            C7634a.m36846a(this, cX_, cY_);
        }
    }

    private static synchronized void m36846a(C7634a c7634a, long j, boolean z) {
        synchronized (C7634a.class) {
            if (f39533d == null) {
                f39533d = new C7634a();
                new C7722d().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                c7634a.f39536g = Math.min(j, c7634a.mo6508c() - nanoTime) + nanoTime;
            } else if (j != 0) {
                c7634a.f39536g = nanoTime + j;
            } else if (z) {
                c7634a.f39536g = c7634a.mo6508c();
            } else {
                throw new AssertionError();
            }
            long j2 = c7634a.f39536g - nanoTime;
            C7634a c7634a2 = f39533d;
            while (c7634a2.f39535f != null && j2 >= c7634a2.f39535f.f39536g - nanoTime) {
                c7634a2 = c7634a2.f39535f;
            }
            c7634a.f39535f = c7634a2.f39535f;
            c7634a2.f39535f = c7634a;
            if (c7634a2 == f39533d) {
                C7634a.class.notify();
            }
        }
    }

    public final boolean cW_() {
        if (!this.f39534e) {
            return false;
        }
        this.f39534e = false;
        return C7634a.m36847a(this);
    }

    private static synchronized boolean m36847a(C7634a c7634a) {
        boolean z;
        synchronized (C7634a.class) {
            for (C7634a c7634a2 = f39533d; c7634a2 != null; c7634a2 = c7634a2.f39535f) {
                if (c7634a2.f39535f == c7634a) {
                    c7634a2.f39535f = c7634a.f39535f;
                    c7634a.f39535f = null;
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return z;
    }

    public void mo6459a() {
    }

    final void m36850a(boolean z) {
        if (cW_() && z) {
            throw mo6458a(null);
        }
    }

    final IOException m36851b(IOException iOException) {
        return !cW_() ? iOException : mo6458a(iOException);
    }

    public IOException mo6458a(IOException iOException) {
        IOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
