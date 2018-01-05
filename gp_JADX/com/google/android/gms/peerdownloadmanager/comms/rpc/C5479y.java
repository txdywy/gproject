package com.google.android.gms.peerdownloadmanager.comms.rpc;

import android.util.Log;
import com.google.android.gms.peerdownloadmanager.common.C5373c;
import com.google.android.gms.peerdownloadmanager.common.aa;
import com.google.common.f.a.a;
import com.google.common.f.a.bf;
import java.io.Closeable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

final /* synthetic */ class C5479y implements Runnable {
    public final bf f28229a;
    public final int f28230b = 5;
    public final C5373c f28231c;
    public final AtomicBoolean f28232d;

    C5479y(bf bfVar, C5373c c5373c, AtomicBoolean atomicBoolean) {
        this.f28229a = bfVar;
        this.f28231c = c5373c;
        this.f28232d = atomicBoolean;
    }

    public final void run() {
        Throwable e;
        a aVar = this.f28229a;
        int i = this.f28230b;
        Closeable closeable = this.f28231c;
        AtomicBoolean atomicBoolean = this.f28232d;
        try {
            aVar.get((long) i, TimeUnit.SECONDS);
            return;
        } catch (TimeoutException e2) {
            e = e2;
        } catch (ExecutionException e3) {
            e = e3;
        } catch (InterruptedException e4) {
            e = e4;
        }
        Log.w("StreamManager", "Egress did not close normally after ingress closed; safe closing channel", e);
        aa.m26135a(closeable);
        atomicBoolean.set(true);
    }
}
