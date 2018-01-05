package com.google.android.finsky.foregroundcoordinator;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator.ForegroundCoordinatorService;

public final class C3138b implements ServiceConnection {
    public final Context f16152a;
    public Runnable f16153b;
    public final int f16154c;
    public ForegroundCoordinatorService f16155d;
    public boolean f16156e;

    public C3138b(Context context, Runnable runnable, int i) {
        this.f16152a = context;
        this.f16153b = runnable;
        this.f16154c = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f16155d = ((C3137a) iBinder).f16151a;
        this.f16156e = true;
        if (this.f16153b != null) {
            this.f16153b.run();
            this.f16153b = null;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f16156e = false;
    }
}
