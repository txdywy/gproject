package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.support.v4.p037h.C0304u;
import android.util.Log;
import android.util.Pair;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class GooglePlayReceiver extends Service implements C0731f {
    public static final C0754w f4639a = new C0754w("com.firebase.jobdispatcher.");
    public static final C0304u f4640g = new C0304u(1);
    public Messenger f4641b;
    public C0736c f4642c;
    public ValidationEnforcer f4643d;
    public C0737d f4644e;
    public int f4645f;

    public GooglePlayReceiver() {
        C0742h c0742h = new C0742h();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    private static void m4802a(C0744v c0744v, int i) {
        try {
            c0744v.mo1117a(i);
        } catch (Throwable th) {
            Log.e("FJD.GooglePlayReceiver", "Encountered error running callback", th.getCause());
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C0755x c0755x = null;
        try {
            super.onStartCommand(intent, i, i2);
            if (intent == null) {
                Log.w("FJD.GooglePlayReceiver", "Null Intent passed, terminating");
                synchronized (f4640g) {
                    this.f4645f = i2;
                    if (f4640g.isEmpty()) {
                        stopSelf(this.f4645f);
                    }
                }
            } else {
                String action = intent.getAction();
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                    C0737d a = m4806a();
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        Log.e("FJD.GooglePlayReceiver", "No data provided, terminating");
                    } else {
                        Pair pair;
                        if (extras == null) {
                            Log.e("FJD.GooglePlayReceiver", "No callback received, terminating");
                            pair = null;
                        } else {
                            pair = C0742h.m4846a(extras);
                        }
                        if (pair == null) {
                            Log.i("FJD.GooglePlayReceiver", "no callback found");
                        } else {
                            c0755x = m4801a((C0744v) pair.first, (Bundle) pair.second);
                        }
                    }
                    a.m4840a(c0755x);
                    synchronized (f4640g) {
                        this.f4645f = i2;
                        if (f4640g.isEmpty()) {
                            stopSelf(this.f4645f);
                        }
                    }
                } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    synchronized (f4640g) {
                        this.f4645f = i2;
                        if (f4640g.isEmpty()) {
                            stopSelf(this.f4645f);
                        }
                    }
                } else {
                    Log.e("FJD.GooglePlayReceiver", "Unknown action received, terminating");
                    synchronized (f4640g) {
                        this.f4645f = i2;
                        if (f4640g.isEmpty()) {
                            stopSelf(this.f4645f);
                        }
                    }
                }
            }
            return 2;
        } catch (Throwable th) {
            synchronized (f4640g) {
                this.f4645f = i2;
                if (f4640g.isEmpty()) {
                    stopSelf(this.f4645f);
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        if (intent == null || VERSION.SDK_INT < 21 || !"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
            return null;
        }
        return m4803b().getBinder();
    }

    private final synchronized Messenger m4803b() {
        if (this.f4641b == null) {
            this.f4641b = new Messenger(new C0747l(Looper.getMainLooper(), this));
        }
        return this.f4641b;
    }

    final synchronized C0737d m4806a() {
        if (this.f4644e == null) {
            this.f4644e = new C0737d(this, this);
        }
        return this.f4644e;
    }

    private final synchronized C0736c m4804c() {
        if (this.f4642c == null) {
            this.f4642c = new C0743i(getApplicationContext());
        }
        return this.f4642c;
    }

    private final synchronized ValidationEnforcer m4805d() {
        if (this.f4643d == null) {
            this.f4643d = new ValidationEnforcer(m4804c().mo1115b());
        }
        return this.f4643d;
    }

    static C0755x m4801a(C0744v c0744v, Bundle bundle) {
        C0755x c0755x;
        C0754w c0754w = f4639a;
        if (bundle == null) {
            Log.e("FJD.ExternalReceiver", "Unexpected null Bundle provided");
            c0755x = null;
        } else {
            Bundle bundle2 = bundle.getBundle("extras");
            if (bundle2 == null) {
                c0755x = null;
            } else {
                C0756y a = c0754w.m4894a(bundle2);
                if (bundle.getParcelableArrayList("triggered_uris") != null) {
                    a.f4731j = new ap();
                }
                c0755x = a.m4904a();
            }
        }
        if (c0755x == null) {
            Log.e("FJD.GooglePlayReceiver", "unable to decode job");
            m4802a(c0744v, 2);
            return null;
        }
        synchronized (f4640g) {
            C0304u c0304u = (C0304u) f4640g.get(c0755x.f4713b);
            if (c0304u == null) {
                c0304u = new C0304u(1);
                f4640g.put(c0755x.f4713b, c0304u);
            }
            c0304u.put(c0755x.f4712a, c0744v);
        }
        return c0755x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1108a(com.firebase.jobdispatcher.C0755x r7, int r8) {
        /*
        r6 = this;
        r2 = 1;
        r3 = f4640g;
        monitor-enter(r3);
        r0 = f4640g;	 Catch:{ all -> 0x00be }
        r1 = r7.f4713b;	 Catch:{ all -> 0x00be }
        r0 = r0.get(r1);	 Catch:{ all -> 0x00be }
        r0 = (android.support.v4.p037h.C0304u) r0;	 Catch:{ all -> 0x00be }
        if (r0 != 0) goto L_0x001f;
    L_0x0010:
        r0 = f4640g;	 Catch:{ all -> 0x0038 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x001d;
    L_0x0018:
        r0 = r6.f4645f;	 Catch:{ all -> 0x0038 }
        r6.stopSelf(r0);	 Catch:{ all -> 0x0038 }
    L_0x001d:
        monitor-exit(r3);	 Catch:{ all -> 0x0038 }
    L_0x001e:
        return;
    L_0x001f:
        r1 = r7.f4712a;	 Catch:{ all -> 0x00be }
        r1 = r0.remove(r1);	 Catch:{ all -> 0x00be }
        r1 = (com.firebase.jobdispatcher.C0744v) r1;	 Catch:{ all -> 0x00be }
        if (r1 != 0) goto L_0x003b;
    L_0x0029:
        r0 = f4640g;	 Catch:{ all -> 0x0038 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0036;
    L_0x0031:
        r0 = r6.f4645f;	 Catch:{ all -> 0x0038 }
        r6.stopSelf(r0);	 Catch:{ all -> 0x0038 }
    L_0x0036:
        monitor-exit(r3);	 Catch:{ all -> 0x0038 }
        goto L_0x001e;
    L_0x0038:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0038 }
        throw r0;
    L_0x003b:
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00be }
        if (r0 == 0) goto L_0x0048;
    L_0x0041:
        r0 = f4640g;	 Catch:{ all -> 0x00be }
        r4 = r7.f4713b;	 Catch:{ all -> 0x00be }
        r0.remove(r4);	 Catch:{ all -> 0x00be }
    L_0x0048:
        r0 = r7.mo1125h();	 Catch:{ all -> 0x00be }
        if (r0 == 0) goto L_0x0081;
    L_0x004e:
        r0 = r7.mo1123f();	 Catch:{ all -> 0x00be }
        r0 = r0 instanceof com.firebase.jobdispatcher.ah;	 Catch:{ all -> 0x00be }
        if (r0 == 0) goto L_0x0081;
    L_0x0056:
        if (r8 == r2) goto L_0x0081;
    L_0x0058:
        r0 = r2;
    L_0x0059:
        if (r0 == 0) goto L_0x0083;
    L_0x005b:
        r0 = new com.firebase.jobdispatcher.u;	 Catch:{ all -> 0x00be }
        r1 = r6.m4805d();	 Catch:{ all -> 0x00be }
        r0.<init>(r1, r7);	 Catch:{ all -> 0x00be }
        r1 = 1;
        r0.f4709i = r1;	 Catch:{ all -> 0x00be }
        r0 = r0.m4890j();	 Catch:{ all -> 0x00be }
        r1 = r6.m4804c();	 Catch:{ all -> 0x00be }
        r1.mo1114a(r0);	 Catch:{ all -> 0x00be }
    L_0x0072:
        r0 = f4640g;	 Catch:{ all -> 0x0038 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x007f;
    L_0x007a:
        r0 = r6.f4645f;	 Catch:{ all -> 0x0038 }
        r6.stopSelf(r0);	 Catch:{ all -> 0x0038 }
    L_0x007f:
        monitor-exit(r3);	 Catch:{ all -> 0x0038 }
        goto L_0x001e;
    L_0x0081:
        r0 = 0;
        goto L_0x0059;
    L_0x0083:
        r0 = "FJD.GooglePlayReceiver";
        r2 = 2;
        r0 = android.util.Log.isLoggable(r0, r2);	 Catch:{ all -> 0x00be }
        if (r0 == 0) goto L_0x00ba;
    L_0x008c:
        r0 = "FJD.GooglePlayReceiver";
        r2 = r7.f4712a;	 Catch:{ all -> 0x00be }
        r4 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00be }
        r4 = r4.length();	 Catch:{ all -> 0x00be }
        r4 = r4 + 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00be }
        r5.<init>(r4);	 Catch:{ all -> 0x00be }
        r4 = "sending jobFinished for ";
        r4 = r5.append(r4);	 Catch:{ all -> 0x00be }
        r2 = r4.append(r2);	 Catch:{ all -> 0x00be }
        r4 = " = ";
        r2 = r2.append(r4);	 Catch:{ all -> 0x00be }
        r2 = r2.append(r8);	 Catch:{ all -> 0x00be }
        r2 = r2.toString();	 Catch:{ all -> 0x00be }
        android.util.Log.v(r0, r2);	 Catch:{ all -> 0x00be }
    L_0x00ba:
        m4802a(r1, r8);	 Catch:{ all -> 0x00be }
        goto L_0x0072;
    L_0x00be:
        r0 = move-exception;
        r1 = f4640g;	 Catch:{ all -> 0x0038 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0038 }
        if (r1 == 0) goto L_0x00cc;
    L_0x00c7:
        r1 = r6.f4645f;	 Catch:{ all -> 0x0038 }
        r6.stopSelf(r1);	 Catch:{ all -> 0x0038 }
    L_0x00cc:
        throw r0;	 Catch:{ all -> 0x0038 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.GooglePlayReceiver.a(com.firebase.jobdispatcher.x, int):void");
    }
}
