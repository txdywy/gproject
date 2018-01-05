package org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.os.SystemClock;
import android.util.Log;

final class C7912x extends C7911w implements IdleHandler {
    public long f40556a;
    public long f40557b;
    public int f40558c;
    public int f40559d;
    public int f40560e;
    public boolean f40561f;

    C7912x() {
    }

    private final void m37831a() {
        if (TraceEvent.f40509a && !this.f40561f) {
            this.f40556a = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler(this);
            this.f40561f = true;
            Log.v("TraceEvent.LooperMonitor", "attached idle handler");
        } else if (this.f40561f && !TraceEvent.f40509a) {
            Looper.myQueue().removeIdleHandler(this);
            this.f40561f = false;
            Log.v("TraceEvent.LooperMonitor", "detached idle handler");
        }
    }

    final void mo6571a(String str) {
        if (this.f40560e == 0) {
            TraceEvent.m37809a("Looper.queueIdle");
        }
        this.f40557b = SystemClock.elapsedRealtime();
        m37831a();
        super.mo6571a(str);
    }

    final void mo6572b(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f40557b;
        if (elapsedRealtime > 16) {
            C7912x.m37832a(5, "observed a task that took " + elapsedRealtime + "ms: " + str);
        }
        super.mo6572b(str);
        m37831a();
        this.f40558c++;
        this.f40560e++;
    }

    private static void m37832a(int i, String str) {
        TraceEvent.m37810a("TraceEvent.LooperMonitor:IdleStats", str);
        Log.println(i, "TraceEvent.LooperMonitor", str);
    }

    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f40556a == 0) {
            this.f40556a = elapsedRealtime;
        }
        long j = elapsedRealtime - this.f40556a;
        this.f40559d++;
        TraceEvent.m37812b("Looper.queueIdle", this.f40560e + " tasks since last idle.");
        if (j > 48) {
            C7912x.m37832a(3, this.f40558c + " tasks and " + this.f40559d + " idles processed so far, " + this.f40560e + " tasks bursted and " + j + "ms elapsed since last idle");
        }
        this.f40556a = elapsedRealtime;
        this.f40560e = 0;
        return true;
    }
}
