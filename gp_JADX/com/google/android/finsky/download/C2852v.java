package com.google.android.finsky.download;

import com.google.android.finsky.utils.FinskyLog;

abstract class C2852v implements Runnable {
    public int f15300c;
    public final /* synthetic */ C2851n f15301d;

    public C2852v(C2851n c2851n, int i) {
        this.f15301d = c2851n;
        this.f15300c = i;
    }

    abstract void mo3183a(C2106x c2106x);

    public void run() {
        for (C2106x a : this.f15301d.f15294c) {
            try {
                mo3183a(a);
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Download listener threw an exception during " + this.f15300c, new Object[0]);
            }
        }
    }
}
