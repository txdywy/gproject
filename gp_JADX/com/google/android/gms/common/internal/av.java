package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class av extends Handler {
    public /* synthetic */ ar f25995a;

    public av(ar arVar, Looper looper) {
        this.f25995a = arVar;
        super(looper);
    }

    private static void m23760a(Message message) {
        aw awVar = (aw) message.obj;
        awVar.mo4613b();
        awVar.m23751c();
    }

    private static boolean m23761b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    public final void handleMessage(Message message) {
        if (this.f25995a.f25411B.get() != message.arg1) {
            if (m23761b(message)) {
                m23760a(message);
            }
        } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.f25995a.m23022k()) {
            m23760a(message);
        } else if (message.what == 4) {
            this.f25995a.f25433z = new ConnectionResult(message.arg2);
            if (!this.f25995a.m23003w() || this.f25995a.f25410A) {
                r0 = this.f25995a.f25433z != null ? this.f25995a.f25433z : new ConnectionResult(8);
                this.f25995a.f25424q.mo4580a(r0);
                this.f25995a.m23010a(r0);
                return;
            }
            this.f25995a.m22989a(3, null);
        } else if (message.what == 5) {
            r0 = this.f25995a.f25433z != null ? this.f25995a.f25433z : new ConnectionResult(8);
            this.f25995a.f25424q.mo4580a(r0);
            this.f25995a.m23010a(r0);
        } else if (message.what == 3) {
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null);
            this.f25995a.f25424q.mo4580a(connectionResult);
            this.f25995a.m23010a(connectionResult);
        } else if (message.what == 6) {
            this.f25995a.m22989a(5, null);
            if (this.f25995a.f25429v != null) {
                this.f25995a.f25429v.mo4620a(message.arg2);
            }
            this.f25995a.mo4507a(message.arg2);
            this.f25995a.m22992a(5, 1, null);
        } else if (message.what == 2 && !this.f25995a.m23021j()) {
            m23760a(message);
        } else if (m23761b(message)) {
            Object obj;
            aw awVar = (aw) message.obj;
            synchronized (awVar) {
                obj = awVar.f25990d;
                if (awVar.f25991e) {
                    String valueOf = String.valueOf(awVar);
                    Log.w("GmsClient", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.").toString());
                }
            }
            if (obj != null) {
                try {
                    awVar.mo4612a(obj);
                } catch (RuntimeException e) {
                    awVar.mo4613b();
                    throw e;
                }
            }
            awVar.mo4613b();
            synchronized (awVar) {
                awVar.f25991e = true;
            }
            awVar.m23751c();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
        }
    }
}
