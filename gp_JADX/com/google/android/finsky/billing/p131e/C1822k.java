package com.google.android.finsky.billing.p131e;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0700r;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.p060a.C0661c;
import com.android.volley.p060a.C0662b;
import com.android.volley.p060a.ag;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.cj;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;
import p002a.C0002a;

public final class C1822k {
    public static final Throwable f9393a = null;
    public static final Boolean f9394b = null;
    public static final String f9395c = null;
    public C1461c f9396d;
    public C0002a f9397e;
    public final Context f9398f;
    public final AccountManager f9399g = AccountManager.get(this.f9398f);
    public final C2495w f9400h;

    public C1822k(Context context, C2495w c2495w) {
        ((C1352c) C3947d.m18649a(C1352c.class)).mo1735a(this);
        this.f9398f = context;
        this.f9400h = c2495w;
    }

    public final C1823l m9843a(Account account) {
        String userData;
        try {
            userData = this.f9399g.getUserData(account, (String) C0955b.eR.m28964b());
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Failed to fetch user data from account manager.", new Object[0]);
            userData = null;
        }
        if (userData == null) {
            m9840a(900, null, -1, 1, f9393a);
            return null;
        }
        try {
            C1823l a = C1823l.m9849a(new JSONObject(userData), false);
            m9840a(900, null, -1, 0, f9393a);
            return a;
        } catch (Throwable e2) {
            m9840a(900, null, -1, 2, e2);
            FinskyLog.m21667d("Error deserializing reauth settings response from device: %s", e2);
            return new C1823l(907);
        }
    }

    public final C1823l m9847b(Account account) {
        StrictMode.noteSlowCall("ReauthClient.getReauthSettingsFromServer");
        return m9835a(account.name, m9848c(account));
    }

    private final C1823l m9835a(String str, C0662b c0662b) {
        Throwable e;
        Pair a = m9834a((C0661c) c0662b, 901, f9395c, 1, f9394b);
        String str2 = (String) a.first;
        Integer num = (Integer) a.second;
        if (num != null) {
            return new C1823l(num.intValue());
        }
        C0657w agVar = new ag();
        ((C0700r) this.f9397e.mo1a()).m4510a(new C1816d((String) C0955b.eN.m28964b(), str2, c0662b.f4064c, agVar, agVar));
        m9840a(902, null, -1, 0, f9393a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long elapsedRealtime2;
        try {
            JSONObject jSONObject = (JSONObject) agVar.get();
            elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (jSONObject == null) {
                m9840a(903, null, elapsedRealtime2, -1, f9393a);
                return new C1823l(901);
            }
            try {
                C1823l a2 = C1823l.m9849a(jSONObject, true);
                m9840a(903, null, elapsedRealtime2, 0, f9393a);
                return a2;
            } catch (Throwable e2) {
                m9840a(903, null, elapsedRealtime2, -3, e2);
                FinskyLog.m21667d("Error deserializing reauth settings response over network: %s", e2);
                return new C1823l(907);
            }
        } catch (ExecutionException e3) {
            elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            e2 = e3.getCause();
            if (e2 instanceof ServerError) {
                int a3 = C1826o.m9850a((ServerError) e2, false);
                m9840a(903, null, elapsedRealtime2, a3, e2);
                return new C1823l(a3);
            }
            m9840a(903, null, elapsedRealtime2, -2, e2);
            FinskyLog.m21667d("VolleyError with getReauthSettings: %s", e2);
            if (this.f9396d.mo2249j(str).mo2294a(12626157) || !(e2 instanceof NoConnectionError)) {
                return new C1823l(902);
            }
            return new C1823l(910);
        } catch (Throwable e22) {
            m9840a(903, null, SystemClock.elapsedRealtime() - elapsedRealtime, -2, e22);
            FinskyLog.m21667d("getReauthSettings request to LSO reauth api interrupted.", new Object[0]);
            return new C1823l(902);
        }
    }

    public final String m9845a(C0662b c0662b, String str) {
        Throwable e;
        Pair a = m9834a((C0661c) c0662b, 910, f9395c, 4, f9394b);
        String str2 = (String) a.first;
        if (((Integer) a.second) != null) {
            return null;
        }
        C0657w agVar = new ag();
        ((C0700r) this.f9397e.mo1a()).m4510a(new C1827p((String) C0955b.eO.m28964b(), str2, c0662b.f4064c, C1827p.m9851c(str), agVar, agVar));
        m9840a(913, null, -1, 0, f9393a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long elapsedRealtime2;
        try {
            JSONObject jSONObject = (JSONObject) agVar.get();
            elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (jSONObject == null) {
                m9840a(914, null, elapsedRealtime2, -1, f9393a);
                return null;
            }
            try {
                String string;
                String str3 = "";
                if (jSONObject.getBoolean("shouldPrompt")) {
                    string = jSONObject.getString("recoveryOptionsUrl");
                } else {
                    string = str3;
                }
                m9840a(914, null, elapsedRealtime2, 0, f9393a);
                return string;
            } catch (Throwable e2) {
                m9840a(914, null, elapsedRealtime2, -3, e2);
                FinskyLog.m21667d("Error deserializing recovery option response over network: %s", e2);
                return null;
            }
        } catch (ExecutionException e3) {
            elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            e2 = e3.getCause();
            if (e2 instanceof ServerError) {
                m9840a(914, null, elapsedRealtime2, C1826o.m9850a((ServerError) e2, false), e2);
                return null;
            }
            m9840a(914, null, elapsedRealtime2, -2, e2);
            FinskyLog.m21667d("VolleyError with getRecoveryOptionsStatus: %s", e2);
            return null;
        } catch (Throwable e22) {
            m9840a(914, null, SystemClock.elapsedRealtime() - elapsedRealtime, -2, e22);
            FinskyLog.m21669e("getReauthSettings request to LSO reauth api interrupted.", new Object[0]);
            return null;
        }
    }

    public final C1829r m9844a(Account account, String str, boolean z, String str2) {
        return m9836a(account.name, str, z, str2, m9848c(account));
    }

    private final C1829r m9836a(String str, String str2, boolean z, String str3, C0662b c0662b) {
        int i;
        long elapsedRealtime;
        Throwable e;
        StrictMode.noteSlowCall("ReauthClient.verifyCredentials");
        Pair a = m9834a((C0661c) c0662b, z ? 904 : 907, f9395c, 3, Boolean.valueOf(z));
        String str4 = (String) a.first;
        Integer num = (Integer) a.second;
        if (num != null) {
            return new C1829r(num.intValue());
        }
        String builder;
        int i2;
        Object obj = !TextUtils.isEmpty(str3) ? 1 : null;
        JSONObject a2 = C1828q.m9853a(str2, z);
        C0657w agVar = new ag();
        if (obj == null) {
            str3 = "me";
        }
        String replace = ((String) C0955b.eP.m28964b()).replace("%user_id%", str3);
        if (obj != null) {
            builder = Uri.parse(replace).buildUpon().appendQueryParameter("delegationType", "unicorn").toString();
        } else {
            builder = replace;
        }
        C0656n c1828q = new C1828q(builder, str4, c0662b.f4064c, a2, agVar, agVar);
        if (z) {
            i2 = 905;
        } else {
            i2 = 908;
        }
        if (z) {
            i = 906;
        } else {
            i = 909;
        }
        ((C0700r) this.f9397e.mo1a()).m4510a(c1828q);
        m9842a(911, z, -1, 0, f9393a);
        m9839a(i2, -1, null);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        try {
            JSONObject jSONObject = (JSONObject) agVar.get();
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
            if (jSONObject == null) {
                m9842a(912, z, elapsedRealtime, -1, f9393a);
                m9837a(i, elapsedRealtime, -1, f9393a);
                return new C1829r(901);
            }
            try {
                C1829r c1829r;
                obj = jSONObject.getString("encodedRapt");
                if (TextUtils.isEmpty(obj)) {
                    int i3;
                    if (z) {
                        i3 = 1003;
                    } else {
                        i3 = 1100;
                    }
                    c1829r = new C1829r(i3);
                } else {
                    c1829r = new C1829r(0, obj);
                }
                m9842a(912, z, elapsedRealtime, 0, f9393a);
                m9839a(i, elapsedRealtime, null);
                return c1829r;
            } catch (Throwable e2) {
                m9842a(912, z, elapsedRealtime, -3, e2);
                m9837a(i, elapsedRealtime, -3, e2);
                FinskyLog.m21667d("Error deserializing verifyCredentials response: %s", e2);
                return new C1829r(907);
            }
        } catch (ExecutionException e3) {
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
            e2 = e3.getCause();
            if (e2 instanceof ServerError) {
                int a3 = C1826o.m9850a((ServerError) e2, z);
                m9842a(912, z, elapsedRealtime, a3, e2);
                m9837a(i, elapsedRealtime, a3, e2);
                return new C1829r(a3);
            }
            m9842a(912, z, elapsedRealtime, -2, e2);
            m9837a(i, elapsedRealtime, -2, e2);
            FinskyLog.m21667d("VolleyError with verifyCredentials: %s", e2);
            if (this.f9396d.mo2249j(str).mo2294a(12626157) || !(e2 instanceof NoConnectionError)) {
                return new C1829r(902);
            }
            return new C1829r(910);
        } catch (Throwable e22) {
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
            m9842a(912, z, elapsedRealtime, -2, e22);
            m9837a(i, elapsedRealtime, -2, e22);
            FinskyLog.m21667d("verifyCredentials request to LSO reauth api interrupted.", new Object[0]);
            return new C1829r(902);
        }
    }

    public final void m9846a(Account account, boolean z, String str) {
        m9834a(m9848c(account), z ? 904 : 907, str, 2, Boolean.valueOf(z));
    }

    private final Pair m9834a(C0661c c0661c, int i, String str, int i2, Boolean bool) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long elapsedRealtime2;
        try {
            CharSequence a = c0661c.mo1071a();
            elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (TextUtils.isEmpty(a)) {
                m9841a(i2, bool, elapsedRealtime2, 1, f9393a);
                m9838a(i, elapsedRealtime2, 1, f9393a, str);
                return new Pair(null, Integer.valueOf(903));
            }
            m9841a(i2, bool, elapsedRealtime2, 0, f9393a);
            m9839a(i, elapsedRealtime2, str);
            return new Pair(a, null);
        } catch (Throwable e) {
            elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            m9841a(i2, bool, elapsedRealtime2, 2, e);
            m9838a(i, elapsedRealtime2, 2, e, str);
            return new Pair(null, Integer.valueOf(904));
        } catch (Throwable e2) {
            elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            FinskyLog.m21667d("account is null", new Object[0]);
            m9841a(i2, bool, elapsedRealtime2, 2, e2);
            m9838a(i, elapsedRealtime2, 2, e2, str);
            return new Pair(null, Integer.valueOf(909));
        }
    }

    public final C0662b m9848c(Account account) {
        return new C0662b(this.f9398f, account, (String) C0955b.eQ.m28964b(), (byte) 0);
    }

    private final void m9837a(int i, long j, int i2, Throwable th) {
        m9838a(i, j, i2, th, null);
    }

    private final void m9838a(int i, long j, int i2, Throwable th, String str) {
        if (this.f9400h != null) {
            this.f9400h.m13367a(new C2474c(i).m13242b(j).m13210a(i2).m13238a(th).m13244b(str));
        }
    }

    private final void m9839a(int i, long j, String str) {
        if (this.f9400h != null) {
            this.f9400h.m13367a(new C2474c(i).m13242b(j).m13244b(str));
        }
    }

    private final void m9841a(int i, Boolean bool, long j, int i2, Throwable th) {
        cj cjVar = new cj();
        cjVar.b = i;
        cjVar.a |= 1;
        if (bool != null) {
            if (bool.booleanValue()) {
                cjVar.a(2);
            } else {
                cjVar.a(1);
            }
        }
        m9840a(910, cjVar, j, i2, th);
    }

    private final void m9842a(int i, boolean z, long j, int i2, Throwable th) {
        cj cjVar = new cj();
        if (z) {
            cjVar.a(2);
        } else {
            cjVar.a(1);
        }
        m9840a(i, cjVar, j, i2, th);
    }

    private final void m9840a(int i, cj cjVar, long j, int i2, Throwable th) {
        C2474c c2474c = new C2474c(i);
        if (cjVar != null) {
            c2474c.f13342a.f31696V = cjVar;
        }
        if (this.f9400h != null) {
            this.f9400h.m13367a(c2474c.m13242b(j).m13210a(i2).m13238a(th));
        }
    }
}
