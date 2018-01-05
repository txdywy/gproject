package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.p282a.C5051b;
import java.util.HashSet;
import java.util.Set;

final class C5122k implements ServiceConnection {
    public final Set f26051a = new HashSet();
    public int f26052b = 2;
    public boolean f26053c;
    public IBinder f26054d;
    public final C5120i f26055e;
    public ComponentName f26056f;
    public /* synthetic */ C5121j f26057g;

    public C5122k(C5121j c5121j, C5120i c5120i) {
        this.f26057g = c5121j;
        this.f26055e = c5120i;
    }

    public final void m23802a() {
        this.f26052b = 3;
        this.f26057g.f26048f;
        this.f26053c = C5051b.m23268a(this.f26057g.f26046d, this.f26055e.m23794a(), this, this.f26055e.f26044d);
        if (this.f26053c) {
            this.f26057g.f26047e.sendMessageDelayed(this.f26057g.f26047e.obtainMessage(1, this.f26055e), this.f26057g.f26050h);
            return;
        }
        this.f26052b = 2;
        try {
            this.f26057g.f26048f;
            this.f26057g.f26046d.unbindService(this);
        } catch (IllegalArgumentException e) {
        }
    }

    public final void m23803a(ServiceConnection serviceConnection) {
        this.f26057g.f26048f;
        this.f26057g.f26046d;
        this.f26055e.m23794a();
        this.f26051a.add(serviceConnection);
    }

    public final boolean m23804b() {
        return this.f26051a.isEmpty();
    }

    public final boolean m23805b(ServiceConnection serviceConnection) {
        return this.f26051a.contains(serviceConnection);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f26057g.f26045c) {
            this.f26057g.f26047e.removeMessages(1, this.f26055e);
            this.f26054d = iBinder;
            this.f26056f = componentName;
            for (ServiceConnection onServiceConnected : this.f26051a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f26052b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f26057g.f26045c) {
            this.f26057g.f26047e.removeMessages(1, this.f26055e);
            this.f26054d = null;
            this.f26056f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f26051a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f26052b = 2;
        }
    }
}
