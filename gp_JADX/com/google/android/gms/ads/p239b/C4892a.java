package com.google.android.gms.ads.p239b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.C5109i;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.p282a.C5051b;
import com.google.android.gms.internal.tv;
import com.google.android.gms.internal.tw;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class C4892a {
    public C5109i f25239a;
    public tv f25240b;
    public boolean f25241c;
    public Object f25242d;
    public C4894c f25243e;
    public final Context f25244f;
    public long f25245g;

    public C4892a(Context context) {
        this(context, 30000, false);
    }

    private C4892a(Context context, long j, boolean z) {
        this.f25242d = new Object();
        am.m23733a((Object) context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f25244f = context;
        } else {
            this.f25244f = context;
        }
        this.f25241c = false;
        this.f25245g = j;
    }

    private static C5109i m22913b(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            switch (C5095d.m23655a(context)) {
                case 0:
                case 2:
                    Object c5109i = new C5109i();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        C5051b.m23267a();
                        if (C5051b.m23269b(context, intent, c5109i, 1)) {
                            return c5109i;
                        }
                        throw new IOException("Connection failure");
                    } catch (Throwable th) {
                        IOException iOException = new IOException(th);
                    }
                default:
                    throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException e) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    private final void m22914c() {
        synchronized (this.f25242d) {
            if (this.f25243e != null) {
                this.f25243e.f25250c.countDown();
                try {
                    this.f25243e.join();
                } catch (InterruptedException e) {
                }
            }
            if (this.f25245g > 0) {
                this.f25243e = new C4894c(this, this.f25245g);
            }
        }
    }

    public final C4893b m22915a() {
        C4893b c4893b;
        am.m23745c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f25241c) {
                synchronized (this.f25242d) {
                    if (this.f25243e == null || !this.f25243e.f25251d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m22916a(false);
                    if (!this.f25241c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Throwable e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Throwable e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            am.m23733a(this.f25239a);
            am.m23733a(this.f25240b);
            c4893b = new C4893b(this.f25240b.mo4886a(), this.f25240b.mo4887b());
        }
        m22914c();
        return c4893b;
    }

    public final void m22916a(boolean z) {
        am.m23745c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f25241c) {
                m22917b();
            }
            this.f25239a = C4892a.m22913b(this.f25244f);
            this.f25240b = C4892a.m22911a(this.f25239a);
            this.f25241c = true;
            if (z) {
                m22914c();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m22917b() {
        /*
        r3 = this;
        r0 = "Calling this from your main thread can lead to deadlock";
        com.google.android.gms.common.internal.am.m23745c(r0);
        monitor-enter(r3);
        r0 = r3.f25244f;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x000e;
    L_0x000a:
        r0 = r3.f25239a;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x0029 }
    L_0x000f:
        return;
    L_0x0010:
        r0 = r3.f25241c;	 Catch:{ Throwable -> 0x002c }
        if (r0 == 0) goto L_0x001e;
    L_0x0014:
        com.google.android.gms.common.p282a.C5051b.m23267a();	 Catch:{ Throwable -> 0x002c }
        r0 = r3.f25244f;	 Catch:{ Throwable -> 0x002c }
        r1 = r3.f25239a;	 Catch:{ Throwable -> 0x002c }
        r0.unbindService(r1);	 Catch:{ Throwable -> 0x002c }
    L_0x001e:
        r0 = 0;
        r3.f25241c = r0;	 Catch:{ all -> 0x0029 }
        r0 = 0;
        r3.f25240b = r0;	 Catch:{ all -> 0x0029 }
        r0 = 0;
        r3.f25239a = r0;	 Catch:{ all -> 0x0029 }
        monitor-exit(r3);	 Catch:{ all -> 0x0029 }
        goto L_0x000f;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0029 }
        throw r0;
    L_0x002c:
        r0 = move-exception;
        r1 = "AdvertisingIdClient";
        r2 = "AdvertisingIdClient unbindService failed.";
        android.util.Log.i(r1, r2, r0);	 Catch:{ all -> 0x0029 }
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.b.a.b():void");
    }

    protected final void finalize() {
        m22917b();
        super.finalize();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.ads.p239b.C4893b m22910a(android.content.Context r8) {
        /*
        r7 = 0;
        r0 = 0;
        r1 = new com.google.android.gms.ads.b.j;
        r1.<init>(r8);
        r2 = "gads:ad_id_app_context:enabled";
        r2 = r1.m22924a(r2);
        r3 = "gads:ad_id_app_context:ping_ratio";
        r3 = r1.m22925b(r3);
        r4 = "gads:ad_id_use_shared_preference:enabled";
        r1 = r1.m22924a(r4);
        if (r1 == 0) goto L_0x0062;
    L_0x001b:
        r1 = com.google.android.gms.ads.p239b.C4897g.m22922a(r8);
        r4 = r1.f25255b;
        r4 = com.google.android.gms.common.C5105f.m23698h(r4);
        if (r4 != 0) goto L_0x002d;
    L_0x0027:
        r1.m22923a(r0, r7);
    L_0x002a:
        if (r0 == 0) goto L_0x0062;
    L_0x002c:
        return r0;
    L_0x002d:
        r5 = "adid_settings";
        r4 = r4.getSharedPreferences(r5, r7);
        if (r4 != 0) goto L_0x0039;
    L_0x0035:
        r1.m22923a(r0, r7);
        goto L_0x002a;
    L_0x0039:
        r5 = "adid_key";
        r5 = r4.contains(r5);
        if (r5 == 0) goto L_0x0049;
    L_0x0041:
        r5 = "enable_limit_ad_tracking";
        r5 = r4.contains(r5);
        if (r5 != 0) goto L_0x004e;
    L_0x0049:
        r4 = 1;
        r1.m22923a(r0, r4);
        goto L_0x002a;
    L_0x004e:
        r0 = new com.google.android.gms.ads.b.b;
        r5 = "adid_key";
        r6 = "";
        r5 = r4.getString(r5, r6);
        r6 = "enable_limit_ad_tracking";
        r4 = r4.getBoolean(r6, r7);
        r0.<init>(r5, r4);
        goto L_0x0049;
    L_0x0062:
        r1 = new com.google.android.gms.ads.b.a;
        r4 = -1;
        r1.<init>(r8, r4, r2);
        r0 = 0;
        r1.m22916a(r0);	 Catch:{ Throwable -> 0x0079 }
        r0 = r1.m22915a();	 Catch:{ Throwable -> 0x0079 }
        r4 = 0;
        com.google.android.gms.ads.p239b.C4892a.m22912a(r0, r2, r3, r4);	 Catch:{ Throwable -> 0x0079 }
        r1.m22917b();
        goto L_0x002c;
    L_0x0079:
        r0 = move-exception;
        r4 = 0;
        com.google.android.gms.ads.p239b.C4892a.m22912a(r4, r2, r3, r0);	 Catch:{ all -> 0x007f }
        throw r0;	 Catch:{ all -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        r1.m22917b();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.b.a.a(android.content.Context):com.google.android.gms.ads.b.b");
    }

    private static boolean m22912a(C4893b c4893b, boolean z, float f, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        Map hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (c4893b != null) {
            hashMap.put("limit_ad_tracking", c4893b.f25247b ? "1" : "0");
        }
        if (!(c4893b == null || c4893b.f25246a == null)) {
            hashMap.put("ad_id_size", Integer.toString(c4893b.f25246a.length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        new C4896f(hashMap).start();
        return true;
    }

    private static tv m22911a(C5109i c5109i) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            am.m23745c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
            if (c5109i.f25973a) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            c5109i.f25973a = true;
            IBinder iBinder = (IBinder) c5109i.f25974b.poll(10000, timeUnit);
            if (iBinder == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            } else if (iBinder == null) {
                return null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                return queryLocalInterface instanceof tv ? (tv) queryLocalInterface : new tw(iBinder);
            }
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            IOException iOException = new IOException(th);
        }
    }
}
