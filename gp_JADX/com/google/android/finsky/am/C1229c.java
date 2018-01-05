package com.google.android.finsky.am;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Parcelable;
import android.support.v4.app.cg;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1228w;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.p111d.C1464x;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.concurrent.TimeUnit;

public final class C1229c implements C0657w, C0660x, C1228w, C1031w {
    public final C2473o f7364a = new C2473o(912, null);
    public final C2473o f7365b = new C2473o(913, this.f7364a);
    public final Context f7366c;
    public final C1287h f7367d;
    public final C1464x f7368e;
    public String f7369f;
    public Intent f7370g;
    public C2495w f7371h;
    public BroadcastReceiver f7372i;
    public BroadcastReceiver f7373j;
    public boolean f7374k;
    public boolean f7375l;
    public C2719i f7376m;

    public C1229c(Context context, C1287h c1287h, C1464x c1464x) {
        this.f7366c = context;
        this.f7367d = c1287h;
        this.f7368e = c1464x;
    }

    public static boolean m7218b(VolleyError volleyError) {
        return volleyError instanceof NoConnectionError;
    }

    public final synchronized void m7228a(String str, C2495w c2495w, Intent intent) {
        if (intent != null) {
            m7230c();
            this.f7369f = str;
            this.f7370g = intent;
            this.f7371h = c2495w;
            m7219g();
            m7221i();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m7226a(com.google.android.finsky.p111d.C2495w r5, android.content.Intent r6) {
        /*
        r4 = this;
        r0 = 0;
        monitor-enter(r4);
        r1 = "notification_on_reconnection";
        r2 = 0;
        r1 = r6.getBooleanExtra(r1, r2);	 Catch:{ all -> 0x004b }
        if (r1 != 0) goto L_0x003b;
    L_0x000b:
        r2 = r4.f7370g;	 Catch:{ all -> 0x004b }
        if (r2 != 0) goto L_0x0016;
    L_0x000f:
        if (r6 != 0) goto L_0x0012;
    L_0x0011:
        r0 = 1;
    L_0x0012:
        if (r0 != 0) goto L_0x003b;
    L_0x0014:
        monitor-exit(r4);
        return;
    L_0x0016:
        r0 = "reconnection_original_intent";
        r0 = r6.hasExtra(r0);	 Catch:{ all -> 0x004b }
        if (r0 == 0) goto L_0x004e;
    L_0x001e:
        r0 = "reconnection_original_intent";
        r0 = r6.getParcelableExtra(r0);	 Catch:{ all -> 0x004b }
        r0 = (android.content.Intent) r0;	 Catch:{ all -> 0x004b }
    L_0x0026:
        r2 = r4.f7370g;	 Catch:{ all -> 0x004b }
        r3 = 0;
        r2 = r2.toUri(r3);	 Catch:{ all -> 0x004b }
        if (r0 != 0) goto L_0x0035;
    L_0x002f:
        r0 = 0;
    L_0x0030:
        r0 = android.text.TextUtils.equals(r2, r0);	 Catch:{ all -> 0x004b }
        goto L_0x0012;
    L_0x0035:
        r3 = 0;
        r0 = r0.toUri(r3);	 Catch:{ all -> 0x004b }
        goto L_0x0030;
    L_0x003b:
        if (r1 != 0) goto L_0x0047;
    L_0x003d:
        r0 = new com.google.android.finsky.d.c;	 Catch:{ all -> 0x004b }
        r1 = 548; // 0x224 float:7.68E-43 double:2.707E-321;
        r0.<init>(r1);	 Catch:{ all -> 0x004b }
        r5.m13367a(r0);	 Catch:{ all -> 0x004b }
    L_0x0047:
        r4.m7230c();	 Catch:{ all -> 0x004b }
        goto L_0x0014;
    L_0x004b:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x004e:
        r0 = r6;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.am.c.a(com.google.android.finsky.d.w, android.content.Intent):void");
    }

    public final synchronized void m7229b() {
        m7233f();
        if (this.f7370g != null) {
            m7219g();
            if (this.f7374k) {
                m7232e();
            }
        }
    }

    public final synchronized void m7227a(String str) {
        if (!(this.f7376m == null || this.f7376m.m14722b() == null || !TextUtils.equals(str, this.f7376m.m14722b().f14885a.f12097d))) {
            m7230c();
        }
    }

    final synchronized void m7230c() {
        m7223l();
        this.f7369f = null;
        this.f7370g = null;
        this.f7371h = null;
        this.f7376m = null;
        m7221i();
        m7220h();
    }

    final synchronized void m7231d() {
        m7223l();
    }

    final synchronized void m7232e() {
        if (this.f7370g == null) {
            m7220h();
        } else if (!(this.f7370g == null || this.f7375l)) {
            if (this.f7376m != null) {
                m7222j();
            } else {
                C1254c m = m7224m();
                if (m != null) {
                    this.f7375l = true;
                    m.mo1592a(this.f7370g.getDataString(), null, (C0660x) this, (C0657w) this, (C1228w) this);
                }
            }
        }
    }

    private final void m7219g() {
        if (this.f7372i == null) {
            this.f7372i = new C1230d(this);
            this.f7366c.registerReceiver(this.f7372i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    private final void m7220h() {
        if (this.f7372i != null) {
            this.f7366c.unregisterReceiver(this.f7372i);
            this.f7372i = null;
        }
    }

    final void m7233f() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f7366c.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        this.f7374k = z;
    }

    private final void m7221i() {
        SharedPreferences sharedPreferences = this.f7366c.getSharedPreferences("notification_on_reconnection", 0);
        sharedPreferences.edit().putString("saved_dfe_account", this.f7369f).apply();
        sharedPreferences.edit().putString("saved_notification_request", this.f7370g == null ? null : this.f7370g.toUri(0)).apply();
        if (this.f7371h != null) {
            Intent intent = new Intent();
            this.f7371h.m13376a(intent);
            sharedPreferences.edit().putString("saved_logging_context", intent.toUri(0)).apply();
        }
        sharedPreferences.edit().putLong("saved_timestamp", C4678i.m21812a()).apply();
    }

    private final void m7222j() {
        if (this.f7370g != null) {
            CharSequence string;
            boolean z = (this.f7376m == null || this.f7376m.m14722b() == null || this.f7376m.m14722b().f14885a.f12100g == null) ? false : true;
            if (z) {
                string = this.f7366c.getString(C1592a.f8474w.intValue(), new Object[]{this.f7376m.m14722b().f14885a.f12100g});
            } else {
                string = this.f7366c.getString(C1592a.f8473v.intValue());
            }
            cg b = new cg(this.f7366c).m1415a((int) C7582R.drawable.ic_play_store).m1422a(string).m1425b(this.f7366c.getString(C1592a.f8475x.intValue()));
            Parcelable parcelable = this.f7370g;
            Intent intent = (Intent) parcelable.clone();
            intent.setPackage(this.f7366c.getPackageName());
            intent.putExtra("reconnection_original_intent", parcelable);
            intent.putExtra("notification_on_reconnection", true);
            b.f1501e = PendingIntent.getActivity(this.f7366c, 0, intent, 0);
            intent = new Intent("notification_delete");
            intent.setPackage(this.f7366c.getPackageName());
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f7366c, 0, intent, 0);
            if (this.f7373j == null) {
                this.f7373j = new C1231e(this);
            }
            this.f7366c.registerReceiver(this.f7373j, new IntentFilter("notification_delete"));
            ((NotificationManager) this.f7366c.getSystemService("notification")).notify("notification_on_reconnection", 1, b.m1419a(broadcast).m1414a());
            this.f7371h.m13370a(new C2488p().m13345b(this.f7364a));
        }
    }

    private final void m7223l() {
        ((NotificationManager) this.f7366c.getSystemService("notification")).cancel("notification_on_reconnection", 1);
        if (this.f7373j != null) {
            this.f7366c.unregisterReceiver(this.f7373j);
            this.f7373j = null;
        }
    }

    private final C1254c m7224m() {
        C1254c a = this.f7367d.mo2016a(this.f7369f);
        if (a == null) {
            String str = "Finsky API is null for account ";
            String valueOf = String.valueOf(this.f7369f);
            FinskyLog.m21667d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        return a;
    }

    public final void mo1062a(VolleyError volleyError) {
        String str = "Volley error on DeeplinkDisconnectionManager: ";
        String valueOf = String.valueOf(volleyError.getMessage());
        FinskyLog.m21667d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        if (this.f7370g != null) {
            str = "   request url was ";
            valueOf = String.valueOf(this.f7370g.getDataString());
            FinskyLog.m21667d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        this.f7375l = false;
    }

    public final void ah_() {
        this.f7375l = false;
    }

    public final void m_() {
        this.f7376m.m11926j();
        m7222j();
        this.f7375l = false;
    }

    public final /* synthetic */ void b_(Object obj) {
        ip ipVar = (ip) obj;
        if (ipVar.f12679b.length() <= 0 || ipVar.f12673F == null) {
            m7222j();
            this.f7375l = false;
            return;
        }
        if (this.f7376m != null) {
            this.f7376m.m11922b((C1031w) this);
            this.f7376m.m11921b((C0657w) this);
        }
        this.f7376m = new C2719i(m7224m(), ipVar.f12679b, true, ipVar.f12673F.f11833b, null);
        this.f7376m.m11918a((C1031w) this);
        this.f7376m.m11917a((C0657w) this);
    }

    static {
        TimeUnit.DAYS.toMillis(3);
    }
}
