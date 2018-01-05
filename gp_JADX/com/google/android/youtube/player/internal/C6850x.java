package com.google.android.youtube.player.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.youtube.player.C6820a;
import com.google.android.youtube.player.C6821b;
import java.util.ArrayList;

public abstract class C6850x implements ai {
    public final Context f33865e;
    public final Handler f33866f;
    public IInterface f33867g;
    public ArrayList f33868h;
    public final ArrayList f33869i = new ArrayList();
    public boolean f33870j = false;
    public ArrayList f33871k;
    public final ArrayList f33872l = new ArrayList();
    public ServiceConnection f33873m;
    public boolean f33874n = false;

    protected C6850x(Context context, aj ajVar, ak akVar) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Clients must be created on the UI thread.");
        }
        this.f33865e = (Context) C6838b.m31127a((Object) context);
        this.f33868h = new ArrayList();
        this.f33868h.add(C6838b.m31127a((Object) ajVar));
        this.f33871k = new ArrayList();
        this.f33871k.add(C6838b.m31127a((Object) akVar));
        this.f33866f = new C6855z(this);
    }

    static C6821b m31195a(String str) {
        try {
            return C6821b.valueOf(str);
        } catch (IllegalArgumentException e) {
            return C6821b.UNKNOWN_ERROR;
        } catch (NullPointerException e2) {
            return C6821b.UNKNOWN_ERROR;
        }
    }

    protected abstract IInterface mo5735a(IBinder iBinder);

    protected final void m31197a(C6821b c6821b) {
        this.f33866f.removeMessages(4);
        synchronized (this.f33871k) {
            ArrayList arrayList = this.f33871k;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (this.f33874n) {
                    if (this.f33871k.contains(arrayList.get(i))) {
                        ((ak) arrayList.get(i)).mo5743a(c6821b);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    protected abstract void mo5736a(C6843o c6843o, ac acVar);

    protected abstract String mo5738b();

    protected abstract String mo5739c();

    public void mo5732d() {
        m31205h();
        this.f33874n = false;
        synchronized (this.f33872l) {
            int size = this.f33872l.size();
            for (int i = 0; i < size; i++) {
                aa aaVar = (aa) this.f33872l.get(i);
                synchronized (aaVar) {
                    aaVar.f33835a = null;
                }
            }
            this.f33872l.clear();
        }
        m31204g();
    }

    public final void mo5733e() {
        this.f33874n = true;
        C6821b a = C6820a.m31042a(this.f33865e);
        if (a != C6821b.SUCCESS) {
            this.f33866f.sendMessage(this.f33866f.obtainMessage(3, a));
            return;
        }
        Intent intent = new Intent(mo5739c()).setPackage(ar.m31121a(this.f33865e));
        if (this.f33873m != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            m31204g();
        }
        this.f33873m = new ad(this);
        if (!this.f33865e.bindService(intent, this.f33873m, 129)) {
            this.f33866f.sendMessage(this.f33866f.obtainMessage(3, C6821b.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    public final boolean m31203f() {
        return this.f33867g != null;
    }

    final void m31204g() {
        if (this.f33873m != null) {
            try {
                this.f33865e.unbindService(this.f33873m);
            } catch (Throwable e) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e);
            }
        }
        this.f33867g = null;
        this.f33873m = null;
    }

    protected final void m31205h() {
        this.f33866f.removeMessages(4);
        synchronized (this.f33868h) {
            this.f33870j = true;
            ArrayList arrayList = this.f33868h;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f33874n; i++) {
                if (this.f33868h.contains(arrayList.get(i))) {
                    ((aj) arrayList.get(i)).mo5742b();
                }
            }
            this.f33870j = false;
        }
    }

    protected final void m31206i() {
        if (!m31203f()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected final IInterface m31207j() {
        m31206i();
        return this.f33867g;
    }
}
