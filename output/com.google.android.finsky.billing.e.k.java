package com.google.android.finsky.billing.e;

import a.a;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.android.volley.AuthFailureError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.a.ag;
import com.android.volley.a.b;
import com.android.volley.a.c;
import com.android.volley.r;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.bo;
import com.google.wireless.android.a.a.a.a.cj;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

public final class com.google.android.finsky.billing.e.k
{

    public static final Throwable a;
    public static final Boolean b;
    public static final String c;
    public com.google.android.finsky.ba.c d;
    public a.a e;
    public final Context f;
    public final AccountManager g;
    public final com.google.android.finsky.d.w h;

    static {
        com.google.android.finsky.billing.e.k.a = 0;
        com.google.android.finsky.billing.e.k.b = 0;
        com.google.android.finsky.billing.e.k.c = 0;
    }

    k(Context p0, com.google.android.finsky.d.w p1) {
        ((com.google.android.finsky.billing.e.c)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.e.c)).a(this);
        this.f = p0;
        this.g = AccountManager.get(this.f);
        this.h = p1;
    }

    private final Pair a(com.android.volley.a.c p0, int p1, String p2, int p3, Boolean p4) {
        v0 = SystemClock.elapsedRealtime();
        try {
            v8 = p0.a();
        }
        catch (AuthFailureError ex) {
            v4 = SystemClock.elapsedRealtime() - v0;
            this.a(p3, p4, v4, 2, ex);
            this.a(p1, v4, 2, ex, p2);
            v0 = new Pair(0, Integer.valueOf(904));
            return v0;
        }
        catch (IllegalArgumentException ex) {
            v4 = SystemClock.elapsedRealtime() - v0;
            FinskyLog.d("account is null", new Object[0]);
            this.a(p3, p4, v4, 2, ex);
            this.a(p1, v4, 2, ex, p2);
            v0 = new Pair(0, Integer.valueOf(909));
            return v0;
        }
        v4 = SystemClock.elapsedRealtime() - v0;
        if (TextUtils.isEmpty(v8)) {
            this.a(p3, p4, v4, 1, com.google.android.finsky.billing.e.k.a);
            this.a(p1, v4, 1, com.google.android.finsky.billing.e.k.a, p2);
            v0 = new Pair(0, Integer.valueOf(903));
        }
        else {
            this.a(p3, p4, v4, 0, com.google.android.finsky.billing.e.k.a);
            this.a(p1, v4, p2);
            v0 = new Pair(v8, 0);
        }
        return v0;
    }

    private final com.google.android.finsky.billing.e.l a(String p0, com.android.volley.a.b p1) {
        v0 = this.a(p1, 901, com.google.android.finsky.billing.e.k.c, 1, com.google.android.finsky.billing.e.k.b);
        if ((Integer)v0.second == 0) {
            v4 = new com.android.volley.a.ag();
            ((com.android.volley.r)this.e.a()).a(new com.google.android.finsky.billing.e.d((String)com.google.android.finsky.aa.b.eN.b(), (String)v0.first, p1.c, v4, v4));
            this.a(902, 0, -1, 0, com.google.android.finsky.billing.e.k.a);
            v2 = SystemClock.elapsedRealtime();
            v0 = (JSONObject)v4.get();
            v4 = SystemClock.elapsedRealtime() - v2;
            if (v0 == 0) {
                this.a(903, 0, v4, -1, com.google.android.finsky.billing.e.k.a);
                v0 = new com.google.android.finsky.billing.e.l(901);
            }
            else {
                try {
                    v0 = com.google.android.finsky.billing.e.l.a(v0, 1);
                    this.a(903, 0, v4, 0, com.google.android.finsky.billing.e.k.a);
                }
                catch (JSONException ex) {
                    this.a(903, 0, v4, -3, ex);
                    v1 = new Object[1];
                    v1[0] = ex;
                    FinskyLog.d("Error deserializing reauth settings response over network: %s", v1);
                    v0 = new com.google.android.finsky.billing.e.l(907);
                }
            }
            return v0;
        }
        v0 = new com.google.android.finsky.billing.e.l(((Integer)v0.second).intValue());
        return v0;
        v4 = new com.android.volley.a.ag();
        ((com.android.volley.r)this.e.a()).a(new com.google.android.finsky.billing.e.d((String)com.google.android.finsky.aa.b.eN.b(), (String)v0.first, p1.c, v4, v4));
        this.a(902, 0, -1, 0, com.google.android.finsky.billing.e.k.a);
        v2 = SystemClock.elapsedRealtime();
        try {
            v0 = (JSONObject)v4.get();
        }
        catch (ExecutionException ex) {
            v4 = SystemClock.elapsedRealtime() - v2;
            v7 = ex.getCause();
            if (v7 instanceof ServerError) {
                v6 = com.google.android.finsky.billing.e.o.a((ServerError)v7, 0);
                this.a(903, 0, v4, v6, v7);
                v0 = new com.google.android.finsky.billing.e.l(v6);
            }
            else {
                this.a(903, 0, v4, -2, v7);
                v1 = new Object[1];
                v1[0] = v7;
                FinskyLog.d("VolleyError with getReauthSettings: %s", v1);
                if (!this.d.j(p0).a(12626157) && v7 instanceof NoConnectionError)
                    v0 = new com.google.android.finsky.billing.e.l(910);
                else
                    v0 = new com.google.android.finsky.billing.e.l(902);
            }
            return v0;
        }
        catch (InterruptedException ex) {
            this.a(903, 0, SystemClock.elapsedRealtime() - v2, -2, ex);
            FinskyLog.d("getReauthSettings request to LSO reauth api interrupted.", new Object[0]);
            v0 = new com.google.android.finsky.billing.e.l(902);
            return v0;
        }
        v4 = SystemClock.elapsedRealtime() - v2;
        if (v0 == 0) {
            this.a(903, 0, v4, -1, com.google.android.finsky.billing.e.k.a);
            v0 = new com.google.android.finsky.billing.e.l(901);
        }
        else {
            try {
                v0 = com.google.android.finsky.billing.e.l.a(v0, 1);
                this.a(903, 0, v4, 0, com.google.android.finsky.billing.e.k.a);
            }
            catch (JSONException ex) {
                this.a(903, 0, v4, -3, ex);
                v1 = new Object[1];
                v1[0] = ex;
                FinskyLog.d("Error deserializing reauth settings response over network: %s", v1);
                v0 = new com.google.android.finsky.billing.e.l(907);
            }
        }
        return v0;
    }

    private final com.google.android.finsky.billing.e.r a(String p0, String p1, boolean p2, String p3, com.android.volley.a.b p4) {
        StrictMode.noteSlowCall("ReauthClient.verifyCredentials");
        if (p2 != 0)
            v4 = 904;
        else
            v4 = 907;
        v2 = this.a(p4, v4, com.google.android.finsky.billing.e.k.c, 3, Boolean.valueOf(p2));
        v4 = (String)v2.first;
        if ((Integer)v2.second != 0) {
            v2 = new com.google.android.finsky.billing.e.r(((Integer)v2.second).intValue());
            return v2;
        }
        if (!TextUtils.isEmpty(p3))
            v3 = 1;
        else
            v3 = 0;
        v7 = new com.android.volley.a.ag();
        if (v3 == 0)
            p3 = "me";
        v2 = ((String)com.google.android.finsky.aa.b.eP.b()).replace("%user_id%", p3);
        if (v3 != 0)
            v3 = Uri.parse(v2).buildUpon().appendQueryParameter("delegationType", "unicorn").toString();
        else
            v3 = v2;
        v2 = new com.google.android.finsky.billing.e.q(v3, v4, p4.c, com.google.android.finsky.billing.e.q.a(p1, p2), v7, v7);
        if (p2 != 0)
            v4 = 905;
        else
            v4 = 908;
        if (p2 != 0)
            v16 = 906;
        else
            v16 = 909;
        ((com.android.volley.r)this.e.a()).a(v2);
        this.a(911, p2, -1, 0, com.google.android.finsky.billing.e.k.a);
        this.a(v4, -1, 0);
        v4 = SystemClock.elapsedRealtime();
        try {
            v2 = (JSONObject)v7.get();
        }
        catch (ExecutionException ex) {
            v6 = SystemClock.elapsedRealtime() - v4;
            v9 = ex.getCause();
            if (v9 instanceof ServerError) {
                v8 = com.google.android.finsky.billing.e.o.a((ServerError)v9, p2);
                this.a(912, p2, v6, v8, v9);
                this.a(v16, v6, v8, v9);
                v2 = new com.google.android.finsky.billing.e.r(v8);
            }
            else {
                this.a(912, p2, v6, -2, v9);
                this.a(v16, v6, -2, v9);
                v3 = new Object[1];
                v3[0] = v9;
                FinskyLog.d("VolleyError with verifyCredentials: %s", v3);
                if (!this.d.j(p0).a(12626157) && v9 instanceof NoConnectionError)
                    v2 = new com.google.android.finsky.billing.e.r(910);
                else
                    v2 = new com.google.android.finsky.billing.e.r(902);
            }
            return v2;
        }
        catch (InterruptedException ex) {
            v6 = SystemClock.elapsedRealtime() - v4;
            this.a(912, p2, v6, -2, ex);
            this.a(v16, v6, -2, ex);
            FinskyLog.d("verifyCredentials request to LSO reauth api interrupted.", new Object[0]);
            v2 = new com.google.android.finsky.billing.e.r(902);
            return v2;
        }
        v6 = SystemClock.elapsedRealtime() - v4;
        if (v2 == 0) {
            this.a(912, p2, v6, -1, com.google.android.finsky.billing.e.k.a);
            this.a(v16, v6, -1, com.google.android.finsky.billing.e.k.a);
            v2 = new com.google.android.finsky.billing.e.r(901);
            return v2;
        }
        try {
            v3 = v2.getString("encodedRapt");
            if (TextUtils.isEmpty(v3)) {
                if (p2 != 0)
                    v3 = 1003;
                else
                    v3 = 1100;
                v2 = new com.google.android.finsky.billing.e.r(v3);
            }
            else {
                try {
                    v2 = new com.google.android.finsky.billing.e.r(0, v3);
                }
                catch (JSONException ex) {
                    this.a(912, p2, v6, -3, ex);
                    this.a(v16, v6, -3, ex);
                    v3 = new Object[1];
                    v3[0] = ex;
                    FinskyLog.d("Error deserializing verifyCredentials response: %s", v3);
                    v2 = new com.google.android.finsky.billing.e.r(907);
                    return v2;
                }
            }
            this.a(912, p2, v6, 0, com.google.android.finsky.billing.e.k.a);
            this.a(v16, v6, 0);
        }
        catch (JSONException ex) {
            this.a(912, p2, v6, -3, ex);
            this.a(v16, v6, -3, ex);
            v3 = new Object[1];
            v3[0] = ex;
            FinskyLog.d("Error deserializing verifyCredentials response: %s", v3);
            v2 = new com.google.android.finsky.billing.e.r(907);
            return v2;
        }
        return v2;
    }

    private final void a(int p0, long p1, int p3, Throwable p4) {
        this.a(p0, p1, p3, p4, 0);
    }

    private final void a(int p0, long p1, int p3, Throwable p4, String p5) {
        if (this.h != 0)
            this.h.a(new com.google.android.finsky.d.c(p0).b(p1).a(p3).a(p4).b(p5));
    }

    private final void a(int p0, long p1, String p3) {
        if (this.h != 0)
            this.h.a(new com.google.android.finsky.d.c(p0).b(p1).b(p3));
    }

    private final void a(int p0, com.google.wireless.android.a.a.a.a.cj p1, long p2, int p4, Throwable p5) {
        v0 = new com.google.android.finsky.d.c(p0);
        if (p1 != 0)
            v0.a.V = p1;
        if (this.h != 0)
            this.h.a(v0.b(p2).a(p4).a(p5));
    }

    private final void a(int p0, Boolean p1, long p2, int p4, Throwable p5) {
        v3 = new com.google.wireless.android.a.a.a.a.cj();
        v3.b = p0;
        v3.a = v3.a | 1;
        if (p1 != 0) {
            if (p1.booleanValue())
                v3.a(2);
            else
                v3.a(1);
        }
        this.a(910, v3, p2, p4, p5);
    }

    private final void a(int p0, boolean p1, long p2, int p4, Throwable p5) {
        v3 = new com.google.wireless.android.a.a.a.a.cj();
        if (p1 != 0)
            v3.a(2);
        else
            v3.a(1);
        this.a(p0, v3, p2, p4, p5);
    }

    public final com.google.android.finsky.billing.e.l a(Account p0) {
        try {
            v0 = this.g.getUserData(p0, (String)com.google.android.finsky.aa.b.eR.b());
        }
        catch (Exception ex) {
            FinskyLog.b(ex, "Failed to fetch user data from account manager.", new Object[0]);
            v0 = 0;
        }
        if (v0 == 0) {
            this.a(900, 0, -1, 1, com.google.android.finsky.billing.e.k.a);
            v0 = 0;
        }
        else {
            try {
                v0 = com.google.android.finsky.billing.e.l.a(new JSONObject(v0), 0);
                this.a(900, 0, -1, 0, com.google.android.finsky.billing.e.k.a);
            }
            catch (JSONException ex) {
                this.a(900, 0, -1, 2, ex);
                v1 = new Object[1];
                v1[0] = ex;
                FinskyLog.d("Error deserializing reauth settings response from device: %s", v1);
                v0 = new com.google.android.finsky.billing.e.l(907);
            }
        }
        return v0;
    }

    public final com.google.android.finsky.billing.e.r a(Account p0, String p1, boolean p2, String p3) {
        return this.a(p0.name, p1, p2, p3, this.c(p0));
    }

    public final String a(com.android.volley.a.b p0, String p1) {
        v0 = this.a(p0, 910, com.google.android.finsky.billing.e.k.c, 4, com.google.android.finsky.billing.e.k.b);
        if ((Integer)v0.second == 0) {
            v5 = new com.android.volley.a.ag();
            ((com.android.volley.r)this.e.a()).a(new com.google.android.finsky.billing.e.p((String)com.google.android.finsky.aa.b.eO.b(), (String)v0.first, p0.c, com.google.android.finsky.billing.e.p.c(p1), v5, v5));
            this.a(913, 0, -1, 0, com.google.android.finsky.billing.e.k.a);
            v2 = SystemClock.elapsedRealtime();
            v0 = (JSONObject)v5.get();
            v4 = SystemClock.elapsedRealtime() - v2;
            if (v0 == 0) {
                this.a(914, 0, v4, -1, com.google.android.finsky.billing.e.k.a);
                v0 = 0;
            }
            else {
                try {
                    if (v0.getBoolean("shouldPrompt"))
                        v0 = v0.getString("recoveryOptionsUrl");
                    else
                        v0 = "";
                    this.a(914, 0, v4, 0, com.google.android.finsky.billing.e.k.a);
                }
                catch (JSONException ex) {
                    this.a(914, 0, v4, -3, ex);
                    v1 = new Object[1];
                    v1[0] = ex;
                    FinskyLog.d("Error deserializing recovery option response over network: %s", v1);
                    v0 = 0;
                }
            }
            return v0;
        }
        v0 = 0;
        return v0;
        v5 = new com.android.volley.a.ag();
        ((com.android.volley.r)this.e.a()).a(new com.google.android.finsky.billing.e.p((String)com.google.android.finsky.aa.b.eO.b(), (String)v0.first, p0.c, com.google.android.finsky.billing.e.p.c(p1), v5, v5));
        this.a(913, 0, -1, 0, com.google.android.finsky.billing.e.k.a);
        v2 = SystemClock.elapsedRealtime();
        try {
            v0 = (JSONObject)v5.get();
        }
        catch (ExecutionException ex) {
            v4 = SystemClock.elapsedRealtime() - v2;
            v7 = ex.getCause();
            if (v7 instanceof ServerError) {
                this.a(914, 0, v4, com.google.android.finsky.billing.e.o.a((ServerError)v7, 0), v7);
                v0 = 0;
            }
            else {
                this.a(914, 0, v4, -2, v7);
                v1 = new Object[1];
                v1[0] = v7;
                FinskyLog.d("VolleyError with getRecoveryOptionsStatus: %s", v1);
                v0 = 0;
            }
            return v0;
        }
        catch (InterruptedException ex) {
            this.a(914, 0, SystemClock.elapsedRealtime() - v2, -2, ex);
            FinskyLog.e("getReauthSettings request to LSO reauth api interrupted.", new Object[0]);
            v0 = 0;
            return v0;
        }
        v4 = SystemClock.elapsedRealtime() - v2;
        if (v0 == 0) {
            this.a(914, 0, v4, -1, com.google.android.finsky.billing.e.k.a);
            v0 = 0;
        }
        else {
            try {
                if (v0.getBoolean("shouldPrompt"))
                    v0 = v0.getString("recoveryOptionsUrl");
                else
                    v0 = "";
                this.a(914, 0, v4, 0, com.google.android.finsky.billing.e.k.a);
            }
            catch (JSONException ex) {
                this.a(914, 0, v4, -3, ex);
                v1 = new Object[1];
                v1[0] = ex;
                FinskyLog.d("Error deserializing recovery option response over network: %s", v1);
                v0 = 0;
            }
        }
        return v0;
    }

    public final void a(Account p0, boolean p1, String p2) {
        if (p1 != 0)
            v2 = 904;
        else
            v2 = 907;
        this.a(this.c(p0), v2, p2, 2, Boolean.valueOf(p1));
    }

    public final com.google.android.finsky.billing.e.l b(Account p0) {
        StrictMode.noteSlowCall("ReauthClient.getReauthSettingsFromServer");
        return this.a(p0.name, this.c(p0));
    }

    public final com.android.volley.a.b c(Account p0) {
        return new com.android.volley.a.b(this.f, p0, (String)com.google.android.finsky.aa.b.eQ.b(), 0);
    }

}
