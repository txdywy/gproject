package p526e;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class ab {
    public static final ab f39527h = new ac();
    public boolean f39528i;
    public long f39529j;
    public long f39530k;

    public ab mo6479a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        } else {
            this.f39530k = timeUnit.toNanos(j);
            return this;
        }
    }

    public long cX_() {
        return this.f39530k;
    }

    public boolean cY_() {
        return this.f39528i;
    }

    public long mo6508c() {
        if (this.f39528i) {
            return this.f39529j;
        }
        throw new IllegalStateException("No deadline");
    }

    public ab mo6478a(long j) {
        this.f39528i = true;
        this.f39529j = j;
        return this;
    }

    public ab mo6511d() {
        this.f39530k = 0;
        return this;
    }

    public ab mo6512e() {
        this.f39528i = false;
        return this;
    }

    public void mo6480f() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f39528i && this.f39529j - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
