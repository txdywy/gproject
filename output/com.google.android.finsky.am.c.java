package com.google.android.finsky.am;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.cg;
import android.text.TextUtils;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.bd.a;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.ip;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.d.x;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.i;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.am.c implements com.android.volley.w, com.android.volley.x, com.google.android.finsky.api.w, com.google.android.finsky.dfemodel.w
{

    public final com.google.android.finsky.d.o a;
    public final com.google.android.finsky.d.o b;
    public final Context c;
    public final com.google.android.finsky.api.h d;
    public final com.google.android.finsky.d.x e;
    public String f;
    public Intent g;
    public com.google.android.finsky.d.w h;
    public BroadcastReceiver i;
    public BroadcastReceiver j;
    public boolean k;
    public boolean l;
    public com.google.android.finsky.dfemodel.i m;

    static {
        TimeUnit.DAYS.toMillis(3);
    }

    c(Context p0, com.google.android.finsky.api.h p1, com.google.android.finsky.d.x p2) {
        this.a = new com.google.android.finsky.d.o(912, 0);
        this.b = new com.google.android.finsky.d.o(913, this.a);
        this.c = p0;
        this.d = p1;
        this.e = p2;
    }

    public static boolean b(VolleyError p0) {
        return p0 instanceof NoConnectionError;
    }

    private final void g() {
        if (this.i == 0) {
            this.i = new com.google.android.finsky.am.d(this);
            this.c.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    private final void h() {
        if (this.i != 0) {
            this.c.unregisterReceiver(this.i);
            this.i = 0;
        }
    }

    private final void i() {
        v1 = this.c.getSharedPreferences("notification_on_reconnection", 0);
        v1.edit().putString("saved_dfe_account", this.f).apply();
        if (this.g == 0)
            v0 = 0;
        else
            v0 = this.g.toUri(0);
        v1.edit().putString("saved_notification_request", v0).apply();
        if (this.h != 0) {
            v0 = new Intent();
            this.h.a(v0);
            v1.edit().putString("saved_logging_context", v0.toUri(0)).apply();
        }
        v1.edit().putLong("saved_timestamp", com.google.android.finsky.utils.i.a()).apply();
    }

    private final void j() {
        if (this.g != 0) {
            if (this.m != 0 && this.m.b() != 0 && this.m.b().a.g != 0)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                v4 = new Object[1];
                v4[0] = this.m.b().a.g;
                v0 = this.c.getString(com.google.android.finsky.bd.a.w.intValue(), v4);
            }
            else
                v0 = this.c.getString(com.google.android.finsky.bd.a.v.intValue());
            v3 = new android.support.v4.app.cg(this.c).a(2130837797).a(v0).b(this.c.getString(com.google.android.finsky.bd.a.x.intValue()));
            v0 = (Intent)this.g.clone();
            v0.setPackage(this.c.getPackageName());
            v0.putExtra("reconnection_original_intent", this.g);
            v0.putExtra("notification_on_reconnection", 1);
            v3.e = PendingIntent.getActivity(this.c, 0, v0, 0);
            v0 = new Intent("notification_delete");
            v0.setPackage(this.c.getPackageName());
            if (this.j == 0)
                this.j = new com.google.android.finsky.am.e(this);
            this.c.registerReceiver(this.j, new IntentFilter("notification_delete"));
            ((NotificationManager)this.c.getSystemService("notification")).notify("notification_on_reconnection", 1, v3.a(PendingIntent.getBroadcast(this.c, 0, v0, 0)).a());
            this.h.a(new com.google.android.finsky.d.p().b(this.a));
        }
    }

    private final void l() {
        ((NotificationManager)this.c.getSystemService("notification")).cancel("notification_on_reconnection", 1);
        if (this.j != 0) {
            this.c.unregisterReceiver(this.j);
            this.j = 0;
        }
    }

    private final com.google.android.finsky.api.c m() {
        v1 = this.d.a(this.f);
        if (v1 == 0) {
            v0 = String.valueOf(this.f);
            if (v0.length() != 0)
                v0 = "Finsky API is null for account ".concat(v0);
            else
                v0 = new String("Finsky API is null for account ");
            FinskyLog.d(v0, new Object[0]);
        }
        return v1;
    }

    public final void a(VolleyError p0) {
        v0 = String.valueOf(p0.getMessage());
        if (v0.length() != 0)
            v0 = "Volley error on DeeplinkDisconnectionManager: ".concat(v0);
        else
            v0 = new String("Volley error on DeeplinkDisconnectionManager: ");
        FinskyLog.d(v0, new Object[0]);
        if (this.g != 0) {
            v0 = String.valueOf(this.g.getDataString());
            if (v0.length() != 0)
                v0 = "   request url was ".concat(v0);
            else
                v0 = new String("   request url was ");
            FinskyLog.d(v0, new Object[0]);
        }
        this.l = 0;
    }

    public final synchronized void a(com.google.android.finsky.d.w p0, Intent p1) {
  0:    v0 = 0;
  1:    enter this;
  5:    v1 = p1.getBooleanExtra("notification_on_reconnection", 0);
  9:    if (v1 != 0) goto 59;
 13:    if (this.g != 0) goto 22;
 15:    if (p1 == 0)
 17:        v0 = 1;
 18:    if (v0 != 0) goto 59;
 20:    exit this;
 21:    return;
 28:    if (p1.hasExtra("reconnection_original_intent"))
 36:        v0 = (Intent)p1.getParcelableExtra("reconnection_original_intent");
        else
 78:        v0 = p1;
 45:    if (v0 == 0)
 47:        v0 = 0;
        else
 54:        v0 = v0.toUri(0);
 48:    v0 = TextUtils.equals(this.g.toUri(0), v0);
 52:    goto 18;
 59:    if (v1 == 0)
 68:        p0.a(new com.google.android.finsky.d.c(548));
 71:    this.c();
 74:    goto 20;
 76:    exit this;
 77:    throw ex;
 80:    try
            run 22...74
        catch (Throwable ex) {
 22:        goto 75;
        }
 81:    try
            run 2...13
        catch (Throwable ex) {
  2:        goto 75;
        }
    }

    public final synchronized void a(String p0) {
        enter this;
        try {
            if (this.m != 0) {
                if (this.m.b() != 0) {
                    if (TextUtils.equals(p0, this.m.b().a.d))
                        this.c();
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, com.google.android.finsky.d.w p1, Intent p2) {
        enter this;
        if (p2 != 0) {
            try {
                this.c();
                this.f = p0;
                this.g = p2;
                this.h = p1;
                this.g();
                this.i();
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
        }
        exit this;
    }

    public final void ah_() {
        this.l = 0;
    }

    public final synchronized void b() {
        enter this;
        try {
            this.f();
            if (this.g != 0) {
                this.g();
                if (this.k != 0)
                    this.e();
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void b_(Object p0) {
        if (((com.google.android.finsky.cv.a.ip)p0).b.length() > 0 && ((com.google.android.finsky.cv.a.ip)p0).F != 0) {
            if (this.m != 0) {
                this.m.b(this);
                this.m.b(this);
            }
            this.m = new com.google.android.finsky.dfemodel.i(this.m(), ((com.google.android.finsky.cv.a.ip)p0).b, 1, ((com.google.android.finsky.cv.a.ip)p0).F.b, 0);
            this.m.a(this);
            this.m.a(this);
        }
        else {
            this.j();
            this.l = 0;
        }
    }

    final synchronized void c() {
        enter this;
        try {
            this.l();
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.m = 0;
            this.i();
            this.h();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    final synchronized void d() {
        enter this;
        try {
            this.l();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    final synchronized void e() {
  0:    enter this;
  1:    try {
  3:        if (this.g != 0) {
  7:            if (this.g != 0) {
 11:                if (this.l != 0) {
                    }
                    else {
 15:                    try {
 17:                        if (this.m != 0)
 19:                            this.j();
                            else {
 26:                            v0 = this.m();
 30:                            if (v0 != 0) {
 33:                                this.l = 1;
 45:                                v0.a(this.g.getDataString(), 0, this, this, this);
                                }
                            }
                        }
                        catch (Throwable ex) {
 24:                        exit this;
 25:                        throw ex;
                        }
                    }
                }
            }
            else
 49:            this.h();
        }
        catch (Throwable ex) {
 24:        exit this;
 25:        throw ex;
        }
 13:    exit this;
 14:    return;
 26:    try {
 26:        v0 = this.m();
 30:        if (v0 != 0) {
 33:            this.l = 1;
 45:            v0.a(this.g.getDataString(), 0, this, this, this);
            }
        }
        catch (Throwable ex) {
 24:        exit this;
 25:        throw ex;
        }
 48:    goto 13;
    }

    final void f() {
        v0 = ((ConnectivityManager)this.c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (v0 != 0 && v0.isConnectedOrConnecting())
            v0 = 1;
        else
            v0 = 0;
        this.k = v0;
    }

    public final void m_() {
        this.m.j();
        this.j();
        this.l = 0;
    }

}
