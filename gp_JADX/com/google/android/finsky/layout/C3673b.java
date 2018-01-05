package com.google.android.finsky.layout;

import android.annotation.TargetApi;
import android.os.Build.VERSION;

final class C3673b implements Runnable {
    public long f18507a = System.nanoTime();
    public float f18508b;
    public float f18509c;
    public final /* synthetic */ C3657a f18510d;

    public C3673b(C3657a c3657a, float f, long j) {
        this.f18510d = c3657a;
        this.f18508b = ((float) j) / 1000.0f;
        this.f18509c = f;
    }

    public final void run() {
        float nanoTime = ((float) (System.nanoTime() - this.f18507a)) / 1.0E9f;
        if (nanoTime > this.f18508b) {
            nanoTime = this.f18508b;
        } else {
            m17427a();
        }
        nanoTime = (Math.abs(this.f18509c) * nanoTime) - ((nanoTime * (this.f18510d.f18231k * nanoTime)) / 2.0f);
        if (this.f18509c < 0.0f) {
            nanoTime = -nanoTime;
        }
        this.f18510d.m17311a(((float) Math.round(nanoTime)) + this.f18510d.f18224d);
    }

    @TargetApi(16)
    final void m17427a() {
        if (VERSION.SDK_INT >= 16) {
            this.f18510d.postOnAnimation(this);
        } else {
            this.f18510d.post(this);
        }
    }
}
