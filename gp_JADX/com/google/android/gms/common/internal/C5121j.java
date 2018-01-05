package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.p282a.C5051b;
import java.util.HashMap;

final class C5121j extends C5119h implements Callback {
    public final HashMap f26045c = new HashMap();
    public final Context f26046d;
    public final Handler f26047e;
    public final C5051b f26048f;
    public final long f26049g;
    public final long f26050h;

    C5121j(Context context) {
        this.f26046d = context.getApplicationContext();
        this.f26047e = new Handler(context.getMainLooper(), this);
        this.f26048f = C5051b.m23267a();
        this.f26049g = 5000;
        this.f26050h = 300000;
    }

    protected final boolean mo4622a(C5120i c5120i, ServiceConnection serviceConnection) {
        boolean z;
        am.m23734a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f26045c) {
            C5122k c5122k = (C5122k) this.f26045c.get(c5120i);
            if (c5122k != null) {
                this.f26047e.removeMessages(0, c5120i);
                if (!c5122k.m23805b(serviceConnection)) {
                    c5122k.m23803a(serviceConnection);
                    switch (c5122k.f26052b) {
                        case 1:
                            serviceConnection.onServiceConnected(c5122k.f26056f, c5122k.f26054d);
                            break;
                        case 2:
                            c5122k.m23802a();
                            break;
                        default:
                            break;
                    }
                }
                String valueOf = String.valueOf(c5120i);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
            }
            c5122k = new C5122k(this, c5120i);
            c5122k.m23803a(serviceConnection);
            c5122k.m23802a();
            this.f26045c.put(c5120i, c5122k);
            z = c5122k.f26053c;
        }
        return z;
    }

    protected final void mo4623b(C5120i c5120i, ServiceConnection serviceConnection) {
        am.m23734a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f26045c) {
            C5122k c5122k = (C5122k) this.f26045c.get(c5120i);
            String valueOf;
            if (c5122k == null) {
                valueOf = String.valueOf(c5120i);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
            } else if (c5122k.m23805b(serviceConnection)) {
                c5122k.f26051a.remove(serviceConnection);
                if (c5122k.m23804b()) {
                    this.f26047e.sendMessageDelayed(this.f26047e.obtainMessage(0, c5120i), this.f26049g);
                }
            } else {
                valueOf = String.valueOf(c5120i);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf).toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        C5120i c5120i;
        C5122k c5122k;
        switch (message.what) {
            case 0:
                synchronized (this.f26045c) {
                    c5120i = (C5120i) message.obj;
                    c5122k = (C5122k) this.f26045c.get(c5120i);
                    if (c5122k != null && c5122k.m23804b()) {
                        if (c5122k.f26053c) {
                            c5122k.f26057g.f26047e.removeMessages(1, c5122k.f26055e);
                            c5122k.f26057g.f26046d.unbindService(c5122k);
                            c5122k.f26053c = false;
                            c5122k.f26052b = 2;
                        }
                        this.f26045c.remove(c5120i);
                    }
                }
                return true;
            case 1:
                synchronized (this.f26045c) {
                    c5120i = (C5120i) message.obj;
                    c5122k = (C5122k) this.f26045c.get(c5120i);
                    if (c5122k != null && c5122k.f26052b == 3) {
                        String valueOf = String.valueOf(c5120i);
                        Log.wtf("GmsClientSupervisor", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Timeout waiting for ServiceConnection callback ").append(valueOf).toString(), new Exception());
                        ComponentName componentName = c5122k.f26056f;
                        if (componentName == null) {
                            componentName = c5120i.f26043c;
                        }
                        c5122k.onServiceDisconnected(componentName == null ? new ComponentName(c5120i.f26042b, "unknown") : componentName);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
