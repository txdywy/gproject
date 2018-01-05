package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C5087l;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ar {
    public boolean f25410A;
    public AtomicInteger f25411B;
    public int f25412e;
    public long f25413f;
    public long f25414g;
    public int f25415h;
    public long f25416i;
    public C5125n f25417j;
    public final Context f25418k;
    public final C5119h f25419l;
    public final Handler f25420m;
    public final Object f25421n;
    public final Object f25422o;
    public C5133x f25423p;
    public ax f25424q;
    public IInterface f25425r;
    public final ArrayList f25426s;
    public az f25427t;
    public int f25428u;
    public final at f25429v;
    public final au f25430w;
    public final int f25431x;
    public final String f25432y;
    public ConnectionResult f25433z;

    static {
        String[] strArr = new String[]{"service_esmobile", "service_googleme"};
    }

    public ar(Context context, Looper looper, int i, at atVar, au auVar) {
        this(context, looper, C5119h.m23789a(context), C5095d.f25937d, i, (at) am.m23733a((Object) atVar), (au) am.m23733a((Object) auVar), null);
    }

    protected ar(Context context, Looper looper, C5119h c5119h, C5095d c5095d, int i, at atVar, au auVar, String str) {
        this.f25421n = new Object();
        this.f25422o = new Object();
        this.f25426s = new ArrayList();
        this.f25428u = 1;
        this.f25433z = null;
        this.f25410A = false;
        this.f25411B = new AtomicInteger(0);
        this.f25418k = (Context) am.m23734a((Object) context, (Object) "Context must not be null");
        am.m23734a((Object) looper, (Object) "Looper must not be null");
        this.f25419l = (C5119h) am.m23734a((Object) c5119h, (Object) "Supervisor must not be null");
        am.m23734a((Object) c5095d, (Object) "API availability must not be null");
        this.f25420m = new av(this, looper);
        this.f25431x = i;
        this.f25429v = atVar;
        this.f25430w = auVar;
        this.f25432y = str;
    }

    private final boolean m22992a(int i, int i2, IInterface iInterface) {
        boolean z;
        synchronized (this.f25421n) {
            if (this.f25428u != i) {
                z = false;
            } else {
                m22989a(i2, iInterface);
                z = true;
            }
        }
        return z;
    }

    private final String mo4511f() {
        return this.f25432y == null ? this.f25418k.getClass().getName() : this.f25432y;
    }

    private final boolean mo4512g() {
        boolean z;
        synchronized (this.f25421n) {
            z = this.f25428u == 3;
        }
        return z;
    }

    private final boolean m23003w() {
        if (this.f25410A || TextUtils.isEmpty(mo4483b()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(mo4483b());
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public final Bundle m23004a() {
        return null;
    }

    public abstract IInterface mo4482a(IBinder iBinder);

    public void mo4507a(int i) {
        this.f25412e = i;
        this.f25413f = System.currentTimeMillis();
    }

    protected final void m23007a(int i, int i2) {
        this.f25420m.sendMessage(this.f25420m.obtainMessage(7, i2, -1, new bc(this, i)));
    }

    public void mo5111a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f25420m.sendMessage(this.f25420m.obtainMessage(1, i2, -1, new bb(this, i, iBinder, bundle)));
    }

    public void mo4508a(IInterface iInterface) {
        this.f25414g = System.currentTimeMillis();
    }

    public void mo4509a(ax axVar) {
        this.f25424q = (ax) am.m23734a((Object) axVar, (Object) "Connection progress callbacks cannot be null.");
        m22989a(2, null);
    }

    public final void m23012a(ax axVar, int i, PendingIntent pendingIntent) {
        this.f25424q = (ax) am.m23734a((Object) axVar, (Object) "Connection progress callbacks cannot be null.");
        this.f25420m.sendMessage(this.f25420m.obtainMessage(3, this.f25411B.get(), i, pendingIntent));
    }

    public final void m23014a(String str, PrintWriter printWriter) {
        synchronized (this.f25421n) {
            int i = this.f25428u;
            IInterface iInterface = this.f25425r;
        }
        synchronized (this.f25422o) {
            C5133x c5133x = this.f25423p;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("REMOTE_CONNECTING");
                break;
            case 3:
                printWriter.print("LOCAL_CONNECTING");
                break;
            case 4:
                printWriter.print("CONNECTED");
                break;
            case 5:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo4483b()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (c5133x == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(c5133x.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f25414g > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f25414g;
            String format = simpleDateFormat.format(new Date(this.f25414g));
            append.println(new StringBuilder(String.valueOf(format).length() + 21).append(j).append(" ").append(format).toString());
        }
        if (this.f25413f > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.f25412e) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.f25412e));
                    break;
            }
            append = printWriter.append(" lastSuspendedTime=");
            j = this.f25413f;
            format = simpleDateFormat.format(new Date(this.f25413f));
            append.println(new StringBuilder(String.valueOf(format).length() + 21).append(j).append(" ").append(format).toString());
        }
        if (this.f25416i > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C5087l.m23645a(this.f25415h));
            append = printWriter.append(" lastFailedTime=");
            j = this.f25416i;
            String format2 = simpleDateFormat.format(new Date(this.f25416i));
            append.println(new StringBuilder(String.valueOf(format2).length() + 21).append(j).append(" ").append(format2).toString());
        }
    }

    public abstract String mo4483b();

    public boolean mo4484c() {
        return false;
    }

    public abstract String cu_();

    public Intent mo4486d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public void mo4510e() {
        this.f25411B.incrementAndGet();
        synchronized (this.f25426s) {
            int size = this.f25426s.size();
            for (int i = 0; i < size; i++) {
                ((aw) this.f25426s.get(i)).m23752d();
            }
            this.f25426s.clear();
        }
        synchronized (this.f25422o) {
            this.f25423p = null;
        }
        m22989a(1, null);
    }

    public int mo4513h() {
        return 129;
    }

    public Bundle mo4514i() {
        return new Bundle();
    }

    public final boolean m23021j() {
        boolean z;
        synchronized (this.f25421n) {
            z = this.f25428u == 4;
        }
        return z;
    }

    public final boolean m23022k() {
        boolean z;
        synchronized (this.f25421n) {
            z = this.f25428u == 2 || this.f25428u == 3;
        }
        return z;
    }

    public boolean mo4826l() {
        return false;
    }

    public boolean mo5112m() {
        return true;
    }

    public final IBinder m23025n() {
        IBinder iBinder;
        synchronized (this.f25422o) {
            if (this.f25423p == null) {
                iBinder = null;
            } else {
                iBinder = this.f25423p.asBinder();
            }
        }
        return iBinder;
    }

    public Account mo4479o() {
        return null;
    }

    protected Set mo4480p() {
        return Collections.EMPTY_SET;
    }

    public zzc[] mo4481q() {
        return new zzc[0];
    }

    public String mo5113r() {
        return "com.google.android.gms";
    }

    public final void m23030s() {
        int a = C5095d.m23655a(this.f25418k);
        if (a != 0) {
            m22989a(1, null);
            m23012a(new ba(this), a, null);
            return;
        }
        mo4509a(new ba(this));
    }

    public final void m23031t() {
        if (!m23021j()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final IInterface m23032u() {
        IInterface iInterface;
        synchronized (this.f25421n) {
            if (this.f25428u == 5) {
                throw new DeadObjectException();
            }
            m23031t();
            am.m23739a(this.f25425r != null, (Object) "Client is connected but service is null");
            iInterface = this.f25425r;
        }
        return iInterface;
    }

    public boolean mo4844v() {
        return false;
    }

    protected final void m23010a(ConnectionResult connectionResult) {
        this.f25415h = connectionResult.f25611c;
        this.f25416i = System.currentTimeMillis();
    }

    private final void m22989a(int i, IInterface iInterface) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (iInterface != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            z3 = false;
        }
        am.m23742b(z3);
        synchronized (this.f25421n) {
            this.f25428u = i;
            this.f25425r = iInterface;
            C5119h c5119h;
            String cu_;
            String r;
            int h;
            ServiceConnection serviceConnection;
            switch (i) {
                case 1:
                    if (this.f25427t != null) {
                        c5119h = this.f25419l;
                        cu_ = cu_();
                        r = mo5113r();
                        h = mo4513h();
                        serviceConnection = this.f25427t;
                        mo4511f();
                        c5119h.m23791a(cu_, r, h, serviceConnection);
                        this.f25427t = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!(this.f25427t == null || this.f25417j == null)) {
                        cu_ = this.f25417j.f26058a;
                        r = this.f25417j.f26059b;
                        Log.e("GmsClient", new StringBuilder((String.valueOf(cu_).length() + 70) + String.valueOf(r).length()).append("Calling connect() while still connected, missing disconnect() for ").append(cu_).append(" on ").append(r).toString());
                        c5119h = this.f25419l;
                        cu_ = this.f25417j.f26058a;
                        r = this.f25417j.f26059b;
                        h = this.f25417j.f26060c;
                        serviceConnection = this.f25427t;
                        mo4511f();
                        c5119h.m23791a(cu_, r, h, serviceConnection);
                        this.f25411B.incrementAndGet();
                    }
                    this.f25427t = new az(this, this.f25411B.get());
                    this.f25417j = new C5125n(mo5113r(), cu_(), mo4513h());
                    c5119h = this.f25419l;
                    cu_ = this.f25417j.f26058a;
                    r = this.f25417j.f26059b;
                    h = this.f25417j.f26060c;
                    serviceConnection = this.f25427t;
                    mo4511f();
                    if (!c5119h.mo4622a(new C5120i(cu_, r, h), serviceConnection)) {
                        cu_ = this.f25417j.f26058a;
                        r = this.f25417j.f26059b;
                        Log.e("GmsClient", new StringBuilder((String.valueOf(cu_).length() + 34) + String.valueOf(r).length()).append("unable to connect to service: ").append(cu_).append(" on ").append(r).toString());
                        m23007a(16, this.f25411B.get());
                        break;
                    }
                    break;
                case 4:
                    mo4508a(iInterface);
                    break;
            }
        }
    }

    public final void m23013a(C5110o c5110o, Set set) {
        Throwable e;
        Bundle i = mo4514i();
        zzz com_google_android_gms_common_internal_zzz = new zzz(this.f25431x);
        com_google_android_gms_common_internal_zzz.f26074d = this.f25418k.getPackageName();
        com_google_android_gms_common_internal_zzz.f26077g = i;
        if (set != null) {
            com_google_android_gms_common_internal_zzz.f26076f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo4826l()) {
            com_google_android_gms_common_internal_zzz.f26078h = mo4479o() != null ? mo4479o() : new Account("<<default account>>", "com.google");
            if (c5110o != null) {
                com_google_android_gms_common_internal_zzz.f26075e = c5110o.asBinder();
            }
        } else if (mo4844v()) {
            com_google_android_gms_common_internal_zzz.f26078h = mo4479o();
        }
        com_google_android_gms_common_internal_zzz.f26079i = mo4481q();
        try {
            synchronized (this.f25422o) {
                if (this.f25423p != null) {
                    this.f25423p.mo4626a(new ay(this, this.f25411B.get()), com_google_android_gms_common_internal_zzz);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (Throwable e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            this.f25420m.sendMessage(this.f25420m.obtainMessage(6, this.f25411B.get(), 1));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException e4) {
            e2 = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            mo5111a(8, null, null, this.f25411B.get());
        } catch (RuntimeException e5) {
            e2 = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            mo5111a(8, null, null, this.f25411B.get());
        }
    }

    static /* synthetic */ void m22990a(ar arVar) {
        int i;
        if (arVar.mo4512g()) {
            i = 5;
            arVar.f25410A = true;
        } else {
            i = 4;
        }
        arVar.f25420m.sendMessage(arVar.f25420m.obtainMessage(i, arVar.f25411B.get(), 16));
    }
}
