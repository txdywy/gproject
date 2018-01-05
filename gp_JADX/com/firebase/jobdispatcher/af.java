package com.firebase.jobdispatcher;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class af implements ServiceConnection {
    public final Map f4659a = new HashMap();
    public final C0738n f4660b;
    public final Context f4661c;
    public boolean f4662d = false;
    public C0733q f4663e;

    af(C0738n c0738n, Context context) {
        this.f4660b = c0738n;
        this.f4661c = context;
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (m4823a()) {
            Log.w("FJD.ExternalReceiver", "Connection have been used already.");
        } else {
            C0733q c0733q;
            if (iBinder == null) {
                c0733q = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.firebase.jobdispatcher.IRemoteJobService");
                if (queryLocalInterface instanceof C0733q) {
                    c0733q = (C0733q) queryLocalInterface;
                } else {
                    c0733q = new C0750s(iBinder);
                }
            }
            this.f4663e = c0733q;
            Set<C0755x> hashSet = new HashSet();
            for (Entry entry : this.f4659a.entrySet()) {
                if (Boolean.FALSE.equals(entry.getValue())) {
                    try {
                        this.f4663e.mo1110a(m4819a((C0751z) entry.getKey()), this.f4660b);
                        hashSet.add((C0755x) entry.getKey());
                    } catch (Throwable e) {
                        String valueOf = String.valueOf(entry.getKey());
                        Log.e("FJD.ExternalReceiver", new StringBuilder(String.valueOf(valueOf).length() + 20).append("Failed to start job ").append(valueOf).toString(), e);
                        m4826c();
                    }
                }
            }
            for (C0755x put : hashSet) {
                this.f4659a.put(put, Boolean.valueOf(true));
            }
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        m4826c();
    }

    final synchronized boolean m4823a() {
        return this.f4662d;
    }

    final synchronized boolean m4824b() {
        return this.f4663e != null;
    }

    final synchronized void m4822a(C0755x c0755x, boolean z) {
        if (m4823a()) {
            Log.w("FJD.ExternalReceiver", "Can't send stop request because service was unbound.");
        } else {
            if (Boolean.TRUE.equals(this.f4659a.remove(c0755x)) && m4824b()) {
                m4820a(z, c0755x);
            }
            if (!z && this.f4659a.isEmpty()) {
                m4826c();
            }
        }
    }

    private final synchronized void m4820a(boolean z, C0755x c0755x) {
        try {
            this.f4663e.mo1111a(m4819a((C0751z) c0755x), z);
        } catch (Throwable e) {
            Log.e("FJD.ExternalReceiver", "Failed to stop a job", e);
            m4826c();
        }
    }

    final synchronized void m4826c() {
        if (!m4823a()) {
            this.f4663e = null;
            this.f4662d = true;
            try {
                this.f4661c.unbindService(this);
            } catch (IllegalArgumentException e) {
                String str = "FJD.ExternalReceiver";
                String str2 = "Error unbinding service: ";
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                Log.w(str, valueOf);
            }
        }
    }

    final synchronized void m4821a(C0755x c0755x) {
        this.f4659a.remove(c0755x);
        if (this.f4659a.isEmpty()) {
            m4826c();
        }
    }

    final synchronized boolean m4825b(C0755x c0755x) {
        boolean z;
        boolean b = m4824b();
        if (b) {
            if (Boolean.TRUE.equals((Boolean) this.f4659a.get(c0755x))) {
                String valueOf = String.valueOf(c0755x);
                Log.w("FJD.ExternalReceiver", new StringBuilder(String.valueOf(valueOf).length() + 54).append("Received an execution request for already running job ").append(valueOf).toString());
                m4820a(false, c0755x);
            }
            try {
                this.f4663e.mo1110a(m4819a((C0751z) c0755x), this.f4660b);
            } catch (Throwable e) {
                valueOf = String.valueOf(c0755x);
                Log.e("FJD.ExternalReceiver", new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to start the job ").append(valueOf).toString(), e);
                m4826c();
                z = false;
            }
        }
        this.f4659a.put(c0755x, Boolean.valueOf(b));
        z = b;
        return z;
    }

    private static Bundle m4819a(C0751z c0751z) {
        return GooglePlayReceiver.f4639a.m4893a(c0751z, new Bundle());
    }

    final synchronized boolean m4827c(C0755x c0755x) {
        return this.f4659a.containsKey(c0755x);
    }
}
