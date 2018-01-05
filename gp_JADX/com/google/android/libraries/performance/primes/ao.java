package com.google.android.libraries.performance.primes;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window.OnFrameMetricsAvailableListener;

final class ao implements OnFrameMetricsAvailableListener, C5953j, C5954k {
    public final ap f29660a;
    public final boolean f29661b;
    public Activity f29662c;
    public boolean f29663d;
    public HandlerThread f29664e;
    public Handler f29665f;

    ao(ap apVar, boolean z) {
        this.f29660a = apVar;
        this.f29661b = z;
        if (z) {
            this.f29663d = true;
        }
    }

    final void m27634a() {
        if (this.f29662c != null) {
            Window window = this.f29662c.getWindow();
            if (this.f29665f == null) {
                this.f29664e = new HandlerThread("Primes-Jank");
                this.f29664e.start();
                this.f29665f = new Handler(this.f29664e.getLooper());
            }
            window.addOnFrameMetricsAvailableListener(this, this.f29665f);
        }
    }

    private final void m27633c() {
        if (this.f29662c != null) {
            try {
                this.f29662c.getWindow().removeOnFrameMetricsAvailableListener(this);
            } catch (Throwable e) {
                C5989do.m27826a("FrameMetricService", "remove frame metrics listener failed", e, new Object[0]);
            }
        }
    }

    public final void mo5231b(Activity activity) {
        if (this.f29661b) {
            this.f29660a.mo5228a(activity.getClass().getName());
        }
        synchronized (this) {
            this.f29662c = activity;
            if (this.f29663d) {
                m27634a();
            }
        }
    }

    public final void mo5230a(Activity activity) {
        synchronized (this) {
            if (this.f29663d) {
                m27633c();
            }
            this.f29662c = null;
        }
        if (this.f29661b) {
            this.f29660a.mo5229b(activity.getClass().getName());
        }
    }

    final void m27636b() {
        synchronized (this) {
            this.f29663d = false;
            m27633c();
        }
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        this.f29660a.mo5227a((int) (((double) frameMetrics.getMetric(8)) / 1000000.0d));
    }
}
